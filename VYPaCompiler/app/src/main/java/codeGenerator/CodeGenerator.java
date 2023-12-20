package codeGenerator;

import expression.Expression;
import expression.IdentifierExpression;
import expression.IntLiteral;
import expression.StringLiteral;
import tables.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class CodeGenerator {

    private SymbolTable st;
    private AddressTable at;
    private List<String> targetCode;

    public CodeGenerator(SymbolTable st){
        this.st = st;
        this.at = new AddressTable();
        this.targetCode = new ArrayList<>();
    }

    public AddressTable getAddrTable(){
        return at;
    }

    public void addLine(String s){
        this.targetCode.add(s);
    }

    public List<String> getTargetCode(){
        return this.targetCode;
    }

    public void assingVariable(IdentifierExpression id, Expression expr){
        String idType = id.getType();
        String strExpr = generateExpression(expr);

    }

    public String generateExpression(Expression expr){
        if (expr instanceof IntLiteral)
            return String.valueOf(((IntLiteral)expr).getValue());
        else if (expr instanceof StringLiteral)
            return ((StringLiteral)expr).getValue();
        else if (expr instanceof IdentifierExpression)
            return this.at.getAddress(((IdentifierExpression)expr).getIdentifier()).toCode();
        else {
            expr.generateCode(st,this);
            Address add = this.at.addTemp();
            addLine("SET "+add.toCode()+" $0");
            return add.toCode();
        }
    }







}
