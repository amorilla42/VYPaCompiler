package expression;

import tables.SymbolTable;

public class NotExpression extends Expression {
    private Expression toBeNegated;
    public NotExpression(Expression toBeNegated) {
        this.toBeNegated = toBeNegated;
    }


    @Override
    public void checkType(SymbolTable st) {
        toBeNegated.checkType(st);
        if (!toBeNegated.getType().equals(BOOL_TYPE)) {
            throw new RuntimeException("non boolean");
        }

    }

    @Override
    public String getType() {
        return null;
    }


}
