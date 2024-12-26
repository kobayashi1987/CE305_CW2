package listeners;

import visitors.CQLBaseListener;
import visitors.CQLParser;

/**
 * Listener to print parsed CQL statements in a readable format.
 */
public class CQLPrintListener extends CQLBaseListener {

    @Override
    public void enterSelectStmt(CQLParser.SelectStmtContext ctx) {
        System.out.println(">> Entering SELECT statement");
    }

    @Override
    public void exitSelectStmt(CQLParser.SelectStmtContext ctx) {
        String columns = ctx.columnList().getText();
        String table = ctx.tableName().getText();
        System.out.println("SELECT columns: " + columns + " FROM " + table);

        if (ctx.whereClause() != null) {
            String condition = ctx.whereClause().conditionExpr().getText();
            System.out.println("WHERE: " + condition);
        }
        System.out.println(">> Exiting SELECT statement\n");
    }

    @Override
    public void enterInsertStmt(CQLParser.InsertStmtContext ctx) {
        System.out.println(">> Entering INSERT statement");
    }

    @Override
    public void exitInsertStmt(CQLParser.InsertStmtContext ctx) {
        String table = ctx.tableName().getText();
        String columns = ctx.columnList().getText();
        String values = ctx.valueList().getText();

        System.out.println("INSERT INTO: " + table);
        System.out.println("COLUMNS: " + columns);
        System.out.println("VALUES: " + values);
        System.out.println(">> Exiting INSERT statement\n");
    }

    @Override
    public void enterUpdateStmt(CQLParser.UpdateStmtContext ctx) {
        System.out.println(">> Entering UPDATE statement");
    }

    @Override
    public void exitUpdateStmt(CQLParser.UpdateStmtContext ctx) {
        String table = ctx.tableName().getText();
        String assignments = ctx.assignmentList().getText();
        System.out.println("UPDATE TABLE: " + table);
        System.out.println("SET: " + assignments);

        if (ctx.whereClause() != null) {
            String condition = ctx.whereClause().conditionExpr().getText();
            System.out.println("WHERE: " + condition);
        }
        System.out.println(">> Exiting UPDATE statement\n");
    }

    @Override
    public void enterDeleteStmt(CQLParser.DeleteStmtContext ctx) {
        System.out.println(">> Entering DELETE statement");
    }

    @Override
    public void exitDeleteStmt(CQLParser.DeleteStmtContext ctx) {
        String table = ctx.tableName().getText();
        System.out.println("DELETE FROM: " + table);

        if (ctx.whereClause() != null) {
            String condition = ctx.whereClause().conditionExpr().getText();
            System.out.println("WHERE: " + condition);
        }
        System.out.println(">> Exiting DELETE statement\n");
    }
}

