package model.type;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Majid Vaghari on 7/23/2016.
 */
public class ComplexType implements AbstractType {
    private Collection<Type> types;

    public ComplexType() {
        this(new ArrayList<>());
    }

    public ComplexType(Collection<Type> types) {
        this.types = types;
    }

    public void addType(Type t) {
        types.add(t);
    }

    public Collection<Type> getTypes() {
        return types;
    }
}
