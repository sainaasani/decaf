package model.type;

/**
 * Created by Majid Vaghari on 4/2/2016.
 */
public enum Type {
    BOOLEAN,
    CHARACTER,
    FLOAT,
    INTEGER,
    VOID;

    /**
     * Gets one of the types as string and returns the proper type
     *
     * @param type given type as string
     *
     * @return proper type
     */
    public static Type parse(String type) {
        switch (type) {
            case "boolean":
                return BOOLEAN;
            case "char":
                return CHARACTER;
            case "float":
                return FLOAT;
            case "int":
                return INTEGER;
            case "void":
                return VOID;
        }
        return null;
    }
}
