package model;

import model.type.Types;

/**
 * Created by Majid Vaghari on 4/2/2016.
 */
public class IntegerLiteral extends Literal {
    public IntegerLiteral(String value, int line, int column) {
        super(value, line, column);
    }

    @Override
    public Types getType() {
        return Types.INTEGER;
    }
}
