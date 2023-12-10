// Generated from VYPAParser.g4 by ANTLR 4.13.0
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VYPAParser}.
 */
public interface VYPAParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VYPAParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(VYPAParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(VYPAParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#genericDef}.
	 * @param ctx the parse tree
	 */
	void enterGenericDef(VYPAParser.GenericDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#genericDef}.
	 * @param ctx the parse tree
	 */
	void exitGenericDef(VYPAParser.GenericDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(VYPAParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(VYPAParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#paramDefList}.
	 * @param ctx the parse tree
	 */
	void enterParamDefList(VYPAParser.ParamDefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#paramDefList}.
	 * @param ctx the parse tree
	 */
	void exitParamDefList(VYPAParser.ParamDefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#paramDef}.
	 * @param ctx the parse tree
	 */
	void enterParamDef(VYPAParser.ParamDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#paramDef}.
	 * @param ctx the parse tree
	 */
	void exitParamDef(VYPAParser.ParamDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(VYPAParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(VYPAParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#classExtends}.
	 * @param ctx the parse tree
	 */
	void enterClassExtends(VYPAParser.ClassExtendsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#classExtends}.
	 * @param ctx the parse tree
	 */
	void exitClassExtends(VYPAParser.ClassExtendsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(VYPAParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(VYPAParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#methodDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodDef(VYPAParser.MethodDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#methodDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodDef(VYPAParser.MethodDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(VYPAParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(VYPAParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(VYPAParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(VYPAParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(VYPAParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(VYPAParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(VYPAParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(VYPAParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(VYPAParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(VYPAParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(VYPAParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(VYPAParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnWithType}
	 * labeled alternative in {@link VYPAParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnWithType(VYPAParser.ReturnWithTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnWithType}
	 * labeled alternative in {@link VYPAParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnWithType(VYPAParser.ReturnWithTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link VYPAParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnVoid(VYPAParser.ReturnVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link VYPAParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnVoid(VYPAParser.ReturnVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#singleDefStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleDefStatement(VYPAParser.SingleDefStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#singleDefStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleDefStatement(VYPAParser.SingleDefStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#varDefStatement}.
	 * @param ctx the parse tree
	 */
	void enterVarDefStatement(VYPAParser.VarDefStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#varDefStatement}.
	 * @param ctx the parse tree
	 */
	void exitVarDefStatement(VYPAParser.VarDefStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStatementDeclare}
	 * labeled alternative in {@link VYPAParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatementDeclare(VYPAParser.ExpressionStatementDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStatementDeclare}
	 * labeled alternative in {@link VYPAParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatementDeclare(VYPAParser.ExpressionStatementDeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SideEffectAssing}
	 * labeled alternative in {@link VYPAParser#sideEffectExpression}.
	 * @param ctx the parse tree
	 */
	void enterSideEffectAssing(VYPAParser.SideEffectAssingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SideEffectAssing}
	 * labeled alternative in {@link VYPAParser#sideEffectExpression}.
	 * @param ctx the parse tree
	 */
	void exitSideEffectAssing(VYPAParser.SideEffectAssingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SideEffectInvokeFunction}
	 * labeled alternative in {@link VYPAParser#sideEffectExpression}.
	 * @param ctx the parse tree
	 */
	void enterSideEffectInvokeFunction(VYPAParser.SideEffectInvokeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SideEffectInvokeFunction}
	 * labeled alternative in {@link VYPAParser#sideEffectExpression}.
	 * @param ctx the parse tree
	 */
	void exitSideEffectInvokeFunction(VYPAParser.SideEffectInvokeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SideEffectInvokeMethod}
	 * labeled alternative in {@link VYPAParser#sideEffectExpression}.
	 * @param ctx the parse tree
	 */
	void enterSideEffectInvokeMethod(VYPAParser.SideEffectInvokeMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SideEffectInvokeMethod}
	 * labeled alternative in {@link VYPAParser#sideEffectExpression}.
	 * @param ctx the parse tree
	 */
	void exitSideEffectInvokeMethod(VYPAParser.SideEffectInvokeMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SideEffectNone}
	 * labeled alternative in {@link VYPAParser#sideEffectExpression}.
	 * @param ctx the parse tree
	 */
	void enterSideEffectNone(VYPAParser.SideEffectNoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SideEffectNone}
	 * labeled alternative in {@link VYPAParser#sideEffectExpression}.
	 * @param ctx the parse tree
	 */
	void exitSideEffectNone(VYPAParser.SideEffectNoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#superConstructor}.
	 * @param ctx the parse tree
	 */
	void enterSuperConstructor(VYPAParser.SuperConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#superConstructor}.
	 * @param ctx the parse tree
	 */
	void exitSuperConstructor(VYPAParser.SuperConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarNone}
	 * labeled alternative in {@link VYPAParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVarNone(VYPAParser.VarNoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarNone}
	 * labeled alternative in {@link VYPAParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVarNone(VYPAParser.VarNoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarMultipleAccess}
	 * labeled alternative in {@link VYPAParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVarMultipleAccess(VYPAParser.VarMultipleAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarMultipleAccess}
	 * labeled alternative in {@link VYPAParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVarMultipleAccess(VYPAParser.VarMultipleAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#superMethod}.
	 * @param ctx the parse tree
	 */
	void enterSuperMethod(VYPAParser.SuperMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#superMethod}.
	 * @param ctx the parse tree
	 */
	void exitSuperMethod(VYPAParser.SuperMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableThis}
	 * labeled alternative in {@link VYPAParser#variableStart}.
	 * @param ctx the parse tree
	 */
	void enterVariableThis(VYPAParser.VariableThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableThis}
	 * labeled alternative in {@link VYPAParser#variableStart}.
	 * @param ctx the parse tree
	 */
	void exitVariableThis(VYPAParser.VariableThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariablePar}
	 * labeled alternative in {@link VYPAParser#variableStart}.
	 * @param ctx the parse tree
	 */
	void enterVariablePar(VYPAParser.VariableParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariablePar}
	 * labeled alternative in {@link VYPAParser#variableStart}.
	 * @param ctx the parse tree
	 */
	void exitVariablePar(VYPAParser.VariableParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableNone}
	 * labeled alternative in {@link VYPAParser#variableStart}.
	 * @param ctx the parse tree
	 */
	void enterVariableNone(VYPAParser.VariableNoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableNone}
	 * labeled alternative in {@link VYPAParser#variableStart}.
	 * @param ctx the parse tree
	 */
	void exitVariableNone(VYPAParser.VariableNoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableInvokeFunction}
	 * labeled alternative in {@link VYPAParser#variableStart}.
	 * @param ctx the parse tree
	 */
	void enterVariableInvokeFunction(VYPAParser.VariableInvokeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableInvokeFunction}
	 * labeled alternative in {@link VYPAParser#variableStart}.
	 * @param ctx the parse tree
	 */
	void exitVariableInvokeFunction(VYPAParser.VariableInvokeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link VYPAParser#variableStart}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(VYPAParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link VYPAParser#variableStart}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(VYPAParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(VYPAParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(VYPAParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#invocation}.
	 * @param ctx the parse tree
	 */
	void enterInvocation(VYPAParser.InvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#invocation}.
	 * @param ctx the parse tree
	 */
	void exitInvocation(VYPAParser.InvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#newObjParams}.
	 * @param ctx the parse tree
	 */
	void enterNewObjParams(VYPAParser.NewObjParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#newObjParams}.
	 * @param ctx the parse tree
	 */
	void exitNewObjParams(VYPAParser.NewObjParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#newObject}.
	 * @param ctx the parse tree
	 */
	void enterNewObject(VYPAParser.NewObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#newObject}.
	 * @param ctx the parse tree
	 */
	void exitNewObject(VYPAParser.NewObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#expUnary}.
	 * @param ctx the parse tree
	 */
	void enterExpUnary(VYPAParser.ExpUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#expUnary}.
	 * @param ctx the parse tree
	 */
	void exitExpUnary(VYPAParser.ExpUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#expMul}.
	 * @param ctx the parse tree
	 */
	void enterExpMul(VYPAParser.ExpMulContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#expMul}.
	 * @param ctx the parse tree
	 */
	void exitExpMul(VYPAParser.ExpMulContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#expAdd}.
	 * @param ctx the parse tree
	 */
	void enterExpAdd(VYPAParser.ExpAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#expAdd}.
	 * @param ctx the parse tree
	 */
	void exitExpAdd(VYPAParser.ExpAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#expRel}.
	 * @param ctx the parse tree
	 */
	void enterExpRel(VYPAParser.ExpRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#expRel}.
	 * @param ctx the parse tree
	 */
	void exitExpRel(VYPAParser.ExpRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#expComparation}.
	 * @param ctx the parse tree
	 */
	void enterExpComparation(VYPAParser.ExpComparationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#expComparation}.
	 * @param ctx the parse tree
	 */
	void exitExpComparation(VYPAParser.ExpComparationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#expAnd}.
	 * @param ctx the parse tree
	 */
	void enterExpAnd(VYPAParser.ExpAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#expAnd}.
	 * @param ctx the parse tree
	 */
	void exitExpAnd(VYPAParser.ExpAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#expOr}.
	 * @param ctx the parse tree
	 */
	void enterExpOr(VYPAParser.ExpOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#expOr}.
	 * @param ctx the parse tree
	 */
	void exitExpOr(VYPAParser.ExpOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(VYPAParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(VYPAParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(VYPAParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(VYPAParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(VYPAParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(VYPAParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(VYPAParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(VYPAParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(VYPAParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(VYPAParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPAParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(VYPAParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPAParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(VYPAParser.ReturnTypeContext ctx);
}