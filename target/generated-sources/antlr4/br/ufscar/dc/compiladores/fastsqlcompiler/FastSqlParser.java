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
		T__0=1, T__1=2, T__2=3, NAME=4, COLUMNS=5, CREATE_TABLE=6, FIND=7, DELETE=8, 
		INSERT=9, DELETE_ALL=10, FIND_ALL=11, A_PARENTESES=12, F_PARENTESES=13, 
		TYPE=14, INT=15, REAL=16, BOOLEAN=17, VARCHAR=18, NOT_CLOSED_VARCHAR=19, 
		DATE=20, IDENT=21, WS=22, UNDEFINED_CHAR=23;
	public static final int
		RULE_script = 0, RULE_commands = 1, RULE_create_table = 2, RULE_insert = 3, 
		RULE_deleteAll = 4, RULE_findAll = 5, RULE_find = 6, RULE_delete = 7, 
		RULE_decl_column = 8, RULE_sized = 9, RULE_value = 10, RULE_itemWhere = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "commands", "create_table", "insert", "deleteAll", "findAll", 
			"find", "delete", "decl_column", "sized", "value", "itemWhere"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "':'", "'name'", "'columns'", "'createTable'", "'find'", 
			"'delete'", "'insert'", "'deleteAll'", "'findAll'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NAME", "COLUMNS", "CREATE_TABLE", "FIND", "DELETE", 
			"INSERT", "DELETE_ALL", "FIND_ALL", "A_PARENTESES", "F_PARENTESES", "TYPE", 
			"INT", "REAL", "BOOLEAN", "VARCHAR", "NOT_CLOSED_VARCHAR", "DATE", "IDENT", 
			"WS", "UNDEFINED_CHAR"
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
			setState(24);
			create_table();
			setState(28);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(25);
					create_table();
					}
					} 
				}
				setState(30);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CREATE_TABLE || _la==IDENT) {
				{
				{
				setState(31);
				commands();
				}
				}
				setState(36);
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
		public DeleteAllContext deleteAll() {
			return getRuleContext(DeleteAllContext.class,0);
		}
		public FindAllContext findAll() {
			return getRuleContext(FindAllContext.class,0);
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
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				create_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				insert();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				find();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				delete();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				deleteAll();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				findAll();
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
		public List<TerminalNode> A_PARENTESES() { return getTokens(FastSqlParser.A_PARENTESES); }
		public TerminalNode A_PARENTESES(int i) {
			return getToken(FastSqlParser.A_PARENTESES, i);
		}
		public TerminalNode IDENT() { return getToken(FastSqlParser.IDENT, 0); }
		public List<TerminalNode> F_PARENTESES() { return getTokens(FastSqlParser.F_PARENTESES); }
		public TerminalNode F_PARENTESES(int i) {
			return getToken(FastSqlParser.F_PARENTESES, i);
		}
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
			setState(45);
			match(CREATE_TABLE);
			setState(46);
			match(A_PARENTESES);
			setState(47);
			match(IDENT);
			setState(48);
			match(F_PARENTESES);
			setState(49);
			match(T__0);
			setState(50);
			match(COLUMNS);
			setState(51);
			match(A_PARENTESES);
			setState(52);
			decl_column();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(53);
				match(T__1);
				setState(54);
				decl_column();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(F_PARENTESES);
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
		public TerminalNode A_PARENTESES() { return getToken(FastSqlParser.A_PARENTESES, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode F_PARENTESES() { return getToken(FastSqlParser.F_PARENTESES, 0); }
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
			setState(62);
			match(IDENT);
			setState(63);
			match(T__0);
			setState(64);
			match(INSERT);
			setState(65);
			match(A_PARENTESES);
			setState(66);
			value();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(67);
				match(T__1);
				setState(68);
				value();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(F_PARENTESES);
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

	public static class DeleteAllContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(FastSqlParser.IDENT, 0); }
		public TerminalNode DELETE_ALL() { return getToken(FastSqlParser.DELETE_ALL, 0); }
		public TerminalNode A_PARENTESES() { return getToken(FastSqlParser.A_PARENTESES, 0); }
		public TerminalNode F_PARENTESES() { return getToken(FastSqlParser.F_PARENTESES, 0); }
		public DeleteAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteAll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).enterDeleteAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).exitDeleteAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FastSqlVisitor ) return ((FastSqlVisitor<? extends T>)visitor).visitDeleteAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteAllContext deleteAll() throws RecognitionException {
		DeleteAllContext _localctx = new DeleteAllContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deleteAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(IDENT);
			setState(77);
			match(T__0);
			setState(78);
			match(DELETE_ALL);
			setState(79);
			match(A_PARENTESES);
			setState(80);
			match(F_PARENTESES);
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

	public static class FindAllContext extends ParserRuleContext {
		public Token tableName;
		public TerminalNode FIND_ALL() { return getToken(FastSqlParser.FIND_ALL, 0); }
		public List<TerminalNode> A_PARENTESES() { return getTokens(FastSqlParser.A_PARENTESES); }
		public TerminalNode A_PARENTESES(int i) {
			return getToken(FastSqlParser.A_PARENTESES, i);
		}
		public List<TerminalNode> F_PARENTESES() { return getTokens(FastSqlParser.F_PARENTESES); }
		public TerminalNode F_PARENTESES(int i) {
			return getToken(FastSqlParser.F_PARENTESES, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(FastSqlParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FastSqlParser.IDENT, i);
		}
		public TerminalNode COLUMNS() { return getToken(FastSqlParser.COLUMNS, 0); }
		public FindAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_findAll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).enterFindAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FastSqlListener ) ((FastSqlListener)listener).exitFindAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FastSqlVisitor ) return ((FastSqlVisitor<? extends T>)visitor).visitFindAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FindAllContext findAll() throws RecognitionException {
		FindAllContext _localctx = new FindAllContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_findAll);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			((FindAllContext)_localctx).tableName = match(IDENT);
			setState(83);
			match(T__0);
			setState(84);
			match(FIND_ALL);
			setState(85);
			match(A_PARENTESES);
			setState(86);
			match(F_PARENTESES);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(87);
				match(T__0);
				setState(88);
				match(COLUMNS);
				setState(89);
				match(A_PARENTESES);
				setState(90);
				match(IDENT);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(91);
					match(T__1);
					setState(92);
					match(IDENT);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(F_PARENTESES);
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

	public static class FindContext extends ParserRuleContext {
		public Token tableName;
		public TerminalNode FIND() { return getToken(FastSqlParser.FIND, 0); }
		public List<TerminalNode> A_PARENTESES() { return getTokens(FastSqlParser.A_PARENTESES); }
		public TerminalNode A_PARENTESES(int i) {
			return getToken(FastSqlParser.A_PARENTESES, i);
		}
		public List<ItemWhereContext> itemWhere() {
			return getRuleContexts(ItemWhereContext.class);
		}
		public ItemWhereContext itemWhere(int i) {
			return getRuleContext(ItemWhereContext.class,i);
		}
		public List<TerminalNode> F_PARENTESES() { return getTokens(FastSqlParser.F_PARENTESES); }
		public TerminalNode F_PARENTESES(int i) {
			return getToken(FastSqlParser.F_PARENTESES, i);
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
		enterRule(_localctx, 12, RULE_find);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((FindContext)_localctx).tableName = match(IDENT);
			setState(102);
			match(T__0);
			setState(103);
			match(FIND);
			setState(104);
			match(A_PARENTESES);
			setState(105);
			itemWhere();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(106);
				match(T__1);
				setState(107);
				itemWhere();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(F_PARENTESES);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(114);
				match(T__0);
				setState(115);
				match(COLUMNS);
				setState(116);
				match(A_PARENTESES);
				setState(117);
				match(IDENT);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(118);
					match(T__1);
					setState(119);
					match(IDENT);
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				match(F_PARENTESES);
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
		public TerminalNode A_PARENTESES() { return getToken(FastSqlParser.A_PARENTESES, 0); }
		public List<ItemWhereContext> itemWhere() {
			return getRuleContexts(ItemWhereContext.class);
		}
		public ItemWhereContext itemWhere(int i) {
			return getRuleContext(ItemWhereContext.class,i);
		}
		public TerminalNode F_PARENTESES() { return getToken(FastSqlParser.F_PARENTESES, 0); }
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
		enterRule(_localctx, 14, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IDENT);
			setState(129);
			match(T__0);
			setState(130);
			match(DELETE);
			setState(131);
			match(A_PARENTESES);
			setState(132);
			itemWhere();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(133);
				match(T__1);
				setState(134);
				itemWhere();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(F_PARENTESES);
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
		enterRule(_localctx, 16, RULE_decl_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(IDENT);
			setState(143);
			match(T__2);
			setState(144);
			match(TYPE);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==A_PARENTESES) {
				{
				setState(145);
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
		public TerminalNode A_PARENTESES() { return getToken(FastSqlParser.A_PARENTESES, 0); }
		public TerminalNode INT() { return getToken(FastSqlParser.INT, 0); }
		public TerminalNode F_PARENTESES() { return getToken(FastSqlParser.F_PARENTESES, 0); }
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
		enterRule(_localctx, 18, RULE_sized);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(A_PARENTESES);
			setState(149);
			match(INT);
			setState(150);
			match(F_PARENTESES);
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
		enterRule(_localctx, 20, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
		enterRule(_localctx, 22, RULE_itemWhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(IDENT);
			setState(155);
			match(T__2);
			setState(156);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00a1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7`\n\7\f\7\16\7c\13\7\3\7\5\7f"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bo\n\b\f\b\16\br\13\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\5\b\u0081\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\5\n\u0095\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\2\2\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\3\4\2\21\24\26\26\2\u00a4\2\32\3\2\2"+
		"\2\4-\3\2\2\2\6/\3\2\2\2\b@\3\2\2\2\nN\3\2\2\2\fT\3\2\2\2\16g\3\2\2\2"+
		"\20\u0082\3\2\2\2\22\u0090\3\2\2\2\24\u0096\3\2\2\2\26\u009a\3\2\2\2\30"+
		"\u009c\3\2\2\2\32\36\5\6\4\2\33\35\5\6\4\2\34\33\3\2\2\2\35 \3\2\2\2\36"+
		"\34\3\2\2\2\36\37\3\2\2\2\37$\3\2\2\2 \36\3\2\2\2!#\5\4\3\2\"!\3\2\2\2"+
		"#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&$\3\2\2\2\'.\5\6\4\2(.\5\b"+
		"\5\2).\5\16\b\2*.\5\20\t\2+.\5\n\6\2,.\5\f\7\2-\'\3\2\2\2-(\3\2\2\2-)"+
		"\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\5\3\2\2\2/\60\7\b\2\2\60\61\7"+
		"\16\2\2\61\62\7\27\2\2\62\63\7\17\2\2\63\64\7\3\2\2\64\65\7\7\2\2\65\66"+
		"\7\16\2\2\66;\5\22\n\2\678\7\4\2\28:\5\22\n\29\67\3\2\2\2:=\3\2\2\2;9"+
		"\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\17\2\2?\7\3\2\2\2@A\7\27\2"+
		"\2AB\7\3\2\2BC\7\13\2\2CD\7\16\2\2DI\5\26\f\2EF\7\4\2\2FH\5\26\f\2GE\3"+
		"\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\17\2\2M\t"+
		"\3\2\2\2NO\7\27\2\2OP\7\3\2\2PQ\7\f\2\2QR\7\16\2\2RS\7\17\2\2S\13\3\2"+
		"\2\2TU\7\27\2\2UV\7\3\2\2VW\7\r\2\2WX\7\16\2\2Xe\7\17\2\2YZ\7\3\2\2Z["+
		"\7\7\2\2[\\\7\16\2\2\\a\7\27\2\2]^\7\4\2\2^`\7\27\2\2_]\3\2\2\2`c\3\2"+
		"\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2df\7\17\2\2eY\3\2\2\2ef\3"+
		"\2\2\2f\r\3\2\2\2gh\7\27\2\2hi\7\3\2\2ij\7\t\2\2jk\7\16\2\2kp\5\30\r\2"+
		"lm\7\4\2\2mo\5\30\r\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2"+
		"\2rp\3\2\2\2s\u0080\7\17\2\2tu\7\3\2\2uv\7\7\2\2vw\7\16\2\2w|\7\27\2\2"+
		"xy\7\4\2\2y{\7\27\2\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2"+
		"\2\2~|\3\2\2\2\177\u0081\7\17\2\2\u0080t\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\17\3\2\2\2\u0082\u0083\7\27\2\2\u0083\u0084\7\3\2\2\u0084\u0085\7\n\2"+
		"\2\u0085\u0086\7\16\2\2\u0086\u008b\5\30\r\2\u0087\u0088\7\4\2\2\u0088"+
		"\u008a\5\30\r\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\7\17\2\2\u008f\21\3\2\2\2\u0090\u0091\7\27\2\2\u0091\u0092\7\5"+
		"\2\2\u0092\u0094\7\20\2\2\u0093\u0095\5\24\13\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\23\3\2\2\2\u0096\u0097\7\16\2\2\u0097\u0098\7\21"+
		"\2\2\u0098\u0099\7\17\2\2\u0099\25\3\2\2\2\u009a\u009b\t\2\2\2\u009b\27"+
		"\3\2\2\2\u009c\u009d\7\27\2\2\u009d\u009e\7\5\2\2\u009e\u009f\5\26\f\2"+
		"\u009f\31\3\2\2\2\16\36$-;Iaep|\u0080\u008b\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}