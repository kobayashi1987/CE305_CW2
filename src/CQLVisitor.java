// Generated from CQL.g4 by ANTLR 4.13.2
package visitors;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(CQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQLParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(CQLParser.SelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQLParser#insertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStmt(CQLParser.InsertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQLParser#updateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStmt(CQLParser.UpdateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQLParser#deleteStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStmt(CQLParser.DeleteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQLParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(CQLParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQLParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(CQLParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQLParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(CQLParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CQLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(CQLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQLParser#conditionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpr(CQLParser.ConditionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQLParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(CQLParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQLParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(CQLParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CQLParser.LiteralContext ctx);
}