/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import exceptions.SemanticException;
import tables.SymbolTable;

public class ThisExpression extends Expression{

    private ClassDef instance;
    private String type = null;

    public ThisExpression(){}

    @Override
    public String getType() {
        return type;
    }


    @Override
    public void checkType(SymbolTable st) {
        instance = st.getCurrentClassDefinition();
        if (instance == null) {
            throw new SemanticException("This expression is not in a class context.");
        }
        type = instance.getName();
    }


}
