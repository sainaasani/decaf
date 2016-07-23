package model.ast;

import java.util.Collection;

/**
 * Created by Majid Vaghari on 7/23/2016.
 */
public class Block extends AbstractNode {
    private Collection<Statement> statements;

    public Block(Node parent) {
        super(parent);
    }
}
