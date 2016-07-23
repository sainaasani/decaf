package model.ast;

import java.util.Collection;

/**
 * Created by Majid Vaghari on 7/22/2016.
 */
public interface Node {
    Node getParent();

    void addChild(Node node);

    void addChildren(Collection<? extends Node> nodes);

    Collection<? extends Node> getChildren();
}
