// Generated from WenyanR.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, STRING_LITERAL=50, IDENTIFIER=51, 
		POST_MOD_MATH_OP=52, LOGIC_BINARY_OP=53, UNARY_OP=54, IF_LOGIC_OP=55, 
		ARRAY_KEY_FUNCTION=56, WRITE_KEY_FUNCTION=57, PREPOSITION=58, PREPOSITION_LEFT=59, 
		PREPOSITION_RIGHT=60, DECLARE_OP=61, LOCAL_DECLARE_OP=62, GLOBAL_DECLARE_OP=63, 
		FOR_IF_END=64, FLOAT_NUM=65, INT_NUM=66, BOOL_VALUE=67, BREAK=68, COMMENT=69, 
		WS=70;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expr_statement = 2, RULE_data = 3, 
		RULE_reference_statement = 4, RULE_declare_statement = 5, RULE_init_declare_statement = 6, 
		RULE_define_statement = 7, RULE_mod_math_statement = 8, RULE_boolean_algebra_statement = 9, 
		RULE_assign_statement = 10, RULE_function_define_statement = 11, RULE_function_call_statement = 12, 
		RULE_key_function_call_statement = 13, RULE_object_statement = 14, RULE_object_define_statement = 15, 
		RULE_flush_statement = 16, RULE_if_statement = 17, RULE_if_expression = 18, 
		RULE_for_statement = 19, RULE_return_statement = 20, RULE_import_statement = 21, 
		RULE_arith_binary_op = 22, RULE_key_function = 23, RULE_type = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expr_statement", "data", "reference_statement", 
			"declare_statement", "init_declare_statement", "define_statement", "mod_math_statement", 
			"boolean_algebra_statement", "assign_statement", "function_define_statement", 
			"function_call_statement", "key_function_call_statement", "object_statement", 
			"object_define_statement", "flush_statement", "if_statement", "if_expression", 
			"for_statement", "return_statement", "import_statement", "arith_binary_op", 
			"key_function", "type"
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
			"'\\u4E4B\\u66F8'", "'\\u65B9\\u609F'", "'\\u4E4B\\u7FA9'", "'\\u52A0'", 
			"'\\u6E1B'", "'\\u4E58'", "'\\u6578'", "'\\u5217'", "'\\u8A00'", "'\\u723B'", 
			null, null, "'\\u6240\\u9918\\u5E7E\\u4F55'", null, "'\\u8B8A'", null, 
			null, "'\\u66F8'", null, "'\\u65BC'", "'\\u4EE5'", null, "'\\u543E\\u6709'", 
			"'\\u4ECA\\u6709'", null, null, null, null, "'\\u4E43\\u6B62'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "STRING_LITERAL", "IDENTIFIER", "POST_MOD_MATH_OP", "LOGIC_BINARY_OP", 
			"UNARY_OP", "IF_LOGIC_OP", "ARRAY_KEY_FUNCTION", "WRITE_KEY_FUNCTION", 
			"PREPOSITION", "PREPOSITION_LEFT", "PREPOSITION_RIGHT", "DECLARE_OP", 
			"LOCAL_DECLARE_OP", "GLOBAL_DECLARE_OP", "FOR_IF_END", "FLOAT_NUM", "INT_NUM", 
			"BOOL_VALUE", "BREAK", "COMMENT", "WS"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7151778857616409552L) != 0) || _la==BREAK) {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				expr_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				object_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				for_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				return_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				match(BREAK);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
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
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				declare_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				define_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				reference_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				init_declare_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				assign_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				mod_math_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				boolean_algebra_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(74);
				function_define_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(75);
				function_call_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(76);
				key_function_call_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(77);
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
		public Token data_type;
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
			setState(85);
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

				setState(81);
				((Data_primaryContext)_localctx).data_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 229377L) != 0)) ) {
					((Data_primaryContext)_localctx).data_type = (Token)_errHandler.recoverInline(this);
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
				setState(82);
				match(T__0);
				}
				break;
			case T__1:
				{
				_localctx = new Id_last_with_selfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(T__1);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
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
					setState(87);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(88);
					match(T__1);
					setState(89);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3377699720527882L) != 0) || _la==INT_NUM) ) {
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
				setState(94);
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
			setState(95);
			match(T__3);
			setState(96);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
			setState(98);
			((Declare_statementContext)_localctx).d = match(DECLARE_OP);
			setState(99);
			match(INT_NUM);
			setState(100);
			type();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(101);
				match(T__4);
				setState(102);
				data(0);
				}
				}
				setState(107);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
			setState(108);
			match(T__5);
			setState(109);
			type();
			setState(110);
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
			setState(112);
			match(T__6);
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				match(T__4);
				setState(114);
				match(IDENTIFIER);
				}
				}
				setState(117); 
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
			setState(119);
			match(T__7);
			setState(120);
			data(0);
			setState(121);
			match(PREPOSITION);
			setState(122);
			data(0);
			setState(123);
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
			setState(125);
			match(T__3);
			setState(126);
			data(0);
			setState(127);
			data(0);
			setState(128);
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
			setState(130);
			match(T__8);
			setState(131);
			data(0);
			setState(132);
			match(T__9);
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				{
				setState(133);
				match(T__10);
				setState(134);
				data(0);
				setState(135);
				match(T__11);
				}
				}
				break;
			case T__12:
				{
				setState(137);
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
			setState(140);
			match(LOCAL_DECLARE_OP);
			setState(141);
			match(T__13);
			setState(142);
			match(T__6);
			setState(143);
			match(T__4);
			setState(144);
			match(IDENTIFIER);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(145);
				match(T__14);
				setState(146);
				match(T__15);
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(147);
					match(INT_NUM);
					setState(148);
					type();
					setState(151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(149);
						match(T__4);
						setState(150);
						match(IDENTIFIER);
						}
						}
						setState(153); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__4 );
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT_NUM );
				}
			}

			setState(161);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7151778857616409552L) != 0) || _la==BREAK) {
				{
				{
				setState(162);
				statement();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(T__18);
			setState(169);
			match(IDENTIFIER);
			setState(170);
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
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new Function_pre_callContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__20);
				setState(173);
				data(0);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PREPOSITION) {
					{
					{
					setState(174);
					match(PREPOSITION);
					setState(175);
					data(0);
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__21:
				_localctx = new Function_post_callContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(T__21);
				setState(182);
				match(INT_NUM);
				setState(183);
				match(T__22);
				setState(184);
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
		public Key_functionContext key_function() {
			return getRuleContext(Key_functionContext.class,0);
		}
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
			setState(187);
			key_function();
			setState(188);
			data(0);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PREPOSITION) {
				{
				{
				setState(189);
				match(PREPOSITION);
				setState(190);
				data(0);
				}
				}
				setState(195);
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
			setState(196);
			match(LOCAL_DECLARE_OP);
			setState(197);
			match(INT_NUM);
			setState(198);
			match(T__23);
			setState(199);
			define_statement();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(200);
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
			setState(203);
			match(T__24);
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				match(T__25);
				setState(205);
				match(STRING_LITERAL);
				setState(206);
				match(T__9);
				setState(207);
				type();
				setState(208);
				match(T__4);
				setState(209);
				data(0);
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__25 );
			setState(215);
			match(T__18);
			setState(216);
			match(IDENTIFIER);
			setState(217);
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
			setState(219);
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
			setState(221);
			match(T__28);
			setState(222);
			if_expression();
			setState(223);
			match(T__9);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7151778857616409552L) != 0) || _la==BREAK) {
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
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(230);
				match(T__29);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7151778857616409552L) != 0) || _la==BREAK) {
					{
					{
					setState(231);
					statement();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(239);
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
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				data(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				data(0);
				setState(243);
				match(IF_LOGIC_OP);
				setState(244);
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
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				_localctx = new For_arr_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(T__30);
				setState(249);
				data(0);
				setState(250);
				match(T__31);
				setState(251);
				match(IDENTIFIER);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7151778857616409552L) != 0) || _la==BREAK) {
					{
					{
					setState(252);
					statement();
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
				match(FOR_IF_END);
				}
				break;
			case T__32:
				_localctx = new For_enum_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(T__32);
				setState(261);
				data(0);
				setState(262);
				match(T__33);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7151778857616409552L) != 0) || _la==BREAK) {
					{
					{
					setState(263);
					statement();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				match(FOR_IF_END);
				}
				break;
			case T__34:
				_localctx = new For_while_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(T__34);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7151778857616409552L) != 0) || _la==BREAK) {
					{
					{
					setState(272);
					statement();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
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
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				_localctx = new Return_data_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(T__35);
				setState(282);
				data(0);
				}
				break;
			case T__36:
				_localctx = new Return_last_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(T__36);
				}
				break;
			case T__37:
				_localctx = new Return_void_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
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
			setState(287);
			match(T__38);
			setState(288);
			match(STRING_LITERAL);
			setState(289);
			match(T__39);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(290);
				match(T__40);
				setState(292); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(291);
					match(IDENTIFIER);
					}
					}
					setState(294); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(296);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arith_binary_opContext extends ParserRuleContext {
		public Arith_binary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_binary_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitArith_binary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_binary_opContext arith_binary_op() throws RecognitionException {
		Arith_binary_opContext _localctx = new Arith_binary_opContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arith_binary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651155712L) != 0)) ) {
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
	public static class Key_functionContext extends ParserRuleContext {
		public Arith_binary_opContext arith_binary_op() {
			return getRuleContext(Arith_binary_opContext.class,0);
		}
		public TerminalNode UNARY_OP() { return getToken(WenyanRParser.UNARY_OP, 0); }
		public TerminalNode ARRAY_KEY_FUNCTION() { return getToken(WenyanRParser.ARRAY_KEY_FUNCTION, 0); }
		public TerminalNode WRITE_KEY_FUNCTION() { return getToken(WenyanRParser.WRITE_KEY_FUNCTION, 0); }
		public Key_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitKey_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_functionContext key_function() throws RecognitionException {
		Key_functionContext _localctx = new Key_functionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_key_function);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__42:
			case T__43:
			case T__44:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				arith_binary_op();
				}
				break;
			case UNARY_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(UNARY_OP);
				}
				break;
			case ARRAY_KEY_FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(ARRAY_KEY_FUNCTION);
				}
				break;
			case WRITE_KEY_FUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				match(WRITE_KEY_FUNCTION);
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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0)) ) {
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
		"\u0004\u0001F\u0136\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002O\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003V\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003[\b\u0003\n\u0003\f\u0003"+
		"^\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005h\b\u0005\n\u0005\f\u0005"+
		"k\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007t\b\u0007\u000b\u0007\f\u0007u\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u008b\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u0098\b\u000b\u000b\u000b\f\u000b\u0099\u0004\u000b"+
		"\u009c\b\u000b\u000b\u000b\f\u000b\u009d\u0003\u000b\u00a0\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00a4\b\u000b\n\u000b\f\u000b\u00a7\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00b1\b\f\n\f\f\f\u00b4\t\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00ba\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00c0"+
		"\b\r\n\r\f\r\u00c3\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00ca\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f"+
		"\u00d4\b\u000f\u000b\u000f\f\u000f\u00d5\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u00e2\b\u0011\n\u0011\f\u0011\u00e5\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00e9\b\u0011\n\u0011\f\u0011\u00ec"+
		"\t\u0011\u0003\u0011\u00ee\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00f7\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00fe\b\u0013\n\u0013\f\u0013\u0101\t\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0109\b\u0013\n"+
		"\u0013\f\u0013\u010c\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u0112\b\u0013\n\u0013\f\u0013\u0115\t\u0013\u0001\u0013"+
		"\u0003\u0013\u0118\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u011e\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0004\u0015\u0125\b\u0015\u000b\u0015\f\u0015\u0126\u0001"+
		"\u0015\u0003\u0015\u012a\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0132\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0000\u0001\u0006\u0019\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000"+
		"\u0005\u0002\u000022AC\u0004\u0000\u0001\u0001\u0003\u000323BB\u0001\u0000"+
		"\u0011\u0012\u0002\u0000\b\b+-\u0001\u0000.1\u014d\u00005\u0001\u0000"+
		"\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004N\u0001\u0000\u0000\u0000"+
		"\u0006U\u0001\u0000\u0000\u0000\b_\u0001\u0000\u0000\u0000\nb\u0001\u0000"+
		"\u0000\u0000\fl\u0001\u0000\u0000\u0000\u000ep\u0001\u0000\u0000\u0000"+
		"\u0010w\u0001\u0000\u0000\u0000\u0012}\u0001\u0000\u0000\u0000\u0014\u0082"+
		"\u0001\u0000\u0000\u0000\u0016\u008c\u0001\u0000\u0000\u0000\u0018\u00b9"+
		"\u0001\u0000\u0000\u0000\u001a\u00bb\u0001\u0000\u0000\u0000\u001c\u00c4"+
		"\u0001\u0000\u0000\u0000\u001e\u00cb\u0001\u0000\u0000\u0000 \u00db\u0001"+
		"\u0000\u0000\u0000\"\u00dd\u0001\u0000\u0000\u0000$\u00f6\u0001\u0000"+
		"\u0000\u0000&\u0117\u0001\u0000\u0000\u0000(\u011d\u0001\u0000\u0000\u0000"+
		"*\u011f\u0001\u0000\u0000\u0000,\u012b\u0001\u0000\u0000\u0000.\u0131"+
		"\u0001\u0000\u0000\u00000\u0133\u0001\u0000\u0000\u000024\u0003\u0002"+
		"\u0001\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000089\u0005\u0000\u0000\u00019\u0001\u0001\u0000"+
		"\u0000\u0000:B\u0003\u0004\u0002\u0000;B\u0003\u001c\u000e\u0000<B\u0003"+
		"\"\u0011\u0000=B\u0003&\u0013\u0000>B\u0003(\u0014\u0000?B\u0005D\u0000"+
		"\u0000@B\u0003*\u0015\u0000A:\u0001\u0000\u0000\u0000A;\u0001\u0000\u0000"+
		"\u0000A<\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000A>\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000B\u0003"+
		"\u0001\u0000\u0000\u0000CO\u0003\n\u0005\u0000DO\u0003\u000e\u0007\u0000"+
		"EO\u0003\b\u0004\u0000FO\u0003\f\u0006\u0000GO\u0003\u0014\n\u0000HO\u0003"+
		"\u0010\b\u0000IO\u0003\u0012\t\u0000JO\u0003\u0016\u000b\u0000KO\u0003"+
		"\u0018\f\u0000LO\u0003\u001a\r\u0000MO\u0003 \u0010\u0000NC\u0001\u0000"+
		"\u0000\u0000ND\u0001\u0000\u0000\u0000NE\u0001\u0000\u0000\u0000NF\u0001"+
		"\u0000\u0000\u0000NG\u0001\u0000\u0000\u0000NH\u0001\u0000\u0000\u0000"+
		"NI\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000O\u0005\u0001"+
		"\u0000\u0000\u0000PQ\u0006\u0003\uffff\uffff\u0000QV\u0007\u0000\u0000"+
		"\u0000RV\u0005\u0001\u0000\u0000SV\u0005\u0002\u0000\u0000TV\u00053\u0000"+
		"\u0000UP\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000US\u0001\u0000"+
		"\u0000\u0000UT\u0001\u0000\u0000\u0000V\\\u0001\u0000\u0000\u0000WX\n"+
		"\u0001\u0000\u0000XY\u0005\u0002\u0000\u0000Y[\u0007\u0001\u0000\u0000"+
		"ZW\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]\u0007\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000_`\u0005\u0004\u0000\u0000`a\u0003\u0006\u0003\u0000"+
		"a\t\u0001\u0000\u0000\u0000bc\u0005=\u0000\u0000cd\u0005B\u0000\u0000"+
		"di\u00030\u0018\u0000ef\u0005\u0005\u0000\u0000fh\u0003\u0006\u0003\u0000"+
		"ge\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000j\u000b\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000lm\u0005\u0006\u0000\u0000mn\u00030\u0018\u0000no\u0003"+
		"\u0006\u0003\u0000o\r\u0001\u0000\u0000\u0000ps\u0005\u0007\u0000\u0000"+
		"qr\u0005\u0005\u0000\u0000rt\u00053\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000v\u000f\u0001\u0000\u0000\u0000wx\u0005\b\u0000\u0000xy\u0003\u0006"+
		"\u0003\u0000yz\u0005:\u0000\u0000z{\u0003\u0006\u0003\u0000{|\u00054\u0000"+
		"\u0000|\u0011\u0001\u0000\u0000\u0000}~\u0005\u0004\u0000\u0000~\u007f"+
		"\u0003\u0006\u0003\u0000\u007f\u0080\u0003\u0006\u0003\u0000\u0080\u0081"+
		"\u00055\u0000\u0000\u0081\u0013\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"\t\u0000\u0000\u0083\u0084\u0003\u0006\u0003\u0000\u0084\u008a\u0005\n"+
		"\u0000\u0000\u0085\u0086\u0005\u000b\u0000\u0000\u0086\u0087\u0003\u0006"+
		"\u0003\u0000\u0087\u0088\u0005\f\u0000\u0000\u0088\u008b\u0001\u0000\u0000"+
		"\u0000\u0089\u008b\u0005\r\u0000\u0000\u008a\u0085\u0001\u0000\u0000\u0000"+
		"\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u0015\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005>\u0000\u0000\u008d\u008e\u0005\u000e\u0000\u0000\u008e"+
		"\u008f\u0005\u0007\u0000\u0000\u008f\u0090\u0005\u0005\u0000\u0000\u0090"+
		"\u009f\u00053\u0000\u0000\u0091\u0092\u0005\u000f\u0000\u0000\u0092\u009b"+
		"\u0005\u0010\u0000\u0000\u0093\u0094\u0005B\u0000\u0000\u0094\u0097\u0003"+
		"0\u0018\u0000\u0095\u0096\u0005\u0005\u0000\u0000\u0096\u0098\u00053\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0093\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000"+
		"\u0000\u009f\u0091\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a5\u0007\u0002\u0000"+
		"\u0000\u00a2\u00a4\u0003\u0002\u0001\u0000\u00a3\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0013\u0000"+
		"\u0000\u00a9\u00aa\u00053\u0000\u0000\u00aa\u00ab\u0005\u0014\u0000\u0000"+
		"\u00ab\u0017\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0015\u0000\u0000"+
		"\u00ad\u00b2\u0003\u0006\u0003\u0000\u00ae\u00af\u0005:\u0000\u0000\u00af"+
		"\u00b1\u0003\u0006\u0003\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u00ba\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0016\u0000\u0000\u00b6"+
		"\u00b7\u0005B\u0000\u0000\u00b7\u00b8\u0005\u0017\u0000\u0000\u00b8\u00ba"+
		"\u0003\u0006\u0003\u0000\u00b9\u00ac\u0001\u0000\u0000\u0000\u00b9\u00b5"+
		"\u0001\u0000\u0000\u0000\u00ba\u0019\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0003.\u0017\u0000\u00bc\u00c1\u0003\u0006\u0003\u0000\u00bd\u00be\u0005"+
		":\u0000\u0000\u00be\u00c0\u0003\u0006\u0003\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u001b\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005>\u0000"+
		"\u0000\u00c5\u00c6\u0005B\u0000\u0000\u00c6\u00c7\u0005\u0018\u0000\u0000"+
		"\u00c7\u00c9\u0003\u000e\u0007\u0000\u00c8\u00ca\u0003\u001e\u000f\u0000"+
		"\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u001d\u0001\u0000\u0000\u0000\u00cb\u00d3\u0005\u0019\u0000\u0000"+
		"\u00cc\u00cd\u0005\u001a\u0000\u0000\u00cd\u00ce\u00052\u0000\u0000\u00ce"+
		"\u00cf\u0005\n\u0000\u0000\u00cf\u00d0\u00030\u0018\u0000\u00d0\u00d1"+
		"\u0005\u0005\u0000\u0000\u00d1\u00d2\u0003\u0006\u0003\u0000\u00d2\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d3\u00cc\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0005\u0013\u0000\u0000\u00d8\u00d9\u00053\u0000\u0000\u00d9\u00da\u0005"+
		"\u001b\u0000\u0000\u00da\u001f\u0001\u0000\u0000\u0000\u00db\u00dc\u0005"+
		"\u001c\u0000\u0000\u00dc!\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u001d"+
		"\u0000\u0000\u00de\u00df\u0003$\u0012\u0000\u00df\u00e3\u0005\n\u0000"+
		"\u0000\u00e0\u00e2\u0003\u0002\u0001\u0000\u00e1\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00ed\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00ea\u0005\u001e\u0000"+
		"\u0000\u00e7\u00e9\u0003\u0002\u0001\u0000\u00e8\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00e6\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005@\u0000\u0000\u00f0#\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f7\u0003\u0006\u0003\u0000\u00f2\u00f3\u0003\u0006\u0003\u0000\u00f3"+
		"\u00f4\u00057\u0000\u0000\u00f4\u00f5\u0003\u0006\u0003\u0000\u00f5\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f1\u0001\u0000\u0000\u0000\u00f6\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f7%\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005"+
		"\u001f\u0000\u0000\u00f9\u00fa\u0003\u0006\u0003\u0000\u00fa\u00fb\u0005"+
		" \u0000\u0000\u00fb\u00ff\u00053\u0000\u0000\u00fc\u00fe\u0003\u0002\u0001"+
		"\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000"+
		"\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000"+
		"\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0005@\u0000\u0000\u0103\u0118\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0005!\u0000\u0000\u0105\u0106\u0003\u0006\u0003\u0000\u0106"+
		"\u010a\u0005\"\u0000\u0000\u0107\u0109\u0003\u0002\u0001\u0000\u0108\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d"+
		"\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0005@\u0000\u0000\u010e\u0118\u0001\u0000\u0000\u0000\u010f\u0113\u0005"+
		"#\u0000\u0000\u0110\u0112\u0003\u0002\u0001\u0000\u0111\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0116\u0001\u0000"+
		"\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0118\u0005@\u0000"+
		"\u0000\u0117\u00f8\u0001\u0000\u0000\u0000\u0117\u0104\u0001\u0000\u0000"+
		"\u0000\u0117\u010f\u0001\u0000\u0000\u0000\u0118\'\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0005$\u0000\u0000\u011a\u011e\u0003\u0006\u0003\u0000\u011b"+
		"\u011e\u0005%\u0000\u0000\u011c\u011e\u0005&\u0000\u0000\u011d\u0119\u0001"+
		"\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011c\u0001"+
		"\u0000\u0000\u0000\u011e)\u0001\u0000\u0000\u0000\u011f\u0120\u0005\'"+
		"\u0000\u0000\u0120\u0121\u00052\u0000\u0000\u0121\u0129\u0005(\u0000\u0000"+
		"\u0122\u0124\u0005)\u0000\u0000\u0123\u0125\u00053\u0000\u0000\u0124\u0123"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0124"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0001\u0000\u0000\u0000\u0128\u012a\u0005*\u0000\u0000\u0129\u0122\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a+\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0007\u0003\u0000\u0000\u012c-\u0001\u0000\u0000"+
		"\u0000\u012d\u0132\u0003,\u0016\u0000\u012e\u0132\u00056\u0000\u0000\u012f"+
		"\u0132\u00058\u0000\u0000\u0130\u0132\u00059\u0000\u0000\u0131\u012d\u0001"+
		"\u0000\u0000\u0000\u0131\u012e\u0001\u0000\u0000\u0000\u0131\u012f\u0001"+
		"\u0000\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132/\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0007\u0004\u0000\u0000\u01341\u0001\u0000\u0000"+
		"\u0000\u001d5ANU\\iu\u008a\u0099\u009d\u009f\u00a5\u00b2\u00b9\u00c1\u00c9"+
		"\u00d5\u00e3\u00ea\u00ed\u00f6\u00ff\u010a\u0113\u0117\u011d\u0126\u0129"+
		"\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}