package model;

/**
 * Created by Majid Vaghari on 4/2/2016.
 */
public class PreprocessorDirective extends AbstractToken {
    private String fileName;

    public PreprocessorDirective(String fileName, int line, int column) {
        super(line, column);
        this.fileName = fileName; // TODO consider throwing an exception
    }

    @Override
    public String getValue() {
        return fileName;
    }
}
