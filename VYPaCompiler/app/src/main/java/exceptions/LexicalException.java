package exceptions;

public class LexicalException extends CustomException{
    public LexicalException(String message) {
        super(message, Error.VALUE_LEXICAL);
    }
}
