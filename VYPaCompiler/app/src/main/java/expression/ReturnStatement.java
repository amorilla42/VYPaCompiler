/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.CodeGenerator;
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

    public void generateCode(SymbolTable st, CodeGenerator cg) {
        if (exp != null) {
            cg.addLine("SET $0 "+cg.generateExpression(exp));
        }
        cg.addLine("RETURN [$SP-1]");
    }
}
