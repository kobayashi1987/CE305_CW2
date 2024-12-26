// Generated from CQL.g4 by ANTLR 4.13.2
package visitors;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SELECT=2, INSERT=3, INTO=4, VALUES=5, UPDATE=6, DELETE=7, FROM=8, 
		WHERE=9, SET=10, SEMI=11, COMMA=12, LPAREN=13, RPAREN=14, EQ=15, NE=16, 
		LT=17, LE=18, GT=19, GE=20, STRING=21, NUMBER=22, IDENTIFIER=23, WS=24;
	public static final int
		RULE_query = 0, RULE_selectStmt = 1, RULE_insertStmt = 2, RULE_updateStmt = 3, 
		RULE_deleteStmt = 4, RULE_columnList = 5, RULE_valueList = 6, RULE_assignmentList = 7, 
		RULE_assignment = 8, RULE_whereClause = 9, RULE_conditionExpr = 10, RULE_comparison = 11, 
		RULE_tableName = 12, RULE_literal = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "selectStmt", "insertStmt", "updateStmt", "deleteStmt", "columnList", 
			"valueList", "assignmentList", "assignment", "whereClause", "conditionExpr", 
			"comparison", "tableName", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", null, null, null, null, null, null, null, null, null, "';'", 
			"','", "'('", "')'", "'='", null, "'<'", "'<='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SELECT", "INSERT", "INTO", "VALUES", "UPDATE", "DELETE", 
			"FROM", "WHERE", "SET", "SEMI", "COMMA", "LPAREN", "RPAREN", "EQ", "NE", 
			"LT", "LE", "GT", "GE", "STRING", "NUMBER", "IDENTIFIER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public UpdateStmtContext updateStmt() {
			return getRuleContext(UpdateStmtContext.class,0);
		}
		public DeleteStmtContext deleteStmt() {
			return getRuleContext(DeleteStmtContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLVisitor ) return ((CQLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				selectStmt();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				insertStmt();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				updateStmt();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				deleteStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(CQLParser.SELECT, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(CQLParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CQLParser.SEMI, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).exitSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLVisitor ) return ((CQLVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(SELECT);
			setState(35);
			columnList();
			setState(36);
			match(FROM);
			setState(37);
			tableName();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(38);
				whereClause();
				}
			}

			setState(41);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertStmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(CQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(CQLParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(CQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CQLParser.LPAREN, i);
		}
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CQLParser.RPAREN, i);
		}
		public TerminalNode VALUES() { return getToken(CQLParser.VALUES, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CQLParser.SEMI, 0); }
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).enterInsertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).exitInsertStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLVisitor ) return ((CQLVisitor<? extends T>)visitor).visitInsertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStmtContext insertStmt() throws RecognitionException {
		InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(INSERT);
			setState(44);
			match(INTO);
			setState(45);
			tableName();
			setState(46);
			match(LPAREN);
			setState(47);
			columnList();
			setState(48);
			match(RPAREN);
			setState(49);
			match(VALUES);
			setState(50);
			match(LPAREN);
			setState(51);
			valueList();
			setState(52);
			match(RPAREN);
			setState(53);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateStmtContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(CQLParser.UPDATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(CQLParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CQLParser.SEMI, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).enterUpdateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).exitUpdateStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLVisitor ) return ((CQLVisitor<? extends T>)visitor).visitUpdateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStmtContext updateStmt() throws RecognitionException {
		UpdateStmtContext _localctx = new UpdateStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_updateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(UPDATE);
			setState(56);
			tableName();
			setState(57);
			match(SET);
			setState(58);
			assignmentList();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(59);
				whereClause();
				}
			}

			setState(62);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteStmtContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(CQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(CQLParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CQLParser.SEMI, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).enterDeleteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).exitDeleteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLVisitor ) return ((CQLVisitor<? extends T>)visitor).visitDeleteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStmtContext deleteStmt() throws RecognitionException {
		DeleteStmtContext _localctx = new DeleteStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deleteStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(DELETE);
			setState(65);
			match(FROM);
			setState(66);
			tableName();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(67);
				whereClause();
				}
			}

			setState(70);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnListContext extends ParserRuleContext {
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
	 
		public ColumnListContext() { }
		public void copyFrom(ColumnListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpecificColumnsContext extends ColumnListContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CQLParser.COMMA, i);
		}
		public SpecificColumnsContext(ColumnListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).enterSpecificColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).exitSpecificColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLVisitor ) return ((CQLVisitor<? extends T>)visitor).visitSpecificColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllColumnsContext extends ColumnListContext {
		public AllColumnsContext(ColumnListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).enterAllColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).exitAllColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLVisitor ) return ((CQLVisitor<? extends T>)visitor).visitAllColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_columnList);
		int _la;
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new AllColumnsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__0);
				}
				break;
			case IDENTIFIER:
				_localctx = new SpecificColumnsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(IDENTIFIER);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(74);
					match(COMMA);
					setState(75);
					match(IDENTIFIER);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueListContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CQLParser.COMMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLVisitor ) return ((CQLVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			literal();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(84);
				match(COMMA);
				setState(85);
				literal();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CQLParser.COMMA, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLVisitor ) return ((CQLVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			assignment();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(92);
				match(COMMA);
				setState(93);
				assignment();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CQLParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(CQLParser.EQ, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLVisitor ) return ((CQLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(IDENTIFIER);
			setState(100);
			match(EQ);
			setState(101);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CQLParser.WHERE, 0); }
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLVisitor ) return ((CQLVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(WHERE);
			setState(104);
			conditionExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CQLParser.IDENTIFIER, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConditionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).enterConditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).exitConditionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLVisitor ) return ((CQLVisitor<? extends T>)visitor).visitConditionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExprContext conditionExpr() throws RecognitionException {
		ConditionExprContext _localctx = new ConditionExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(IDENTIFIER);
			setState(107);
			comparison();
			setState(108);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(CQLParser.EQ, 0); }
		public TerminalNode NE() { return getToken(CQLParser.NE, 0); }
		public TerminalNode LT() { return getToken(CQLParser.LT, 0); }
		public TerminalNode LE() { return getToken(CQLParser.LE, 0); }
		public TerminalNode GT() { return getToken(CQLParser.GT, 0); }
		public TerminalNode GE() { return getToken(CQLParser.GE, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLVisitor ) return ((CQLVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CQLParser.IDENTIFIER, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLVisitor ) return ((CQLVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CQLParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(CQLParser.NUMBER, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CQLListener ) ((CQLListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQLVisitor ) return ((CQLVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018u\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000!\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003=\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004E\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005M\b\u0005\n\u0005\f\u0005P\t\u0005"+
		"\u0003\u0005R\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"W\b\u0006\n\u0006\f\u0006Z\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007_\b\u0007\n\u0007\f\u0007b\t\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0000\u0000"+
		"\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u0000\u0002\u0001\u0000\u000f\u0014\u0001\u0000\u0015\u0016p\u0000"+
		" \u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004+\u0001"+
		"\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\b@\u0001\u0000\u0000"+
		"\u0000\nQ\u0001\u0000\u0000\u0000\fS\u0001\u0000\u0000\u0000\u000e[\u0001"+
		"\u0000\u0000\u0000\u0010c\u0001\u0000\u0000\u0000\u0012g\u0001\u0000\u0000"+
		"\u0000\u0014j\u0001\u0000\u0000\u0000\u0016n\u0001\u0000\u0000\u0000\u0018"+
		"p\u0001\u0000\u0000\u0000\u001ar\u0001\u0000\u0000\u0000\u001c!\u0003"+
		"\u0002\u0001\u0000\u001d!\u0003\u0004\u0002\u0000\u001e!\u0003\u0006\u0003"+
		"\u0000\u001f!\u0003\b\u0004\u0000 \u001c\u0001\u0000\u0000\u0000 \u001d"+
		"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 \u001f\u0001\u0000"+
		"\u0000\u0000!\u0001\u0001\u0000\u0000\u0000\"#\u0005\u0002\u0000\u0000"+
		"#$\u0003\n\u0005\u0000$%\u0005\b\u0000\u0000%\'\u0003\u0018\f\u0000&("+
		"\u0003\u0012\t\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000)*\u0005\u000b\u0000\u0000*\u0003\u0001\u0000"+
		"\u0000\u0000+,\u0005\u0003\u0000\u0000,-\u0005\u0004\u0000\u0000-.\u0003"+
		"\u0018\f\u0000./\u0005\r\u0000\u0000/0\u0003\n\u0005\u000001\u0005\u000e"+
		"\u0000\u000012\u0005\u0005\u0000\u000023\u0005\r\u0000\u000034\u0003\f"+
		"\u0006\u000045\u0005\u000e\u0000\u000056\u0005\u000b\u0000\u00006\u0005"+
		"\u0001\u0000\u0000\u000078\u0005\u0006\u0000\u000089\u0003\u0018\f\u0000"+
		"9:\u0005\n\u0000\u0000:<\u0003\u000e\u0007\u0000;=\u0003\u0012\t\u0000"+
		"<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>?\u0005\u000b\u0000\u0000?\u0007\u0001\u0000\u0000\u0000@A\u0005"+
		"\u0007\u0000\u0000AB\u0005\b\u0000\u0000BD\u0003\u0018\f\u0000CE\u0003"+
		"\u0012\t\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FG\u0005\u000b\u0000\u0000G\t\u0001\u0000\u0000\u0000"+
		"HR\u0005\u0001\u0000\u0000IN\u0005\u0017\u0000\u0000JK\u0005\f\u0000\u0000"+
		"KM\u0005\u0017\u0000\u0000LJ\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OR\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000QH\u0001\u0000\u0000\u0000QI\u0001"+
		"\u0000\u0000\u0000R\u000b\u0001\u0000\u0000\u0000SX\u0003\u001a\r\u0000"+
		"TU\u0005\f\u0000\u0000UW\u0003\u001a\r\u0000VT\u0001\u0000\u0000\u0000"+
		"WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y\r\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[`\u0003\u0010"+
		"\b\u0000\\]\u0005\f\u0000\u0000]_\u0003\u0010\b\u0000^\\\u0001\u0000\u0000"+
		"\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000a\u000f\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"cd\u0005\u0017\u0000\u0000de\u0005\u000f\u0000\u0000ef\u0003\u001a\r\u0000"+
		"f\u0011\u0001\u0000\u0000\u0000gh\u0005\t\u0000\u0000hi\u0003\u0014\n"+
		"\u0000i\u0013\u0001\u0000\u0000\u0000jk\u0005\u0017\u0000\u0000kl\u0003"+
		"\u0016\u000b\u0000lm\u0003\u001a\r\u0000m\u0015\u0001\u0000\u0000\u0000"+
		"no\u0007\u0000\u0000\u0000o\u0017\u0001\u0000\u0000\u0000pq\u0005\u0017"+
		"\u0000\u0000q\u0019\u0001\u0000\u0000\u0000rs\u0007\u0001\u0000\u0000"+
		"s\u001b\u0001\u0000\u0000\u0000\b \'<DNQX`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}