/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import tables.SymbolTable;

import java.util.List;

public class ExpressionList extends AST {
    private List<Expression> expressions;

    public ExpressionList(List<Expression> exps){
        this.expressions = exps;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public void checkType(SymbolTable st) {
        for (Expression ast : expressions) {
            if(ast != null) {
                ast.checkType(st);
            }
        }
    }


}
