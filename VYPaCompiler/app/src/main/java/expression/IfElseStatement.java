/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.CodeGenerator;
import tables.SymbolTable;

public class IfElseStatement extends AST{
    private Expression condition;
    private AST statement;
    private AST elseStatement;
    public IfElseStatement(Expression condition, AST statement, AST elseStatement) {
        this.condition = condition;
        this.statement = statement;
        this.elseStatement = elseStatement;
    }



    @Override
    public void checkType(SymbolTable st) {
        condition.checkType(st);
        statement.checkType(st);
        elseStatement.checkType(st);

    }

    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {
        String elseLabel = st.getUniqueLabel();
        String endLabel = st.getUniqueLabel();
        this.condition.generateCode(st,cg);
        cg.addLine("JUMPZ "+elseLabel+" $0");
        this.statement.generateCode(st,cg);
        cg.addLine("JUMP "+endLabel);
        cg.addLine("LABEL "+elseLabel);
        this.elseStatement.generateCode(st,cg);
        cg.addLine("LABEL "+endLabel);
    }
}
