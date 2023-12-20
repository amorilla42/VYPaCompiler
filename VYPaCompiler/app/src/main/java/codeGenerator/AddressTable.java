package codeGenerator;

import java.util.HashMap;
import java.util.Map;

public class AddressTable {

    private Map<String,Address> globalAdresses;
    private Map<String,Address> localAdresses;
    private int globalCounter;
    private int tempVarCounter;

    public AddressTable(){
        globalAdresses = new HashMap<>();
        localAdresses = new HashMap<>();
        globalCounter = 0;
        tempVarCounter = 0;
    }

    public Address addGlobal(String id){
        Address add = new Address(Address.Type.STACK_ABS,globalCounter);
        globalCounter++;
        globalAdresses.put(id,add);
        return add;
    }

    public Address getAddress(String id){
        Address add = localAdresses.get(id);
        if (add == null)
            add = globalAdresses.get(id);
        if (add == null)
            throw new RuntimeException("Variable "+id+" is not defined");
        return add;
    }

    public Address addLocal(String id){
        Address add = new Address(Address.Type.STACK_REL,localAdresses.size());
        localAdresses.put(id,add);
        return add;
    }

    public void clearLocalAdresses(){
        localAdresses.clear();
    }





}
