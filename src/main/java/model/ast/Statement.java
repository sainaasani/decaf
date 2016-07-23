package model.ast;

import java.util.Collection;

/**
 * Created by Majid Vaghari on 7/23/2016.
 */
public class Statement implements Node {
    @Override
    public Node getParent() {
        return null;
    }

    @Override
    public void addChild(Node node) {

    }

    @Override
    public void addChildren(Collection<? extends Node> nodes) {

    }
}
