package expression;

import tables.SymbolTable;

public class ExpressionStatement extends AST{

    private Expression expression;

    public ExpressionStatement(Expression exp){
        this.expression = exp;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void checkType(SymbolTable st) {
        expression.checkType(st);
    }
}
