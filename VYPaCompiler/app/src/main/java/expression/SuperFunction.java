package expression;

import tables.SymbolTable;

public class SuperFunction extends Expression{

    private ExpressionList args;
    private ClassDef superClass;

    public SuperFunction(ExpressionList arguments){
        this.args = arguments;
    }

    public void setSuperClass(ClassDef superClass) {
        this.superClass = superClass;
    }

    @Override
    public String getType() {
        return VOID_TYPE;
    }

    @Override
    public void checkType(SymbolTable st) {

    }


}
