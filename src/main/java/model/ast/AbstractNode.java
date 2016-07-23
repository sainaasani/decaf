package model.ast;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Majid Vaghari on 7/23/2016.
 */
public abstract class AbstractNode implements Node {
    private final Node             parent;
    private       Collection<Node> children;

    public AbstractNode(Node parent) {
        this(parent, new ArrayList<>());
    }

    protected AbstractNode(Node parent, Collection<Node> children) {
        this.parent = parent;
        this.children = children;
    }

    @Override
    public Node getParent() {
        return parent;
    }

    @Override
    public void addChild(Node node) {
        children.add(node);
    }

    @Override
    public void addChildren(Collection<? extends Node> nodes) {
        children.addAll(nodes);
    }

    @Override
    public Collection<Node> getChildren() {
        return children;
    }
}
