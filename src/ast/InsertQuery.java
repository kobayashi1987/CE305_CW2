package ast;

import java.util.List;

/**
 * AST node for INSERT queries.
 */
public class InsertQuery extends ASTNode {
    private final String tableName;
    private final ColumnsNode columns;
    private final List<Value> values;

    public InsertQuery(String tableName, ColumnsNode columns, List<Value> values) {
        this.tableName = tableName;
        this.columns = columns;
        this.values = values;
    }

    public String getTableName() {
        return tableName;
    }

    public ColumnsNode getColumns() {
        return columns;
    }

    public List<Value> getValues() {
        return values;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}