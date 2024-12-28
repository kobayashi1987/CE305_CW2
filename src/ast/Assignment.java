package ast;

/**
 * AST node representing an assignment in UPDATE statement.
 */
public class Assignment extends ASTNode {
    private final String columnName;
    private final Value value;

    public Assignment(String columnName, Value value) {
        this.columnName = columnName;
        this.value = value;
    }

    public String getColumnName() {
        return columnName;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}