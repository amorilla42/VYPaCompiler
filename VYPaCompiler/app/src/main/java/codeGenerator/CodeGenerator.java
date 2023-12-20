package codeGenerator;

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









}
