package expression;

import codeGenerator.CodeGenerator;
import tables.SymbolTable;

public abstract class AST {

    public static final String VOID_TYPE = "void";
    public static final String STRING_TYPE = "string";
    public static final String INT_TYPE = "int";
    public static final String BOOL_TYPE = "bool";

    public enum BinaryOp {
        ADD,
        SUB,
        MUL,
        DIV,
        AND,
        OR,
        GT,
        LT,
        GE,
        LE,
        EQ,
        NEQ
    }

    public void generateCode(SymbolTable st, CodeGenerator cg) {}

    public abstract void checkType(SymbolTable st);
}