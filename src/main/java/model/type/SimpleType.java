package model.type;

/**
 * Created by Majid Vaghari on 7/23/2016.
 */
public class SimpleType implements AbstractType {
    private Type type;

    public SimpleType() {
    }

    public SimpleType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
