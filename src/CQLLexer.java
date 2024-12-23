// Generated from CQL.g4 by ANTLR 4.13.2
package visitors;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, INSERT=2, INTO=3, VALUES=4, UPDATE=5, DELETE=6, FROM=7, WHERE=8, 
		SET=9, SEMI=10, COMMA=11, LPAREN=12, RPAREN=13, EQ=14, NE=15, LT=16, LE=17, 
		GT=18, GE=19, STRING=20, NUMBER=21, IDENTIFIER=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "INSERT", "INTO", "VALUES", "UPDATE", "DELETE", "FROM", "WHERE", 
			"SET", "SEMI", "COMMA", "LPAREN", "RPAREN", "EQ", "NE", "LT", "LE", "GT", 
			"GE", "STRING", "NUMBER", "DIGIT", "IDENTIFIER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "';'", "','", 
			"'('", "')'", "'='", null, "'<'", "'<='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "INSERT", "INTO", "VALUES", "UPDATE", "DELETE", "FROM", 
			"WHERE", "SET", "SEMI", "COMMA", "LPAREN", "RPAREN", "EQ", "NE", "LT", 
			"LE", "GT", "GE", "STRING", "NUMBER", "IDENTIFIER", "WS"
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


	public CQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u00b5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"w\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0087\b\u0013\n\u0013"+
		"\f\u0013\u008a\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u0091\b\u0013\n\u0013\f\u0013\u0094\t\u0013\u0001"+
		"\u0013\u0003\u0013\u0097\b\u0013\u0001\u0014\u0004\u0014\u009a\b\u0014"+
		"\u000b\u0014\f\u0014\u009b\u0001\u0014\u0001\u0014\u0004\u0014\u00a0\b"+
		"\u0014\u000b\u0014\f\u0014\u00a1\u0003\u0014\u00a4\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u00aa\b\u0016\n\u0016"+
		"\f\u0016\u00ad\t\u0016\u0001\u0017\u0004\u0017\u00b0\b\u0017\u000b\u0017"+
		"\f\u0017\u00b1\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0000-\u0016/\u0017\u0001\u0000"+
		"\u0018\u0002\u0000SSss\u0002\u0000EEee\u0002\u0000LLll\u0002\u0000CCc"+
		"c\u0002\u0000TTtt\u0002\u0000IIii\u0002\u0000NNnn\u0002\u0000RRrr\u0002"+
		"\u0000OOoo\u0002\u0000VVvv\u0002\u0000AAaa\u0002\u0000UUuu\u0002\u0000"+
		"PPpp\u0002\u0000DDdd\u0002\u0000FFff\u0002\u0000MMmm\u0002\u0000WWww\u0002"+
		"\u0000HHhh\u0002\u0000\'\'\\\\\u0002\u0000\"\"\\\\\u0001\u000009\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u00be\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000"+
		"\u0000\u00038\u0001\u0000\u0000\u0000\u0005?\u0001\u0000\u0000\u0000\u0007"+
		"D\u0001\u0000\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000bR\u0001\u0000"+
		"\u0000\u0000\rY\u0001\u0000\u0000\u0000\u000f^\u0001\u0000\u0000\u0000"+
		"\u0011d\u0001\u0000\u0000\u0000\u0013h\u0001\u0000\u0000\u0000\u0015j"+
		"\u0001\u0000\u0000\u0000\u0017l\u0001\u0000\u0000\u0000\u0019n\u0001\u0000"+
		"\u0000\u0000\u001bp\u0001\u0000\u0000\u0000\u001dv\u0001\u0000\u0000\u0000"+
		"\u001fx\u0001\u0000\u0000\u0000!z\u0001\u0000\u0000\u0000#}\u0001\u0000"+
		"\u0000\u0000%\u007f\u0001\u0000\u0000\u0000\'\u0096\u0001\u0000\u0000"+
		"\u0000)\u0099\u0001\u0000\u0000\u0000+\u00a5\u0001\u0000\u0000\u0000-"+
		"\u00a7\u0001\u0000\u0000\u0000/\u00af\u0001\u0000\u0000\u000012\u0007"+
		"\u0000\u0000\u000023\u0007\u0001\u0000\u000034\u0007\u0002\u0000\u0000"+
		"45\u0007\u0001\u0000\u000056\u0007\u0003\u0000\u000067\u0007\u0004\u0000"+
		"\u00007\u0002\u0001\u0000\u0000\u000089\u0007\u0005\u0000\u00009:\u0007"+
		"\u0006\u0000\u0000:;\u0007\u0000\u0000\u0000;<\u0007\u0001\u0000\u0000"+
		"<=\u0007\u0007\u0000\u0000=>\u0007\u0004\u0000\u0000>\u0004\u0001\u0000"+
		"\u0000\u0000?@\u0007\u0005\u0000\u0000@A\u0007\u0006\u0000\u0000AB\u0007"+
		"\u0004\u0000\u0000BC\u0007\b\u0000\u0000C\u0006\u0001\u0000\u0000\u0000"+
		"DE\u0007\t\u0000\u0000EF\u0007\n\u0000\u0000FG\u0007\u0002\u0000\u0000"+
		"GH\u0007\u000b\u0000\u0000HI\u0007\u0001\u0000\u0000IJ\u0007\u0000\u0000"+
		"\u0000J\b\u0001\u0000\u0000\u0000KL\u0007\u000b\u0000\u0000LM\u0007\f"+
		"\u0000\u0000MN\u0007\r\u0000\u0000NO\u0007\n\u0000\u0000OP\u0007\u0004"+
		"\u0000\u0000PQ\u0007\u0001\u0000\u0000Q\n\u0001\u0000\u0000\u0000RS\u0007"+
		"\r\u0000\u0000ST\u0007\u0001\u0000\u0000TU\u0007\u0002\u0000\u0000UV\u0007"+
		"\u0001\u0000\u0000VW\u0007\u0004\u0000\u0000WX\u0007\u0001\u0000\u0000"+
		"X\f\u0001\u0000\u0000\u0000YZ\u0007\u000e\u0000\u0000Z[\u0007\u0007\u0000"+
		"\u0000[\\\u0007\b\u0000\u0000\\]\u0007\u000f\u0000\u0000]\u000e\u0001"+
		"\u0000\u0000\u0000^_\u0007\u0010\u0000\u0000_`\u0007\u0011\u0000\u0000"+
		"`a\u0007\u0001\u0000\u0000ab\u0007\u0007\u0000\u0000bc\u0007\u0001\u0000"+
		"\u0000c\u0010\u0001\u0000\u0000\u0000de\u0007\u0000\u0000\u0000ef\u0007"+
		"\u0001\u0000\u0000fg\u0007\u0004\u0000\u0000g\u0012\u0001\u0000\u0000"+
		"\u0000hi\u0005;\u0000\u0000i\u0014\u0001\u0000\u0000\u0000jk\u0005,\u0000"+
		"\u0000k\u0016\u0001\u0000\u0000\u0000lm\u0005(\u0000\u0000m\u0018\u0001"+
		"\u0000\u0000\u0000no\u0005)\u0000\u0000o\u001a\u0001\u0000\u0000\u0000"+
		"pq\u0005=\u0000\u0000q\u001c\u0001\u0000\u0000\u0000rs\u0005!\u0000\u0000"+
		"sw\u0005=\u0000\u0000tu\u0005<\u0000\u0000uw\u0005>\u0000\u0000vr\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000w\u001e\u0001\u0000\u0000"+
		"\u0000xy\u0005<\u0000\u0000y \u0001\u0000\u0000\u0000z{\u0005<\u0000\u0000"+
		"{|\u0005=\u0000\u0000|\"\u0001\u0000\u0000\u0000}~\u0005>\u0000\u0000"+
		"~$\u0001\u0000\u0000\u0000\u007f\u0080\u0005>\u0000\u0000\u0080\u0081"+
		"\u0005=\u0000\u0000\u0081&\u0001\u0000\u0000\u0000\u0082\u0088\u0005\'"+
		"\u0000\u0000\u0083\u0087\b\u0012\u0000\u0000\u0084\u0085\u0005\\\u0000"+
		"\u0000\u0085\u0087\t\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008b\u0097\u0005\'\u0000\u0000\u008c\u0092\u0005\"\u0000\u0000\u008d"+
		"\u0091\b\u0013\u0000\u0000\u008e\u008f\u0005\\\u0000\u0000\u008f\u0091"+
		"\t\u0000\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0097\u0005"+
		"\"\u0000\u0000\u0096\u0082\u0001\u0000\u0000\u0000\u0096\u008c\u0001\u0000"+
		"\u0000\u0000\u0097(\u0001\u0000\u0000\u0000\u0098\u009a\u0003+\u0015\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u00a3\u0001\u0000\u0000\u0000\u009d\u009f\u0005.\u0000\u0000\u009e"+
		"\u00a0\u0003+\u0015\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u009d"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4*\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0007\u0014\u0000\u0000\u00a6,\u0001\u0000"+
		"\u0000\u0000\u00a7\u00ab\u0007\u0015\u0000\u0000\u00a8\u00aa\u0007\u0016"+
		"\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac.\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b0\u0007\u0017\u0000\u0000\u00af\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0006\u0017\u0000\u0000\u00b40\u0001\u0000\u0000\u0000"+
		"\f\u0000v\u0086\u0088\u0090\u0092\u0096\u009b\u00a1\u00a3\u00ab\u00b1"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}