/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.CodeGenerator;
import exceptions.SemanticTypeException;
import tables.SymbolTable;

public class BinaryExpression extends Expression{
    private Expression leftExp;
    private Expression rightExp;
    private  BinaryOp operation;
    private String type = null;
    public Expression getLeftExp() {
        return leftExp;
    }

    public Expression getRightExp() {
        return rightExp;
    }

    public BinaryOp getOperation() {
        return operation;
    }

    public BinaryExpression(Expression leftExp, Expression rightExp, BinaryOp operation) {
        this.leftExp = leftExp;
        this.rightExp = rightExp;
        this.operation = operation;
    }

    /**
     * This method checks the type of the binary expression.
     * It checks the types of the left and right expressions and ensures they are compatible with the operation.
     * Equality and inequality checks can be performed between any two types as long as they are the same.
     * Less than, less than or equal to, greater than, and greater than or equal to operations are only allowed between two integers or two strings.
     * And and Or operations are only allowed between two integers or two booleans.
     *
     * @param st The symbol table to use for type checking.
     * @throws SemanticTypeException If the types of the left and right expressions are not compatible with the operation.
     */
    @Override
    public void checkType(SymbolTable st) {
        leftExp.checkType(st);
        rightExp.checkType(st);
        String leftType = leftExp.getType();
        String rightType = rightExp.getType();
        if (leftType == null || rightType == null) {
            throw new SemanticTypeException("at least one type is null: " + leftType + " "+ operation.name() +" "+ rightType);
        }
        switch (operation) {
            case ADD:
                if (STRING_TYPE.equals(leftType) && STRING_TYPE.equals(rightType)) {
                    type = STRING_TYPE;
                    break;
                }
            case SUB:
            case MUL:
            case DIV: {
                if (INT_TYPE.equals(leftType) && INT_TYPE.equals(rightType)) {
                    type = INT_TYPE;
                    break;
                }
                throw new SemanticTypeException("Type mismatch for operation " + operation.name() + ".Got Left type: " + leftType + ", Right type: " + rightType);

            }
            case EQ:
            case NEQ:
                if (leftType.equals(rightType)) {
                    type = leftType;
                    break;
                }
                throw new SemanticTypeException("Incompatible types for comparison in " + operation.name() + " operation. Left type: " + leftType + ", Right type: " + rightType);

            case LT:
            case LE:
            case GT:
            case GE:
                if ((INT_TYPE.equals(leftType) && INT_TYPE.equals(rightType)) ||
                        (STRING_TYPE.equals(leftType) && STRING_TYPE.equals(rightType))) {
                    type = BOOL_TYPE;
                    break;
                } else {
                    throw new SemanticTypeException("Non-numeric types in " + operation.name() + " operation.Got Left type: " + leftType + ", Right type: " + rightType);

                }
            case AND:
            case OR:
                if ((INT_TYPE.equals(leftType) || BOOL_TYPE.equals(leftType)) &&
                        (INT_TYPE.equals(rightType) || BOOL_TYPE.equals(rightType))) {
                    type = BOOL_TYPE;
                    break;
                }
                throw new SemanticTypeException("Invalid types for binary operation " + operation.name() + ".Got Left type: " + leftType + ", Right type: " + rightType);

        }

    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg){
        String left = cg.generateExpression(leftExp);
        String right = cg.generateExpression(rightExp);

        String operator = null;

        switch (this.operation){
            case ADD:
                if(this.type.equals(STRING_TYPE)){
                    //concatenation of strings
                    int allocatedLocalVars = cg.getAddrTable().localVarsSize();
                    int offsetSP = allocatedLocalVars + 3; // 3 is the size of the return address and the saved registers for the concat function
                    cg.addLine("SET [$SP+" + (offsetSP-2) + "] " + left);
                    cg.addLine("SET [$SP+" + (offsetSP-3) + "] " + right);
                    cg.addLine("ADDI $SP $SP " + offsetSP); // move the stack pointer to the first parameter
                    cg.addLine("CALL [$SP-1] " + CONCAT_FUN_LABEL );
                    cg.addLine("SUBI $SP $SP " + offsetSP); // restore the stack pointer
                    return;
                }
                operator = "ADDI";
                break;
            case SUB:
                operator = "SUBI";
                break;
            case MUL:
                operator = "MULI";
                break;
            case DIV:
                operator = "DIVI";
                break;
            case EQ, NEQ:
                operator = "EQ";
                break;
            case LT, GE:
                operator = "LT";
                break;
            case LE,GT:
                operator = "GT";
                break;
            case AND:
                operator = "AND";
                break;
            case OR:
                operator = "OR";
                break;
        }
        if (this.operation == BinaryOp.EQ || this.operation == BinaryOp.NEQ
                || this.operation == BinaryOp.LT || this.operation == BinaryOp.GT
                || this.operation == BinaryOp.LE || this.operation == BinaryOp.GE ){
            if (leftExp.getType().equals(INT_TYPE))
                operator += "I";
            else if (leftExp.getType().equals(STRING_TYPE))
                operator += "S";
        }
        cg.addLine(operator + " $0 " + left + " " + right); //The result is stored in $0
        if (this.operation == BinaryOp.NEQ || this.operation == BinaryOp.LE || this.operation == BinaryOp.GE ){
            cg.addLine("NOT $0 $0");
        }

    }
}
