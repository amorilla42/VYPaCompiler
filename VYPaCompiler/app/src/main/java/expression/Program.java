/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import exceptions.SemanticException;
import tables.SymbolTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program extends AST{

    private List<FunctionDef> functionDefinitions;
    private List<ClassDef> classDefinitions;
    private  List<VariableDef> globalVariableDefinitions;

    public Program(List<FunctionDef> functionDefinitions, List<ClassDef> classDefinitions, List<VariableDef> globalVariableDefinitions){
        this.classDefinitions = classDefinitions;
        this.globalVariableDefinitions = globalVariableDefinitions;
        this.functionDefinitions = functionDefinitions;
    }

    public List<FunctionDef> getFunctionDefinitions() {
        return functionDefinitions;
    }

    public List<ClassDef> getClassDefinitions() {
        return classDefinitions;
    }

    public List<VariableDef> getGlobalVariableDefinitions() {
        return globalVariableDefinitions;
    }

    /**
     * This method checks the type of the program.
     * It adds class definitions to the symbol table, sets superclass definitions, and adds method definitions.
     * It also adds function definitions to the symbol table and checks for the existence of a main function.
     * Finally, it checks the types of class definitions, function definitions, and global variable definitions.
     *
     * @param st The symbol table to use for type checking.
     * @throws SemanticException If the superclass is invalid or if there is no main function.
     */
    @Override
    public void checkType(SymbolTable st) {
        classDefinitions.add(new ObjectClassDef());
        for (ClassDef classDef : classDefinitions) {
            st.addClassDef(classDef);
        }
        for (ClassDef classDef : classDefinitions) {
            String superClassName = classDef.getSuperClass();
            if (superClassName != null) {
                ClassDef superClassDef = st.getClassDef(superClassName);
                if (superClassDef == null) {
                    throw new SemanticException("Invalid superclass " + superClassName);
                }
                classDef.setSuperClassDef(superClassDef);
            }
            for (MethodDef methodDef : classDef.getMethodDefs()) {
                st.addMethodDef(classDef.getName(), methodDef);
            }
        }
        functionDefinitions.add(new SubStrFunctionDef());
        functionDefinitions.add(new ConcatDef());

        for (FunctionDef functionDef : functionDefinitions) {
            st.addFunctionDef(functionDef);
        }
        FunctionDef mainFunctionDef = st.getFunctionDef("main");
        if (!mainFunctionDef.getParams().getParameters().isEmpty()) {
            throw new SemanticException("main must have no arguments");
        }
        globalVariableDefinitions.forEach(st::addGlobalDef);
        classDefinitions.forEach(classDef -> classDef.checkType(st));
        functionDefinitions.forEach(functionDef -> functionDef.checkType(st));
        globalVariableDefinitions.forEach(variableDef -> variableDef.checkType(st));
    }

}
