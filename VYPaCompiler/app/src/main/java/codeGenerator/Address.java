package codeGenerator;

public class Address {
    public enum Type {IN_REGISTER,STACK_ABS,STACK_REL}
    private Type type;
    private int address;

    public Address(Type type, int address){
        this.address=address;
        this.type=type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public String toCode(){
        if (this.type == Type.IN_REGISTER)
            return "$"+this.address;
        if (this.type == Type.STACK_ABS)
            return "["+this.address+"]";
        else {
            if (this.address<0)
                return "[$SP"+this.address+"]";
            else
                return "[$SP"+"+"+this.address+"]";

        }
    }


}
