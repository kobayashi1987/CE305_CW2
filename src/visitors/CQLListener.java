// Generated from CQL.g4 by ANTLR 4.13.2
package visitors;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CQLParser}.
 */
public interface CQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(CQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(CQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(CQLParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(CQLParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void enterInsertStmt(CQLParser.InsertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void exitInsertStmt(CQLParser.InsertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#updateStmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStmt(CQLParser.UpdateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#updateStmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStmt(CQLParser.UpdateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStmt(CQLParser.DeleteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStmt(CQLParser.DeleteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(CQLParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(CQLParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(CQLParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(CQLParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(CQLParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(CQLParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CQLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CQLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(CQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(CQLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpr(CQLParser.ConditionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpr(CQLParser.ConditionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(CQLParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(CQLParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(CQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(CQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CQLParser.LiteralContext ctx);
}