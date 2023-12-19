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
}
