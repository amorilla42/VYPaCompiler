// Generated from C:/Users/Andres/Desktop/BRNO PROYECTS/COMPILER PROYECT/VYPaCompiler/VYPaCompiler/src/parserGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link parserGrammar}.
 */
public interface parserGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link parserGrammar#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(parserGrammar.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(parserGrammar.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#genericDef}.
	 * @param ctx the parse tree
	 */
	void enterGenericDef(parserGrammar.GenericDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#genericDef}.
	 * @param ctx the parse tree
	 */
	void exitGenericDef(parserGrammar.GenericDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(parserGrammar.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(parserGrammar.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#paramDefList}.
	 * @param ctx the parse tree
	 */
	void enterParamDefList(parserGrammar.ParamDefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#paramDefList}.
	 * @param ctx the parse tree
	 */
	void exitParamDefList(parserGrammar.ParamDefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#paramDef}.
	 * @param ctx the parse tree
	 */
	void enterParamDef(parserGrammar.ParamDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#paramDef}.
	 * @param ctx the parse tree
	 */
	void exitParamDef(parserGrammar.ParamDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(parserGrammar.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(parserGrammar.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#classExtends}.
	 * @param ctx the parse tree
	 */
	void enterClassExtends(parserGrammar.ClassExtendsContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#classExtends}.
	 * @param ctx the parse tree
	 */
	void exitClassExtends(parserGrammar.ClassExtendsContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(parserGrammar.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(parserGrammar.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#methodDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodDef(parserGrammar.MethodDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#methodDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodDef(parserGrammar.MethodDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(parserGrammar.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(parserGrammar.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(parserGrammar.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(parserGrammar.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(parserGrammar.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(parserGrammar.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(parserGrammar.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(parserGrammar.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(parserGrammar.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(parserGrammar.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(parserGrammar.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(parserGrammar.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(parserGrammar.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(parserGrammar.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#singleDefStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleDefStatement(parserGrammar.SingleDefStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#singleDefStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleDefStatement(parserGrammar.SingleDefStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#varDefStatement}.
	 * @param ctx the parse tree
	 */
	void enterVarDefStatement(parserGrammar.VarDefStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#varDefStatement}.
	 * @param ctx the parse tree
	 */
	void exitVarDefStatement(parserGrammar.VarDefStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(parserGrammar.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(parserGrammar.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#sideEffectExpression}.
	 * @param ctx the parse tree
	 */
	void enterSideEffectExpression(parserGrammar.SideEffectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#sideEffectExpression}.
	 * @param ctx the parse tree
	 */
	void exitSideEffectExpression(parserGrammar.SideEffectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#superConstructor}.
	 * @param ctx the parse tree
	 */
	void enterSuperConstructor(parserGrammar.SuperConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#superConstructor}.
	 * @param ctx the parse tree
	 */
	void exitSuperConstructor(parserGrammar.SuperConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(parserGrammar.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(parserGrammar.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#superMethod}.
	 * @param ctx the parse tree
	 */
	void enterSuperMethod(parserGrammar.SuperMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#superMethod}.
	 * @param ctx the parse tree
	 */
	void exitSuperMethod(parserGrammar.SuperMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#variableStart}.
	 * @param ctx the parse tree
	 */
	void enterVariableStart(parserGrammar.VariableStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#variableStart}.
	 * @param ctx the parse tree
	 */
	void exitVariableStart(parserGrammar.VariableStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(parserGrammar.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(parserGrammar.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#invocation}.
	 * @param ctx the parse tree
	 */
	void enterInvocation(parserGrammar.InvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#invocation}.
	 * @param ctx the parse tree
	 */
	void exitInvocation(parserGrammar.InvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#newObjParams}.
	 * @param ctx the parse tree
	 */
	void enterNewObjParams(parserGrammar.NewObjParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#newObjParams}.
	 * @param ctx the parse tree
	 */
	void exitNewObjParams(parserGrammar.NewObjParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#newObject}.
	 * @param ctx the parse tree
	 */
	void enterNewObject(parserGrammar.NewObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#newObject}.
	 * @param ctx the parse tree
	 */
	void exitNewObject(parserGrammar.NewObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#expUnary}.
	 * @param ctx the parse tree
	 */
	void enterExpUnary(parserGrammar.ExpUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#expUnary}.
	 * @param ctx the parse tree
	 */
	void exitExpUnary(parserGrammar.ExpUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#expMul}.
	 * @param ctx the parse tree
	 */
	void enterExpMul(parserGrammar.ExpMulContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#expMul}.
	 * @param ctx the parse tree
	 */
	void exitExpMul(parserGrammar.ExpMulContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#expAdd}.
	 * @param ctx the parse tree
	 */
	void enterExpAdd(parserGrammar.ExpAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#expAdd}.
	 * @param ctx the parse tree
	 */
	void exitExpAdd(parserGrammar.ExpAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#expRel}.
	 * @param ctx the parse tree
	 */
	void enterExpRel(parserGrammar.ExpRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#expRel}.
	 * @param ctx the parse tree
	 */
	void exitExpRel(parserGrammar.ExpRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#expComparation}.
	 * @param ctx the parse tree
	 */
	void enterExpComparation(parserGrammar.ExpComparationContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#expComparation}.
	 * @param ctx the parse tree
	 */
	void exitExpComparation(parserGrammar.ExpComparationContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#expAnd}.
	 * @param ctx the parse tree
	 */
	void enterExpAnd(parserGrammar.ExpAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#expAnd}.
	 * @param ctx the parse tree
	 */
	void exitExpAnd(parserGrammar.ExpAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#expOr}.
	 * @param ctx the parse tree
	 */
	void enterExpOr(parserGrammar.ExpOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#expOr}.
	 * @param ctx the parse tree
	 */
	void exitExpOr(parserGrammar.ExpOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(parserGrammar.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(parserGrammar.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(parserGrammar.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(parserGrammar.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(parserGrammar.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(parserGrammar.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(parserGrammar.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(parserGrammar.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(parserGrammar.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(parserGrammar.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGrammar#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(parserGrammar.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGrammar#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(parserGrammar.ReturnTypeContext ctx);
}