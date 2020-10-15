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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TYPE=7, INT=8, REAL=9, 
		BOOLEAN=10, VARCHAR=11, DATE=12, ESC_SEQ=13, OP_ARIT1=14, OP_ARIT2=15, 
		OP_REL=16, OP_BOOL=17, IDENT=18, WS=19, NAME=20, COLUMNS=21, CREATE_TABLE=22, 
		FIND=23, DELETE=24, INSERT=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "TYPE", "INT", "REAL", 
			"BOOLEAN", "VARCHAR", "DATE", "ESC_SEQ", "OP_ARIT1", "OP_ARIT2", "OP_REL", 
			"OP_BOOL", "IDENT", "WS", "NAME", "COLUMNS", "CREATE_TABLE", "FIND", 
			"DELETE", "INSERT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'.'", "','", "':'", "';'", null, null, null, null, 
			null, null, "'\\''", null, null, null, null, null, null, "'name'", "'columns'", 
			"'createTable'", "'find'", "'delete'", "'insert'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "TYPE", "INT", "REAL", "BOOLEAN", 
			"VARCHAR", "DATE", "ESC_SEQ", "OP_ARIT1", "OP_ARIT2", "OP_REL", "OP_BOOL", 
			"IDENT", "WS", "NAME", "COLUMNS", "CREATE_TABLE", "FIND", "DELETE", "INSERT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00d8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b[\n\b\3\t\6\t^\n\t\r\t\16\t_\3\n\6\nc\n\n"+
		"\r\n\16\nd\3\n\3\n\6\ni\n\n\r\n\16\nj\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13v\n\13\3\f\3\f\6\fz\n\f\r\f\16\f{\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u009b\n\21\3\22\3\22"+
		"\3\22\5\22\u00a0\n\22\3\23\3\23\7\23\u00a4\n\23\f\23\16\23\u00a7\13\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\3\2\7\5\2\62;C\\c|\4\2--//\4\2,,\61\61\4\2C\\c|\5\2\13"+
		"\f\17\17\"\"\2\u00e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2"+
		"\2\2\79\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17Z\3\2\2\2\21]\3\2"+
		"\2\2\23b\3\2\2\2\25u\3\2\2\2\27w\3\2\2\2\31\177\3\2\2\2\33\u008a\3\2\2"+
		"\2\35\u008d\3\2\2\2\37\u008f\3\2\2\2!\u009a\3\2\2\2#\u009f\3\2\2\2%\u00a1"+
		"\3\2\2\2\'\u00a8\3\2\2\2)\u00ac\3\2\2\2+\u00b1\3\2\2\2-\u00b9\3\2\2\2"+
		"/\u00c5\3\2\2\2\61\u00ca\3\2\2\2\63\u00d1\3\2\2\2\65\66\7*\2\2\66\4\3"+
		"\2\2\2\678\7+\2\28\6\3\2\2\29:\7\60\2\2:\b\3\2\2\2;<\7.\2\2<\n\3\2\2\2"+
		"=>\7<\2\2>\f\3\2\2\2?@\7=\2\2@\16\3\2\2\2AB\7D\2\2BC\7q\2\2CD\7q\2\2D"+
		"E\7n\2\2EF\7g\2\2FG\7c\2\2G[\7p\2\2HI\7x\2\2IJ\7c\2\2JK\7t\2\2KL\7e\2"+
		"\2LM\7j\2\2MN\7c\2\2N[\7t\2\2OP\7f\2\2PQ\7c\2\2QR\7v\2\2R[\7g\2\2ST\7"+
		"k\2\2TU\7p\2\2U[\7v\2\2VW\7t\2\2WX\7g\2\2XY\7c\2\2Y[\7n\2\2ZA\3\2\2\2"+
		"ZH\3\2\2\2ZO\3\2\2\2ZS\3\2\2\2ZV\3\2\2\2[\20\3\2\2\2\\^\4\62;\2]\\\3\2"+
		"\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\22\3\2\2\2ac\4\62;\2ba\3\2\2\2cd\3"+
		"\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fh\7\60\2\2gi\4\62;\2hg\3\2\2\2ij"+
		"\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\24\3\2\2\2lm\7v\2\2mn\7t\2\2no\7w\2\2ov"+
		"\7g\2\2pq\7h\2\2qr\7c\2\2rs\7n\2\2st\7u\2\2tv\7g\2\2ul\3\2\2\2up\3\2\2"+
		"\2v\26\3\2\2\2wy\7)\2\2xz\t\2\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2"+
		"\2\2|}\3\2\2\2}~\7)\2\2~\30\3\2\2\2\177\u0080\4\62;\2\u0080\u0081\4\62"+
		";\2\u0081\u0082\4\62;\2\u0082\u0083\4\62;\2\u0083\u0084\7/\2\2\u0084\u0085"+
		"\4\62;\2\u0085\u0086\4\62;\2\u0086\u0087\7/\2\2\u0087\u0088\4\62;\2\u0088"+
		"\u0089\4\62;\2\u0089\32\3\2\2\2\u008a\u008b\7^\2\2\u008b\u008c\7)\2\2"+
		"\u008c\34\3\2\2\2\u008d\u008e\t\3\2\2\u008e\36\3\2\2\2\u008f\u0090\t\4"+
		"\2\2\u0090 \3\2\2\2\u0091\u009b\7@\2\2\u0092\u0093\7@\2\2\u0093\u009b"+
		"\7?\2\2\u0094\u009b\7>\2\2\u0095\u0096\7>\2\2\u0096\u009b\7?\2\2\u0097"+
		"\u0098\7>\2\2\u0098\u009b\7@\2\2\u0099\u009b\7?\2\2\u009a\u0091\3\2\2"+
		"\2\u009a\u0092\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0097"+
		"\3\2\2\2\u009a\u0099\3\2\2\2\u009b\"\3\2\2\2\u009c\u00a0\7G\2\2\u009d"+
		"\u009e\7Q\2\2\u009e\u00a0\7W\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2"+
		"\2\u00a0$\3\2\2\2\u00a1\u00a5\t\5\2\2\u00a2\u00a4\t\2\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"&\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\t\6\2\2\u00a9\u00aa\3\2\2\2"+
		"\u00aa\u00ab\b\24\2\2\u00ab(\3\2\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7"+
		"c\2\2\u00ae\u00af\7o\2\2\u00af\u00b0\7g\2\2\u00b0*\3\2\2\2\u00b1\u00b2"+
		"\7e\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7w\2\2\u00b5"+
		"\u00b6\7o\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7u\2\2\u00b8,\3\2\2\2\u00b9"+
		"\u00ba\7e\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7c\2\2"+
		"\u00bd\u00be\7v\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7V\2\2\u00c0\u00c1"+
		"\7c\2\2\u00c1\u00c2\7d\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		".\3\2\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8"+
		"\u00c9\7f\2\2\u00c9\60\3\2\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"\u00cd\7n\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7g\2\2"+
		"\u00d0\62\3\2\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7"+
		"u\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7v\2\2\u00d7\64"+
		"\3\2\2\2\f\2Z_dju{\u009a\u009f\u00a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}