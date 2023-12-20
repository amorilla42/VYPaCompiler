/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import tables.SymbolTable;

public class ReturnStatement extends AST{

    private Expression exp;

    public ReturnStatement(Expression exp){
        this.exp=exp;
    }

    public String getType(){
        if (this.exp==null)
            return VOID_TYPE;
        else
            return exp.getType();
    }

    @Override
    public void checkType(SymbolTable st) {
        if (exp != null) {
            exp.checkType(st);
        }

    }
}
