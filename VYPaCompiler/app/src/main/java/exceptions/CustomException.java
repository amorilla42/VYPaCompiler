package exceptions;

public class CustomException extends RuntimeException{
    private int returnValue;

    public int getReturnValue() {
        return returnValue;
    }

    public CustomException(String message, int returnValue) {
        super(message);
        this.returnValue = returnValue;
    }


}
