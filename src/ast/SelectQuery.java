package ast;

/**
 * AST node for SELECT queries.
 */
public class SelectQuery extends ASTNode {
    private final String tableName;
    private final ColumnsNode columns;
    private final Condition whereCondition;

    public SelectQuery(String tableName, ColumnsNode columns, Condition whereCondition) {
        this.tableName = tableName;
        this.columns = columns;
        this.whereCondition = whereCondition;
    }

    public String getTableName() {
        return tableName;
    }

    public ColumnsNode getColumns() {
        return columns;
    }

    public Condition getWhereCondition() {
        return whereCondition;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}