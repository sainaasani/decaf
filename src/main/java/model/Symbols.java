package model;

/**
 * Created by Majid Vaghari on 4/3/2016.
 */
public enum Symbols {
    // Separators
    LPAREN("("),
    RPAREN(")"),
    LBRACE("{"),
    RBRACE("}"),
    LBRACKET("["),
    RBRACKET("]"),
    SEMICOLON(";"),
    COMMA(","),

    // Operators
    MINUS("-"),
    PLUS("+"),
    NOT("!"),
    MULT("*"),
    DIV("/"),
    MOD("%"),
    GT(">"),
    LT("<"),
    GTEQ(">="),
    LTEQ("<="),
    EQ("="),
    EQEQ("=="),
    NOTEQ("!="),
    ANDAND("&&"),
    OROR("||");

    private final String value;

    Symbols(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Symbols{" +
               "name=" + name() +
               "value='" + value + '\'' +
               '}';
    }
}
