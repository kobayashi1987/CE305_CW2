package demo;

import visitors.CQLLexer;
import visitors.CQLParser;
import error.CQLCustomErrorListener;
import listeners.CQLPrintListener;
import listeners.CQLTypeCheckListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Main class to demonstrate the CQL Parser.
 */
public class CQLDemo {
    public static void main(String[] args) {
        // Sample queries
        String[] queries = {
                "SELECT name, age FROM myTable WHERE age > 30;",
                "INSERT INTO customers (name, age) VALUES ('Alice', 25);",
                "UPDATE orders SET status = 'shipped', trackingNumber = 12345 WHERE id = 10;",
                "DELETE FROM logs WHERE date < '2024-01-01';",
                // Intentional type error
                "UPDATE customers SET age = 'abc';",
                // Additional test cases
                "SELECT * FROM employees;", // Assuming '*' is not handled, should produce a warning or error
                "INSERT INTO products (id, name, price) VALUES (101, \"Widget\", 19.99);",
                "DELETE FROM sessions WHERE userId = 42;",
                "UPDATE users SET lastLogin = \"2024-12-25\" WHERE userId = 1;"
        };

        for (String query : queries) {
            System.out.println("===========================================");
            System.out.println("Query: " + query);
            parseAndProcess(query);
            System.out.println("===========================================\n");
        }
    }

    private static void parseAndProcess(String queryText) {
        try {
            // 1. Create a CharStream from the input
            CharStream input = CharStreams.fromString(queryText);

            // 2. Instantiate the lexer
            CQLLexer lexer = new CQLLexer(input);

            // 3. Remove default error listeners and add custom listener
            lexer.removeErrorListeners();
            lexer.addErrorListener(new CQLCustomErrorListener());

            // 4. Create a token stream
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 5. Instantiate the parser
            CQLParser parser = new CQLParser(tokens);

            // 6. Remove default error listeners and add custom listener
            parser.removeErrorListeners();
            parser.addErrorListener(new CQLCustomErrorListener());

            // 7. Begin parsing at the 'query' rule
            ParseTree tree = parser.query();

            // 8. Create a walker and attach listeners
            ParseTreeWalker walker = new ParseTreeWalker();

            // Listener to print the parsed query
            CQLPrintListener printListener = new CQLPrintListener();
            walker.walk(printListener, tree);

            // Listener to perform type checking
            CQLTypeCheckListener typeCheckListener = new CQLTypeCheckListener();
            walker.walk(typeCheckListener, tree);

        } catch (RuntimeException e) {
            // Catch and display syntax errors
            System.err.println("Error while parsing: " + e.getMessage());
        }
    }
}