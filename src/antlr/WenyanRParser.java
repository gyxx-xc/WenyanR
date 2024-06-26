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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		STRING_LITERAL=46, IDENTIFIER=47, POST_MOD_MATH_OP=48, AND=49, OR=50, 
		IF_LOGIC_OP=51, ADD=52, SUB=53, MUL=54, DIV=55, UNARY_OP=56, ARRAY_COMBINE_OP=57, 
		ARRAY_ADD_OP=58, WRITE_KEY_FUNCTION=59, PREPOSITION_LEFT=60, PREPOSITION_RIGHT=61, 
		LOCAL_DECLARE_OP=62, GLOBAL_DECLARE_OP=63, FOR_IF_END=64, FLOAT_NUM=65, 
		INT_NUM=66, BOOL_VALUE=67, BREAK=68, COMMENT=69, WS=70;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expr_statement = 2, RULE_data = 3, 
		RULE_reference_statement = 4, RULE_declare_statement = 5, RULE_init_declare_statement = 6, 
		RULE_define_statement = 7, RULE_mod_math_statement = 8, RULE_boolean_algebra_statement = 9, 
		RULE_assign_statement = 10, RULE_key_function_call_statement = 11, RULE_function_define_statement = 12, 
		RULE_function_call_statement = 13, RULE_object_statement = 14, RULE_object_define_statement = 15, 
		RULE_flush_statement = 16, RULE_if_statement = 17, RULE_if_expression = 18, 
		RULE_for_statement = 19, RULE_return_statement = 20, RULE_import_statement = 21, 
		RULE_key_function = 22, RULE_preposition = 23, RULE_declare_op = 24, RULE_type = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expr_statement", "data", "reference_statement", 
			"declare_statement", "init_declare_statement", "define_statement", "mod_math_statement", 
			"boolean_algebra_statement", "assign_statement", "key_function_call_statement", 
			"function_define_statement", "function_call_statement", "object_statement", 
			"object_define_statement", "flush_statement", "if_statement", "if_expression", 
			"for_statement", "return_statement", "import_statement", "key_function", 
			"preposition", "declare_op", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u5176'", "'\\u4E4B'", "'\\u9577'", "'\\u592B'", "'\\u66F0'", 
			"'\\u6709'", "'\\u540D\\u4E4B'", "'\\u6614\\u4E4B'", "'\\u8005'", "'\\u4ECA'", 
			"'\\u662F\\u77E3'", "'\\u4ECA\\u4E0D\\u5FA9\\u5B58\\u77E3'", "'\\u4E00\\u8853'", 
			"'\\u6B32\\u884C\\u662F\\u8853'", "'\\u5FC5\\u5148\\u5F97'", "'\\u662F\\u8853\\u66F0'", 
			"'\\u4E43\\u884C\\u662F\\u8853\\u66F0'", "'\\u662F\\u8B02'", "'\\u4E4B\\u8853\\u4E5F'", 
			"'\\u65BD'", "'\\u53D6'", "'\\u4EE5\\u65BD'", "'\\u7269'", "'\\u5176\\u7269\\u5982\\u662F'", 
			"'\\u7269\\u4E4B'", "'\\u4E4B\\u7269\\u4E5F'", "'\\u566B'", "'\\u82E5'", 
			"'\\u82E5\\u975E'", "'\\u51E1'", "'\\u4E2D\\u4E4B'", "'\\u70BA\\u662F'", 
			"'\\u904D'", "'\\u6046\\u70BA\\u662F'", "'\\u4E43\\u5F97'", "'\\u4E43\\u5F97\\u77E3'", 
			"'\\u4E43\\u6B78\\u7A7A\\u7121'", "'\\u543E\\u5617\\u89C0'", "'\\u4E4B\\u66F8'", 
			"'\\u65B9\\u609F'", "'\\u4E4B\\u7FA9'", "'\\u6578'", "'\\u5217'", "'\\u8A00'", 
			"'\\u723B'", null, null, "'\\u6240\\u9918\\u5E7E\\u4F55'", "'\\u4E2D\\u7121\\u9670\\u4E4E'", 
			"'\\u4E2D\\u6709\\u967D\\u4E4E'", null, "'\\u52A0'", "'\\u6E1B'", "'\\u4E58'", 
			"'\\u9664'", "'\\u8B8A'", "'\\u929C'", "'\\u5145'", "'\\u66F8'", "'\\u65BC'", 
			"'\\u4EE5'", "'\\u543E\\u6709'", "'\\u4ECA\\u6709'", null, null, null, 
			null, "'\\u4E43\\u6B62'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "STRING_LITERAL", 
			"IDENTIFIER", "POST_MOD_MATH_OP", "AND", "OR", "IF_LOGIC_OP", "ADD", 
			"SUB", "MUL", "DIV", "UNARY_OP", "ARRAY_COMBINE_OP", "ARRAY_ADD_OP", 
			"WRITE_KEY_FUNCTION", "PREPOSITION_LEFT", "PREPOSITION_RIGHT", "LOCAL_DECLARE_OP", 
			"GLOBAL_DECLARE_OP", "FOR_IF_END", "FLOAT_NUM", "INT_NUM", "BOOL_VALUE", 
			"BREAK", "COMMENT", "WS"
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3463267575097458224L) != 0) || _la==BREAK) {
				{
				{
				setState(52);
				statement();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
		public Flush_statementContext flush_statement() {
			return getRuleContext(Flush_statementContext.class,0);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				expr_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				flush_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				object_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				for_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				return_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				match(BREAK);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(67);
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
		public Init_declare_statementContext init_declare_statement() {
			return getRuleContext(Init_declare_statementContext.class,0);
		}
		public Reference_statementContext reference_statement() {
			return getRuleContext(Reference_statementContext.class,0);
		}
		public Define_statementContext define_statement() {
			return getRuleContext(Define_statementContext.class,0);
		}
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public Boolean_algebra_statementContext boolean_algebra_statement() {
			return getRuleContext(Boolean_algebra_statementContext.class,0);
		}
		public Mod_math_statementContext mod_math_statement() {
			return getRuleContext(Mod_math_statementContext.class,0);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				declare_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				init_declare_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				reference_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				define_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				assign_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				boolean_algebra_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				mod_math_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
				function_define_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(78);
				function_call_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(79);
				key_function_call_statement();
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
			setState(87);
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

				setState(83);
				((Data_primaryContext)_localctx).data_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 3670017L) != 0)) ) {
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
				setState(84);
				match(T__0);
				}
				break;
			case T__1:
				{
				_localctx = new Id_last_with_selfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(T__1);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
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
					setState(89);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(90);
					match(T__1);
					setState(91);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 211106232533002L) != 0) || _la==INT_NUM) ) {
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
				setState(96);
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
			setState(97);
			match(T__3);
			setState(98);
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
		public DataContext data;
		public List<DataContext> d = new ArrayList<DataContext>();
		public Declare_opContext declare_op() {
			return getRuleContext(Declare_opContext.class,0);
		}
		public TerminalNode INT_NUM() { return getToken(WenyanRParser.INT_NUM, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
			setState(100);
			declare_op();
			setState(101);
			match(INT_NUM);
			setState(102);
			type();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(103);
				match(T__4);
				setState(104);
				((Declare_statementContext)_localctx).data = data(0);
				((Declare_statementContext)_localctx).d.add(((Declare_statementContext)_localctx).data);
				}
				}
				setState(109);
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
			setState(110);
			match(T__5);
			setState(111);
			type();
			setState(112);
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
		public Token IDENTIFIER;
		public List<Token> d = new ArrayList<Token>();
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
			setState(114);
			match(T__6);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				match(T__4);
				setState(116);
				((Define_statementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((Define_statementContext)_localctx).d.add(((Define_statementContext)_localctx).IDENTIFIER);
				}
				}
				setState(119); 
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
		public Token pp;
		public TerminalNode DIV() { return getToken(WenyanRParser.DIV, 0); }
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public TerminalNode POST_MOD_MATH_OP() { return getToken(WenyanRParser.POST_MOD_MATH_OP, 0); }
		public TerminalNode PREPOSITION_LEFT() { return getToken(WenyanRParser.PREPOSITION_LEFT, 0); }
		public TerminalNode PREPOSITION_RIGHT() { return getToken(WenyanRParser.PREPOSITION_RIGHT, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(DIV);
			setState(122);
			data(0);
			setState(123);
			((Mod_math_statementContext)_localctx).pp = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==PREPOSITION_LEFT || _la==PREPOSITION_RIGHT) ) {
				((Mod_math_statementContext)_localctx).pp = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(124);
			data(0);
			setState(125);
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
		public Token op;
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public TerminalNode AND() { return getToken(WenyanRParser.AND, 0); }
		public TerminalNode OR() { return getToken(WenyanRParser.OR, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__3);
			setState(128);
			data(0);
			setState(129);
			data(0);
			setState(130);
			((Boolean_algebra_statementContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
				((Boolean_algebra_statementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
	public static class Assign_statementContext extends ParserRuleContext {
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
	 
		public Assign_statementContext() { }
		public void copyFrom(Assign_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Assign_null_statementContext extends Assign_statementContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public Assign_null_statementContext(Assign_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitAssign_null_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Assign_data_statementContext extends Assign_statementContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public Assign_data_statementContext(Assign_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitAssign_data_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_statement);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Assign_data_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__7);
				setState(133);
				data(0);
				setState(134);
				match(T__8);
				{
				setState(135);
				match(T__9);
				setState(136);
				data(0);
				setState(137);
				match(T__10);
				}
				}
				break;
			case 2:
				_localctx = new Assign_null_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__7);
				setState(140);
				data(0);
				setState(141);
				match(T__8);
				setState(142);
				match(T__11);
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
	public static class Key_function_call_statementContext extends ParserRuleContext {
		public DataContext data;
		public List<DataContext> d = new ArrayList<DataContext>();
		public Token PREPOSITION_LEFT;
		public List<Token> pp = new ArrayList<Token>();
		public Token PREPOSITION_RIGHT;
		public Token _tset319;
		public Key_functionContext key_function() {
			return getRuleContext(Key_functionContext.class,0);
		}
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public List<TerminalNode> PREPOSITION_LEFT() { return getTokens(WenyanRParser.PREPOSITION_LEFT); }
		public TerminalNode PREPOSITION_LEFT(int i) {
			return getToken(WenyanRParser.PREPOSITION_LEFT, i);
		}
		public List<TerminalNode> PREPOSITION_RIGHT() { return getTokens(WenyanRParser.PREPOSITION_RIGHT); }
		public TerminalNode PREPOSITION_RIGHT(int i) {
			return getToken(WenyanRParser.PREPOSITION_RIGHT, i);
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
		enterRule(_localctx, 22, RULE_key_function_call_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			key_function();
			setState(147);
			((Key_function_call_statementContext)_localctx).data = data(0);
			((Key_function_call_statementContext)_localctx).d.add(((Key_function_call_statementContext)_localctx).data);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PREPOSITION_LEFT || _la==PREPOSITION_RIGHT) {
				{
				{
				setState(148);
				((Key_function_call_statementContext)_localctx)._tset319 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PREPOSITION_LEFT || _la==PREPOSITION_RIGHT) ) {
					((Key_function_call_statementContext)_localctx)._tset319 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((Key_function_call_statementContext)_localctx).pp.add(((Key_function_call_statementContext)_localctx)._tset319);
				setState(149);
				((Key_function_call_statementContext)_localctx).data = data(0);
				((Key_function_call_statementContext)_localctx).d.add(((Key_function_call_statementContext)_localctx).data);
				}
				}
				setState(154);
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
		enterRule(_localctx, 24, RULE_function_define_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(LOCAL_DECLARE_OP);
			setState(156);
			match(T__12);
			setState(157);
			match(T__6);
			setState(158);
			match(T__4);
			setState(159);
			match(IDENTIFIER);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(160);
				match(T__13);
				setState(161);
				match(T__14);
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(162);
					match(INT_NUM);
					setState(163);
					type();
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(164);
						match(T__4);
						setState(165);
						match(IDENTIFIER);
						}
						}
						setState(168); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__4 );
					}
					}
					setState(172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT_NUM );
				}
			}

			setState(176);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3463267575097458224L) != 0) || _la==BREAK) {
				{
				{
				setState(177);
				statement();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(T__17);
			setState(184);
			match(IDENTIFIER);
			setState(185);
			match(T__18);
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
		public List<PrepositionContext> preposition() {
			return getRuleContexts(PrepositionContext.class);
		}
		public PrepositionContext preposition(int i) {
			return getRuleContext(PrepositionContext.class,i);
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
		enterRule(_localctx, 26, RULE_function_call_statement);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				_localctx = new Function_pre_callContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(T__19);
				setState(188);
				data(0);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PREPOSITION_LEFT || _la==PREPOSITION_RIGHT) {
					{
					{
					setState(189);
					preposition();
					setState(190);
					data(0);
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__20:
				_localctx = new Function_post_callContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(T__20);
				setState(198);
				match(INT_NUM);
				setState(199);
				match(T__21);
				setState(200);
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
			setState(203);
			match(LOCAL_DECLARE_OP);
			setState(204);
			match(INT_NUM);
			setState(205);
			match(T__22);
			setState(206);
			define_statement();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(207);
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
			setState(210);
			match(T__23);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				match(T__24);
				setState(212);
				match(STRING_LITERAL);
				setState(213);
				match(T__8);
				setState(214);
				type();
				setState(215);
				match(T__4);
				setState(216);
				data(0);
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__24 );
			setState(222);
			match(T__17);
			setState(223);
			match(IDENTIFIER);
			setState(224);
			match(T__25);
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
			setState(226);
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
			setState(228);
			match(T__27);
			setState(229);
			if_expression();
			setState(230);
			match(T__8);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3463267575097458224L) != 0) || _la==BREAK) {
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
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(237);
				match(T__28);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3463267575097458224L) != 0) || _la==BREAK) {
					{
					{
					setState(238);
					statement();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(246);
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
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				data(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				data(0);
				setState(250);
				match(IF_LOGIC_OP);
				setState(251);
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
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				_localctx = new For_arr_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(T__29);
				setState(256);
				data(0);
				setState(257);
				match(T__30);
				setState(258);
				match(IDENTIFIER);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3463267575097458224L) != 0) || _la==BREAK) {
					{
					{
					setState(259);
					statement();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				match(FOR_IF_END);
				}
				break;
			case T__31:
				_localctx = new For_enum_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(T__31);
				setState(268);
				data(0);
				setState(269);
				match(T__32);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3463267575097458224L) != 0) || _la==BREAK) {
					{
					{
					setState(270);
					statement();
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				match(FOR_IF_END);
				}
				break;
			case T__33:
				_localctx = new For_while_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(T__33);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3463267575097458224L) != 0) || _la==BREAK) {
					{
					{
					setState(279);
					statement();
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
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
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				_localctx = new Return_data_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(T__34);
				setState(289);
				data(0);
				}
				break;
			case T__35:
				_localctx = new Return_last_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(T__35);
				}
				break;
			case T__36:
				_localctx = new Return_void_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(T__36);
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
			setState(294);
			match(T__37);
			setState(295);
			match(STRING_LITERAL);
			setState(296);
			match(T__38);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(297);
				match(T__39);
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(298);
					match(IDENTIFIER);
					}
					}
					setState(301); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(303);
				match(T__40);
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
	public static class Key_functionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ADD() { return getToken(WenyanRParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(WenyanRParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(WenyanRParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(WenyanRParser.DIV, 0); }
		public TerminalNode UNARY_OP() { return getToken(WenyanRParser.UNARY_OP, 0); }
		public TerminalNode ARRAY_COMBINE_OP() { return getToken(WenyanRParser.ARRAY_COMBINE_OP, 0); }
		public TerminalNode ARRAY_ADD_OP() { return getToken(WenyanRParser.ARRAY_ADD_OP, 0); }
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
		enterRule(_localctx, 44, RULE_key_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			((Key_functionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1148417904979476480L) != 0)) ) {
				((Key_functionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
	public static class PrepositionContext extends ParserRuleContext {
		public TerminalNode PREPOSITION_LEFT() { return getToken(WenyanRParser.PREPOSITION_LEFT, 0); }
		public TerminalNode PREPOSITION_RIGHT() { return getToken(WenyanRParser.PREPOSITION_RIGHT, 0); }
		public PrepositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preposition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitPreposition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrepositionContext preposition() throws RecognitionException {
		PrepositionContext _localctx = new PrepositionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_preposition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !(_la==PREPOSITION_LEFT || _la==PREPOSITION_RIGHT) ) {
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
	public static class Declare_opContext extends ParserRuleContext {
		public TerminalNode LOCAL_DECLARE_OP() { return getToken(WenyanRParser.LOCAL_DECLARE_OP, 0); }
		public TerminalNode GLOBAL_DECLARE_OP() { return getToken(WenyanRParser.GLOBAL_DECLARE_OP, 0); }
		public Declare_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WenyanRVisitor ) return ((WenyanRVisitor<? extends T>)visitor).visitDeclare_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_opContext declare_op() throws RecognitionException {
		Declare_opContext _localctx = new Declare_opContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declare_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !(_la==LOCAL_DECLARE_OP || _la==GLOBAL_DECLARE_OP) ) {
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
		enterRule(_localctx, 50, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970697666560L) != 0)) ) {
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
		"\u0004\u0001F\u013b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"E\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"Q\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003X\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"]\b\u0003\n\u0003\f\u0003`\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"j\b\u0005\n\u0005\f\u0005m\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007v\b\u0007"+
		"\u000b\u0007\f\u0007w\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0091\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0097\b\u000b\n\u000b\f\u000b\u009a\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u00a7"+
		"\b\f\u000b\f\f\f\u00a8\u0004\f\u00ab\b\f\u000b\f\f\f\u00ac\u0003\f\u00af"+
		"\b\f\u0001\f\u0001\f\u0005\f\u00b3\b\f\n\f\f\f\u00b6\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00c1"+
		"\b\r\n\r\f\r\u00c4\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ca\b"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00d1\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00db\b\u000f\u000b\u000f"+
		"\f\u000f\u00dc\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00e9\b\u0011\n\u0011\f\u0011\u00ec\t\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00f0\b\u0011\n\u0011\f\u0011\u00f3\t\u0011\u0003\u0011\u00f5\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00fe\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0105\b\u0013\n\u0013\f\u0013"+
		"\u0108\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u0110\b\u0013\n\u0013\f\u0013\u0113\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0119\b\u0013\n"+
		"\u0013\f\u0013\u011c\t\u0013\u0001\u0013\u0003\u0013\u011f\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0125\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u012c"+
		"\b\u0015\u000b\u0015\f\u0015\u012d\u0001\u0015\u0003\u0015\u0131\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0001\u0006\u001a\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02\u0000\b\u0002\u0000..AC\u0004\u0000\u0001\u0001\u0003\u0003"+
		"./BB\u0001\u0000<=\u0001\u000012\u0001\u0000\u0010\u0011\u0001\u00004"+
		";\u0001\u0000>?\u0001\u0000*-\u014e\u00007\u0001\u0000\u0000\u0000\u0002"+
		"D\u0001\u0000\u0000\u0000\u0004P\u0001\u0000\u0000\u0000\u0006W\u0001"+
		"\u0000\u0000\u0000\ba\u0001\u0000\u0000\u0000\nd\u0001\u0000\u0000\u0000"+
		"\fn\u0001\u0000\u0000\u0000\u000er\u0001\u0000\u0000\u0000\u0010y\u0001"+
		"\u0000\u0000\u0000\u0012\u007f\u0001\u0000\u0000\u0000\u0014\u0090\u0001"+
		"\u0000\u0000\u0000\u0016\u0092\u0001\u0000\u0000\u0000\u0018\u009b\u0001"+
		"\u0000\u0000\u0000\u001a\u00c9\u0001\u0000\u0000\u0000\u001c\u00cb\u0001"+
		"\u0000\u0000\u0000\u001e\u00d2\u0001\u0000\u0000\u0000 \u00e2\u0001\u0000"+
		"\u0000\u0000\"\u00e4\u0001\u0000\u0000\u0000$\u00fd\u0001\u0000\u0000"+
		"\u0000&\u011e\u0001\u0000\u0000\u0000(\u0124\u0001\u0000\u0000\u0000*"+
		"\u0126\u0001\u0000\u0000\u0000,\u0132\u0001\u0000\u0000\u0000.\u0134\u0001"+
		"\u0000\u0000\u00000\u0136\u0001\u0000\u0000\u00002\u0138\u0001\u0000\u0000"+
		"\u000046\u0003\u0002\u0001\u000054\u0001\u0000\u0000\u000069\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005\u0000\u0000\u0001"+
		";\u0001\u0001\u0000\u0000\u0000<E\u0003\u0004\u0002\u0000=E\u0003 \u0010"+
		"\u0000>E\u0003\u001c\u000e\u0000?E\u0003\"\u0011\u0000@E\u0003&\u0013"+
		"\u0000AE\u0003(\u0014\u0000BE\u0005D\u0000\u0000CE\u0003*\u0015\u0000"+
		"D<\u0001\u0000\u0000\u0000D=\u0001\u0000\u0000\u0000D>\u0001\u0000\u0000"+
		"\u0000D?\u0001\u0000\u0000\u0000D@\u0001\u0000\u0000\u0000DA\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000E\u0003"+
		"\u0001\u0000\u0000\u0000FQ\u0003\n\u0005\u0000GQ\u0003\f\u0006\u0000H"+
		"Q\u0003\b\u0004\u0000IQ\u0003\u000e\u0007\u0000JQ\u0003\u0014\n\u0000"+
		"KQ\u0003\u0012\t\u0000LQ\u0003\u0010\b\u0000MQ\u0003\u0018\f\u0000NQ\u0003"+
		"\u001a\r\u0000OQ\u0003\u0016\u000b\u0000PF\u0001\u0000\u0000\u0000PG\u0001"+
		"\u0000\u0000\u0000PH\u0001\u0000\u0000\u0000PI\u0001\u0000\u0000\u0000"+
		"PJ\u0001\u0000\u0000\u0000PK\u0001\u0000\u0000\u0000PL\u0001\u0000\u0000"+
		"\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000Q\u0005\u0001\u0000\u0000\u0000RS\u0006\u0003\uffff\uffff"+
		"\u0000SX\u0007\u0000\u0000\u0000TX\u0005\u0001\u0000\u0000UX\u0005\u0002"+
		"\u0000\u0000VX\u0005/\u0000\u0000WR\u0001\u0000\u0000\u0000WT\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000X^\u0001"+
		"\u0000\u0000\u0000YZ\n\u0001\u0000\u0000Z[\u0005\u0002\u0000\u0000[]\u0007"+
		"\u0001\u0000\u0000\\Y\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0007\u0001\u0000"+
		"\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0005\u0004\u0000\u0000bc\u0003"+
		"\u0006\u0003\u0000c\t\u0001\u0000\u0000\u0000de\u00030\u0018\u0000ef\u0005"+
		"B\u0000\u0000fk\u00032\u0019\u0000gh\u0005\u0005\u0000\u0000hj\u0003\u0006"+
		"\u0003\u0000ig\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u000b\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0006\u0000\u0000op\u00032\u0019"+
		"\u0000pq\u0003\u0006\u0003\u0000q\r\u0001\u0000\u0000\u0000ru\u0005\u0007"+
		"\u0000\u0000st\u0005\u0005\u0000\u0000tv\u0005/\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000x\u000f\u0001\u0000\u0000\u0000yz\u00057\u0000\u0000"+
		"z{\u0003\u0006\u0003\u0000{|\u0007\u0002\u0000\u0000|}\u0003\u0006\u0003"+
		"\u0000}~\u00050\u0000\u0000~\u0011\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\u0004\u0000\u0000\u0080\u0081\u0003\u0006\u0003\u0000\u0081\u0082"+
		"\u0003\u0006\u0003\u0000\u0082\u0083\u0007\u0003\u0000\u0000\u0083\u0013"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005\b\u0000\u0000\u0085\u0086\u0003"+
		"\u0006\u0003\u0000\u0086\u0087\u0005\t\u0000\u0000\u0087\u0088\u0005\n"+
		"\u0000\u0000\u0088\u0089\u0003\u0006\u0003\u0000\u0089\u008a\u0005\u000b"+
		"\u0000\u0000\u008a\u0091\u0001\u0000\u0000\u0000\u008b\u008c\u0005\b\u0000"+
		"\u0000\u008c\u008d\u0003\u0006\u0003\u0000\u008d\u008e\u0005\t\u0000\u0000"+
		"\u008e\u008f\u0005\f\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090"+
		"\u0084\u0001\u0000\u0000\u0000\u0090\u008b\u0001\u0000\u0000\u0000\u0091"+
		"\u0015\u0001\u0000\u0000\u0000\u0092\u0093\u0003,\u0016\u0000\u0093\u0098"+
		"\u0003\u0006\u0003\u0000\u0094\u0095\u0007\u0002\u0000\u0000\u0095\u0097"+
		"\u0003\u0006\u0003\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u009a"+
		"\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u0017\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0005>\u0000\u0000\u009c\u009d\u0005"+
		"\r\u0000\u0000\u009d\u009e\u0005\u0007\u0000\u0000\u009e\u009f\u0005\u0005"+
		"\u0000\u0000\u009f\u00ae\u0005/\u0000\u0000\u00a0\u00a1\u0005\u000e\u0000"+
		"\u0000\u00a1\u00aa\u0005\u000f\u0000\u0000\u00a2\u00a3\u0005B\u0000\u0000"+
		"\u00a3\u00a6\u00032\u0019\u0000\u00a4\u00a5\u0005\u0005\u0000\u0000\u00a5"+
		"\u00a7\u0005/\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a2"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af"+
		"\u0001\u0000\u0000\u0000\u00ae\u00a0\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b4"+
		"\u0007\u0004\u0000\u0000\u00b1\u00b3\u0003\u0002\u0001\u0000\u00b2\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0005\u0012\u0000\u0000\u00b8\u00b9\u0005/\u0000\u0000\u00b9\u00ba\u0005"+
		"\u0013\u0000\u0000\u00ba\u0019\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"\u0014\u0000\u0000\u00bc\u00c2\u0003\u0006\u0003\u0000\u00bd\u00be\u0003"+
		".\u0017\u0000\u00be\u00bf\u0003\u0006\u0003\u0000\u00bf\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00ca\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0005\u0015\u0000\u0000\u00c6\u00c7\u0005B\u0000"+
		"\u0000\u00c7\u00c8\u0005\u0016\u0000\u0000\u00c8\u00ca\u0003\u0006\u0003"+
		"\u0000\u00c9\u00bb\u0001\u0000\u0000\u0000\u00c9\u00c5\u0001\u0000\u0000"+
		"\u0000\u00ca\u001b\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005>\u0000\u0000"+
		"\u00cc\u00cd\u0005B\u0000\u0000\u00cd\u00ce\u0005\u0017\u0000\u0000\u00ce"+
		"\u00d0\u0003\u000e\u0007\u0000\u00cf\u00d1\u0003\u001e\u000f\u0000\u00d0"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u001d\u0001\u0000\u0000\u0000\u00d2\u00da\u0005\u0018\u0000\u0000\u00d3"+
		"\u00d4\u0005\u0019\u0000\u0000\u00d4\u00d5\u0005.\u0000\u0000\u00d5\u00d6"+
		"\u0005\t\u0000\u0000\u00d6\u00d7\u00032\u0019\u0000\u00d7\u00d8\u0005"+
		"\u0005\u0000\u0000\u00d8\u00d9\u0003\u0006\u0003\u0000\u00d9\u00db\u0001"+
		"\u0000\u0000\u0000\u00da\u00d3\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"\u0012\u0000\u0000\u00df\u00e0\u0005/\u0000\u0000\u00e0\u00e1\u0005\u001a"+
		"\u0000\u0000\u00e1\u001f\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u001b"+
		"\u0000\u0000\u00e3!\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u001c\u0000"+
		"\u0000\u00e5\u00e6\u0003$\u0012\u0000\u00e6\u00ea\u0005\t\u0000\u0000"+
		"\u00e7\u00e9\u0003\u0002\u0001\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00f4\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00f1\u0005\u001d\u0000\u0000"+
		"\u00ee\u00f0\u0003\u0002\u0001\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0005@\u0000\u0000\u00f7#\u0001\u0000\u0000\u0000\u00f8\u00fe"+
		"\u0003\u0006\u0003\u0000\u00f9\u00fa\u0003\u0006\u0003\u0000\u00fa\u00fb"+
		"\u00053\u0000\u0000\u00fb\u00fc\u0003\u0006\u0003\u0000\u00fc\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fd\u00f8\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fe%\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u001e"+
		"\u0000\u0000\u0100\u0101\u0003\u0006\u0003\u0000\u0101\u0102\u0005\u001f"+
		"\u0000\u0000\u0102\u0106\u0005/\u0000\u0000\u0103\u0105\u0003\u0002\u0001"+
		"\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000"+
		"\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000"+
		"\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0005@\u0000\u0000\u010a\u011f\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0005 \u0000\u0000\u010c\u010d\u0003\u0006\u0003\u0000\u010d"+
		"\u0111\u0005!\u0000\u0000\u010e\u0110\u0003\u0002\u0001\u0000\u010f\u010e"+
		"\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0114"+
		"\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0005@\u0000\u0000\u0115\u011f\u0001\u0000\u0000\u0000\u0116\u011a\u0005"+
		"\"\u0000\u0000\u0117\u0119\u0003\u0002\u0001\u0000\u0118\u0117\u0001\u0000"+
		"\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011d\u0001\u0000"+
		"\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u011f\u0005@\u0000"+
		"\u0000\u011e\u00ff\u0001\u0000\u0000\u0000\u011e\u010b\u0001\u0000\u0000"+
		"\u0000\u011e\u0116\u0001\u0000\u0000\u0000\u011f\'\u0001\u0000\u0000\u0000"+
		"\u0120\u0121\u0005#\u0000\u0000\u0121\u0125\u0003\u0006\u0003\u0000\u0122"+
		"\u0125\u0005$\u0000\u0000\u0123\u0125\u0005%\u0000\u0000\u0124\u0120\u0001"+
		"\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0123\u0001"+
		"\u0000\u0000\u0000\u0125)\u0001\u0000\u0000\u0000\u0126\u0127\u0005&\u0000"+
		"\u0000\u0127\u0128\u0005.\u0000\u0000\u0128\u0130\u0005\'\u0000\u0000"+
		"\u0129\u012b\u0005(\u0000\u0000\u012a\u012c\u0005/\u0000\u0000\u012b\u012a"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012b"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0001\u0000\u0000\u0000\u012f\u0131\u0005)\u0000\u0000\u0130\u0129\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131+\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0007\u0005\u0000\u0000\u0133-\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0007\u0002\u0000\u0000\u0135/\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0007\u0006\u0000\u0000\u01371\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0007\u0007\u0000\u0000\u01393\u0001\u0000\u0000\u0000\u001c7D"+
		"PW^kw\u0090\u0098\u00a8\u00ac\u00ae\u00b4\u00c2\u00c9\u00d0\u00dc\u00ea"+
		"\u00f1\u00f4\u00fd\u0106\u0111\u011a\u011e\u0124\u012d\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}