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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NAME=6, COLUMNS=7, CREATE_TABLE=8, 
		FIND=9, DELETE=10, INSERT=11, TYPE=12, INT=13, REAL=14, BOOLEAN=15, VARCHAR=16, 
		NOT_CLOSED_VARCHAR=17, DATE=18, IDENT=19, WS=20, UNDEFINED_CHAR=21;
	public static final int
		RULE_script = 0, RULE_commands = 1, RULE_create_table = 2, RULE_insert = 3, 
		RULE_find = 4, RULE_delete = 5, RULE_decl_column = 6, RULE_sized = 7, 
		RULE_value = 8, RULE_itemWhere = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "commands", "create_table", "insert", "find", "delete", "decl_column", 
			"sized", "value", "itemWhere"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'.'", "','", "':'", "'name'", "'columns'", "'createTable'", 
			"'find'", "'delete'", "'insert'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "NAME", "COLUMNS", "CREATE_TABLE", 
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
		public TerminalNode EOF() { return getToken(FastSqlParser.EOF, 0); }
		public List<Create_tableContext> create_table() {
			return getRuleContexts(Create_tableContext.class);
		}
		public Create_tableContext create_table(int i) {
			return getRuleContext(Create_tableContext.class,i);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(20);
					create_table();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(23); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CREATE_TABLE || _la==IDENT) {
				{
				{
				setState(25);
				commands();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(EOF);
			 System.out.println("Parser found a script"); 
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
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public FindContext find() {
			return getRuleContext(FindContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
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
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				create_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				insert();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				find();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				delete();
				 System.out.println("Parser found a command"); 
				}
				break;
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
			setState(42);
			match(CREATE_TABLE);
			setState(43);
			match(T__0);
			setState(44);
			match(IDENT);
			setState(45);
			match(T__1);
			setState(46);
			match(T__2);
			setState(47);
			match(COLUMNS);
			setState(48);
			match(T__0);
			setState(49);
			decl_column();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(50);
				match(T__3);
				setState(51);
				decl_column();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(T__1);
			 System.out.println("Parser found a create_table"); 
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
			setState(60);
			match(IDENT);
			setState(61);
			match(T__2);
			setState(62);
			match(INSERT);
			setState(63);
			match(T__0);
			setState(64);
			value();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(65);
				match(T__3);
				setState(66);
				value();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(T__1);
			 System.out.println("Parser found a insert"); 
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
		public Token tableName;
		public TerminalNode FIND() { return getToken(FastSqlParser.FIND, 0); }
		public List<ItemWhereContext> itemWhere() {
			return getRuleContexts(ItemWhereContext.class);
		}
		public ItemWhereContext itemWhere(int i) {
			return getRuleContext(ItemWhereContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(FastSqlParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FastSqlParser.IDENT, i);
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
			setState(75);
			((FindContext)_localctx).tableName = match(IDENT);
			setState(76);
			match(T__2);
			setState(77);
			match(FIND);
			setState(78);
			match(T__0);
			setState(79);
			itemWhere();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(80);
				match(T__3);
				setState(81);
				itemWhere();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(T__1);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(88);
				match(T__2);
				setState(89);
				match(COLUMNS);
				setState(90);
				match(T__0);
				setState(91);
				match(IDENT);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(92);
					match(T__3);
					setState(93);
					match(IDENT);
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(T__1);
				}
			}

			 System.out.println("Parser found a find"); 
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
			setState(104);
			match(IDENT);
			setState(105);
			match(T__2);
			setState(106);
			match(DELETE);
			setState(107);
			match(T__0);
			setState(108);
			itemWhere();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(109);
				match(T__3);
				setState(110);
				itemWhere();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__1);
			 System.out.println("Parser found a delete"); 
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
		public SizedContext sized() {
			return getRuleContext(SizedContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IDENT);
			setState(120);
			match(T__4);
			setState(121);
			match(TYPE);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(122);
				sized();
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

	public static class SizedContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FastSqlParser.INT, 0); }
		public SizedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sized; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).enterSized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).exitSized(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FastSqlVisitor ) return ((FastSqlVisitor<? extends T>)visitor).visitSized(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizedContext sized() throws RecognitionException {
		SizedContext _localctx = new SizedContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sized);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__0);
			setState(126);
			match(INT);
			setState(127);
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
		enterRule(_localctx, 16, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
		enterRule(_localctx, 18, RULE_itemWhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IDENT);
			setState(132);
			match(T__4);
			setState(133);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\6\2\30\n\2\r\2\16\2\31\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5F\n\5\f\5\16\5I\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6U\n\6\f\6\16\6X\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6a\n\6\f\6\16\6d"+
		"\13\6\3\6\5\6g\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7r\n\7\f\7\16"+
		"\7u\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b~\n\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\3\4\2\17\22"+
		"\24\24\2\u008b\2\27\3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b>\3\2\2\2\nM\3\2\2"+
		"\2\fj\3\2\2\2\16y\3\2\2\2\20\177\3\2\2\2\22\u0083\3\2\2\2\24\u0085\3\2"+
		"\2\2\26\30\5\6\4\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2"+
		"\2\2\32\36\3\2\2\2\33\35\5\4\3\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2"+
		"\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7\2\2\3\"#\b\2\1\2#\3\3\2"+
		"\2\2$+\5\6\4\2%+\5\b\5\2&+\5\n\6\2\'(\5\f\7\2()\b\3\1\2)+\3\2\2\2*$\3"+
		"\2\2\2*%\3\2\2\2*&\3\2\2\2*\'\3\2\2\2+\5\3\2\2\2,-\7\n\2\2-.\7\3\2\2."+
		"/\7\25\2\2/\60\7\4\2\2\60\61\7\5\2\2\61\62\7\t\2\2\62\63\7\3\2\2\638\5"+
		"\16\b\2\64\65\7\6\2\2\65\67\5\16\b\2\66\64\3\2\2\2\67:\3\2\2\28\66\3\2"+
		"\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\4\2\2<=\b\4\1\2=\7\3\2\2\2>?\7"+
		"\25\2\2?@\7\5\2\2@A\7\r\2\2AB\7\3\2\2BG\5\22\n\2CD\7\6\2\2DF\5\22\n\2"+
		"EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\4\2\2"+
		"KL\b\5\1\2L\t\3\2\2\2MN\7\25\2\2NO\7\5\2\2OP\7\13\2\2PQ\7\3\2\2QV\5\24"+
		"\13\2RS\7\6\2\2SU\5\24\13\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY"+
		"\3\2\2\2XV\3\2\2\2Yf\7\4\2\2Z[\7\5\2\2[\\\7\t\2\2\\]\7\3\2\2]b\7\25\2"+
		"\2^_\7\6\2\2_a\7\25\2\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2"+
		"\2\2db\3\2\2\2eg\7\4\2\2fZ\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\b\6\1\2i\13\3"+
		"\2\2\2jk\7\25\2\2kl\7\5\2\2lm\7\f\2\2mn\7\3\2\2ns\5\24\13\2op\7\6\2\2"+
		"pr\5\24\13\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2"+
		"\2vw\7\4\2\2wx\b\7\1\2x\r\3\2\2\2yz\7\25\2\2z{\7\7\2\2{}\7\16\2\2|~\5"+
		"\20\t\2}|\3\2\2\2}~\3\2\2\2~\17\3\2\2\2\177\u0080\7\3\2\2\u0080\u0081"+
		"\7\17\2\2\u0081\u0082\7\4\2\2\u0082\21\3\2\2\2\u0083\u0084\t\2\2\2\u0084"+
		"\23\3\2\2\2\u0085\u0086\7\25\2\2\u0086\u0087\7\7\2\2\u0087\u0088\5\22"+
		"\n\2\u0088\25\3\2\2\2\f\31\36*8GVbfs}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}