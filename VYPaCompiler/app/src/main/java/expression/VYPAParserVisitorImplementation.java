package expression;

import parser.VYPALexer;
import parser.VYPAParser;
import parser.VYPAParserBaseVisitor;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VYPAParserVisitorImplementation extends VYPAParserBaseVisitor<AST> {
    @Override
    public AST visitIfElse(VYPAParser.IfElseContext ctx) {
        Expression condition = (Expression) visit(ctx.expr());
        AST statement = visit(ctx.statement());
        AST elseStatement = visit(ctx.elseStatement());
        return new IfElseStatement(condition, statement, elseStatement);
    }

    @Override
    public AST visitIfThen(VYPAParser.IfThenContext ctx) {
        Expression condition =  (Expression) visit(ctx.expr());
        AST statement = visit(ctx.statement());
        return new IfStatement(condition, statement);
    }

    @Override
    public AST visitElse(VYPAParser.ElseContext ctx) {
        return visit(ctx.statement());
    }

    @Override
    public AST visitWhileStatement(VYPAParser.WhileStatementContext ctx) {
        VYPAParser.ExprContext conditionContext = ctx.expr();
        Expression condition = null;
        if (conditionContext != null) {
            condition = (Expression) visit(conditionContext);
        }
        AST statement = visit(ctx.statement());
        return new WhileStatement(condition, statement);
    }

    @Override
    public AST visitNot(VYPAParser.NotContext ctx) {
        return new NotExpression((Expression) visit(ctx.expUnary()));
    }

    @Override
    public AST visitCast(VYPAParser.CastContext ctx) {
        String type = ctx.dataType().getText();
        Expression toBeCast = (Expression) visit(ctx.expUnary());
        return new CastExpression(type, toBeCast);
    }

    @Override
    public AST visitMult(VYPAParser.MultContext ctx) {
        Expression leftExp = (Expression) visit(ctx.expMul());
        Expression rightExp = (Expression) visit(ctx.expUnary());

        AST.BinaryOp opType;

        if (ctx.op.getType() == VYPALexer.MUL) {
            opType = AST.BinaryOp.MUL;
        } else {
            opType = AST.BinaryOp.DIV;
        }

        return new BinaryExpression(leftExp, rightExp, opType);
    }

    @Override
    public AST visitAdd(VYPAParser.AddContext ctx) {
        Expression leftExp = (Expression) visit(ctx.expAdd());
        Expression rightExp = (Expression) visit(ctx.expMul());

        AST.BinaryOp opType;
        if (ctx.op.getType() == VYPALexer.ADD) {
            opType = AST.BinaryOp.ADD;
        } else {
            opType = AST.BinaryOp.SUB;
        }

        return new BinaryExpression(leftExp, rightExp, opType);
    }

    @Override
    public AST visitRel(VYPAParser.RelContext ctx) {
        Expression leftExp = (Expression) visit(ctx.expAdd(0));
        Expression rightExp = (Expression) visit(ctx.expAdd(1));

        AST.BinaryOp opType;
        int type = ctx.op.getType();
        if (type == VYPALexer.GE) {
            opType = AST.BinaryOp.GE;
        } else if (type == VYPALexer.GT) {
            opType = AST.BinaryOp.GT;
        } else if (type == VYPALexer.LE) {
            opType = AST.BinaryOp.LE;
        } else if (type == VYPALexer.LT) {
            opType = AST.BinaryOp.LT;
        } else {
            throw new RuntimeException("Wrong binary operator");
        }
        return new BinaryExpression(leftExp, rightExp, opType);
    }

    @Override
    public AST visitCompare(VYPAParser.CompareContext ctx) {
        Expression leftExp = (Expression) visit(ctx.expComparation());
        Expression rightExp = (Expression) visit(ctx.expRel());

        AST.BinaryOp opType;
        int type = ctx.op.getType();
        if (type == VYPALexer.EQ) {
            opType = AST.BinaryOp.EQ;
        } else if (type == VYPALexer.NEQ) {
            opType = AST.BinaryOp.NEQ;
        } else {
            throw new RuntimeException("Wrong binary operator");
        }
        return new BinaryExpression(leftExp, rightExp, opType);
    }

    @Override
    public AST visitAnd(VYPAParser.AndContext ctx) {
        Expression leftExp = (Expression) visit(ctx.expAnd());
        Expression rightExp = (Expression) visit(ctx.expComparation());

        return new BinaryExpression(leftExp, rightExp, AST.BinaryOp.AND);
    }

    @Override
    public AST visitOr(VYPAParser.OrContext ctx) {
        Expression leftExp = (Expression) visit(ctx.expOr());
        Expression rightExp = (Expression) visit(ctx.expAnd());
        return new BinaryExpression(leftExp, rightExp, AST.BinaryOp.OR);
    }
    @Override
    public AST visitMethodDef(VYPAParser.MethodDefContext ctx) {
        String type = ctx.returnType().getText();
        String name = ctx.IDENTIFIER().getText();
        List<ParamDef> paramDefs = new ArrayList<>();
        if (ctx.paramDefList() != null) {
            ctx.paramDefList().paramDef().forEach(paramDefContext -> paramDefs.add((ParamDef) visit(paramDefContext)));
        }
        CodeBlock body = (CodeBlock) visit(ctx.codeBlock());
        return new MethodDef(type, name, new ParamDefList(paramDefs), new Statements(body.getStatements()));
    }

    @Override
    public AST visitClassDef(VYPAParser.ClassDefContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        VYPAParser.ClassExtendsContext extendsContext = ctx.classExtends();
        String superClass = "Object";
        if(extendsContext != null){
            superClass = extendsContext.IDENTIFIER().getText();
        }
        List<VariableDef> variableDefs = new ArrayList<>();
        List<MethodDef> methodDefs = new ArrayList<>();

        VYPAParser.ClassBodyContext classBody = ctx.classBody();
        for (VYPAParser.VarDefStatementContext varDefStatementContext : classBody.varDefStatement()) {
            Statements statements = (Statements) visit(varDefStatementContext);
            for (AST statement : statements.getStatements()) {
                if (statement instanceof VariableDef) {
                    variableDefs.add((VariableDef) statement);
                }
            }
        }
        classBody.methodDef().forEach(methodDefContext -> {
            MethodDef methodDef = (MethodDef) visit(methodDefContext);
            methodDefs.add(methodDef);
        });
        return new ClassDef(name,superClass,variableDefs,methodDefs);
    }

    @Override
    public AST visitGenericDef(VYPAParser.GenericDefContext ctx){
        return visitChildren(ctx);
    }

    @Override
    public AST visitProgram(VYPAParser.ProgramContext ctx){
        List<FunctionDef> funcDefs      = new ArrayList<>();
        List<ClassDef>    classDefs     = new ArrayList<>();
        List<VariableDef> globalVarDefs = new ArrayList<>();

        for(VYPAParser.GenericDefContext c : ctx.genericDef()){
            AST obj = visit(c);
            if (obj instanceof FunctionDef){
                funcDefs.add((FunctionDef)obj);
            } else if (obj instanceof ClassDef) {
                classDefs.add((ClassDef)obj);
            } else if (obj instanceof Statements sts) {
                for (AST s : sts.getStatements()){
                    globalVarDefs.add((VariableDef) s);
                }
            } else
                System.err.println("Unable to load program");
        }
        return new Program(funcDefs,classDefs,globalVarDefs);
    }

    @Override
    public AST visitVarDefStatement(VYPAParser.VarDefStatementContext ctx){
        List<AST> singleStatements = new ArrayList<>();
        String type = ctx.dataType().getText();
        for (VYPAParser.SingleDefStatementContext c : ctx.singleDefStatement()){
            String id = c.IDENTIFIER().getText();
            VYPAParser.ExprContext exp = c.expr();
            if (exp == null)
                singleStatements.add(new VariableDef(type,id,null));
            else
                singleStatements.add(new VariableDef(type,id,(Expression)visit(c)));
        }
        return new Statements(singleStatements);
    }

    @Override
    public AST visitFuncDef(VYPAParser.FuncDefContext ctx){
        String typeReturn = ctx.returnType().getText();
        String id = ctx.IDENTIFIER().getText();
        ParamDefList params;
        if (ctx.paramDefList()!= null)
            params = (ParamDefList) visit(ctx.paramDefList());
        else
            params = new ParamDefList(new ArrayList<>());

        CodeBlock code = (CodeBlock) visit(ctx.codeBlock());
        return new FunctionDef(typeReturn,id,params,code);
    }

    @Override
    public AST visitParamDef(VYPAParser.ParamDefContext ctx){
        String id = ctx.IDENTIFIER().getText();
        String type = ctx.dataType().getText();
        return new ParamDef(type,id);
    }

    @Override
    public AST visitReturnVoid(VYPAParser.ReturnVoidContext ctx){
        return new ReturnStatement(null);
    }

    @Override
    public AST visitReturnWithType(VYPAParser.ReturnWithTypeContext ctx){
        return new ReturnStatement((Expression) visit(ctx.expr()));
    }

    @Override
    public AST visitExpressionStatementDeclare(VYPAParser.ExpressionStatementDeclareContext ctx){
        return new ExpressionStatement((Expression) visit(ctx.sideEffectExpression()));
    }

    @Override
    public AST visitSideEffectAssing(VYPAParser.SideEffectAssingContext ctx){
        Expression var  = (Expression) visit(ctx.variable());
        Expression expr = (Expression) visit(ctx.expr());
        return new Assing(var,expr);
    }

    private Expression merge(Expression left, Expression right){
        if (right instanceof Invocation)
            ((Invocation) right).setFather(left);
        else if (right instanceof FieldAccess)
            ((FieldAccess) right).setFather(left);
        return right;
    }

    @Override
    public AST visitCodeBlock(VYPAParser.CodeBlockContext ctx){
        return visit(ctx.statementList());
    }

    @Override
    public AST visitStatementList(VYPAParser.StatementListContext ctx){
        List<AST> statements = new ArrayList<>();
        for (VYPAParser.StatementContext s : ctx.statement()){
            if (s ==null)
                System.err.println("Null StatementContext");
            AST currentStatement = visit(s);
            if (currentStatement == null){
                System.err.println("Null Statement at line "+s.getStart().getLine());
                System.err.println(s.toString());
            }
            statements.add(currentStatement);
        }
        return new CodeBlock(statements);
    }


    @Override
    public AST visitVarMultipleAccess(VYPAParser.VarMultipleAccessContext ctx){
        List<VYPAParser.FieldAccessContext> field = ctx.fieldAccess();
        if (field==null)
            return visit(ctx.variableStart());
        Expression exp = (Expression) visit(ctx.variableStart());
        for (VYPAParser.FieldAccessContext c : ctx.fieldAccess()){
            exp = merge(exp,(Expression)visit(c));
        }
        if (exp instanceof Invocation){
            Invocation i = (Invocation) exp;
            //TODO: NEW INVOKEMETHOD
        }
        return exp;
    }
}