package model;

/**
 * Created by Majid Vaghari on 4/2/2016.
 */
public class BooleanLiteral extends Literal {
    public BooleanLiteral(String value, int line, int column) {
        super(Boolean.valueOf(value).toString(), line, column);
    }

    @Override
    public Type getType() {
        return Type.BOOLEAN;
    }
}
