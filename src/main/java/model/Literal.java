package model;

import model.type.Types;

/**
 * Created by Majid Vaghari on 4/2/2016.
 */
public abstract class Literal extends AbstractToken {
    private String value;

    public Literal(String value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public abstract Types getType();

    public String getValue() {
        return value;
    }
}
