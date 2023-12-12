package expression;

import tables.SymbolTable;

public class NewObjExpression extends Expression{
    private String className;
    private ExpressionList params;

    public NewObjExpression(String className, ExpressionList params) {
        this.className = className;
        this.params = params;
    }

    @Override
    public void checkType(SymbolTable st) {

    }

    @Override
    public String getType() {
        return null;
    }
}
