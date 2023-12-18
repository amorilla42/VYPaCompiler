package expression;

import tables.SymbolTable;

public class LengthFunction extends FunctionInvokeExpression{
    @Override
    public void checkType(SymbolTable st) {
        if (getArgs().getExpressions().size() != 1) {
            throw new RuntimeException("length expects one string argument!");
        }
        Expression e = getArgs().getExpressions().get(0);
        e.checkType(st);
        if (!e.getType().equals(STRING_TYPE)) {
            throw new RuntimeException("length expects one string argument!");
        }
    }

    public LengthFunction(ExpressionList arguments) {
        super("length", arguments);
    }

    @Override
    public String getType(){
        return INT_TYPE;
    }
}
