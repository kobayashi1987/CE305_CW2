package ast;

/**
 * AST node representing a value.
 */
public class Value extends ASTNode {
    private final String value;

    public Value(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}