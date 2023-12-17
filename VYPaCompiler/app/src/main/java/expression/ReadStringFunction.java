package expression;

public class ReadStringFunction extends FunctionInvokeExpression{
    public ReadStringFunction(ExpressionList arguments) {
        super("readString", arguments);
    }

    @Override
    public String getType() {
        return STRING_TYPE;
    }
}
