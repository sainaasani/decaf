package model;

/**
 * Created by Majid Vaghari on 4/2/2016.
 */
public enum Keywords {
    BOOLEAN,
    BREAK,
    CHAR,
    CONTINUE,
    ELSE,
    FALSE,
    FLOAT,
    FOR,
    IF,
    INT,
    READCHAR,
    READFLOAT,
    READINT,
    RETURN,
    TRUE,
    VOID,
    WHILE,
    WRITECHAR,
    WRITEFLOAT,
    WRITEINT;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
