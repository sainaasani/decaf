package model.ast;

import java.util.Collection;

/**
 * Created by Majid Vaghari on 7/22/2016.
 */
public interface ASTNode {
    ASTNode getParent();

    void addChild(ASTNode node);

    void addChildren(Collection<? extends ASTNode> nodes);

    Collection<? extends ASTNode> getChildren();
}
