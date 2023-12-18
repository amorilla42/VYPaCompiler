package tables;

import expression.*;
import java.util.*;

public class SymbolTable {

    //CLASS Table
    private Map<String, ClassDef> classDefMap;
    private Map<String, MethodDef> methodDefMap;

    //GLOBAL Table
    //Since it can be global variables and functions, we need to create a wrapper "Data"
    private Map<String, Data> globalMap;

    //Stack of maps of Local Variables and functions (Data)
    private Stack<LocalScope> localVarScopeStack;

    //We need to know the class that we are defining to store it properly
    private ClassDef currentClassDefinition;

    private int labelCounter;
    public String getUniqueLabel(){
        return "_l"+(labelCounter++);
    }

    public SymbolTable(){
        classDefMap = new HashMap<>();
        methodDefMap = new HashMap<>();
        globalMap = new HashMap<>();
        localVarScopeStack = new Stack<>();
        pushLocalStack();
        labelCounter = 0;
        currentClassDefinition = null;
    }



    // Wrapper Data definition:
    private class Data {
        String name = null;
        public String getType(){
            return AST.VOID_TYPE;
        }
    }

    private class DataVariable extends Data {
        VariableDef varDef=null;

        public DataVariable(VariableDef def){
            this.varDef = def;
        }
        public DataVariable(ParamDef def){
            this.varDef = new VariableDef(def.getType(),def.getName());
        }
        @Override
        public String getType(){
            return varDef.getType();
        }
    }

    private class DataFunction extends Data {

        FunctionDef functionDef=null;

        public DataFunction(FunctionDef funDef){
            this.functionDef = funDef;
        }

        @Override
        public String getType(){
            return functionDef.getType();
        }
    }


    //Local Variables Stack and methods

    private class LocalScope{
        public Map<String,Data> map = new HashMap<>();
    }

    public void pushLocalStack(){
        localVarScopeStack.push(new LocalScope());
    }

    public void popLocalStack(){
        localVarScopeStack.pop();
    }

    //Class definition

    public void startClassDef(ClassDef c){
        this.currentClassDefinition = c;
    }

    public void endClassDef(){
        this.currentClassDefinition = null;
    }

    public ClassDef getCurrentClassDefinition(){
        return this.currentClassDefinition;
    }

    public void addClassDef(ClassDef def) {
        if (classDefMap.containsKey(def.getName()) || globalMap.containsKey(def.getName())) {
            throw new RuntimeException(def.getName() + " already defined");
        }
        classDefMap.put(def.getName(), def);
    }
    public ClassDef getClassDef(String name) {
        return classDefMap.get(name);
    }

    public void addMethodDef(String className, MethodDef def) {
        methodDefMap.put(className + "." + def.getName(), def);
    }

    public void addFunctionDef(FunctionDef functionDef) {
        FunctionData functionData = new FunctionData(functionDef);
        if (classDefMap.containsKey(functionDef.getIdentifier()) || globalMap.containsKey(functionDef.getIdentifier())) {
            throw new RuntimeException(functionDef.getIdentifier() + " already defined");
        }
        globalMap.put(functionDef.getIdentifier(), functionData);
    }

    public FunctionDef getFunctionDef(String name) {
        Data data = find(name);
        if (data instanceof FunctionData) {
            return ((FunctionData)data).functionDef;
        }
        throw new RuntimeException(name + " is not a function");
    }


    private class FunctionData extends Data {
        FunctionDef functionDef = null;

        public FunctionData(FunctionDef functionDef) {
            this.functionDef = functionDef;
        }

        @Override
        public String getType() {
            return functionDef.getType();
        }
    }
    private Data findLocal(String name) {
        for (LocalScope localScope : localVarScopeStack) {
            Data local = localScope.map.get(name);
            if (local != null) {
                return local;
            }
        }
        return null;
    }
    private Data find(String name) {
        Data loc = findLocal(name);
        if (loc != null) return loc;
        return globalMap.get(name);
    }

    public void addGlobalDef(VariableDef def) {
        DataVariable e = new DataVariable(def);
        if (classDefMap.containsKey(def.getIdentifier()) || globalMap.containsKey(def.getIdentifier())) {
            throw new RuntimeException(def.getIdentifier() + " is already defined");
        }
        globalMap.put(def.getIdentifier(), e);
    }
    public void addLocalDef(VariableDef variableDef) {
        DataVariable dataVariable = new DataVariable(variableDef);
        localVarScopeStack.peek().map.put(variableDef.getIdentifier(), dataVariable);
    }

    public void addLocalDef(ParamDef paramDef) {
        DataVariable dataVariable = new DataVariable(paramDef);
        localVarScopeStack.peek().map.put(paramDef.getName(), dataVariable);
    }




}
