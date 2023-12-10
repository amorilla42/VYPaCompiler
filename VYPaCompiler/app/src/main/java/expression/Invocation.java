package expression;

import tables.SymbolTable;

public class Invocation extends Expression{

    private String identifier;
    private ExpressionList args;
    private String type;
    private Expression father; //The expression just before this one

    public Invocation(String id, ExpressionList args){
        this.identifier=id;
        this.args = args;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ExpressionList getArgs() {
        return args;
    }

    public Expression getFather() {
        return father;
    }

    public void setFather(Expression father) {
        this.father = father;
    }

    @Override
    public void checkType(SymbolTable st) {

    }

    @Override
    public String getType() {
        return type;
    }
}
