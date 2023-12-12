package expression;

import tables.SymbolTable;

public class IfStatement extends AST{
    private Expression condition;
    private AST statement;
    public IfStatement(Expression condition, AST statement) {
        this.condition = condition;
        this.statement = statement;
    }


    @Override
    public void checkType(SymbolTable st) {

    }
}
