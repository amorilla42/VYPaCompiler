package expression;

public class LengthFunction extends FunctionInvokeExpression{
    public LengthFunction(ExpressionList arguments) {
        super("length", arguments);
    }

    @Override
    public String getType(){
        return INT_TYPE;
    }
}
