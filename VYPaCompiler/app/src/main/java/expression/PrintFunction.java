/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.CodeGenerator;
import exceptions.SemanticException;
import tables.SymbolTable;

public class PrintFunction extends FunctionInvokeExpression{
    @Override
    public void checkType(SymbolTable st) {
        if (getArgs().getExpressions().isEmpty()) {
            throw new SemanticException("Print function requires at least one parameter!");
        }
        getArgs().checkType(st);
    }

    public PrintFunction(ExpressionList arguments) {
        super("print", arguments);
    }

    @Override
    public String getType(){
        return VOID_TYPE;
    }

    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {
        for (Expression e : getArgs().getExpressions()) {
            String address = cg.generateExpression(e); // generate code for the expression and get the address
            if (e.getType().equals(INT_TYPE)) {
                cg.addLine("WRITEI "+address);
            } else if (e.getType().equals(STRING_TYPE)) {
                cg.addLine("WRITES "+address);
            } else {
                throw new SemanticException("Unknown type for print function!");
            }
        }
    }


}
