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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NAME=7, COLUMNS=8, CREATE_TABLE=9, 
		FIND=10, DELETE=11, INSERT=12, TYPE=13, INT=14, REAL=15, BOOLEAN=16, VARCHAR=17, 
		NOT_CLOSED_VARCHAR=18, DATE=19, IDENT=20, WS=21, UNDEFINED_CHAR=22;
	public static final int
		RULE_script = 0, RULE_commands = 1, RULE_create_table = 2, RULE_insert = 3, 
		RULE_find = 4, RULE_delete = 5, RULE_decl_column = 6, RULE_value = 7, 
		RULE_itemWhere = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "commands", "create_table", "insert", "find", "delete", "decl_column", 
			"value", "itemWhere"
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

	public static class ScriptContext extends ParserRuleContext {
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FastSqlParser.EOF, 0); }
		public List<Create_tableContext> create_table() {
			return getRuleContexts(Create_tableContext.class);
		}
		public Create_tableContext create_table(int i) {
			return getRuleContext(Create_tableContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FastSqlVisitor ) return ((FastSqlVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(18);
					create_table();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(21); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(23);
			commands();
			setState(24);
			match(EOF);
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

	public static class CommandsContext extends ParserRuleContext {
		public List<Create_tableContext> create_table() {
			return getRuleContexts(Create_tableContext.class);
		}
		public Create_tableContext create_table(int i) {
			return getRuleContext(Create_tableContext.class,i);
		}
		public List<InsertContext> insert() {
			return getRuleContexts(InsertContext.class);
		}
		public InsertContext insert(int i) {
			return getRuleContext(InsertContext.class,i);
		}
		public List<FindContext> find() {
			return getRuleContexts(FindContext.class);
		}
		public FindContext find(int i) {
			return getRuleContext(FindContext.class,i);
		}
		public List<DeleteContext> delete() {
			return getRuleContexts(DeleteContext.class);
		}
		public DeleteContext delete(int i) {
			return getRuleContext(DeleteContext.class,i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FastSqlVisitor ) return ((FastSqlVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CREATE_TABLE || _la==IDENT) {
				{
				setState(30);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(26);
					create_table();
					}
					break;
				case 2:
					{
					setState(27);
					insert();
					}
					break;
				case 3:
					{
					setState(28);
					find();
					}
					break;
				case 4:
					{
					setState(29);
					delete();
					}
					break;
				}
				}
				setState(34);
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
		enterRule(_localctx, 4, RULE_create_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(CREATE_TABLE);
			setState(36);
			match(T__0);
			setState(37);
			match(IDENT);
			setState(38);
			match(T__1);
			setState(39);
			match(T__2);
			setState(40);
			match(COLUMNS);
			setState(41);
			match(T__0);
			setState(42);
			decl_column();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(43);
				match(T__3);
				setState(44);
				decl_column();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
		enterRule(_localctx, 6, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(IDENT);
			setState(53);
			match(T__2);
			setState(54);
			match(INSERT);
			setState(55);
			match(T__0);
			setState(56);
			value();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(57);
				match(T__3);
				setState(58);
				value();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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
		enterRule(_localctx, 8, RULE_find);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(IDENT);
			setState(67);
			match(T__2);
			setState(68);
			match(FIND);
			setState(69);
			match(T__0);
			setState(70);
			itemWhere();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(71);
				match(T__3);
				setState(72);
				itemWhere();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(T__1);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(79);
				match(T__2);
				setState(80);
				match(COLUMNS);
				setState(81);
				match(T__0);
				setState(82);
				match(IDENT);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(83);
					match(T__3);
					setState(84);
					match(IDENT);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
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
		enterRule(_localctx, 10, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IDENT);
			setState(94);
			match(T__2);
			setState(95);
			match(DELETE);
			setState(96);
			match(T__0);
			setState(97);
			itemWhere();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(98);
				match(T__3);
				setState(99);
				itemWhere();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
		enterRule(_localctx, 12, RULE_decl_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(IDENT);
			setState(108);
			match(T__4);
			setState(109);
			match(TYPE);
			setState(110);
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
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
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
		enterRule(_localctx, 16, RULE_itemWhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IDENT);
			setState(115);
			match(T__4);
			setState(116);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7g\n\7\f\7\16\7j\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\4\2\20\23\25\25\2z\2\25\3\2"+
		"\2\2\4\"\3\2\2\2\6%\3\2\2\2\b\66\3\2\2\2\nD\3\2\2\2\f_\3\2\2\2\16m\3\2"+
		"\2\2\20r\3\2\2\2\22t\3\2\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26\27\3\2\2\2"+
		"\27\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\32\5\4\3\2\32\33\7\2\2\3"+
		"\33\3\3\2\2\2\34!\5\6\4\2\35!\5\b\5\2\36!\5\n\6\2\37!\5\f\7\2 \34\3\2"+
		"\2\2 \35\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2"+
		"\2#\5\3\2\2\2$\"\3\2\2\2%&\7\13\2\2&\'\7\3\2\2\'(\7\26\2\2()\7\4\2\2)"+
		"*\7\5\2\2*+\7\n\2\2+,\7\3\2\2,\61\5\16\b\2-.\7\6\2\2.\60\5\16\b\2/-\3"+
		"\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2"+
		"\2\2\64\65\7\4\2\2\65\7\3\2\2\2\66\67\7\26\2\2\678\7\5\2\289\7\16\2\2"+
		"9:\7\3\2\2:?\5\20\t\2;<\7\6\2\2<>\5\20\t\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2"+
		"\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\4\2\2C\t\3\2\2\2DE\7\26\2\2EF\7\5"+
		"\2\2FG\7\f\2\2GH\7\3\2\2HM\5\22\n\2IJ\7\6\2\2JL\5\22\n\2KI\3\2\2\2LO\3"+
		"\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2P]\7\4\2\2QR\7\5\2\2RS\7"+
		"\n\2\2ST\7\3\2\2TY\7\26\2\2UV\7\6\2\2VX\7\26\2\2WU\3\2\2\2X[\3\2\2\2Y"+
		"W\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\^\7\4\2\2]Q\3\2\2\2]^\3\2\2"+
		"\2^\13\3\2\2\2_`\7\26\2\2`a\7\5\2\2ab\7\r\2\2bc\7\3\2\2ch\5\22\n\2de\7"+
		"\6\2\2eg\5\22\n\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh"+
		"\3\2\2\2kl\7\4\2\2l\r\3\2\2\2mn\7\26\2\2no\7\7\2\2op\7\17\2\2pq\7\b\2"+
		"\2q\17\3\2\2\2rs\t\2\2\2s\21\3\2\2\2tu\7\26\2\2uv\7\7\2\2vw\5\20\t\2w"+
		"\23\3\2\2\2\13\27 \"\61?MY]h";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}