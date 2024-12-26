package ast;

/**
 * Visitor implementation to print the AST.
 */
public class ASTPrinter implements ASTVisitor {

    @Override
    public void visit(SelectQuery selectQuery) {
        System.out.println("SelectQuery:");
        System.out.println("    Table: " + selectQuery.getTableName());
        System.out.println("    Columns:");
        for (Column column : selectQuery.getColumns().getColumns()) {
            System.out.println("        " + column.getName());
        }
        if (selectQuery.getWhereCondition() != null) {
            System.out.println("    Where:");
            selectQuery.getWhereCondition().accept(this);
        }
    }

    @Override
    public void visit(InsertQuery insertQuery) {
        System.out.println("InsertQuery:");
        System.out.println("    Table: " + insertQuery.getTableName());
        System.out.println("    Columns:");
        for (Column column : insertQuery.getColumns().getColumns()) {
            System.out.println("        " + column.getName());
        }
        System.out.println("    Values:");
        for (Value value : insertQuery.getValues()) {
            System.out.println("        " + value.getValue());
        }
    }

    @Override
    public void visit(UpdateQuery updateQuery) {
        System.out.println("UpdateQuery:");
        System.out.println("    Table: " + updateQuery.getTableName());
        System.out.println("    Assignments:");
        for (Assignment assignment : updateQuery.getAssignments()) {
            System.out.println("        " + assignment.getColumnName() + " = " + assignment.getValue().getValue());
        }
        if (updateQuery.getWhereCondition() != null) {
            System.out.println("    Where:");
            updateQuery.getWhereCondition().accept(this);
        }
    }

    @Override
    public void visit(DeleteQuery deleteQuery) {
        System.out.println("DeleteQuery:");
        System.out.println("    Table: " + deleteQuery.getTableName());
        if (deleteQuery.getWhereCondition() != null) {
            System.out.println("    Where:");
            deleteQuery.getWhereCondition().accept(this);
        }
    }

    @Override
    public void visit(Condition condition) {
        System.out.println("        Condition:");
        System.out.println("            Column: " + condition.getColumnName());
        System.out.println("            Operator: " + condition.getOperator());
        System.out.println("            Value: " + condition.getValue().getValue());
    }

    @Override
    public void visit(Column column) {
        // Not used in this printer
    }

    @Override
    public void visit(Value value) {
        // Not used in this printer
    }

    @Override
    public void visit(Assignment assignment) {
        // Not used in this printer
    }

    @Override
    public void visit(ColumnsNode columnsNode) {
        // Not used in this printer
    }
}