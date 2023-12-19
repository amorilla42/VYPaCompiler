package expression;

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

    @Override
    public void checkType(SymbolTable st) {
        leftExp.checkType(st);
        rightExp.checkType(st);
        String leftType = leftExp.getType();
        String rightType = rightExp.getType();
        if (leftType == null || rightType == null) {
            throw new RuntimeException("Operand type is null " + leftType + operation.name() + rightType);
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
                if (INT_TYPE.equals(leftType)) {
                    if (INT_TYPE.equals(rightType)) {
                        type = INT_TYPE;
                        break;
                    }
                }
                throw new RuntimeException("Binary operation incompatible with provided types");
            }
            case EQ:
            case NEQ:
                if (leftType.equals(rightType)) {
                    type = leftType;
                    break;
                }
                throw new RuntimeException("Comparing incompatible types");
            case LT:
            case LE:
            case GT:
            case GE:
                if (INT_TYPE.equals(leftType)) {
                    if (INT_TYPE.equals(rightType)) {
                        type = BOOL_TYPE;
                        break;
                    }
                } else if (STRING_TYPE.equals(leftType)) {
                    if (STRING_TYPE.equals(rightType)) {
                        type = BOOL_TYPE;
                        break;
                    }
                }
                throw new RuntimeException("Comparing non numeric types");
            case AND:
            case OR:
                if (INT_TYPE.equals(leftType) || BOOL_TYPE.equals(leftType)) {
                    if (INT_TYPE.equals(rightType) || BOOL_TYPE.equals(rightType)) {
                        type = BOOL_TYPE;
                        break;
                    }
                }
                throw new RuntimeException("Binary operation on invalid types");
        }

    }

    @Override
    public String getType() {
        return null;
    }
}
