package expression;

import tables.SymbolTable;

public class SuperConstructorExpression extends Expression{
    private ExpressionList args;
    private ClassDef superClass;

    public SuperConstructorExpression(ExpressionList args){
        this.args=args;
    }

    public void setSuperClass(ClassDef superClass) {
        this.superClass = superClass;
    }

    @Override
    public void checkType(SymbolTable st) {
        ClassDef currentclass = st.getCurrentClassDefinition();
        this.superClass = currentclass.getSuperClassDef();

        for (Expression exp : args.getExpressions()){
            exp.checkType(st);
        }
    }

    @Override
    public String getType() {
        return VOID_TYPE;
    }
}
