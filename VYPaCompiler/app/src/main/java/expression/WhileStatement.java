package expression;

import tables.SymbolTable;

public class WhileStatement extends AST{
    public Expression getCondition() {
        return condition;
    }

    public AST getStatement() {
        return statement;
    }

    private Expression condition;
    private AST statement;

    public WhileStatement(Expression condition, AST statement) {
        this.condition = condition;
        this.statement = statement;
    }

    @Override
    public void checkType(SymbolTable st) {

    }
}
