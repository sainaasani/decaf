package model;

/**
 * Created by Majid Vaghari on 4/3/2016.
 */
public class Keyword extends AbstractToken {
    private Keywords keyword;

    public Keyword(Keywords keyword, int line, int column) {
        super(line, column);
        this.keyword = keyword;
    }

    @Override
    public String getValue() {
        return getKeyword().toString();
    }

    public Keywords getKeyword() {
        return keyword;
    }
}
