/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.CodeGenerator;
import exceptions.SemanticException;
import tables.SymbolTable;

public class ReadIntFunction extends FunctionInvokeExpression{
    @Override
    public void checkType(SymbolTable st) {
        if (!getArgs().getExpressions().isEmpty()) {
            throw new SemanticException("readInt must have no arguments");
        }
    }

    public ReadIntFunction(ExpressionList arguments) {
        super("readInt", arguments);
    }

    @Override
    public String getType() {
        return INT_TYPE;
    }

    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {
        cg.addLine("READI $0");
    }
}
