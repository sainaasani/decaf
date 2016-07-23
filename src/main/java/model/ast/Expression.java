package model.ast;

import model.Symbols;

/**
 * Created by Majid Vaghari on 7/23/2016.
 */
public class Expression extends AbstractNode {
    private Symbols    operation;

    public Expression(Expression parent) {
        super(parent);
    }
}
