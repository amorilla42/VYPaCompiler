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

    }


}
