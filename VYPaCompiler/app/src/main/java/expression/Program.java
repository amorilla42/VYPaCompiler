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

    }
}
