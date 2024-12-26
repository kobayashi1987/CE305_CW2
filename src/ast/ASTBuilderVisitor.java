package ast;

import visitors.CQLBaseVisitor;
import visitors.CQLParser;

import java.util.ArrayList;
import java.util.List;

/**
 * Visitor to build the AST from the parse tree.
 */
public class ASTBuilderVisitor extends CQLBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitQuery(CQLParser.QueryContext ctx) {
        if (ctx.selectStmt() != null) {
            return visitSelectStmt(ctx.selectStmt());
        } else if (ctx.insertStmt() != null) {
            return visitInsertStmt(ctx.insertStmt());
        } else if (ctx.updateStmt() != null) {
            return visitUpdateStmt(ctx.updateStmt());
        } else if (ctx.deleteStmt() != null) {
            return visitDeleteStmt(ctx.deleteStmt());
        }
        return null;
    }

    @Override
    public ASTNode visitSelectStmt(CQLParser.SelectStmtContext ctx) {
        String tableName = ctx.tableName().getText();

        // Columns
        ColumnsNode columnsNode = (ColumnsNode) visit(ctx.columnList());

        // WHERE clause
        Condition condition = null;
        if (ctx.whereClause() != null) {
            condition = (Condition) visit(ctx.whereClause().conditionExpr());
        }

        return new SelectQuery(tableName, columnsNode, condition);
    }

    @Override
    public ASTNode visitAllColumns(CQLParser.AllColumnsContext ctx) {
        List<Column> columns = new ArrayList<>();
        columns.add(new Column("*"));
        return new ColumnsNode(columns);
    }

    @Override
    public ASTNode visitSpecificColumns(CQLParser.SpecificColumnsContext ctx) {
        List<Column> columns = new ArrayList<>();
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            String columnName = ctx.IDENTIFIER(i).getText();
            columns.add(new Column(columnName));
        }
        return new ColumnsNode(columns);
    }

    @Override
    public ASTNode visitInsertStmt(CQLParser.InsertStmtContext ctx) {
        String tableName = ctx.tableName().getText();

        // Columns
        ColumnsNode columnsNode = (ColumnsNode) visit(ctx.columnList());

        // Values
        List<Value> values = new ArrayList<>();
        CQLParser.ValueListContext valListCtx = ctx.valueList();
        for (int i = 0; i < valListCtx.literal().size(); i++) {
            String literal = valListCtx.literal(i).getText();
            values.add(new Value(literal));
        }

        return new InsertQuery(tableName, columnsNode, values);
    }

    @Override
    public ASTNode visitUpdateStmt(CQLParser.UpdateStmtContext ctx) {
        String tableName = ctx.tableName().getText();

        // Assignments
        List<Assignment> assignments = new ArrayList<>();
        CQLParser.AssignmentListContext assignListCtx = ctx.assignmentList();
        for (int i = 0; i < assignListCtx.assignment().size(); i++) {
            CQLParser.AssignmentContext assignCtx = assignListCtx.assignment(i);
            String column = assignCtx.IDENTIFIER().getText();
            Value value = (Value) visit(assignCtx.literal());
            assignments.add(new Assignment(column, value));
        }

        // WHERE clause
        Condition condition = null;
        if (ctx.whereClause() != null) {
            condition = (Condition) visit(ctx.whereClause().conditionExpr());
        }

        return new UpdateQuery(tableName, assignments, condition);
    }

    @Override
    public ASTNode visitDeleteStmt(CQLParser.DeleteStmtContext ctx) {
        String tableName = ctx.tableName().getText();

        // WHERE clause
        Condition condition = null;
        if (ctx.whereClause() != null) {
            condition = (Condition) visit(ctx.whereClause().conditionExpr());
        }

        return new DeleteQuery(tableName, condition);
    }

    @Override
    public ASTNode visitConditionExpr(CQLParser.ConditionExprContext ctx) {
        String columnName = ctx.IDENTIFIER().getText();
        String operator = ctx.comparison().getText();
        String valueLiteral = ctx.literal().getText();
        Value value = new Value(valueLiteral);

        return new Condition(columnName, operator, value);
    }

    @Override
    public ASTNode visitLiteral(CQLParser.LiteralContext ctx) {
        if (ctx.STRING() != null) {
            return new Value(ctx.STRING().getText());
        } else if (ctx.NUMBER() != null) {
            return new Value(ctx.NUMBER().getText());
        }
        return null;
    }

    // You can override additional visit methods as needed for more AST nodes
}