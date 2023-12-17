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











}
