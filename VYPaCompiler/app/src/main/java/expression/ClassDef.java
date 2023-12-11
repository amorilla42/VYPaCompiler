package expression;

import tables.SymbolTable;

import java.util.List;

public class ClassDef extends AST {
    public String getName() {
        return name;
    }

    public String getClassExtends() {
        return classExtends;
    }

    public List<VariableDef> getVariableDefs() {
        return variableDefs;
    }

    public List<MethodDef> getMethodDefs() {
        return methodDefs;
    }

    public ClassDef(String name, String classExtends, List<VariableDef> variableDefs, List<MethodDef> methodDefs) {
        this.name = name;
        this.classExtends = classExtends;
        this.variableDefs = variableDefs;
        this.methodDefs = methodDefs;
    }

    private String name;
    private String classExtends;
    private List<VariableDef> variableDefs;
    private List<MethodDef> methodDefs;
    @Override
    public void checkType(SymbolTable st) {

    }
}
