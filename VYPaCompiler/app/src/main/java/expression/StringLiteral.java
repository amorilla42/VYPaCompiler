/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import tables.SymbolTable;

public class StringLiteral extends Expression {
    private String value;

    public String getValue() {
        return value;
    }

    public StringLiteral(String value) {
        this.value = value;
    }


    @Override
    public void checkType(SymbolTable st) {

    }

    @Override
    public String getType() {
        return STRING_TYPE;
    }

    @Override
    public void generateCode(SymbolTable st, codeGenerator.CodeGenerator cg) {
        cg.addLine("SET $0 "+this.value);
    }
}
