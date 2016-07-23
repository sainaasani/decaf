package model.ast;

import model.type.Types;

/**
 * Created by Majid Vaghari on 7/23/2016.
 */
public class Function extends AbstractNode {
    private Types  inputType;
    private Types  outputType;
    private String name;

    public Function(Node parent) {
        super(parent);
    }
}
