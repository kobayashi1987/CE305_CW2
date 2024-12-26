package ast;

/**
 * Abstract class representing a generic CQL query.
 */
public abstract class Query extends ASTNode {
    private String tableName;

    public Query(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }
}