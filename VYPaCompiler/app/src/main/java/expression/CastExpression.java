/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.CodeGenerator;
import exceptions.SemanticTypeException;
import tables.SymbolTable;

public class CastExpression extends Expression{
    private String type;
    private Expression toBeCast;

    public CastExpression(String type, Expression toBeCast) {
        this.type = type;
        this.toBeCast = toBeCast;
    }

    @Override
    public void checkType(SymbolTable st) {
        toBeCast.checkType(st);
        if (!st.isCastable(type, toBeCast.getType())) {
            throw new SemanticTypeException("Cannot cast " + toBeCast.getType() + " to " + type);
        }

    }

    @Override
    public String getType() {
        return type;  }

    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {
        toBeCast.generateCode(st,cg);
        if (toBeCast.getType().equals(INT_TYPE) && type.equals(STRING_TYPE))
            cg.addLine("INT2STRING $0 $0");
        else if (toBeCast.getType().equals(STRING_TYPE) && type.equals(INT_TYPE))
            cg.addLine("STRING2INT $0 $0");
        else if (toBeCast.getType().equals(INT_TYPE) && type.equals(INT_TYPE)
                || toBeCast.getType().equals(STRING_TYPE) && type.equals(STRING_TYPE)){
            return ;//it is already in the correct type
        } else
            throw new SemanticTypeException("Cant cast " + toBeCast.getType() + " to " + type);
    }


}
