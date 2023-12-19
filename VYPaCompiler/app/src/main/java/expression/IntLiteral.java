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
        super.generateCode(st, cg);
    }

    @Override
    public void checkType(SymbolTable st) {

    }

    @Override
    public String getType() {
        return INT_TYPE;
    }
}
