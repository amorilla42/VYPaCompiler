// Generated from VYPAParser.g4 by ANTLR 4.13.0
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VYPAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VYPAParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VYPAParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(VYPAParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#genericDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericDef(VYPAParser.GenericDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(VYPAParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#paramDefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDefList(VYPAParser.ParamDefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#paramDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDef(VYPAParser.ParamDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(VYPAParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#classExtends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExtends(VYPAParser.ClassExtendsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(VYPAParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#methodDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDef(VYPAParser.MethodDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(VYPAParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(VYPAParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(VYPAParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(VYPAParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(VYPAParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(VYPAParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnWithType}
	 * labeled alternative in {@link VYPAParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnWithType(VYPAParser.ReturnWithTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link VYPAParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVoid(VYPAParser.ReturnVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#singleDefStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDefStatement(VYPAParser.SingleDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#varDefStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefStatement(VYPAParser.VarDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStatementDeclare}
	 * labeled alternative in {@link VYPAParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatementDeclare(VYPAParser.ExpressionStatementDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SideEffectAssing}
	 * labeled alternative in {@link VYPAParser#sideEffectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSideEffectAssing(VYPAParser.SideEffectAssingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SideEffectInvokeFunction}
	 * labeled alternative in {@link VYPAParser#sideEffectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSideEffectInvokeFunction(VYPAParser.SideEffectInvokeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SideEffectInvokeMethod}
	 * labeled alternative in {@link VYPAParser#sideEffectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSideEffectInvokeMethod(VYPAParser.SideEffectInvokeMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SideEffectNone}
	 * labeled alternative in {@link VYPAParser#sideEffectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSideEffectNone(VYPAParser.SideEffectNoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#superConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperConstructor(VYPAParser.SuperConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarNone}
	 * labeled alternative in {@link VYPAParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarNone(VYPAParser.VarNoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarMultipleAccess}
	 * labeled alternative in {@link VYPAParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarMultipleAccess(VYPAParser.VarMultipleAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#superMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperMethod(VYPAParser.SuperMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableThis}
	 * labeled alternative in {@link VYPAParser#variableStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableThis(VYPAParser.VariableThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariablePar}
	 * labeled alternative in {@link VYPAParser#variableStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablePar(VYPAParser.VariableParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableNone}
	 * labeled alternative in {@link VYPAParser#variableStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableNone(VYPAParser.VariableNoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableInvokeFunction}
	 * labeled alternative in {@link VYPAParser#variableStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInvokeFunction(VYPAParser.VariableInvokeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link VYPAParser#variableStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(VYPAParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(VYPAParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(VYPAParser.InvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#newObjParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObjParams(VYPAParser.NewObjParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#newObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObject(VYPAParser.NewObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#expUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpUnary(VYPAParser.ExpUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#expMul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMul(VYPAParser.ExpMulContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#expAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAdd(VYPAParser.ExpAddContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#expRel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRel(VYPAParser.ExpRelContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#expComparation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpComparation(VYPAParser.ExpComparationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#expAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAnd(VYPAParser.ExpAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#expOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOr(VYPAParser.ExpOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(VYPAParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(VYPAParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(VYPAParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(VYPAParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(VYPAParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPAParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(VYPAParser.ReturnTypeContext ctx);
}