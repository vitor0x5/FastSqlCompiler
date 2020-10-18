// Generated from br/ufscar/dc/compiladores/fastsqlcompiler/FastSql.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.fastsqlcompiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FastSqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NAME=7, COLUMNS=8, CREATE_TABLE=9, 
		FIND=10, DELETE=11, INSERT=12, TYPE=13, INT=14, REAL=15, BOOLEAN=16, VARCHAR=17, 
		NOT_CLOSED_VARCHAR=18, DATE=19, IDENT=20, WS=21, UNDEFINED_CHAR=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "NAME", "COLUMNS", "CREATE_TABLE", 
			"FIND", "DELETE", "INSERT", "ESC_SEQ", "TYPE", "INT", "REAL", "BOOLEAN", 
			"VARCHAR", "NOT_CLOSED_VARCHAR", "DATE", "IDENT", "WS", "UNDEFINED_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'.'", "','", "':'", "';'", "'name'", "'columns'", 
			"'createTable'", "'find'", "'delete'", "'insert'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NAME", "COLUMNS", "CREATE_TABLE", 
			"FIND", "DELETE", "INSERT", "TYPE", "INT", "REAL", "BOOLEAN", "VARCHAR", 
			"NOT_CLOSED_VARCHAR", "DATE", "IDENT", "WS", "UNDEFINED_CHAR"
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


	public FastSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FastSql.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00ce\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0086\n\17\3\20\6\20\u0089\n\20\r\20\16\20\u008a"+
		"\3\21\6\21\u008e\n\21\r\21\16\21\u008f\3\21\3\21\6\21\u0094\n\21\r\21"+
		"\16\21\u0095\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a1\n"+
		"\22\3\23\3\23\3\23\7\23\u00a6\n\23\f\23\16\23\u00a9\13\23\3\23\3\23\3"+
		"\24\3\24\3\24\7\24\u00b0\n\24\f\24\16\24\u00b3\13\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u00c4"+
		"\n\26\f\26\16\26\u00c7\13\26\3\27\3\27\3\27\3\27\3\30\3\30\2\2\31\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\17\37\20"+
		"!\21#\22%\23\'\24)\25+\26-\27/\30\3\2\7\4\2\f\f$$\3\2$$\5\2C\\aac|\6\2"+
		"\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00d9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67"+
		"\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21B\3\2\2\2\23J\3\2\2\2\25"+
		"V\3\2\2\2\27[\3\2\2\2\31b\3\2\2\2\33i\3\2\2\2\35\u0085\3\2\2\2\37\u0088"+
		"\3\2\2\2!\u008d\3\2\2\2#\u00a0\3\2\2\2%\u00a2\3\2\2\2\'\u00ac\3\2\2\2"+
		")\u00b6\3\2\2\2+\u00c1\3\2\2\2-\u00c8\3\2\2\2/\u00cc\3\2\2\2\61\62\7*"+
		"\2\2\62\4\3\2\2\2\63\64\7+\2\2\64\6\3\2\2\2\65\66\7\60\2\2\66\b\3\2\2"+
		"\2\678\7.\2\28\n\3\2\2\29:\7<\2\2:\f\3\2\2\2;<\7=\2\2<\16\3\2\2\2=>\7"+
		"p\2\2>?\7c\2\2?@\7o\2\2@A\7g\2\2A\20\3\2\2\2BC\7e\2\2CD\7q\2\2DE\7n\2"+
		"\2EF\7w\2\2FG\7o\2\2GH\7p\2\2HI\7u\2\2I\22\3\2\2\2JK\7e\2\2KL\7t\2\2L"+
		"M\7g\2\2MN\7c\2\2NO\7v\2\2OP\7g\2\2PQ\7V\2\2QR\7c\2\2RS\7d\2\2ST\7n\2"+
		"\2TU\7g\2\2U\24\3\2\2\2VW\7h\2\2WX\7k\2\2XY\7p\2\2YZ\7f\2\2Z\26\3\2\2"+
		"\2[\\\7f\2\2\\]\7g\2\2]^\7n\2\2^_\7g\2\2_`\7v\2\2`a\7g\2\2a\30\3\2\2\2"+
		"bc\7k\2\2cd\7p\2\2de\7u\2\2ef\7g\2\2fg\7t\2\2gh\7v\2\2h\32\3\2\2\2ij\7"+
		"^\2\2jk\7$\2\2k\34\3\2\2\2lm\7d\2\2mn\7q\2\2no\7q\2\2op\7n\2\2pq\7g\2"+
		"\2qr\7c\2\2r\u0086\7p\2\2st\7x\2\2tu\7c\2\2uv\7t\2\2vw\7e\2\2wx\7j\2\2"+
		"xy\7c\2\2y\u0086\7t\2\2z{\7f\2\2{|\7c\2\2|}\7v\2\2}\u0086\7g\2\2~\177"+
		"\7k\2\2\177\u0080\7p\2\2\u0080\u0086\7v\2\2\u0081\u0082\7t\2\2\u0082\u0083"+
		"\7g\2\2\u0083\u0084\7c\2\2\u0084\u0086\7n\2\2\u0085l\3\2\2\2\u0085s\3"+
		"\2\2\2\u0085z\3\2\2\2\u0085~\3\2\2\2\u0085\u0081\3\2\2\2\u0086\36\3\2"+
		"\2\2\u0087\u0089\4\62;\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b \3\2\2\2\u008c\u008e\4\62;\2"+
		"\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\7\60\2\2\u0092\u0094\4\62;\2"+
		"\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\"\3\2\2\2\u0097\u0098\7v\2\2\u0098\u0099\7t\2\2\u0099\u009a"+
		"\7w\2\2\u009a\u00a1\7g\2\2\u009b\u009c\7h\2\2\u009c\u009d\7c\2\2\u009d"+
		"\u009e\7n\2\2\u009e\u009f\7u\2\2\u009f\u00a1\7g\2\2\u00a0\u0097\3\2\2"+
		"\2\u00a0\u009b\3\2\2\2\u00a1$\3\2\2\2\u00a2\u00a7\7$\2\2\u00a3\u00a6\5"+
		"\33\16\2\u00a4\u00a6\n\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab&\3\2\2\2\u00ac\u00b1"+
		"\7$\2\2\u00ad\u00b0\5\33\16\2\u00ae\u00b0\n\3\2\2\u00af\u00ad\3\2\2\2"+
		"\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\f\2\2\u00b5"+
		"(\3\2\2\2\u00b6\u00b7\4\62;\2\u00b7\u00b8\4\62;\2\u00b8\u00b9\4\62;\2"+
		"\u00b9\u00ba\4\62;\2\u00ba\u00bb\7/\2\2\u00bb\u00bc\4\62\63\2\u00bc\u00bd"+
		"\4\62;\2\u00bd\u00be\7/\2\2\u00be\u00bf\4\62\65\2\u00bf\u00c0\4\62;\2"+
		"\u00c0*\3\2\2\2\u00c1\u00c5\t\4\2\2\u00c2\u00c4\t\5\2\2\u00c3\u00c2\3"+
		"\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		",\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\t\6\2\2\u00c9\u00ca\3\2\2\2"+
		"\u00ca\u00cb\b\27\2\2\u00cb.\3\2\2\2\u00cc\u00cd\13\2\2\2\u00cd\60\3\2"+
		"\2\2\r\2\u0085\u008a\u008f\u0095\u00a0\u00a5\u00a7\u00af\u00b1\u00c5\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}