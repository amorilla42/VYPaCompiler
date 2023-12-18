package expression;

import tables.SymbolTable;

import java.util.List;

public class ClassDef extends AST {
    private ClassDef superClassDef;
    private String name;
    private String superClass;
    private List<VariableDef> variableDefs;
    private List<MethodDef> methodDefs;
    public void setSuperClassDef(ClassDef superClassDef) {
        this.superClassDef = superClassDef;
    }

    public String getName() {
        return name;
    }

    public String getSuperClass() {
        return superClass;
    }

    public List<VariableDef> getVariableDefs() {
        return variableDefs;
    }

    public List<MethodDef> getMethodDefs() {
        return methodDefs;
    }

    public ClassDef(String name, String classExtends, List<VariableDef> variableDefs, List<MethodDef> methodDefs) {
        this.name = name;
        this.superClass = classExtends;
        this.variableDefs = variableDefs;
        this.methodDefs = methodDefs;
    }



    @Override
    public void checkType(SymbolTable st) {

    }
}
