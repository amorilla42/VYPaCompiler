/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
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
        ClassDef currentClassDefinition = st.getCurrentClassDefinition();
        superClass = currentClassDefinition.getSuperClassDef();
        for (Expression e : args.getExpressions()) {
            e.checkType(st);
        }

    }


}
