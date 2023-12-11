package expression;

import tables.SymbolTable;

public class CastExpression extends Expression{
    private String type;
    private Expression toBeCast;

    public CastExpression(String type, Expression toBeCast) {
        this.type = type;
        this.toBeCast = toBeCast;
    }

    @Override
    public void checkType(SymbolTable st) {

    }

    @Override
    public String getType() {
        return null;
    }
}
