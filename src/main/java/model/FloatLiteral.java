package model;

/**
 * Created by Majid Vaghari on 4/2/2016.
 */
public class FloatLiteral extends Literal {
    public FloatLiteral(String value, int line, int column) {
        super(value, line, column);
    }

    @Override
    public Type getType() {
        return Type.FLOAT;
    }
}
