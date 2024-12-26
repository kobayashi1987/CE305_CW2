package ast;

/**
 * AST node for DELETE queries.
 */
public class DeleteQuery extends ASTNode {
    private final String tableName;
    private final Condition whereCondition;

    public DeleteQuery(String tableName, Condition whereCondition) {
        this.tableName = tableName;
        this.whereCondition = whereCondition;
    }

    public String getTableName() {
        return tableName;
    }

    public Condition getWhereCondition() {
        return whereCondition;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}