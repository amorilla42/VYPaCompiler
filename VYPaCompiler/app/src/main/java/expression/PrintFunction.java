package expression;

import exceptions.SemanticException;
import tables.SymbolTable;

public class PrintFunction extends FunctionInvokeExpression{
    @Override
    public void checkType(SymbolTable st) {
        if (getArgs().getExpressions().isEmpty()) {
            throw new SemanticException("Print function requires at least one parameter!");
        }
        getArgs().checkType(st);
    }

    public PrintFunction(ExpressionList arguments) {
        super("print", arguments);
    }

    @Override
    public String getType(){
        return VOID_TYPE;
    }


}
