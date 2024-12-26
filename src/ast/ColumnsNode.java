package ast;

import java.util.List;

/**
 * AST node representing a list of columns in a query.
 */
public class ColumnsNode extends ASTNode {
    private final List<Column> columns;

    public ColumnsNode(List<Column> columns) {
        this.columns = columns;
    }

    public List<Column> getColumns() {
        return columns;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}