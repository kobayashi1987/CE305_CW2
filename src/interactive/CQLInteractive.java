package interactive;

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