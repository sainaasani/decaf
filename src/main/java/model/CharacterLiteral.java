package model;

/**
 * Created by Majid Vaghari on 4/2/2016.
 */
public class CharacterLiteral extends Literal {
    public CharacterLiteral(String value, int line, int column) {
        super(validate(value), line, column);
    }

    private static String validate(String value) {
        if (value == null || value.isEmpty())
            return ""; // TODO consider throwing an exception

        char val = value.charAt(0);
        if ((val >= 32 && val <= 176) || val == '\n' || val == '\t')
            return String.valueOf(val);
        else
            return ""; // TODO consider throwing an exception
    }

    @Override
    public Type getType() {
        return Type.CHARACTER;
    }
}
