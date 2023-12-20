package exceptions;

public class SemanticException extends CustomException{
    public SemanticException(String message) {
        super(message, Error.VALUE_SEMANTIC);
    }
}
