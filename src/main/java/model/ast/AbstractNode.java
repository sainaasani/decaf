package model.ast;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Majid Vaghari on 7/23/2016.
 */
public abstract class AbstractNode implements ASTNode {
    private final ASTNode                       parent;
    private       Collection<? extends ASTNode> children;

    public AbstractNode(ASTNode parent) {
        this(parent, new ArrayList<>());
    }

    protected AbstractNode(ASTNode parent, Collection<? extends ASTNode> children) {
        this.parent = parent;
        this.children = children;
    }

    @Override
    public ASTNode getParent() {
        return parent;
    }

    @Override
    public void addChild(ASTNode node) {
        children.add(node);
    }

    @Override
    public void addChildren(Collection<? extends ASTNode> nodes) {
        addHelper(children, nodes);
    }

    @Override
    public Collection<? extends ASTNode> getChildren() {
        return children;
    }
}
