package expression;

import parser.VYPAParser;
import parser.VYPAParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class VYPAParserVisitorImplementation extends VYPAParserBaseVisitor<AST> {

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
