package expression;

import tables.SymbolTable;

public class ReadStringFunction extends FunctionInvokeExpression{
    @Override
    public void checkType(SymbolTable st) {
        if (!getArgs().getExpressions().isEmpty()) {
            throw new RuntimeException("readString expects no arguments!");
        }
    }

    public ReadStringFunction(ExpressionList arguments) {
        super("readString", arguments);
    }

    @Override
    public String getType() {
        return STRING_TYPE;
    }
}
