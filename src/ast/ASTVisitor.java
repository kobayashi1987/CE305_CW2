package ast;

/**
 * Visitor interface for AST traversal.
 */
public interface ASTVisitor {
    void visit(SelectQuery selectQuery);
    void visit(InsertQuery insertQuery);
    void visit(UpdateQuery updateQuery);
    void visit(DeleteQuery deleteQuery);
    void visit(Condition condition);
    void visit(Column column);
    void visit(Value value);
    void visit(Assignment assignment);
    void visit(ColumnsNode columnsNode);
    // Add other visit methods as needed
}