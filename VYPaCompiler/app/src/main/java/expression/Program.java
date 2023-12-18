package expression;

import tables.SymbolTable;

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

    @Override
    public void checkType(SymbolTable st) {
        classDefinitions.add(new ObjectClassDef());
        for (ClassDef classDef : classDefinitions) {
            st.addClassDef(classDef);
            String superClassName = classDef.getSuperClass();
            if (superClassName != null) {
                ClassDef superClassDef = st.getClassDef(superClassName);
                if (superClassDef == null) {
                    throw new RuntimeException("Invalid superclass " + superClassName);
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
        if (mainFunctionDef == null || !mainFunctionDef.getParams().getParameters().isEmpty()) {
            throw new RuntimeException("main function is missing");
        }
        globalVariableDefinitions.forEach(st::addGlobalDef);
        functionDefinitions.forEach(functionDef -> functionDef.checkType(st));
        classDefinitions.forEach(classDef -> classDef.checkType(st));
        globalVariableDefinitions.forEach(variableDef -> variableDef.checkType(st));

    }

}
