package expression;

import tables.SymbolTable;

public class ThisExpression extends Expression{

    private ClassDef instance;

    public ThisExpression(){}

    @Override
    public String getType() {
        return null;
    }


    @Override
    public void checkType(SymbolTable st) {

    }


}
