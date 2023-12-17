package expression;

import tables.SymbolTable;

public class MethodInvokeExpression extends Expression{

    private String type;
    private Expression instance;
    private String methodName;
    private ExpressionList arguments;
    private MethodDef methodDef;

    public MethodInvokeExpression(Expression instance, String methodName, ExpressionList arguments) {
        this.instance = instance;
        this.methodName = methodName;
        this.arguments = arguments;
    }



    @Override
    public String getType() {
        return this.type;
    }


    @Override
    public void checkType(SymbolTable st) {

    }


}
