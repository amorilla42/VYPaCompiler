/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
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
