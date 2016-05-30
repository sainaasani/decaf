package model;

/**
 * Created by Majid Vaghari on 4/2/2016.
 */
public class Symbol extends AbstractToken {
    private Symbols symbol;

    public Symbol(Symbols symbol, int line, int column) {
        super(line, column);
        this.symbol = symbol;
    }

    @Override
    public String getValue() {
        return getSymbol().getValue();
    }

    public Symbols getSymbol() {
        return symbol;
    }
}
