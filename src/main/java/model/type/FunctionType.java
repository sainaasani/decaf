package model.type;

/**
 * Created by Majid Vaghari on 7/23/2016.
 */
public class FunctionType implements AbstractType {
    private ComplexType input;
    private ComplexType output;

    public FunctionType() {
    }

    public FunctionType(ComplexType input, ComplexType output) {
        this.input = input;
        this.output = output;
    }

    public ComplexType getInput() {
        return input;
    }

    public ComplexType getOutput() {
        return output;
    }
}
