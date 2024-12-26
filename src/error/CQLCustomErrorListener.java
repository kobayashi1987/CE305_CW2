package error;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

/**
 * Custom error listener to handle syntax errors gracefully.
 */
public class CQLCustomErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        // Custom error message
        String error = "Syntax Error at line " + line + ":" + charPositionInLine + " - " + msg;
        throw new RuntimeException(error);
    }
}
