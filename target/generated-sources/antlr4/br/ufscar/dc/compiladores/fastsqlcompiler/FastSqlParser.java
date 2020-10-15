// Generated from br/ufscar/dc/compiladores/fastsqlcompiler/FastSql.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.fastsqlcompiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FastSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TYPE=7, INT=8, REAL=9, 
		BOOLEAN=10, VARCHAR=11, DATE=12, ESC_SEQ=13, OP_ARIT1=14, OP_ARIT2=15, 
		OP_REL=16, OP_BOOL=17, IDENT=18, WS=19, NAME=20, COLUMNS=21, CREATE_TABLE=22, 
		FIND=23, DELETE=24, INSERT=25;
	public static final int
		RULE_create_table = 0, RULE_insert = 1, RULE_find = 2, RULE_delete = 3, 
		RULE_decl_column = 4, RULE_value = 5, RULE_itemWhere = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"create_table", "insert", "find", "delete", "decl_column", "value", "itemWhere"
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

	@Override
	public String getGrammarFileName() { return "FastSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FastSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode CREATE_TABLE() { return getToken(FastSqlParser.CREATE_TABLE, 0); }
		public TerminalNode IDENT() { return getToken(FastSqlParser.IDENT, 0); }
		public TerminalNode COLUMNS() { return getToken(FastSqlParser.COLUMNS, 0); }
		public List<Decl_columnContext> decl_column() {
			return getRuleContexts(Decl_columnContext.class);
		}
		public Decl_columnContext decl_column(int i) {
			return getRuleContext(Decl_columnContext.class,i);
		}
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).exitCreate_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FastSqlVisitor ) return ((FastSqlVisitor<? extends T>)visitor).visitCreate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_create_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(CREATE_TABLE);
			setState(15);
			match(T__0);
			setState(16);
			match(IDENT);
			setState(17);
			match(T__1);
			setState(18);
			match(T__2);
			setState(19);
			match(COLUMNS);
			setState(20);
			match(T__0);
			setState(21);
			decl_column();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(22);
				match(T__3);
				setState(23);
				decl_column();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(T__1);
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

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(FastSqlParser.IDENT, 0); }
		public TerminalNode INSERT() { return getToken(FastSqlParser.INSERT, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FastSqlVisitor ) return ((FastSqlVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(IDENT);
			setState(32);
			match(T__2);
			setState(33);
			match(INSERT);
			setState(34);
			match(T__0);
			setState(35);
			value();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(36);
				match(T__3);
				setState(37);
				value();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(T__1);
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

	public static class FindContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(FastSqlParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FastSqlParser.IDENT, i);
		}
		public TerminalNode FIND() { return getToken(FastSqlParser.FIND, 0); }
		public List<ItemWhereContext> itemWhere() {
			return getRuleContexts(ItemWhereContext.class);
		}
		public ItemWhereContext itemWhere(int i) {
			return getRuleContext(ItemWhereContext.class,i);
		}
		public TerminalNode COLUMNS() { return getToken(FastSqlParser.COLUMNS, 0); }
		public FindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_find; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).enterFind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).exitFind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FastSqlVisitor ) return ((FastSqlVisitor<? extends T>)visitor).visitFind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FindContext find() throws RecognitionException {
		FindContext _localctx = new FindContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_find);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(IDENT);
			setState(46);
			match(T__2);
			setState(47);
			match(FIND);
			setState(48);
			match(T__0);
			setState(49);
			itemWhere();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(50);
				match(T__3);
				setState(51);
				itemWhere();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(T__1);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(58);
				match(T__2);
				setState(59);
				match(COLUMNS);
				setState(60);
				match(T__0);
				setState(61);
				match(IDENT);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(62);
					match(T__3);
					setState(63);
					match(IDENT);
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				match(T__1);
				}
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

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(FastSqlParser.IDENT, 0); }
		public TerminalNode DELETE() { return getToken(FastSqlParser.DELETE, 0); }
		public List<ItemWhereContext> itemWhere() {
			return getRuleContexts(ItemWhereContext.class);
		}
		public ItemWhereContext itemWhere(int i) {
			return getRuleContext(ItemWhereContext.class,i);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FastSqlVisitor ) return ((FastSqlVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(IDENT);
			setState(73);
			match(T__2);
			setState(74);
			match(DELETE);
			setState(75);
			match(T__0);
			setState(76);
			itemWhere();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(77);
				match(T__3);
				setState(78);
				itemWhere();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(T__1);
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

	public static class Decl_columnContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(FastSqlParser.IDENT, 0); }
		public TerminalNode TYPE() { return getToken(FastSqlParser.TYPE, 0); }
		public Decl_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).enterDecl_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).exitDecl_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FastSqlVisitor ) return ((FastSqlVisitor<? extends T>)visitor).visitDecl_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_columnContext decl_column() throws RecognitionException {
		Decl_columnContext _localctx = new Decl_columnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(IDENT);
			setState(87);
			match(T__4);
			setState(88);
			match(TYPE);
			setState(89);
			match(T__5);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FastSqlParser.INT, 0); }
		public TerminalNode REAL() { return getToken(FastSqlParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(FastSqlParser.BOOLEAN, 0); }
		public TerminalNode VARCHAR() { return getToken(FastSqlParser.VARCHAR, 0); }
		public TerminalNode DATE() { return getToken(FastSqlParser.DATE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FastSqlVisitor ) return ((FastSqlVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << VARCHAR) | (1L << DATE))) != 0)) ) {
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

	public static class ItemWhereContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(FastSqlParser.IDENT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ItemWhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemWhere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).enterItemWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).exitItemWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FastSqlVisitor ) return ((FastSqlVisitor<? extends T>)visitor).visitItemWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemWhereContext itemWhere() throws RecognitionException {
		ItemWhereContext _localctx = new ItemWhereContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_itemWhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IDENT);
			setState(94);
			match(T__4);
			setState(95);
			value();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33d\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4C\n\4\f\4\16\4F"+
		"\13\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5R\n\5\f\5\16\5U\13\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b"+
		"\n\f\16\2\3\3\2\n\16\2b\2\20\3\2\2\2\4!\3\2\2\2\6/\3\2\2\2\bJ\3\2\2\2"+
		"\nX\3\2\2\2\f]\3\2\2\2\16_\3\2\2\2\20\21\7\30\2\2\21\22\7\3\2\2\22\23"+
		"\7\24\2\2\23\24\7\4\2\2\24\25\7\5\2\2\25\26\7\27\2\2\26\27\7\3\2\2\27"+
		"\34\5\n\6\2\30\31\7\6\2\2\31\33\5\n\6\2\32\30\3\2\2\2\33\36\3\2\2\2\34"+
		"\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\4\2\2 \3\3"+
		"\2\2\2!\"\7\24\2\2\"#\7\5\2\2#$\7\33\2\2$%\7\3\2\2%*\5\f\7\2&\'\7\6\2"+
		"\2\')\5\f\7\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2"+
		"\2\2-.\7\4\2\2.\5\3\2\2\2/\60\7\24\2\2\60\61\7\5\2\2\61\62\7\31\2\2\62"+
		"\63\7\3\2\2\638\5\16\b\2\64\65\7\6\2\2\65\67\5\16\b\2\66\64\3\2\2\2\67"+
		":\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;H\7\4\2\2<=\7\5\2"+
		"\2=>\7\27\2\2>?\7\3\2\2?D\7\24\2\2@A\7\6\2\2AC\7\24\2\2B@\3\2\2\2CF\3"+
		"\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GI\7\4\2\2H<\3\2\2\2HI\3"+
		"\2\2\2I\7\3\2\2\2JK\7\24\2\2KL\7\5\2\2LM\7\32\2\2MN\7\3\2\2NS\5\16\b\2"+
		"OP\7\6\2\2PR\5\16\b\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2"+
		"\2US\3\2\2\2VW\7\4\2\2W\t\3\2\2\2XY\7\24\2\2YZ\7\7\2\2Z[\7\t\2\2[\\\7"+
		"\b\2\2\\\13\3\2\2\2]^\t\2\2\2^\r\3\2\2\2_`\7\24\2\2`a\7\7\2\2ab\5\f\7"+
		"\2b\17\3\2\2\2\b\34*8DHS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}