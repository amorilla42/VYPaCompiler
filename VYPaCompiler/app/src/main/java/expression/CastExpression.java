/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

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
}
