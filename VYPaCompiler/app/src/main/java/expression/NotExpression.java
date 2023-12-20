/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import exceptions.SemanticTypeException;
import tables.SymbolTable;
import codeGenerator.CodeGenerator;

public class NotExpression extends Expression {
    private Expression toBeNegated;
    public NotExpression(Expression toBeNegated) {
        this.toBeNegated = toBeNegated;
    }


    @Override
    public void checkType(SymbolTable st) {
        toBeNegated.checkType(st);
        if (!toBeNegated.getType().equals(BOOL_TYPE)) {
            throw new SemanticTypeException("non boolean");
        }

    }

    @Override
    public String getType() {
        return BOOL_TYPE;
    }

    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {
        String address = cg.generateExpression(toBeNegated); // generate code for the expression and get the address
        cg.addLine("NOT $0 "+address);
    }


}
