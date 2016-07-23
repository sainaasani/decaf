package model.ast;

import java.util.Collection;

/**
 * Created by Majid Vaghari on 7/22/2016.
 */
public final class AbstractSyntaxTree {
    private Collection<Node> nodes;
    private Node             root;

    public Collection<Node> getNodes() {
        return nodes;
    }
}
