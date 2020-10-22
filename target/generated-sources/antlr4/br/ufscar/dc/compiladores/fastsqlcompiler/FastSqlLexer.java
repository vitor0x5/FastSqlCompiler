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
		T__0=1, T__1=2, T__2=3, NAME=4, COLUMNS=5, CREATE_TABLE=6, FIND=7, DELETE=8, 
		INSERT=9, A_PARENTESES=10, F_PARENTESES=11, TYPE=12, INT=13, REAL=14, 
		BOOLEAN=15, VARCHAR=16, NOT_CLOSED_VARCHAR=17, DATE=18, IDENT=19, WS=20, 
		UNDEFINED_CHAR=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "NAME", "COLUMNS", "CREATE_TABLE", "FIND", "DELETE", 
			"INSERT", "A_PARENTESES", "F_PARENTESES", "ESC_SEQ", "TYPE", "INT", "REAL", 
			"BOOLEAN", "VARCHAR", "NOT_CLOSED_VARCHAR", "DATE", "IDENT", "WS", "UNDEFINED_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "':'", "'name'", "'columns'", "'createTable'", "'find'", 
			"'delete'", "'insert'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NAME", "COLUMNS", "CREATE_TABLE", "FIND", "DELETE", 
			"INSERT", "A_PARENTESES", "F_PARENTESES", "TYPE", "INT", "REAL", "BOOLEAN", 
			"VARCHAR", "NOT_CLOSED_VARCHAR", "DATE", "IDENT", "WS", "UNDEFINED_CHAR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00ca\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0082"+
		"\n\16\3\17\6\17\u0085\n\17\r\17\16\17\u0086\3\20\6\20\u008a\n\20\r\20"+
		"\16\20\u008b\3\20\3\20\6\20\u0090\n\20\r\20\16\20\u0091\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u009d\n\21\3\22\3\22\3\22\7\22\u00a2"+
		"\n\22\f\22\16\22\u00a5\13\22\3\22\3\22\3\23\3\23\3\23\7\23\u00ac\n\23"+
		"\f\23\16\23\u00af\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\7\25\u00c0\n\25\f\25\16\25\u00c3\13\25\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\2\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27\3"+
		"\2\7\4\2\f\f$$\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00d5"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2"+
		"\2\7\63\3\2\2\2\t\65\3\2\2\2\13:\3\2\2\2\rB\3\2\2\2\17N\3\2\2\2\21S\3"+
		"\2\2\2\23Z\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31e\3\2\2\2\33\u0081\3\2\2"+
		"\2\35\u0084\3\2\2\2\37\u0089\3\2\2\2!\u009c\3\2\2\2#\u009e\3\2\2\2%\u00a8"+
		"\3\2\2\2\'\u00b2\3\2\2\2)\u00bd\3\2\2\2+\u00c4\3\2\2\2-\u00c8\3\2\2\2"+
		"/\60\7\60\2\2\60\4\3\2\2\2\61\62\7.\2\2\62\6\3\2\2\2\63\64\7<\2\2\64\b"+
		"\3\2\2\2\65\66\7p\2\2\66\67\7c\2\2\678\7o\2\289\7g\2\29\n\3\2\2\2:;\7"+
		"e\2\2;<\7q\2\2<=\7n\2\2=>\7w\2\2>?\7o\2\2?@\7p\2\2@A\7u\2\2A\f\3\2\2\2"+
		"BC\7e\2\2CD\7t\2\2DE\7g\2\2EF\7c\2\2FG\7v\2\2GH\7g\2\2HI\7V\2\2IJ\7c\2"+
		"\2JK\7d\2\2KL\7n\2\2LM\7g\2\2M\16\3\2\2\2NO\7h\2\2OP\7k\2\2PQ\7p\2\2Q"+
		"R\7f\2\2R\20\3\2\2\2ST\7f\2\2TU\7g\2\2UV\7n\2\2VW\7g\2\2WX\7v\2\2XY\7"+
		"g\2\2Y\22\3\2\2\2Z[\7k\2\2[\\\7p\2\2\\]\7u\2\2]^\7g\2\2^_\7t\2\2_`\7v"+
		"\2\2`\24\3\2\2\2ab\7*\2\2b\26\3\2\2\2cd\7+\2\2d\30\3\2\2\2ef\7^\2\2fg"+
		"\7$\2\2g\32\3\2\2\2hi\7d\2\2ij\7q\2\2jk\7q\2\2kl\7n\2\2lm\7g\2\2mn\7c"+
		"\2\2n\u0082\7p\2\2op\7x\2\2pq\7c\2\2qr\7t\2\2rs\7e\2\2st\7j\2\2tu\7c\2"+
		"\2u\u0082\7t\2\2vw\7f\2\2wx\7c\2\2xy\7v\2\2y\u0082\7g\2\2z{\7k\2\2{|\7"+
		"p\2\2|\u0082\7v\2\2}~\7t\2\2~\177\7g\2\2\177\u0080\7c\2\2\u0080\u0082"+
		"\7n\2\2\u0081h\3\2\2\2\u0081o\3\2\2\2\u0081v\3\2\2\2\u0081z\3\2\2\2\u0081"+
		"}\3\2\2\2\u0082\34\3\2\2\2\u0083\u0085\4\62;\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\36\3\2\2"+
		"\2\u0088\u008a\4\62;\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\7\60\2\2"+
		"\u008e\u0090\4\62;\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092 \3\2\2\2\u0093\u0094\7v\2\2\u0094\u0095"+
		"\7t\2\2\u0095\u0096\7w\2\2\u0096\u009d\7g\2\2\u0097\u0098\7h\2\2\u0098"+
		"\u0099\7c\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2\u009b\u009d\7g\2\2"+
		"\u009c\u0093\3\2\2\2\u009c\u0097\3\2\2\2\u009d\"\3\2\2\2\u009e\u00a3\7"+
		"$\2\2\u009f\u00a2\5\31\r\2\u00a0\u00a2\n\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7$\2\2\u00a7"+
		"$\3\2\2\2\u00a8\u00ad\7$\2\2\u00a9\u00ac\5\31\r\2\u00aa\u00ac\n\3\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b1\7\f\2\2\u00b1&\3\2\2\2\u00b2\u00b3\4\62;\2\u00b3\u00b4\4\62;\2"+
		"\u00b4\u00b5\4\62;\2\u00b5\u00b6\4\62;\2\u00b6\u00b7\7/\2\2\u00b7\u00b8"+
		"\4\62\63\2\u00b8\u00b9\4\62;\2\u00b9\u00ba\7/\2\2\u00ba\u00bb\4\62\65"+
		"\2\u00bb\u00bc\4\62;\2\u00bc(\3\2\2\2\u00bd\u00c1\t\4\2\2\u00be\u00c0"+
		"\t\5\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2*\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\t\6\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\26\2\2\u00c7,\3\2\2\2\u00c8\u00c9\13"+
		"\2\2\2\u00c9.\3\2\2\2\r\2\u0081\u0086\u008b\u0091\u009c\u00a1\u00a3\u00ab"+
		"\u00ad\u00c1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}