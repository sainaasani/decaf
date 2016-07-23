package model.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Majid Vaghari on 7/23/2016.
 */
public class ArrayType {
    private Types         baseType;
    private List<Integer> dimensionLengths;

    public ArrayType(Types baseType, Integer... dimensionLengths) {
        this(baseType, dimensionLengths.length);
        this.dimensionLengths.addAll(Arrays.asList(dimensionLengths));
    }

    public ArrayType(Types baseType, int dimension) {
        this(baseType);
        this.dimensionLengths = new ArrayList<>(dimension);
    }

    public ArrayType(Types baseType) {
        this.baseType = baseType;
    }

    public Types getBaseType() {
        return baseType;
    }

    public List<Integer> getDimensionLengths() {
        return dimensionLengths;
    }

    public boolean isPrimitive() {
        return dimensionLengths == null;
    }
}
