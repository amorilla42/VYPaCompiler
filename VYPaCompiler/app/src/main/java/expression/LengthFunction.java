/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.CodeGenerator;
import exceptions.SemanticException;
import tables.SymbolTable;

public class LengthFunction extends FunctionInvokeExpression{
    @Override
    public void checkType(SymbolTable st) {
        if (getArgs().getExpressions().size() != 1) {
            throw new SemanticException("length expects one string argument!");
        }
        Expression e = getArgs().getExpressions().get(0);
        e.checkType(st);
        if (!e.getType().equals(STRING_TYPE)) {
            throw new SemanticException("length expects one string argument!");
        }
    }

    public LengthFunction(ExpressionList arguments) {
        super("length", arguments);
    }

    @Override
    public String getType(){
        return INT_TYPE;
    }

    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {
        getArgs().getExpressions().get(0).generateCode(st, cg);
        cg.addLine("GETSIZE $0 $0");
    }
}
