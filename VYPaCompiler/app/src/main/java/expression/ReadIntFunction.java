package expression;

public class ReadIntFunction extends FunctionInvokeExpression{
    public ReadIntFunction(ExpressionList arguments) {
        super("readInt", arguments);
    }

    @Override
    public String getType() {
        return INT_TYPE;
    }
}
