package model.ast;

import model.type.FunctionType;

/**
 * Created by Majid Vaghari on 7/23/2016.
 */
public class Function extends AbstractNode {
    private Block        code;
    private FunctionType type;
    private String       name;

    public Function(Node parent) {
        super(parent);
    }
}
