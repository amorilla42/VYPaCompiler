package expression;

public class PrintFunction extends FunctionInvokeExpression{
    public PrintFunction(ExpressionList arguments) {
        super("print", arguments);
    }

    @Override
    public String getType(){
        return VOID_TYPE;
    }


}
