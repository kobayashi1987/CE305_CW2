package listeners;

import visitors.CQLBaseListener;
import visitors.CQLParser;

/**
 * Listener to perform basic type checking on CQL statements.
 */
public class CQLTypeCheckListener extends CQLBaseListener {

    // Mock schema: column -> type
    private final java.util.Map<String, String> schema = new java.util.HashMap<>();

    public CQLTypeCheckListener() {
        // Define schema for demonstration
        schema.put("age", "int");
        schema.put("id", "int");
        schema.put("name", "string");
        schema.put("status", "string");
        schema.put("trackingNumber", "int");
        schema.put("date", "string"); // Assuming date is stored as string
        schema.put("price", "int");    // Added for additional test cases
        // Add more columns as needed
    }

    @Override
    public void exitConditionExpr(CQLParser.ConditionExprContext ctx) {
        String column = ctx.IDENTIFIER().getText();
        String expectedType = schema.get(column);
        String literal = ctx.literal().getText();

        if (expectedType != null) {
            if (expectedType.equals("int") && !isNumericLiteral(literal)) {
                System.err.println("Type Error: Column '" + column + "' expects INT but got '" + literal + "'");
            } else if (expectedType.equals("string") && !isStringLiteral(literal)) {
                System.err.println("Type Error: Column '" + column + "' expects STRING but got '" + literal + "'");
            }
        } else {
            System.err.println("Warning: Column '" + column + "' is not defined in the schema.");
        }
    }

    @Override
    public void exitAssignment(CQLParser.AssignmentContext ctx) {
        String column = ctx.IDENTIFIER().getText();
        String expectedType = schema.get(column);
        String literal = ctx.literal().getText();

        if (expectedType != null) {
            if (expectedType.equals("int") && !isNumericLiteral(literal)) {
                System.err.println("Type Error: Column '" + column + "' expects INT but got '" + literal + "'");
            } else if (expectedType.equals("string") && !isStringLiteral(literal)) {
                System.err.println("Type Error: Column '" + column + "' expects STRING but got '" + literal + "'");
            }
        } else {
            System.err.println("Warning: Column '" + column + "' is not defined in the schema.");
        }
    }

    // Helper methods
    private boolean isNumericLiteral(String text) {
        return text.matches("\\d+(\\.\\d+)?");
    }

    private boolean isStringLiteral(String text) {
        return (text.startsWith("'") && text.endsWith("'")) ||
                (text.startsWith("\"") && text.endsWith("\""));
    }
}