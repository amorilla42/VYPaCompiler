package expression;

public class SubStrFunction extends FunctionInvokeExpression{
    public SubStrFunction(ExpressionList arguments) {
        super("subStr", arguments);
    }

    @Override
    public String getType() {
        return STRING_TYPE;
    }
}
