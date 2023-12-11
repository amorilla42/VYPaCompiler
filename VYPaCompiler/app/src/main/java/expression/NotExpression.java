package expression;

import tables.SymbolTable;

public class NotExpression extends Expression {
    private Expression toBeNegated;
    public NotExpression(Expression toBeNegated) {
        this.toBeNegated = toBeNegated;
    }


    @Override
    public void checkType(SymbolTable st) {

    }

    @Override
    public String getType() {
        return null;
    }


}
