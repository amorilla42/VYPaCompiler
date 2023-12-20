package exceptions;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;

public class CustomErrorStrategy extends DefaultErrorStrategy {
    @Override
    public void reportError(Parser recognizer, RecognitionException e) {
        if (e instanceof LexerNoViableAltException) {
            throw new LexicalException("Unknown token");
        } else {
            throw new SyntaxException("Failed to parse");
        }
    }
}
