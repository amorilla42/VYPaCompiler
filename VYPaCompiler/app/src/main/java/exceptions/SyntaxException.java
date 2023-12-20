package exceptions;

public class SyntaxException extends CustomException {

    public SyntaxException(String message) {
        super(message, Error.VALUE_SYNTAX);
    }
}
