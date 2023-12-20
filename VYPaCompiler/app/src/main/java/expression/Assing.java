package expression;

import codeGenerator.CodeGenerator;
import tables.SymbolTable;

public class Assing extends Expression{

    private Expression leftSide;
    private Expression rightSide;
    private String type;

    public Assing(Expression left, Expression right){
        this.leftSide=left;
        this.rightSide=right;
    }


    @Override
    public void checkType(SymbolTable st) {

    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {
        //TODO: assing to a class attribute
        if (this.leftSide instanceof IdentifierExpression){
            cg.assingVariable((IdentifierExpression) this.leftSide,this.rightSide);
        }
    }
}
