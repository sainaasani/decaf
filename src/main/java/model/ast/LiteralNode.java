package model.ast;

import model.Literal;

/**
 * Created by Majid Vaghari on 7/23/2016.
 */
public class LiteralNode extends AbstractNode {
    private Literal literal;

    public LiteralNode(Expression parent) {
        super(parent);
    }
}
