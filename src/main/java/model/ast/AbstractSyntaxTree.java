package model.ast;

import java.util.Collection;

/**
 * Created by Majid Vaghari on 7/22/2016.
 */
public final class AbstractSyntaxTree {
    private Collection<ASTNode> nodes;
    private ASTNode             root;

    public Collection<ASTNode> getNodes() {
        return nodes;
    }
}
