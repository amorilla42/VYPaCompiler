/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import exceptions.SemanticException;
import tables.SymbolTable;

public class ReadStringFunction extends FunctionInvokeExpression{
    @Override
    public void checkType(SymbolTable st) {
        if (!getArgs().getExpressions().isEmpty()) {
            throw new SemanticException("readString must have no arguments.");
        }
    }

    public ReadStringFunction(ExpressionList arguments) {
        super("readString", arguments);
    }

    @Override
    public String getType() {
        return STRING_TYPE;
    }

    @Override
    public void generateCode(SymbolTable st, codeGenerator.CodeGenerator cg) {
        cg.addLine("READS $0");
    }
}
