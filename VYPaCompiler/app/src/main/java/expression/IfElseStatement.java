/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
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
        condition.checkType(st);
        statement.checkType(st);
        elseStatement.checkType(st);

    }


}
