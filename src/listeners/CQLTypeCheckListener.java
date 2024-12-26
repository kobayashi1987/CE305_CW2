package listeners;

import visitors.CQLBaseListener;
import visitors.CQLParser;

import java.util.HashMap;
import java.util.Map;

/**
 * Listener to perform basic type checking on CQL statements.
 */
public class CQLTypeCheckListener extends CQLBaseListener {

    // Mock schemas: table -> (column -> type)
    private final Map<String, Map<String, String>> schemas = new HashMap<>();

    // Current table being processed
    private String currentTable = null;

    public CQLTypeCheckListener() {
        // Define schemas for demonstration
        Map<String, String> customersSchema = new HashMap<>();
        customersSchema.put("id", "int");
        customersSchema.put("name", "string");
        customersSchema.put("age", "int");
        schemas.put("customers", customersSchema);

        Map<String, String> ordersSchema = new HashMap<>();
        ordersSchema.put("id", "int");
        ordersSchema.put("status", "string");
        ordersSchema.put("trackingNumber", "int");
        ordersSchema.put("userId", "int");
        schemas.put("orders", ordersSchema);

        Map<String, String> logsSchema = new HashMap<>();
        logsSchema.put("id", "int");
        logsSchema.put("date", "string");
        schemas.put("logs", logsSchema);

        // Add more table schemas as needed
    }

    @Override
    public void exitSelectStmt(CQLParser.SelectStmtContext ctx) {
        currentTable = ctx.tableName().getText();
    }

    @Override
    public void exitInsertStmt(CQLParser.InsertStmtContext ctx) {
        currentTable = ctx.tableName().getText();
    }

    @Override
    public void exitUpdateStmt(CQLParser.UpdateStmtContext ctx) {
        currentTable = ctx.tableName().getText();
    }

    @Override
    public void exitDeleteStmt(CQLParser.DeleteStmtContext ctx) {
        currentTable = ctx.tableName().getText();
    }

    @Override
    public void exitConditionExpr(CQLParser.ConditionExprContext ctx) {
        String column = ctx.IDENTIFIER().getText();
        String expectedType = getExpectedType(column);
        String literal = ctx.literal().getText();

        if (expectedType != null) {
            if (expectedType.equals("int") && !isNumericLiteral(literal)) {
                System.err.println("Type Error: Column '" + column + "' expects INT but got '" + literal + "'");
            } else if (expectedType.equals("string") && !isStringLiteral(literal)) {
                System.err.println("Type Error: Column '" + column + "' expects STRING but got '" + literal + "'");
            }
        } else {
            System.err.println("Warning: Column '" + column + "' is not defined in the schema for table '" + currentTable + "'.");
        }
    }

    @Override
    public void exitAssignment(CQLParser.AssignmentContext ctx) {
        String column = ctx.IDENTIFIER().getText();
        String expectedType = getExpectedType(column);
        String literal = ctx.literal().getText();

        if (expectedType != null) {
            if (expectedType.equals("int") && !isNumericLiteral(literal)) {
                System.err.println("Type Error: Column '" + column + "' expects INT but got '" + literal + "'");
            } else if (expectedType.equals("string") && !isStringLiteral(literal)) {
                System.err.println("Type Error: Column '" + column + "' expects STRING but got '" + literal + "'");
            }
        } else {
            System.err.println("Warning: Column '" + column + "' is not defined in the schema for table '" + currentTable + "'.");
        }
    }

    // Helper methods
    private String getExpectedType(String column) {
        if (currentTable == null) {
            return null;
        }
        Map<String, String> tableSchema = schemas.get(currentTable.toLowerCase());
        if (tableSchema == null) {
            return null;
        }
        return tableSchema.get(column);
    }

    private boolean isNumericLiteral(String text) {
        return text.matches("\\d+(\\.\\d+)?");
    }

    private boolean isStringLiteral(String text) {
        return (text.startsWith("'") && text.endsWith("'")) ||
                (text.startsWith("\"") && text.endsWith("\""));
    }
}