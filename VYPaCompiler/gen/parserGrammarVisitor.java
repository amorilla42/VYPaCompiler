// Generated from C:/Users/Andres/Desktop/BRNO PROYECTS/COMPILER PROYECT/VYPaCompiler/VYPaCompiler/src/parserGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link parserGrammar}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface parserGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link parserGrammar#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(parserGrammar.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#genericDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericDef(parserGrammar.GenericDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(parserGrammar.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#paramDefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDefList(parserGrammar.ParamDefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#paramDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDef(parserGrammar.ParamDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(parserGrammar.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#classExtends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExtends(parserGrammar.ClassExtendsContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(parserGrammar.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#methodDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDef(parserGrammar.MethodDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(parserGrammar.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(parserGrammar.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(parserGrammar.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(parserGrammar.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(parserGrammar.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(parserGrammar.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(parserGrammar.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#singleDefStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDefStatement(parserGrammar.SingleDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#varDefStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefStatement(parserGrammar.VarDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(parserGrammar.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#sideEffectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSideEffectExpression(parserGrammar.SideEffectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#superConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperConstructor(parserGrammar.SuperConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(parserGrammar.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#superMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperMethod(parserGrammar.SuperMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#variableStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStart(parserGrammar.VariableStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(parserGrammar.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(parserGrammar.InvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#newObjParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObjParams(parserGrammar.NewObjParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#newObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObject(parserGrammar.NewObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#expUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpUnary(parserGrammar.ExpUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#expMul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMul(parserGrammar.ExpMulContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#expAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAdd(parserGrammar.ExpAddContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#expRel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRel(parserGrammar.ExpRelContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#expComparation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpComparation(parserGrammar.ExpComparationContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#expAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAnd(parserGrammar.ExpAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#expOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOr(parserGrammar.ExpOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(parserGrammar.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(parserGrammar.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(parserGrammar.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(parserGrammar.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(parserGrammar.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGrammar#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(parserGrammar.ReturnTypeContext ctx);
}