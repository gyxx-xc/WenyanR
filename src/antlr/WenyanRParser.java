// Generated from WenyanR.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class WenyanRParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, STRING_LITERAL=43, IDENTIFIER=44, 
		ARITH_BINARY_OP=45, POST_MOD_MATH_OP=46, LOGIC_BINARY_OP=47, UNARY_OP=48, 
		IF_LOGIC_OP=49, KEY_FUNCTION=50, ARRAY_KEY_FUNCTION=51, WRITE_KEY_FUNCTION=52, 
		PREPOSITION=53, PREPOSITION_LEFT=54, PREPOSITION_RIGHT=55, DECLARE_OP=56, 
		LOCAL_DECLARE_OP=57, GLOBAL_DECLARE_OP=58, FOR_IF_END=59, FLOAT_NUM=60, 
		FLOAT_NUM_KEYWORDS=61, INT_NUM=62, INT_NUM_KEYWORDS=63, BOOL_VALUE=64, 
		TYPE=65, BREAK=66, COMMENT=67, WS=68;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expr_statement = 2, RULE_data = 3, 
		RULE_reference_statement = 4, RULE_declare_statement = 5, RULE_init_declare_statement = 6, 
		RULE_define_statement = 7, RULE_mod_math_statement = 8, RULE_boolean_algebra_statement = 9, 
		RULE_assign_statement = 10, RULE_function_define_statement = 11, RULE_function_call_statement = 12, 
		RULE_key_function_call_statement = 13, RULE_object_statement = 14, RULE_object_define_statement = 15, 
		RULE_flush_statement = 16, RULE_if_statement = 17, RULE_if_expression = 18, 
		RULE_for_statement = 19, RULE_return_statement = 20, RULE_import_statement = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expr_statement", "data", "reference_statement", 
			"declare_statement", "init_declare_statement", "define_statement", "mod_math_statement", 
			"boolean_algebra_statement", "assign_statement", "function_define_statement", 
			"function_call_statement", "key_function_call_statement", "object_statement", 
			"object_define_statement", "flush_statement", "if_statement", "if_expression", 
			"for_statement", "return_statement", "import_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u5176'", "'\\u4E4B'", "'\\u9577'", "'\\u592B'", "'\\u66F0'", 
			"'\\u6709'", "'\\u540D\\u4E4B'", "'\\u9664'", "'\\u6614\\u4E4B'", "'\\u8005'", 
			"'\\u4ECA'", "'\\u662F\\u77E3'", "'\\u4ECA\\u4E0D\\u5FA9\\u5B58\\u77E3'", 
			"'\\u4E00\\u8853'", "'\\u6B32\\u884C\\u662F\\u8853'", "'\\u5FC5\\u5148\\u5F97'", 
			"'\\u662F\\u8853\\u66F0'", "'\\u4E43\\u884C\\u662F\\u8853\\u66F0'", "'\\u662F\\u8B02'", 
			"'\\u4E4B\\u8853\\u4E5F'", "'\\u65BD'", "'\\u53D6'", "'\\u4EE5\\u65BD'", 
			"'\\u7269'", "'\\u5176\\u7269\\u5982\\u662F'", "'\\u7269\\u4E4B'", "'\\u4E4B\\u7269\\u4E5F'", 
			"'\\u566B'", "'\\u82E5'", "'\\u82E5\\u975E'", "'\\u51E1'", "'\\u4E2D\\u4E4B'", 
			"'\\u70BA\\u662F'", "'\\u904D'", "'\\u6046\\u70BA\\u662F'", "'\\u4E43\\u5F97'", 
			"'\\u4E43\\u5F97\\u77E3'", "'\\u4E43\\u6B78\\u7A7A\\u7121'", "'\\u543E\\u5617\\u89C0'", 
			"'\\u4E4B\\u66F8'", "'\\u65B9\\u609F'", "'\\u4E4B\\u7FA9'", null, null, 
			null, "'\\u6240\\u9918\\u5E7E\\u4F55'", null, "'\\u8B8A'", null, null, 
			null, "'\\u66F8'", null, "'\\u65BC'", "'\\u4EE5'", null, "'\\u543E\\u6709'", 
			"'\\u4ECA\\u6709'", null, null, null, null, null, null, null, "'\\u4E43\\u6B62'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "STRING_LITERAL", "IDENTIFIER", 
			"ARITH_BINARY_OP", "POST_MOD_MATH_OP", "LOGIC_BINARY_OP", "UNARY_OP", 
			"IF_LOGIC_OP", "KEY_FUNCTION", "ARRAY_KEY_FUNCTION", "WRITE_KEY_FUNCTION", 
			"PREPOSITION", "PREPOSITION_LEFT", "PREPOSITION_RIGHT", "DECLARE_OP", 
			"LOCAL_DECLARE_OP", "GLOBAL_DECLARE_OP", "FOR_IF_END", "FLOAT_NUM", "FLOAT_NUM_KEYWORDS", 
			"INT_NUM", "INT_NUM_KEYWORDS", "BOOL_VALUE", "TYPE", "BREAK", "COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "WenyanR.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WenyanRParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(WenyanRParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4625267253347483709L) != 0)) {
				{
				{
				setState(44);
				statement();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Expr_statementContext expr_statement() {
			return getRuleContext(Expr_statementContext.class,0);
		}
		public Object_statementContext object_statement() {
			return getRuleContext(Object_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(WenyanRParser.BREAK, 0); }
		public Import_statementContext import_statement() {
			return getRuleContext(Import_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				expr_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				object_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				for_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				return_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				match(BREAK);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				import_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_statementContext extends ParserRuleContext {
		public Declare_statementContext declare_statement() {
			return getRuleContext(Declare_statementContext.class,0);
		}
		public Define_statementContext define_statement() {
			return getRuleContext(Define_statementContext.class,0);
		}
		public Reference_statementContext reference_statement() {
			return getRuleContext(Reference_statementContext.class,0);
		}
		public Init_declare_statementContext init_declare_statement() {
			return getRuleContext(Init_declare_statementContext.class,0);
		}
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public Mod_math_statementContext mod_math_statement() {
			return getRuleContext(Mod_math_statementContext.class,0);
		}
		public Boolean_algebra_statementContext boolean_algebra_statement() {
			return getRuleContext(Boolean_algebra_statementContext.class,0);
		}
		public Function_define_statementContext function_define_statement() {
			return getRuleContext(Function_define_statementContext.class,0);
		}
		public Function_call_statementContext function_call_statement() {
			return getRuleContext(Function_call_statementContext.class,0);
		}
		public Key_function_call_statementContext key_function_call_statement() {
			return getRuleContext(Key_function_call_statementContext.class,0);
		}
		public Flush_statementContext flush_statement() {
			return getRuleContext(Flush_statementContext.class,0);
		}
		public Expr_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitExpr_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_statementContext expr_statement() throws RecognitionException {
		Expr_statementContext _localctx = new Expr_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr_statement);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				declare_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				define_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				reference_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				init_declare_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				assign_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				mod_math_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				boolean_algebra_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(68);
				function_define_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(69);
				function_call_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(70);
				key_function_call_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(71);
				flush_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataContext extends ParserRuleContext {
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	 
		public DataContext() { }
		public void copyFrom(DataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Data_primaryContext extends DataContext {
		public Token type;
		public TerminalNode STRING_LITERAL() { return getToken(WenyanRParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(WenyanRParser.BOOL_VALUE, 0); }
		public TerminalNode INT_NUM() { return getToken(WenyanRParser.INT_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(WenyanRParser.FLOAT_NUM, 0); }
		public Data_primaryContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitData_primary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Data_childContext extends DataContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(WenyanRParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WenyanRParser.IDENTIFIER, 0); }
		public TerminalNode INT_NUM() { return getToken(WenyanRParser.INT_NUM, 0); }
		public Data_childContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitData_child(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Id_lastContext extends DataContext {
		public Id_lastContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitId_last(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends DataContext {
		public TerminalNode IDENTIFIER() { return getToken(WenyanRParser.IDENTIFIER, 0); }
		public IdContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Id_last_with_selfContext extends DataContext {
		public Id_last_with_selfContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitId_last_with_self(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		return data(0);
	}

	private DataContext data(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DataContext _localctx = new DataContext(_ctx, _parentState);
		DataContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_data, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case FLOAT_NUM:
			case INT_NUM:
			case BOOL_VALUE:
				{
				_localctx = new Data_primaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(75);
				((Data_primaryContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & 2752513L) != 0)) ) {
					((Data_primaryContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__0:
				{
				_localctx = new Id_lastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(T__0);
				}
				break;
			case T__1:
				{
				_localctx = new Id_last_with_selfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(T__1);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Data_childContext(new DataContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_data);
					setState(81);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(82);
					match(T__1);
					setState(83);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611712406706454538L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Reference_statementContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public Reference_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitReference_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reference_statementContext reference_statement() throws RecognitionException {
		Reference_statementContext _localctx = new Reference_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_reference_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__3);
			setState(90);
			data(0);
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
	public static class Declare_statementContext extends ParserRuleContext {
		public Token d;
		public TerminalNode INT_NUM() { return getToken(WenyanRParser.INT_NUM, 0); }
		public TerminalNode TYPE() { return getToken(WenyanRParser.TYPE, 0); }
		public TerminalNode DECLARE_OP() { return getToken(WenyanRParser.DECLARE_OP, 0); }
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public Declare_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitDeclare_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_statementContext declare_statement() throws RecognitionException {
		Declare_statementContext _localctx = new Declare_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declare_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((Declare_statementContext)_localctx).d = match(DECLARE_OP);
			setState(93);
			match(INT_NUM);
			setState(94);
			match(TYPE);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(95);
				match(T__4);
				setState(96);
				data(0);
				}
				}
				setState(101);
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
	public static class Init_declare_statementContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(WenyanRParser.TYPE, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public Init_declare_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declare_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitInit_declare_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declare_statementContext init_declare_statement() throws RecognitionException {
		Init_declare_statementContext _localctx = new Init_declare_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_init_declare_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__5);
			setState(103);
			match(TYPE);
			setState(104);
			data(0);
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
	public static class Define_statementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(WenyanRParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(WenyanRParser.IDENTIFIER, i);
		}
		public Define_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitDefine_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_statementContext define_statement() throws RecognitionException {
		Define_statementContext _localctx = new Define_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_define_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__6);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				match(T__4);
				setState(108);
				match(IDENTIFIER);
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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
	public static class Mod_math_statementContext extends ParserRuleContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public TerminalNode PREPOSITION() { return getToken(WenyanRParser.PREPOSITION, 0); }
		public TerminalNode POST_MOD_MATH_OP() { return getToken(WenyanRParser.POST_MOD_MATH_OP, 0); }
		public Mod_math_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_math_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitMod_math_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mod_math_statementContext mod_math_statement() throws RecognitionException {
		Mod_math_statementContext _localctx = new Mod_math_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mod_math_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__7);
			setState(114);
			data(0);
			setState(115);
			match(PREPOSITION);
			setState(116);
			data(0);
			setState(117);
			match(POST_MOD_MATH_OP);
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
	public static class Boolean_algebra_statementContext extends ParserRuleContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public TerminalNode LOGIC_BINARY_OP() { return getToken(WenyanRParser.LOGIC_BINARY_OP, 0); }
		public Boolean_algebra_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_algebra_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitBoolean_algebra_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_algebra_statementContext boolean_algebra_statement() throws RecognitionException {
		Boolean_algebra_statementContext _localctx = new Boolean_algebra_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolean_algebra_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__3);
			setState(120);
			data(0);
			setState(121);
			data(0);
			setState(122);
			match(LOGIC_BINARY_OP);
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
	public static class Assign_statementContext extends ParserRuleContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitAssign_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__8);
			setState(125);
			data(0);
			setState(126);
			match(T__9);
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				{
				setState(127);
				match(T__10);
				setState(128);
				data(0);
				setState(129);
				match(T__11);
				}
				}
				break;
			case T__12:
				{
				setState(131);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Function_define_statementContext extends ParserRuleContext {
		public TerminalNode LOCAL_DECLARE_OP() { return getToken(WenyanRParser.LOCAL_DECLARE_OP, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(WenyanRParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(WenyanRParser.IDENTIFIER, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> INT_NUM() { return getTokens(WenyanRParser.INT_NUM); }
		public TerminalNode INT_NUM(int i) {
			return getToken(WenyanRParser.INT_NUM, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(WenyanRParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(WenyanRParser.TYPE, i);
		}
		public Function_define_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_define_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitFunction_define_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_define_statementContext function_define_statement() throws RecognitionException {
		Function_define_statementContext _localctx = new Function_define_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_define_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(LOCAL_DECLARE_OP);
			setState(135);
			match(T__13);
			setState(136);
			match(T__6);
			setState(137);
			match(T__4);
			setState(138);
			match(IDENTIFIER);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(139);
				match(T__14);
				setState(140);
				match(T__15);
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					match(INT_NUM);
					setState(142);
					match(TYPE);
					setState(145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(143);
						match(T__4);
						setState(144);
						match(IDENTIFIER);
						}
						}
						setState(147); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__4 );
					}
					}
					setState(151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT_NUM );
				}
			}

			setState(155);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4625267253347483709L) != 0)) {
				{
				{
				setState(156);
				statement();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(T__18);
			setState(163);
			match(IDENTIFIER);
			setState(164);
			match(T__19);
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
	public static class Function_call_statementContext extends ParserRuleContext {
		public Function_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_statement; }
	 
		public Function_call_statementContext() { }
		public void copyFrom(Function_call_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Function_post_callContext extends Function_call_statementContext {
		public TerminalNode INT_NUM() { return getToken(WenyanRParser.INT_NUM, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public Function_post_callContext(Function_call_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitFunction_post_call(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Function_pre_callContext extends Function_call_statementContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public List<TerminalNode> PREPOSITION() { return getTokens(WenyanRParser.PREPOSITION); }
		public TerminalNode PREPOSITION(int i) {
			return getToken(WenyanRParser.PREPOSITION, i);
		}
		public Function_pre_callContext(Function_call_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitFunction_pre_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_statementContext function_call_statement() throws RecognitionException {
		Function_call_statementContext _localctx = new Function_call_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_call_statement);
		int _la;
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new Function_pre_callContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__20);
				setState(167);
				data(0);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PREPOSITION) {
					{
					{
					setState(168);
					match(PREPOSITION);
					setState(169);
					data(0);
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__21:
				_localctx = new Function_post_callContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__21);
				setState(176);
				match(INT_NUM);
				setState(177);
				match(T__22);
				setState(178);
				data(0);
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
	public static class Key_function_call_statementContext extends ParserRuleContext {
		public TerminalNode KEY_FUNCTION() { return getToken(WenyanRParser.KEY_FUNCTION, 0); }
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public List<TerminalNode> PREPOSITION() { return getTokens(WenyanRParser.PREPOSITION); }
		public TerminalNode PREPOSITION(int i) {
			return getToken(WenyanRParser.PREPOSITION, i);
		}
		public Key_function_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_function_call_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitKey_function_call_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_function_call_statementContext key_function_call_statement() throws RecognitionException {
		Key_function_call_statementContext _localctx = new Key_function_call_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_key_function_call_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(KEY_FUNCTION);
			setState(182);
			data(0);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PREPOSITION) {
				{
				{
				setState(183);
				match(PREPOSITION);
				setState(184);
				data(0);
				}
				}
				setState(189);
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
	public static class Object_statementContext extends ParserRuleContext {
		public TerminalNode LOCAL_DECLARE_OP() { return getToken(WenyanRParser.LOCAL_DECLARE_OP, 0); }
		public TerminalNode INT_NUM() { return getToken(WenyanRParser.INT_NUM, 0); }
		public Define_statementContext define_statement() {
			return getRuleContext(Define_statementContext.class,0);
		}
		public Object_define_statementContext object_define_statement() {
			return getRuleContext(Object_define_statementContext.class,0);
		}
		public Object_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitObject_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_statementContext object_statement() throws RecognitionException {
		Object_statementContext _localctx = new Object_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_object_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(LOCAL_DECLARE_OP);
			setState(191);
			match(INT_NUM);
			setState(192);
			match(T__23);
			setState(193);
			define_statement();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(194);
				object_define_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Object_define_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(WenyanRParser.IDENTIFIER, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(WenyanRParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(WenyanRParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(WenyanRParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(WenyanRParser.TYPE, i);
		}
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public Object_define_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_define_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitObject_define_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_define_statementContext object_define_statement() throws RecognitionException {
		Object_define_statementContext _localctx = new Object_define_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_object_define_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__24);
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				match(T__25);
				setState(199);
				match(STRING_LITERAL);
				setState(200);
				match(T__9);
				setState(201);
				match(TYPE);
				setState(202);
				match(T__4);
				setState(203);
				data(0);
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__25 );
			setState(208);
			match(T__18);
			setState(209);
			match(IDENTIFIER);
			setState(210);
			match(T__26);
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
	public static class Flush_statementContext extends ParserRuleContext {
		public Flush_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flush_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitFlush_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flush_statementContext flush_statement() throws RecognitionException {
		Flush_statementContext _localctx = new Flush_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_flush_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__27);
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
	public static class If_statementContext extends ParserRuleContext {
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public TerminalNode FOR_IF_END() { return getToken(WenyanRParser.FOR_IF_END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__28);
			setState(215);
			if_expression();
			setState(216);
			match(T__9);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4625267253347483709L) != 0)) {
				{
				{
				setState(217);
				statement();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(223);
				match(T__29);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4625267253347483709L) != 0)) {
					{
					{
					setState(224);
					statement();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(232);
			match(FOR_IF_END);
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
	public static class If_expressionContext extends ParserRuleContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public TerminalNode IF_LOGIC_OP() { return getToken(WenyanRParser.IF_LOGIC_OP, 0); }
		public If_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitIf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_expression);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				data(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				data(0);
				setState(236);
				match(IF_LOGIC_OP);
				setState(237);
				data(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	 
		public For_statementContext() { }
		public void copyFrom(For_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class For_enum_statementContext extends For_statementContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode FOR_IF_END() { return getToken(WenyanRParser.FOR_IF_END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_enum_statementContext(For_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitFor_enum_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class For_arr_statementContext extends For_statementContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(WenyanRParser.IDENTIFIER, 0); }
		public TerminalNode FOR_IF_END() { return getToken(WenyanRParser.FOR_IF_END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_arr_statementContext(For_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitFor_arr_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class For_while_statementContext extends For_statementContext {
		public TerminalNode FOR_IF_END() { return getToken(WenyanRParser.FOR_IF_END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_while_statementContext(For_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitFor_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_statement);
		int _la;
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				_localctx = new For_arr_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__30);
				setState(242);
				data(0);
				setState(243);
				match(T__31);
				setState(244);
				match(IDENTIFIER);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4625267253347483709L) != 0)) {
					{
					{
					setState(245);
					statement();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251);
				match(FOR_IF_END);
				}
				break;
			case T__32:
				_localctx = new For_enum_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(T__32);
				setState(254);
				data(0);
				setState(255);
				match(T__33);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4625267253347483709L) != 0)) {
					{
					{
					setState(256);
					statement();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(FOR_IF_END);
				}
				break;
			case T__34:
				_localctx = new For_while_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(T__34);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 4625267253347483709L) != 0)) {
					{
					{
					setState(265);
					statement();
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271);
				match(FOR_IF_END);
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
	public static class Return_statementContext extends ParserRuleContext {
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	 
		public Return_statementContext() { }
		public void copyFrom(Return_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Return_data_statementContext extends Return_statementContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public Return_data_statementContext(Return_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitReturn_data_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Return_last_statementContext extends Return_statementContext {
		public Return_last_statementContext(Return_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitReturn_last_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Return_void_statementContext extends Return_statementContext {
		public Return_void_statementContext(Return_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitReturn_void_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_return_statement);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				_localctx = new Return_data_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(T__35);
				setState(275);
				data(0);
				}
				break;
			case T__36:
				_localctx = new Return_last_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(T__36);
				}
				break;
			case T__37:
				_localctx = new Return_void_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(T__37);
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
	public static class Import_statementContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(WenyanRParser.STRING_LITERAL, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(WenyanRParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(WenyanRParser.IDENTIFIER, i);
		}
		public Import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitImport_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_statementContext import_statement() throws RecognitionException {
		Import_statementContext _localctx = new Import_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_import_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__38);
			setState(281);
			match(STRING_LITERAL);
			setState(282);
			match(T__39);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(283);
				match(T__40);
				setState(285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(284);
					match(IDENTIFIER);
					}
					}
					setState(287); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(289);
				match(T__41);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return data_sempred((DataContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean data_sempred(DataContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001D\u0125\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003P\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003U\b\u0003\n\u0003\f\u0003"+
		"X\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005b\b\u0005\n\u0005\f\u0005"+
		"e\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007n\b\u0007\u000b\u0007\f\u0007o\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0085\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u0092\b\u000b\u000b\u000b\f\u000b\u0093\u0004\u000b"+
		"\u0096\b\u000b\u000b\u000b\f\u000b\u0097\u0003\u000b\u009a\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u009e\b\u000b\n\u000b\f\u000b\u00a1\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00ab\b\f\n\f\f\f\u00ae\t\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00b4\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00ba"+
		"\b\r\n\r\f\r\u00bd\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00c4\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00cd\b\u000f"+
		"\u000b\u000f\f\u000f\u00ce\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00db\b\u0011\n\u0011\f\u0011\u00de\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00e2\b\u0011\n\u0011\f\u0011\u00e5\t\u0011\u0003\u0011"+
		"\u00e7\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00f0\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00f7\b\u0013\n\u0013"+
		"\f\u0013\u00fa\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0102\b\u0013\n\u0013\f\u0013\u0105"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u010b"+
		"\b\u0013\n\u0013\f\u0013\u010e\t\u0013\u0001\u0013\u0003\u0013\u0111\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0117"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004"+
		"\u0015\u011e\b\u0015\u000b\u0015\f\u0015\u011f\u0001\u0015\u0003\u0015"+
		"\u0123\b\u0015\u0001\u0015\u0000\u0001\u0006\u0016\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000"+
		"\u0003\u0004\u0000++<<>>@@\u0004\u0000\u0001\u0001\u0003\u0003+,>>\u0001"+
		"\u0000\u0011\u0012\u013c\u0000/\u0001\u0000\u0000\u0000\u0002;\u0001\u0000"+
		"\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006O\u0001\u0000\u0000\u0000"+
		"\bY\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\ff\u0001\u0000"+
		"\u0000\u0000\u000ej\u0001\u0000\u0000\u0000\u0010q\u0001\u0000\u0000\u0000"+
		"\u0012w\u0001\u0000\u0000\u0000\u0014|\u0001\u0000\u0000\u0000\u0016\u0086"+
		"\u0001\u0000\u0000\u0000\u0018\u00b3\u0001\u0000\u0000\u0000\u001a\u00b5"+
		"\u0001\u0000\u0000\u0000\u001c\u00be\u0001\u0000\u0000\u0000\u001e\u00c5"+
		"\u0001\u0000\u0000\u0000 \u00d4\u0001\u0000\u0000\u0000\"\u00d6\u0001"+
		"\u0000\u0000\u0000$\u00ef\u0001\u0000\u0000\u0000&\u0110\u0001\u0000\u0000"+
		"\u0000(\u0116\u0001\u0000\u0000\u0000*\u0118\u0001\u0000\u0000\u0000,"+
		".\u0003\u0002\u0001\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000023\u0005\u0000\u0000\u00013\u0001"+
		"\u0001\u0000\u0000\u00004<\u0003\u0004\u0002\u00005<\u0003\u001c\u000e"+
		"\u00006<\u0003\"\u0011\u00007<\u0003&\u0013\u00008<\u0003(\u0014\u0000"+
		"9<\u0005B\u0000\u0000:<\u0003*\u0015\u0000;4\u0001\u0000\u0000\u0000;"+
		"5\u0001\u0000\u0000\u0000;6\u0001\u0000\u0000\u0000;7\u0001\u0000\u0000"+
		"\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000"+
		"\u0000\u0000<\u0003\u0001\u0000\u0000\u0000=I\u0003\n\u0005\u0000>I\u0003"+
		"\u000e\u0007\u0000?I\u0003\b\u0004\u0000@I\u0003\f\u0006\u0000AI\u0003"+
		"\u0014\n\u0000BI\u0003\u0010\b\u0000CI\u0003\u0012\t\u0000DI\u0003\u0016"+
		"\u000b\u0000EI\u0003\u0018\f\u0000FI\u0003\u001a\r\u0000GI\u0003 \u0010"+
		"\u0000H=\u0001\u0000\u0000\u0000H>\u0001\u0000\u0000\u0000H?\u0001\u0000"+
		"\u0000\u0000H@\u0001\u0000\u0000\u0000HA\u0001\u0000\u0000\u0000HB\u0001"+
		"\u0000\u0000\u0000HC\u0001\u0000\u0000\u0000HD\u0001\u0000\u0000\u0000"+
		"HE\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000"+
		"\u0000I\u0005\u0001\u0000\u0000\u0000JK\u0006\u0003\uffff\uffff\u0000"+
		"KP\u0007\u0000\u0000\u0000LP\u0005\u0001\u0000\u0000MP\u0005\u0002\u0000"+
		"\u0000NP\u0005,\u0000\u0000OJ\u0001\u0000\u0000\u0000OL\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000PV\u0001\u0000"+
		"\u0000\u0000QR\n\u0001\u0000\u0000RS\u0005\u0002\u0000\u0000SU\u0007\u0001"+
		"\u0000\u0000TQ\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u0007\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000YZ\u0005\u0004\u0000\u0000Z[\u0003\u0006"+
		"\u0003\u0000[\t\u0001\u0000\u0000\u0000\\]\u00058\u0000\u0000]^\u0005"+
		">\u0000\u0000^c\u0005A\u0000\u0000_`\u0005\u0005\u0000\u0000`b\u0003\u0006"+
		"\u0003\u0000a_\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u000b\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000fg\u0005\u0006\u0000\u0000gh\u0005A\u0000"+
		"\u0000hi\u0003\u0006\u0003\u0000i\r\u0001\u0000\u0000\u0000jm\u0005\u0007"+
		"\u0000\u0000kl\u0005\u0005\u0000\u0000ln\u0005,\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000p\u000f\u0001\u0000\u0000\u0000qr\u0005\b\u0000\u0000"+
		"rs\u0003\u0006\u0003\u0000st\u00055\u0000\u0000tu\u0003\u0006\u0003\u0000"+
		"uv\u0005.\u0000\u0000v\u0011\u0001\u0000\u0000\u0000wx\u0005\u0004\u0000"+
		"\u0000xy\u0003\u0006\u0003\u0000yz\u0003\u0006\u0003\u0000z{\u0005/\u0000"+
		"\u0000{\u0013\u0001\u0000\u0000\u0000|}\u0005\t\u0000\u0000}~\u0003\u0006"+
		"\u0003\u0000~\u0084\u0005\n\u0000\u0000\u007f\u0080\u0005\u000b\u0000"+
		"\u0000\u0080\u0081\u0003\u0006\u0003\u0000\u0081\u0082\u0005\f\u0000\u0000"+
		"\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0085\u0005\r\u0000\u0000\u0084"+
		"\u007f\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0015\u0001\u0000\u0000\u0000\u0086\u0087\u00059\u0000\u0000\u0087\u0088"+
		"\u0005\u000e\u0000\u0000\u0088\u0089\u0005\u0007\u0000\u0000\u0089\u008a"+
		"\u0005\u0005\u0000\u0000\u008a\u0099\u0005,\u0000\u0000\u008b\u008c\u0005"+
		"\u000f\u0000\u0000\u008c\u0095\u0005\u0010\u0000\u0000\u008d\u008e\u0005"+
		">\u0000\u0000\u008e\u0091\u0005A\u0000\u0000\u008f\u0090\u0005\u0005\u0000"+
		"\u0000\u0090\u0092\u0005,\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000"+
		"\u0095\u008d\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u008b\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000"+
		"\u009b\u009f\u0007\u0002\u0000\u0000\u009c\u009e\u0003\u0002\u0001\u0000"+
		"\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0013\u0000\u0000\u00a3\u00a4\u0005,\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0014\u0000\u0000\u00a5\u0017\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0015\u0000\u0000\u00a7\u00ac\u0003\u0006\u0003\u0000\u00a8"+
		"\u00a9\u00055\u0000\u0000\u00a9\u00ab\u0003\u0006\u0003\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b4"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005\u0016\u0000\u0000\u00b0\u00b1\u0005>\u0000\u0000\u00b1\u00b2\u0005"+
		"\u0017\u0000\u0000\u00b2\u00b4\u0003\u0006\u0003\u0000\u00b3\u00a6\u0001"+
		"\u0000\u0000\u0000\u00b3\u00af\u0001\u0000\u0000\u0000\u00b4\u0019\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u00052\u0000\u0000\u00b6\u00bb\u0003\u0006"+
		"\u0003\u0000\u00b7\u00b8\u00055\u0000\u0000\u00b8\u00ba\u0003\u0006\u0003"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u001b\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u00059\u0000\u0000\u00bf\u00c0\u0005>\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0018\u0000\u0000\u00c1\u00c3\u0003\u000e\u0007\u0000\u00c2"+
		"\u00c4\u0003\u001e\u000f\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u001d\u0001\u0000\u0000\u0000\u00c5"+
		"\u00cc\u0005\u0019\u0000\u0000\u00c6\u00c7\u0005\u001a\u0000\u0000\u00c7"+
		"\u00c8\u0005+\u0000\u0000\u00c8\u00c9\u0005\n\u0000\u0000\u00c9\u00ca"+
		"\u0005A\u0000\u0000\u00ca\u00cb\u0005\u0005\u0000\u0000\u00cb\u00cd\u0003"+
		"\u0006\u0003\u0000\u00cc\u00c6\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		"\u0013\u0000\u0000\u00d1\u00d2\u0005,\u0000\u0000\u00d2\u00d3\u0005\u001b"+
		"\u0000\u0000\u00d3\u001f\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u001c"+
		"\u0000\u0000\u00d5!\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u001d\u0000"+
		"\u0000\u00d7\u00d8\u0003$\u0012\u0000\u00d8\u00dc\u0005\n\u0000\u0000"+
		"\u00d9\u00db\u0003\u0002\u0001\u0000\u00da\u00d9\u0001\u0000\u0000\u0000"+
		"\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00e6\u0001\u0000\u0000\u0000"+
		"\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e3\u0005\u001e\u0000\u0000"+
		"\u00e0\u00e2\u0003\u0002\u0001\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00df\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0005;\u0000\u0000\u00e9#\u0001\u0000\u0000\u0000\u00ea\u00f0"+
		"\u0003\u0006\u0003\u0000\u00eb\u00ec\u0003\u0006\u0003\u0000\u00ec\u00ed"+
		"\u00051\u0000\u0000\u00ed\u00ee\u0003\u0006\u0003\u0000\u00ee\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ea\u0001\u0000\u0000\u0000\u00ef\u00eb\u0001"+
		"\u0000\u0000\u0000\u00f0%\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u001f"+
		"\u0000\u0000\u00f2\u00f3\u0003\u0006\u0003\u0000\u00f3\u00f4\u0005 \u0000"+
		"\u0000\u00f4\u00f8\u0005,\u0000\u0000\u00f5\u00f7\u0003\u0002\u0001\u0000"+
		"\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0005;\u0000\u0000\u00fc\u0111\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005!\u0000\u0000\u00fe\u00ff\u0003\u0006\u0003\u0000\u00ff\u0103"+
		"\u0005\"\u0000\u0000\u0100\u0102\u0003\u0002\u0001\u0000\u0101\u0100\u0001"+
		"\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0106\u0001"+
		"\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0005"+
		";\u0000\u0000\u0107\u0111\u0001\u0000\u0000\u0000\u0108\u010c\u0005#\u0000"+
		"\u0000\u0109\u010b\u0003\u0002\u0001\u0000\u010a\u0109\u0001\u0000\u0000"+
		"\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000"+
		"\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0111\u0005;\u0000\u0000"+
		"\u0110\u00f1\u0001\u0000\u0000\u0000\u0110\u00fd\u0001\u0000\u0000\u0000"+
		"\u0110\u0108\u0001\u0000\u0000\u0000\u0111\'\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0005$\u0000\u0000\u0113\u0117\u0003\u0006\u0003\u0000\u0114\u0117"+
		"\u0005%\u0000\u0000\u0115\u0117\u0005&\u0000\u0000\u0116\u0112\u0001\u0000"+
		"\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0115\u0001\u0000"+
		"\u0000\u0000\u0117)\u0001\u0000\u0000\u0000\u0118\u0119\u0005\'\u0000"+
		"\u0000\u0119\u011a\u0005+\u0000\u0000\u011a\u0122\u0005(\u0000\u0000\u011b"+
		"\u011d\u0005)\u0000\u0000\u011c\u011e\u0005,\u0000\u0000\u011d\u011c\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0001"+
		"\u0000\u0000\u0000\u0121\u0123\u0005*\u0000\u0000\u0122\u011b\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123+\u0001\u0000\u0000"+
		"\u0000\u001c/;HOVco\u0084\u0093\u0097\u0099\u009f\u00ac\u00b3\u00bb\u00c3"+
		"\u00ce\u00dc\u00e3\u00e6\u00ef\u00f8\u0103\u010c\u0110\u0116\u011f\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}