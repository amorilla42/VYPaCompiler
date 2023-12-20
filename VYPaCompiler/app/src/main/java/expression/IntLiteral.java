/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.CodeGenerator;
import tables.SymbolTable;

public class IntLiteral extends Expression{
    private int value;

    public IntLiteral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {

        cg.addLine("SET $0 "+value);
    }

    @Override
    public void checkType(SymbolTable st) {

    }

    @Override
    public String getType() {
        return INT_TYPE;
    }
}
