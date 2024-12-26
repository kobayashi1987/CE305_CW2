package ast;

import java.util.List;

/**
 * AST node for UPDATE queries.
 */
public class UpdateQuery extends ASTNode {
    private final String tableName;
    private final List<Assignment> assignments;
    private final Condition whereCondition;

    public UpdateQuery(String tableName, List<Assignment> assignments, Condition whereCondition) {
        this.tableName = tableName;
        this.assignments = assignments;
        this.whereCondition = whereCondition;
    }

    public String getTableName() {
        return tableName;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public Condition getWhereCondition() {
        return whereCondition;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}