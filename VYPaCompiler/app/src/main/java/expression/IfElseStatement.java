package expression;

import tables.SymbolTable;

public class IfElseStatement extends AST{
    private Expression condition;
    private AST statement;
    private AST elseStatement;
    public IfElseStatement(Expression condition, AST statement, AST elseStatement) {
        this.condition = condition;
        this.statement = statement;
        this.elseStatement = elseStatement;
    }



    @Override
    public void checkType(SymbolTable st) {

    }


}
