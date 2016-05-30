package compiler;

import model.Token;

/**
 * Created by Majid Vaghari on 5/29/2016.
 */
public class UnexpectedTokenException extends Exception {
    public UnexpectedTokenException(Token token) {
        super("Unexpected Token at line " + token.getLine() + " = " + token.getValue());
    }
}
