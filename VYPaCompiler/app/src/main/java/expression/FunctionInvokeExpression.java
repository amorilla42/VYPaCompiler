package expression;

import tables.SymbolTable;

public class FunctionInvokeExpression extends Expression {

    private String type;
    private String funcId;
    private ExpressionList args;

    public FunctionInvokeExpression(String id, ExpressionList arguments){
        this.args = arguments;
        this.funcId= id;
    }

    ExpressionList getArgs(){return this.args;}

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void checkType(SymbolTable st) {
        args.checkType(st);
        FunctionDef functionDef = st.getFunctionDef(funcId);
        type = functionDef.getType();
        st.checkTypes(functionDef.getParams(), args);

    }


}
