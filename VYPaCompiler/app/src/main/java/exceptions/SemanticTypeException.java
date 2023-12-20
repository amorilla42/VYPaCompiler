package exceptions;

public class SemanticTypeException extends CustomException{

    public SemanticTypeException(String message) {
        super(message, Error.VALUE_SEMANTIC_TYPE);
    }
}
