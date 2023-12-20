/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.CodeGenerator;
import tables.SymbolTable;

public class IfStatement extends AST{
    private Expression condition;
    private AST statement;
    public IfStatement(Expression condition, AST statement) {
        this.condition = condition;
        this.statement = statement;
    }


    @Override
    public void checkType(SymbolTable st) {
        condition.checkType(st);
        statement.checkType(st);

    }
    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {
        String endLabel = st.getUniqueLabel();
        this.condition.generateCode(st,cg);
        cg.addLine("JUMPZ "+endLabel+" $0");
        this.statement.generateCode(st,cg);
        cg.addLine("LABEL "+endLabel);
    }
}
