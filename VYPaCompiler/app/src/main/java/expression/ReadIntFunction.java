package expression;

import exceptions.SemanticException;
import tables.SymbolTable;

public class ReadIntFunction extends FunctionInvokeExpression{
    @Override
    public void checkType(SymbolTable st) {
        if (!getArgs().getExpressions().isEmpty()) {
            throw new SemanticException("readInt must have no arguments");
        }
    }

    public ReadIntFunction(ExpressionList arguments) {
        super("readInt", arguments);
    }

    @Override
    public String getType() {
        return INT_TYPE;
    }
}
