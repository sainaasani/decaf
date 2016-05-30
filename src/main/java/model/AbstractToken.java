package model;

/**
 * Created by Majid Vaghari on 4/3/2016.
 */
public abstract class AbstractToken implements Token {
    private int line;
    private int column;

    protected AbstractToken(int line, int column) {
        this.line = line;
        this.column = column;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
               "{" +
               "value='" + getValue() +
               "', line=" + getLine() +
               ", column=" + getColumn() +
               '}';
    }

    @Override
    public int getLine() {
        return this.line;
    }

    @Override
    public int getColumn() {
        return this.column;
    }
}
