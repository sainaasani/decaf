package model.ast;

import java.util.Collection;

/**
 * Created by Majid Vaghari on 7/23/2016.
 */
public class Declaration implements ASTNode {
    @Override
    public ASTNode getParent() {
        return null;
    }

    @Override
    public void addChild(ASTNode node) {

    }

    @Override
    public void addChildren(Collection<? extends ASTNode> nodes) {

    }
}
