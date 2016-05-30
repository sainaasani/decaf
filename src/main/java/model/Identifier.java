package model;

/**
 * Created by Majid Vaghari on 4/2/2016.
 */
public class Identifier extends AbstractToken {
    private String name;

    public Identifier(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Identifier)) return false;

        Identifier that = (Identifier) o;

        return this.getValue() != null ? this.getValue().equals(that.getValue()) : that.getValue() == null;

    }

    @Override
    public String getValue() {
        return name;
    }
}
