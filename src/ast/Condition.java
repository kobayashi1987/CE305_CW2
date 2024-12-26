package ast;

/**
 * AST node representing a condition in WHERE clause.
 */
public class Condition extends ASTNode {
    private final String columnName;
    private final String operator;
    private final Value value;

    public Condition(String columnName, String operator, Value value) {
        this.columnName = columnName;
        this.operator = operator;
        this.value = value;
    }

    public String getColumnName() {
        return columnName;
    }

    public String getOperator() {
        return operator;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}