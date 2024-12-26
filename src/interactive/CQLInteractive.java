package interactive;

import ast.*;
import visitors.CQLLexer;
import visitors.CQLParser;
import error.CQLCustomErrorListener;
import listeners.CQLPrintListener;
import listeners.CQLTypeCheckListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Interactive class to parse and process CQL queries from the terminal.
 */
public class CQLInteractive {
    public static void main(String[] args) {
        System.out.println("Welcome to the CQL Interactive Shell!");
        System.out.println("Enter your CQL queries below. Type 'exit;' to quit.\n");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder queryBuilder = new StringBuilder();

        try {
            while (true) {
                System.out.print("CQL> ");
                String line = reader.readLine();

                if (line == null) {
                    // EOF reached
                    break;
                }

                queryBuilder.append(line.trim()).append(" ");

                // Check if the query ends with a semicolon
                if (line.trim().endsWith(";")) {
                    String query = queryBuilder.toString().trim();
                    queryBuilder.setLength(0); // Reset the builder

                    if (query.equalsIgnoreCase("exit;")) {
                        System.out.println("Exiting CQL Interactive Shell. Goodbye!");
                        break;
                    }

                    parseAndProcess(query);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
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

            // 8. Create an AST builder visitor and build the AST
            ASTBuilderVisitor astBuilder = new ASTBuilderVisitor();
            ASTNode ast = astBuilder.visit(tree);

            // 9. Print the AST
            System.out.println("Abstract Syntax Tree (AST):");
            ASTPrinter printer = new ASTPrinter();
            ast.accept(printer);
            System.out.println();

            // 10. Create a walker and attach listeners (optional, as AST already represents the query)
            /*
            ParseTreeWalker walker = new ParseTreeWalker();

            // Listener to print the parsed query
            CQLPrintListener printListener = new CQLPrintListener();
            walker.walk(printListener, tree);

            // Listener to perform type checking
            CQLTypeCheckListener typeCheckListener = new CQLTypeCheckListener();
            walker.walk(typeCheckListener, tree);
            */

            // Alternatively, you can perform type checking directly on the AST
            // by traversing it with a separate visitor or using the existing listeners.

            // For simplicity, we'll keep the existing type checking via listeners.

            // To perform type checking using listeners, uncomment the following:
            /*
            ParseTreeWalker walker = new ParseTreeWalker();
            CQLPrintListener printListener = new CQLPrintListener();
            walker.walk(printListener, tree);

            CQLTypeCheckListener typeCheckListener = new CQLTypeCheckListener();
            walker.walk(typeCheckListener, tree);
            */

            // However, it's more efficient to perform operations directly on the AST.
            // You can implement separate visitors or methods for type checking based on the AST.

        } catch (RuntimeException e) {
            // Catch and display syntax errors
            System.err.println("Error while parsing: " + e.getMessage());
        }
    }
}