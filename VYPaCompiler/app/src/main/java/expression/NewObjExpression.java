package expression;

import tables.SymbolTable;

public class NewObjExpression extends Expression{
    private String className;
    private ExpressionList params;
    private ClassDef classDef;

    public NewObjExpression(String className, ExpressionList params) {
        this.className = className;
        this.params = params;
    }

    @Override
    public void checkType(SymbolTable st) {
        params.checkType(st);
        classDef = st.getClassDef(className);
        if (classDef == null) {
            throw new RuntimeException("Invalid class name");
        }
        MethodDef constructor = classDef.getConstructorDef();
        if (!st.checkTypes(constructor.getParams(), params)) {
            throw new RuntimeException("Wrong constructor parameters");
        }

    }

    @Override
    public String getType() {
        return null;
    }
}
