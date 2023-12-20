/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.CodeGenerator;
import exceptions.SemanticTypeException;
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
        leftSide.checkType(st);
        rightSide.checkType(st);
        if (!st.checkType(leftSide.getType(), rightSide.getType())) {
            throw new SemanticTypeException("Assignment invalid types: " + leftSide.getType() + " " + rightSide.getType());
        }
        this.type = leftSide.getType();

    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {
        if (this.leftSide instanceof IdentifierExpression){
            cg.assingVariable((IdentifierExpression) this.leftSide,this.rightSide);
        }
    }
}
