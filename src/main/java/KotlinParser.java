// Generated from x:\Programming\Project\JAVA\ProgLang\Kotlin2Java\KotlinParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KotlinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, SNGL_CMNT=2, MLTI_CMNT=3, PACKAGE=4, IMPORT=5, FUN=6, VAR=7, VAL=8, 
		RETURN=9, IF=10, ELSE=11, FOR=12, DOWNTO=13, STEP=14, NULL=15, TRUE=16, 
		FALSE=17, THIS=18, CONTINUE=19, BREAK=20, OVERRIDE=21, PUBLIC=22, PRIVATE=23, 
		INTERNAL=24, PROTECTED=25, ABSTRACT=26, FINAL=27, OPEN=28, DBLE_Q=29, 
		IS=30, NOT_IS=31, IN=32, NOT_IN=33, CASE=34, ELVIS=35, ALL=36, INCR=37, 
		DECR=38, PLUS_ASSN=39, MINUS_ASSN=40, MULTI_ASSN=41, DIVIDE_ASSN=42, REMAIN_ASSN=43, 
		PLUS=44, MINUS=45, MULTI=46, DIVIDE=47, REMAIN=48, COLON=49, COMMA=50, 
		RANGE=51, DOT=52, NEGATE=53, AND=54, OR=55, REF_EQUAL=56, REF_NEQUAL=57, 
		EQUAL=58, NEQUAL=59, GRTR_EQ=60, GRTR=61, LESS_EQ=62, LESS=63, QUESTION=64, 
		L_PAREN=65, R_PAREN=66, L_BRACKET=67, R_BRACKET=68, SNGL_Q=69, R_BRACE=70, 
		L_BRACE=71, ASSIGN=72, ID=73, NL=74, SEMICOLON=75, REAL=76, INT=77, BOOL=78, 
		SINGLE_CH=79, CHAR=80;
	public static final int
		RULE_prog = 0, RULE_root_elem = 1, RULE_package_def = 2, RULE_import_stmt = 3, 
		RULE_loop = 4, RULE_assign_op = 5, RULE_equal_op = 6, RULE_comp_op = 7, 
		RULE_check_op = 8, RULE_add_op = 9, RULE_mult_op = 10, RULE_prefix = 11, 
		RULE_postfix = 12, RULE_modifier = 13, RULE_expr = 14, RULE_expr_or = 15, 
		RULE_expr_and = 16, RULE_expr_eq = 17, RULE_expr_comp = 18, RULE_expr_check = 19, 
		RULE_expr_elvis = 20, RULE_expr_infix = 21, RULE_expr_range = 22, RULE_expr_add = 23, 
		RULE_expr_mult = 24, RULE_expr_pre = 25, RULE_expr_post = 26, RULE_expr_term = 27, 
		RULE_paren_expr = 28, RULE_if_expr = 29, RULE_jumps = 30, RULE_func_decl = 31, 
		RULE_func_body = 32, RULE_param_list = 33, RULE_arg_list = 34, RULE_literal = 35, 
		RULE_str = 36, RULE_assn_rhs = 37, RULE_reassn_rhs = 38, RULE_var_decl = 39, 
		RULE_assn = 40, RULE_stmt = 41, RULE_decl = 42, RULE_identifier = 43, 
		RULE_type_def = 44, RULE_type = 45, RULE_block = 46, RULE_n = 47, RULE_sep = 48;
	public static final String[] ruleNames = {
		"prog", "root_elem", "package_def", "import_stmt", "loop", "assign_op", 
		"equal_op", "comp_op", "check_op", "add_op", "mult_op", "prefix", "postfix", 
		"modifier", "expr", "expr_or", "expr_and", "expr_eq", "expr_comp", "expr_check", 
		"expr_elvis", "expr_infix", "expr_range", "expr_add", "expr_mult", "expr_pre", 
		"expr_post", "expr_term", "paren_expr", "if_expr", "jumps", "func_decl", 
		"func_body", "param_list", "arg_list", "literal", "str", "assn_rhs", "reassn_rhs", 
		"var_decl", "assn", "stmt", "decl", "identifier", "type_def", "type", 
		"block", "n", "sep"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'package '", "'import '", "'fun'", "'var'", "'val'", 
		"'return'", "'if'", "'else'", "'for'", "'downTo'", "'step'", "'null'", 
		"'true'", "'false'", "'this'", "'continue'", "'break'", "'override'", 
		"'public'", "'private'", "'internal'", "'protected'", "'abstract'", "'final'", 
		"'open'", "'\"'", "'is'", "'!is'", "'in'", "'!in'", "'->'", "'?:'", "'.*'", 
		"'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'%='", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "':'", "','", "'..'", "'.'", "'!'", "'&&'", "'||'", 
		"'==='", "'!=='", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'?'", 
		"'('", "')'", "'['", "']'", "'''", "'}'", "'{'", "'='", null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "SNGL_CMNT", "MLTI_CMNT", "PACKAGE", "IMPORT", "FUN", "VAR", 
		"VAL", "RETURN", "IF", "ELSE", "FOR", "DOWNTO", "STEP", "NULL", "TRUE", 
		"FALSE", "THIS", "CONTINUE", "BREAK", "OVERRIDE", "PUBLIC", "PRIVATE", 
		"INTERNAL", "PROTECTED", "ABSTRACT", "FINAL", "OPEN", "DBLE_Q", "IS", 
		"NOT_IS", "IN", "NOT_IN", "CASE", "ELVIS", "ALL", "INCR", "DECR", "PLUS_ASSN", 
		"MINUS_ASSN", "MULTI_ASSN", "DIVIDE_ASSN", "REMAIN_ASSN", "PLUS", "MINUS", 
		"MULTI", "DIVIDE", "REMAIN", "COLON", "COMMA", "RANGE", "DOT", "NEGATE", 
		"AND", "OR", "REF_EQUAL", "REF_NEQUAL", "EQUAL", "NEQUAL", "GRTR_EQ", 
		"GRTR", "LESS_EQ", "LESS", "QUESTION", "L_PAREN", "R_PAREN", "L_BRACKET", 
		"R_BRACKET", "SNGL_Q", "R_BRACE", "L_BRACE", "ASSIGN", "ID", "NL", "SEMICOLON", 
		"REAL", "INT", "BOOL", "SINGLE_CH", "CHAR"
	};
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
	public String getGrammarFileName() { return "KotlinParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KotlinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(KotlinParser.EOF, 0); }
		public Package_defContext package_def() {
			return getRuleContext(Package_defContext.class,0);
		}
		public List<Import_stmtContext> import_stmt() {
			return getRuleContexts(Import_stmtContext.class);
		}
		public Import_stmtContext import_stmt(int i) {
			return getRuleContext(Import_stmtContext.class,i);
		}
		public Root_elemContext root_elem() {
			return getRuleContext(Root_elemContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(98);
				package_def();
				}
			}

			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(101);
				import_stmt();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUN) | (1L << VAR) | (1L << VAL) | (1L << OVERRIDE) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << INTERNAL) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << FINAL) | (1L << OPEN))) != 0) || _la==NL) {
				{
				setState(107);
				root_elem();
				}
			}

			setState(110);
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

	public static class Root_elemContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public Root_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root_elem; }
	}

	public final Root_elemContext root_elem() throws RecognitionException {
		Root_elemContext _localctx = new Root_elemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_root_elem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			decl();
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					sep();
					setState(114);
					decl();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL || _la==SEMICOLON) {
				{
				setState(121);
				sep();
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

	public static class Package_defContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(KotlinParser.PACKAGE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SepContext sep() {
			return getRuleContext(SepContext.class,0);
		}
		public Package_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_def; }
	}

	public final Package_defContext package_def() throws RecognitionException {
		Package_defContext _localctx = new Package_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_package_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(PACKAGE);
			setState(125);
			identifier();
			setState(126);
			sep();
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

	public static class Import_stmtContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(KotlinParser.IMPORT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SepContext sep() {
			return getRuleContext(SepContext.class,0);
		}
		public TerminalNode ALL() { return getToken(KotlinParser.ALL, 0); }
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_import_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IMPORT);
			setState(129);
			identifier();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL) {
				{
				setState(130);
				match(ALL);
				}
			}

			setState(133);
			sep();
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(KotlinParser.FOR, 0); }
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public TerminalNode L_PAREN() { return getToken(KotlinParser.L_PAREN, 0); }
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode IN() { return getToken(KotlinParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(KotlinParser.R_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(KotlinParser.SEMICOLON, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(FOR);
			setState(136);
			n();
			setState(137);
			match(L_PAREN);
			setState(138);
			n();
			setState(139);
			match(ID);
			setState(140);
			n();
			setState(141);
			match(IN);
			setState(142);
			n();
			setState(143);
			expr();
			setState(144);
			n();
			setState(145);
			match(R_PAREN);
			setState(146);
			n();
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BRACE:
				{
				setState(147);
				block();
				}
				break;
			case FUN:
			case VAR:
			case VAL:
			case RETURN:
			case IF:
			case FOR:
			case NULL:
			case THIS:
			case CONTINUE:
			case BREAK:
			case OVERRIDE:
			case PUBLIC:
			case PRIVATE:
			case INTERNAL:
			case PROTECTED:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case DBLE_Q:
			case INCR:
			case DECR:
			case PLUS:
			case MINUS:
			case NEGATE:
			case L_PAREN:
			case ID:
			case NL:
			case REAL:
			case INT:
			case BOOL:
			case SINGLE_CH:
				{
				setState(148);
				stmt();
				}
				break;
			case SEMICOLON:
				{
				setState(149);
				match(SEMICOLON);
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

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(KotlinParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSN() { return getToken(KotlinParser.PLUS_ASSN, 0); }
		public TerminalNode MINUS_ASSN() { return getToken(KotlinParser.MINUS_ASSN, 0); }
		public TerminalNode MULTI_ASSN() { return getToken(KotlinParser.MULTI_ASSN, 0); }
		public TerminalNode DIVIDE_ASSN() { return getToken(KotlinParser.DIVIDE_ASSN, 0); }
		public TerminalNode REMAIN_ASSN() { return getToken(KotlinParser.REMAIN_ASSN, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !(((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (PLUS_ASSN - 39)) | (1L << (MINUS_ASSN - 39)) | (1L << (MULTI_ASSN - 39)) | (1L << (DIVIDE_ASSN - 39)) | (1L << (REMAIN_ASSN - 39)) | (1L << (ASSIGN - 39)))) != 0)) ) {
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

	public static class Equal_opContext extends ParserRuleContext {
		public TerminalNode REF_EQUAL() { return getToken(KotlinParser.REF_EQUAL, 0); }
		public TerminalNode REF_NEQUAL() { return getToken(KotlinParser.REF_NEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(KotlinParser.EQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(KotlinParser.NEQUAL, 0); }
		public Equal_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal_op; }
	}

	public final Equal_opContext equal_op() throws RecognitionException {
		Equal_opContext _localctx = new Equal_opContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_equal_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REF_EQUAL) | (1L << REF_NEQUAL) | (1L << EQUAL) | (1L << NEQUAL))) != 0)) ) {
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

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode GRTR_EQ() { return getToken(KotlinParser.GRTR_EQ, 0); }
		public TerminalNode GRTR() { return getToken(KotlinParser.GRTR, 0); }
		public TerminalNode LESS_EQ() { return getToken(KotlinParser.LESS_EQ, 0); }
		public TerminalNode LESS() { return getToken(KotlinParser.LESS, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRTR_EQ) | (1L << GRTR) | (1L << LESS_EQ) | (1L << LESS))) != 0)) ) {
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

	public static class Check_opContext extends ParserRuleContext {
		public TerminalNode NOT_IS() { return getToken(KotlinParser.NOT_IS, 0); }
		public TerminalNode NOT_IN() { return getToken(KotlinParser.NOT_IN, 0); }
		public TerminalNode IS() { return getToken(KotlinParser.IS, 0); }
		public TerminalNode IN() { return getToken(KotlinParser.IN, 0); }
		public Check_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_op; }
	}

	public final Check_opContext check_op() throws RecognitionException {
		Check_opContext _localctx = new Check_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_check_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IS) | (1L << NOT_IS) | (1L << IN) | (1L << NOT_IN))) != 0)) ) {
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

	public static class Add_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(KotlinParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(KotlinParser.MINUS, 0); }
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class Mult_opContext extends ParserRuleContext {
		public TerminalNode MULTI() { return getToken(KotlinParser.MULTI, 0); }
		public TerminalNode DIVIDE() { return getToken(KotlinParser.DIVIDE, 0); }
		public TerminalNode REMAIN() { return getToken(KotlinParser.REMAIN, 0); }
		public Mult_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_op; }
	}

	public final Mult_opContext mult_op() throws RecognitionException {
		Mult_opContext _localctx = new Mult_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mult_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTI) | (1L << DIVIDE) | (1L << REMAIN))) != 0)) ) {
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

	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode INCR() { return getToken(KotlinParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(KotlinParser.DECR, 0); }
		public TerminalNode PLUS() { return getToken(KotlinParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(KotlinParser.MINUS, 0); }
		public TerminalNode NEGATE() { return getToken(KotlinParser.NEGATE, 0); }
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCR) | (1L << DECR) | (1L << PLUS) | (1L << MINUS) | (1L << NEGATE))) != 0)) ) {
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

	public static class PostfixContext extends ParserRuleContext {
		public TerminalNode INCR() { return getToken(KotlinParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(KotlinParser.DECR, 0); }
		public TerminalNode DOT() { return getToken(KotlinParser.DOT, 0); }
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(KotlinParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(KotlinParser.R_BRACKET, 0); }
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_postfix);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCR:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(INCR);
				}
				break;
			case DECR:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(DECR);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(DOT);
				setState(169);
				n();
				setState(170);
				match(ID);
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				arg_list();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(L_BRACKET);
				setState(174);
				expr();
				setState(175);
				match(R_BRACKET);
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode OVERRIDE() { return getToken(KotlinParser.OVERRIDE, 0); }
		public TerminalNode PUBLIC() { return getToken(KotlinParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(KotlinParser.PRIVATE, 0); }
		public TerminalNode INTERNAL() { return getToken(KotlinParser.INTERNAL, 0); }
		public TerminalNode PROTECTED() { return getToken(KotlinParser.PROTECTED, 0); }
		public TerminalNode ABSTRACT() { return getToken(KotlinParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(KotlinParser.FINAL, 0); }
		public TerminalNode OPEN() { return getToken(KotlinParser.OPEN, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OVERRIDE) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << INTERNAL) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << FINAL) | (1L << OPEN))) != 0)) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			expr_or();
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

	public static class Expr_orContext extends ParserRuleContext {
		public List<Expr_andContext> expr_and() {
			return getRuleContexts(Expr_andContext.class);
		}
		public Expr_andContext expr_and(int i) {
			return getRuleContext(Expr_andContext.class,i);
		}
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(KotlinParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(KotlinParser.OR, i);
		}
		public Expr_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or; }
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		Expr_orContext _localctx = new Expr_orContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr_or);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			expr_and();
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					n();
					setState(185);
					match(OR);
					setState(186);
					n();
					setState(187);
					expr_and();
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Expr_andContext extends ParserRuleContext {
		public List<Expr_eqContext> expr_eq() {
			return getRuleContexts(Expr_eqContext.class);
		}
		public Expr_eqContext expr_eq(int i) {
			return getRuleContext(Expr_eqContext.class,i);
		}
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(KotlinParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(KotlinParser.AND, i);
		}
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_and);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			expr_eq();
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					n();
					setState(196);
					match(AND);
					setState(197);
					n();
					setState(198);
					expr_eq();
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Expr_eqContext extends ParserRuleContext {
		public List<Expr_compContext> expr_comp() {
			return getRuleContexts(Expr_compContext.class);
		}
		public Expr_compContext expr_comp(int i) {
			return getRuleContext(Expr_compContext.class,i);
		}
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public List<Equal_opContext> equal_op() {
			return getRuleContexts(Equal_opContext.class);
		}
		public Equal_opContext equal_op(int i) {
			return getRuleContext(Equal_opContext.class,i);
		}
		public Expr_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq; }
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_eq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			expr_comp();
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					n();
					setState(207);
					equal_op();
					setState(208);
					n();
					setState(209);
					expr_comp();
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Expr_compContext extends ParserRuleContext {
		public List<Expr_checkContext> expr_check() {
			return getRuleContexts(Expr_checkContext.class);
		}
		public Expr_checkContext expr_check(int i) {
			return getRuleContext(Expr_checkContext.class,i);
		}
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public Expr_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_comp; }
	}

	public final Expr_compContext expr_comp() throws RecognitionException {
		Expr_compContext _localctx = new Expr_compContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			expr_check();
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(217);
				n();
				setState(218);
				comp_op();
				setState(219);
				n();
				setState(220);
				expr_check();
				}
				break;
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

	public static class Expr_checkContext extends ParserRuleContext {
		public List<Expr_elvisContext> expr_elvis() {
			return getRuleContexts(Expr_elvisContext.class);
		}
		public Expr_elvisContext expr_elvis(int i) {
			return getRuleContext(Expr_elvisContext.class,i);
		}
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public List<Check_opContext> check_op() {
			return getRuleContexts(Check_opContext.class);
		}
		public Check_opContext check_op(int i) {
			return getRuleContext(Check_opContext.class,i);
		}
		public Expr_checkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_check; }
	}

	public final Expr_checkContext expr_check() throws RecognitionException {
		Expr_checkContext _localctx = new Expr_checkContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_check);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			expr_elvis();
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					n();
					setState(226);
					check_op();
					setState(227);
					n();
					setState(228);
					expr_elvis();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Expr_elvisContext extends ParserRuleContext {
		public List<Expr_infixContext> expr_infix() {
			return getRuleContexts(Expr_infixContext.class);
		}
		public Expr_infixContext expr_infix(int i) {
			return getRuleContext(Expr_infixContext.class,i);
		}
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public List<TerminalNode> ELVIS() { return getTokens(KotlinParser.ELVIS); }
		public TerminalNode ELVIS(int i) {
			return getToken(KotlinParser.ELVIS, i);
		}
		public Expr_elvisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_elvis; }
	}

	public final Expr_elvisContext expr_elvis() throws RecognitionException {
		Expr_elvisContext _localctx = new Expr_elvisContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_elvis);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			expr_infix();
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					n();
					setState(237);
					match(ELVIS);
					setState(238);
					n();
					setState(239);
					expr_infix();
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Expr_infixContext extends ParserRuleContext {
		public List<Expr_rangeContext> expr_range() {
			return getRuleContexts(Expr_rangeContext.class);
		}
		public Expr_rangeContext expr_range(int i) {
			return getRuleContext(Expr_rangeContext.class,i);
		}
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public List<TerminalNode> DOWNTO() { return getTokens(KotlinParser.DOWNTO); }
		public TerminalNode DOWNTO(int i) {
			return getToken(KotlinParser.DOWNTO, i);
		}
		public List<TerminalNode> STEP() { return getTokens(KotlinParser.STEP); }
		public TerminalNode STEP(int i) {
			return getToken(KotlinParser.STEP, i);
		}
		public Expr_infixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_infix; }
	}

	public final Expr_infixContext expr_infix() throws RecognitionException {
		Expr_infixContext _localctx = new Expr_infixContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr_infix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			expr_range();
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					n();
					setState(248);
					_la = _input.LA(1);
					if ( !(_la==DOWNTO || _la==STEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(249);
					n();
					setState(250);
					expr_range();
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Expr_rangeContext extends ParserRuleContext {
		public List<Expr_addContext> expr_add() {
			return getRuleContexts(Expr_addContext.class);
		}
		public Expr_addContext expr_add(int i) {
			return getRuleContext(Expr_addContext.class,i);
		}
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public List<TerminalNode> RANGE() { return getTokens(KotlinParser.RANGE); }
		public TerminalNode RANGE(int i) {
			return getToken(KotlinParser.RANGE, i);
		}
		public Expr_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_range; }
	}

	public final Expr_rangeContext expr_range() throws RecognitionException {
		Expr_rangeContext _localctx = new Expr_rangeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr_range);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			expr_add();
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(258);
					n();
					setState(259);
					match(RANGE);
					setState(260);
					n();
					setState(261);
					expr_add();
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Expr_addContext extends ParserRuleContext {
		public List<Expr_multContext> expr_mult() {
			return getRuleContexts(Expr_multContext.class);
		}
		public Expr_multContext expr_mult(int i) {
			return getRuleContext(Expr_multContext.class,i);
		}
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public List<Add_opContext> add_op() {
			return getRuleContexts(Add_opContext.class);
		}
		public Add_opContext add_op(int i) {
			return getRuleContext(Add_opContext.class,i);
		}
		public Expr_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add; }
	}

	public final Expr_addContext expr_add() throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_add);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			expr_mult();
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					n();
					setState(270);
					add_op();
					setState(271);
					n();
					setState(272);
					expr_mult();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class Expr_multContext extends ParserRuleContext {
		public List<Expr_preContext> expr_pre() {
			return getRuleContexts(Expr_preContext.class);
		}
		public Expr_preContext expr_pre(int i) {
			return getRuleContext(Expr_preContext.class,i);
		}
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public List<Mult_opContext> mult_op() {
			return getRuleContexts(Mult_opContext.class);
		}
		public Mult_opContext mult_op(int i) {
			return getRuleContext(Mult_opContext.class,i);
		}
		public Expr_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult; }
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_mult);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			expr_pre();
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					n();
					setState(281);
					mult_op();
					setState(282);
					n();
					setState(283);
					expr_pre();
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Expr_preContext extends ParserRuleContext {
		public Expr_postContext expr_post() {
			return getRuleContext(Expr_postContext.class,0);
		}
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public Expr_preContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_pre; }
	}

	public final Expr_preContext expr_pre() throws RecognitionException {
		Expr_preContext _localctx = new Expr_preContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCR) | (1L << DECR) | (1L << PLUS) | (1L << MINUS) | (1L << NEGATE))) != 0)) {
				{
				{
				setState(290);
				prefix();
				setState(291);
				n();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			expr_post();
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

	public static class Expr_postContext extends ParserRuleContext {
		public Expr_termContext expr_term() {
			return getRuleContext(Expr_termContext.class,0);
		}
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public Expr_postContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_post; }
	}

	public final Expr_postContext expr_post() throws RecognitionException {
		Expr_postContext _localctx = new Expr_postContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_post);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			expr_term();
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301);
					n();
					setState(302);
					postfix();
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Expr_termContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(KotlinParser.THIS, 0); }
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Paren_exprContext paren_expr() {
			return getRuleContext(Paren_exprContext.class,0);
		}
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public JumpsContext jumps() {
			return getRuleContext(JumpsContext.class,0);
		}
		public Expr_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_term; }
	}

	public final Expr_termContext expr_term() throws RecognitionException {
		Expr_termContext _localctx = new Expr_termContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr_term);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(THIS);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(ID);
				}
				break;
			case NULL:
			case DBLE_Q:
			case REAL:
			case INT:
			case BOOL:
			case SINGLE_CH:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				literal();
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				paren_expr();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(313);
				if_expr();
				}
				break;
			case RETURN:
			case CONTINUE:
			case BREAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(314);
				jumps();
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

	public static class Paren_exprContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(KotlinParser.L_PAREN, 0); }
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(KotlinParser.R_PAREN, 0); }
		public Paren_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren_expr; }
	}

	public final Paren_exprContext paren_expr() throws RecognitionException {
		Paren_exprContext _localctx = new Paren_exprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_paren_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(L_PAREN);
			setState(318);
			n();
			setState(319);
			expr();
			setState(320);
			n();
			setState(321);
			match(R_PAREN);
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

	public static class If_exprContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(KotlinParser.IF, 0); }
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public Paren_exprContext paren_expr() {
			return getRuleContext(Paren_exprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SepContext sep() {
			return getRuleContext(SepContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(KotlinParser.ELSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(KotlinParser.SEMICOLON, 0); }
		public If_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expr; }
	}

	public final If_exprContext if_expr() throws RecognitionException {
		If_exprContext _localctx = new If_exprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_if_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(IF);
			setState(324);
			n();
			setState(325);
			paren_expr();
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(326);
				n();
				setState(327);
				block();
				}
				break;
			case 2:
				{
				setState(329);
				n();
				setState(330);
				stmt();
				}
				break;
			case 3:
				{
				setState(332);
				sep();
				}
				break;
			}
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(335);
				n();
				setState(336);
				match(ELSE);
				setState(337);
				n();
				setState(341);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_BRACE:
					{
					setState(338);
					block();
					}
					break;
				case FUN:
				case VAR:
				case VAL:
				case RETURN:
				case IF:
				case FOR:
				case NULL:
				case THIS:
				case CONTINUE:
				case BREAK:
				case OVERRIDE:
				case PUBLIC:
				case PRIVATE:
				case INTERNAL:
				case PROTECTED:
				case ABSTRACT:
				case FINAL:
				case OPEN:
				case DBLE_Q:
				case INCR:
				case DECR:
				case PLUS:
				case MINUS:
				case NEGATE:
				case L_PAREN:
				case ID:
				case NL:
				case REAL:
				case INT:
				case BOOL:
				case SINGLE_CH:
					{
					setState(339);
					stmt();
					}
					break;
				case SEMICOLON:
					{
					setState(340);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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

	public static class JumpsContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(KotlinParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(KotlinParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(KotlinParser.RETURN, 0); }
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public JumpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumps; }
	}

	public final JumpsContext jumps() throws RecognitionException {
		JumpsContext _localctx = new JumpsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_jumps);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(CONTINUE);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(BREAK);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				match(RETURN);
				setState(348);
				n();
				setState(350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(349);
					expr();
					}
					break;
				}
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

	public static class Func_declContext extends ParserRuleContext {
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public TerminalNode FUN() { return getToken(KotlinParser.FUN, 0); }
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OVERRIDE) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << INTERNAL) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << FINAL) | (1L << OPEN))) != 0)) {
				{
				{
				setState(354);
				modifier();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			n();
			setState(361);
			match(FUN);
			setState(362);
			n();
			setState(363);
			match(ID);
			setState(364);
			n();
			setState(365);
			param_list();
			setState(366);
			n();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(367);
				type_def();
				}
			}

			setState(370);
			n();
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(371);
				func_body();
				}
				break;
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

	public static class Func_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Assn_rhsContext assn_rhs() {
			return getRuleContext(Assn_rhsContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_func_body);
		try {
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				block();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				assn_rhs();
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

	public static class Param_listContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(KotlinParser.L_PAREN, 0); }
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public TerminalNode R_PAREN() { return getToken(KotlinParser.R_PAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(KotlinParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KotlinParser.ID, i);
		}
		public List<Type_defContext> type_def() {
			return getRuleContexts(Type_defContext.class);
		}
		public Type_defContext type_def(int i) {
			return getRuleContext(Type_defContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_param_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(L_PAREN);
			setState(379);
			n();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(380);
				match(ID);
				setState(381);
				n();
				setState(382);
				type_def();
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(383);
						n();
						setState(384);
						match(COMMA);
						setState(385);
						n();
						setState(386);
						match(ID);
						setState(387);
						n();
						setState(388);
						type_def();
						}
						} 
					}
					setState(394);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
			}

			setState(397);
			n();
			setState(398);
			match(R_PAREN);
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

	public static class Arg_listContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(KotlinParser.L_PAREN, 0); }
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public TerminalNode R_PAREN() { return getToken(KotlinParser.R_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arg_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(L_PAREN);
			setState(401);
			n();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << NULL) | (1L << THIS) | (1L << CONTINUE) | (1L << BREAK) | (1L << DBLE_Q) | (1L << INCR) | (1L << DECR) | (1L << PLUS) | (1L << MINUS) | (1L << NEGATE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (L_PAREN - 65)) | (1L << (ID - 65)) | (1L << (REAL - 65)) | (1L << (INT - 65)) | (1L << (BOOL - 65)) | (1L << (SINGLE_CH - 65)))) != 0)) {
				{
				setState(402);
				expr();
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(403);
						n();
						setState(404);
						match(COMMA);
						setState(405);
						n();
						setState(406);
						expr();
						}
						} 
					}
					setState(412);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
			}

			setState(415);
			n();
			setState(416);
			match(R_PAREN);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(KotlinParser.INT, 0); }
		public TerminalNode REAL() { return getToken(KotlinParser.REAL, 0); }
		public TerminalNode SINGLE_CH() { return getToken(KotlinParser.SINGLE_CH, 0); }
		public TerminalNode BOOL() { return getToken(KotlinParser.BOOL, 0); }
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public TerminalNode NULL() { return getToken(KotlinParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_literal);
		try {
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(INT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(REAL);
				}
				break;
			case SINGLE_CH:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				match(SINGLE_CH);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				match(BOOL);
				}
				break;
			case DBLE_Q:
				enterOuterAlt(_localctx, 5);
				{
				setState(422);
				str();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(423);
				match(NULL);
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

	public static class StrContext extends ParserRuleContext {
		public List<TerminalNode> DBLE_Q() { return getTokens(KotlinParser.DBLE_Q); }
		public TerminalNode DBLE_Q(int i) {
			return getToken(KotlinParser.DBLE_Q, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(KotlinParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(KotlinParser.CHAR, i);
		}
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_str);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(DBLE_Q);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHAR) {
				{
				{
				setState(427);
				match(CHAR);
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
			match(DBLE_Q);
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

	public static class Assn_rhsContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(KotlinParser.ASSIGN, 0); }
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assn_rhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assn_rhs; }
	}

	public final Assn_rhsContext assn_rhs() throws RecognitionException {
		Assn_rhsContext _localctx = new Assn_rhsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assn_rhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(ASSIGN);
			setState(436);
			n();
			setState(437);
			expr();
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

	public static class Reassn_rhsContext extends ParserRuleContext {
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Reassn_rhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reassn_rhs; }
	}

	public final Reassn_rhsContext reassn_rhs() throws RecognitionException {
		Reassn_rhsContext _localctx = new Reassn_rhsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_reassn_rhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			assign_op();
			setState(440);
			n();
			setState(441);
			expr();
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

	public static class Var_declContext extends ParserRuleContext {
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode VAR() { return getToken(KotlinParser.VAR, 0); }
		public TerminalNode VAL() { return getToken(KotlinParser.VAL, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public Assn_rhsContext assn_rhs() {
			return getRuleContext(Assn_rhsContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OVERRIDE) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << INTERNAL) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << FINAL) | (1L << OPEN))) != 0)) {
				{
				{
				setState(443);
				modifier();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
			n();
			setState(450);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==VAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(451);
			n();
			setState(452);
			match(ID);
			setState(453);
			n();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(454);
				type_def();
				}
			}

			setState(457);
			n();
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(458);
				assn_rhs();
				}
				break;
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

	public static class AssnContext extends ParserRuleContext {
		public Expr_termContext expr_term() {
			return getRuleContext(Expr_termContext.class,0);
		}
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public Reassn_rhsContext reassn_rhs() {
			return getRuleContext(Reassn_rhsContext.class,0);
		}
		public AssnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assn; }
	}

	public final AssnContext assn() throws RecognitionException {
		AssnContext _localctx = new AssnContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_assn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			expr_term();
			setState(462);
			n();
			setState(463);
			reassn_rhs();
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

	public static class StmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssnContext assn() {
			return getRuleContext(AssnContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_stmt);
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				assn();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				decl();
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

	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_decl);
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				func_decl();
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(KotlinParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KotlinParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(KotlinParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(KotlinParser.DOT, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(ID);
			setState(480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(476);
					match(DOT);
					setState(477);
					match(ID);
					}
					} 
				}
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class Type_defContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_type_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(COLON);
			setState(484);
			n();
			setState(485);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public TerminalNode LESS() { return getToken(KotlinParser.LESS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GRTR() { return getToken(KotlinParser.GRTR, 0); }
		public TerminalNode QUESTION() { return getToken(KotlinParser.QUESTION, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			identifier();
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(488);
				n();
				setState(489);
				match(LESS);
				setState(490);
				n();
				setState(491);
				type();
				setState(492);
				n();
				setState(493);
				match(GRTR);
				}
				break;
			}
			setState(497);
			n();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(498);
				match(QUESTION);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(KotlinParser.L_BRACE, 0); }
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(KotlinParser.R_BRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(L_BRACE);
			setState(502);
			n();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUN) | (1L << VAR) | (1L << VAL) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << NULL) | (1L << THIS) | (1L << CONTINUE) | (1L << BREAK) | (1L << OVERRIDE) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << INTERNAL) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << FINAL) | (1L << OPEN) | (1L << DBLE_Q) | (1L << INCR) | (1L << DECR) | (1L << PLUS) | (1L << MINUS) | (1L << NEGATE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (L_PAREN - 65)) | (1L << (ID - 65)) | (1L << (NL - 65)) | (1L << (REAL - 65)) | (1L << (INT - 65)) | (1L << (BOOL - 65)) | (1L << (SINGLE_CH - 65)))) != 0)) {
				{
				setState(503);
				stmt();
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(504);
						sep();
						setState(505);
						stmt();
						}
						} 
					}
					setState(511);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL || _la==SEMICOLON) {
					{
					setState(512);
					sep();
					}
				}

				}
			}

			setState(517);
			match(R_BRACE);
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

	public static class NContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public NContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n; }
	}

	public final NContext n() throws RecognitionException {
		NContext _localctx = new NContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_n);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(519);
					match(NL);
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class SepContext extends ParserRuleContext {
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public TerminalNode NL() { return getToken(KotlinParser.NL, 0); }
		public TerminalNode SEMICOLON() { return getToken(KotlinParser.SEMICOLON, 0); }
		public SepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sep; }
	}

	public final SepContext sep() throws RecognitionException {
		SepContext _localctx = new SepContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_sep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_la = _input.LA(1);
			if ( !(_la==NL || _la==SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(526);
			n();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u0213\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\5\2f\n\2\3\2"+
		"\7\2i\n\2\f\2\16\2l\13\2\3\2\5\2o\n\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3w\n\3"+
		"\f\3\16\3z\13\3\3\3\5\3}\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\u0086\n\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u0099\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b4\n\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00c0\n\21\f\21"+
		"\16\21\u00c3\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00cb\n\22\f\22"+
		"\16\22\u00ce\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00d6\n\23\f\23"+
		"\16\23\u00d9\13\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e1\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u00e9\n\25\f\25\16\25\u00ec\13\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u00f4\n\26\f\26\16\26\u00f7\13\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u00ff\n\27\f\27\16\27\u0102\13\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u010a\n\30\f\30\16\30\u010d\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u0115\n\31\f\31\16\31\u0118\13\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u0120\n\32\f\32\16\32\u0123\13\32\3\33"+
		"\3\33\3\33\7\33\u0128\n\33\f\33\16\33\u012b\13\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\7\34\u0133\n\34\f\34\16\34\u0136\13\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u013e\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0150\n\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0158\n\37\5\37\u015a\n\37\3 \3 \3 \3 \3 \5 \u0161\n "+
		"\5 \u0163\n \3!\7!\u0166\n!\f!\16!\u0169\13!\3!\3!\3!\3!\3!\3!\3!\3!\5"+
		"!\u0173\n!\3!\3!\5!\u0177\n!\3\"\3\"\5\"\u017b\n\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\7#\u0189\n#\f#\16#\u018c\13#\5#\u018e\n#\3#\3#\3#\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\7$\u019b\n$\f$\16$\u019e\13$\5$\u01a0\n$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\5%\u01ab\n%\3&\3&\7&\u01af\n&\f&\16&\u01b2\13&\3&"+
		"\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\7)\u01bf\n)\f)\16)\u01c2\13)\3)\3)"+
		"\3)\3)\3)\3)\5)\u01ca\n)\3)\3)\5)\u01ce\n)\3*\3*\3*\3*\3+\3+\3+\3+\5+"+
		"\u01d8\n+\3,\3,\5,\u01dc\n,\3-\3-\3-\7-\u01e1\n-\f-\16-\u01e4\13-\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01f2\n/\3/\3/\5/\u01f6\n/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\7\60\u01fe\n\60\f\60\16\60\u0201\13\60\3\60\5\60"+
		"\u0204\n\60\5\60\u0206\n\60\3\60\3\60\3\61\7\61\u020b\n\61\f\61\16\61"+
		"\u020e\13\61\3\62\3\62\3\62\3\62\2\2\63\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\r\4\2)-JJ\3\2"+
		":=\3\2>A\3\2 #\3\2./\3\2\60\62\5\2\'(./\67\67\3\2\27\36\3\2\17\20\3\2"+
		"\t\n\3\2LM\2\u0222\2e\3\2\2\2\4r\3\2\2\2\6~\3\2\2\2\b\u0082\3\2\2\2\n"+
		"\u0089\3\2\2\2\f\u009a\3\2\2\2\16\u009c\3\2\2\2\20\u009e\3\2\2\2\22\u00a0"+
		"\3\2\2\2\24\u00a2\3\2\2\2\26\u00a4\3\2\2\2\30\u00a6\3\2\2\2\32\u00b3\3"+
		"\2\2\2\34\u00b5\3\2\2\2\36\u00b7\3\2\2\2 \u00b9\3\2\2\2\"\u00c4\3\2\2"+
		"\2$\u00cf\3\2\2\2&\u00da\3\2\2\2(\u00e2\3\2\2\2*\u00ed\3\2\2\2,\u00f8"+
		"\3\2\2\2.\u0103\3\2\2\2\60\u010e\3\2\2\2\62\u0119\3\2\2\2\64\u0129\3\2"+
		"\2\2\66\u012e\3\2\2\28\u013d\3\2\2\2:\u013f\3\2\2\2<\u0145\3\2\2\2>\u0162"+
		"\3\2\2\2@\u0167\3\2\2\2B\u017a\3\2\2\2D\u017c\3\2\2\2F\u0192\3\2\2\2H"+
		"\u01aa\3\2\2\2J\u01ac\3\2\2\2L\u01b5\3\2\2\2N\u01b9\3\2\2\2P\u01c0\3\2"+
		"\2\2R\u01cf\3\2\2\2T\u01d7\3\2\2\2V\u01db\3\2\2\2X\u01dd\3\2\2\2Z\u01e5"+
		"\3\2\2\2\\\u01e9\3\2\2\2^\u01f7\3\2\2\2`\u020c\3\2\2\2b\u020f\3\2\2\2"+
		"df\5\6\4\2ed\3\2\2\2ef\3\2\2\2fj\3\2\2\2gi\5\b\5\2hg\3\2\2\2il\3\2\2\2"+
		"jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2mo\5\4\3\2nm\3\2\2\2no\3\2\2\2"+
		"op\3\2\2\2pq\7\2\2\3q\3\3\2\2\2rx\5V,\2st\5b\62\2tu\5V,\2uw\3\2\2\2vs"+
		"\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{}\5b\62\2|"+
		"{\3\2\2\2|}\3\2\2\2}\5\3\2\2\2~\177\7\6\2\2\177\u0080\5X-\2\u0080\u0081"+
		"\5b\62\2\u0081\7\3\2\2\2\u0082\u0083\7\7\2\2\u0083\u0085\5X-\2\u0084\u0086"+
		"\7&\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\5b\62\2\u0088\t\3\2\2\2\u0089\u008a\7\16\2\2\u008a\u008b\5`\61"+
		"\2\u008b\u008c\7C\2\2\u008c\u008d\5`\61\2\u008d\u008e\7K\2\2\u008e\u008f"+
		"\5`\61\2\u008f\u0090\7\"\2\2\u0090\u0091\5`\61\2\u0091\u0092\5\36\20\2"+
		"\u0092\u0093\5`\61\2\u0093\u0094\7D\2\2\u0094\u0098\5`\61\2\u0095\u0099"+
		"\5^\60\2\u0096\u0099\5T+\2\u0097\u0099\7M\2\2\u0098\u0095\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\13\3\2\2\2\u009a\u009b\t\2\2"+
		"\2\u009b\r\3\2\2\2\u009c\u009d\t\3\2\2\u009d\17\3\2\2\2\u009e\u009f\t"+
		"\4\2\2\u009f\21\3\2\2\2\u00a0\u00a1\t\5\2\2\u00a1\23\3\2\2\2\u00a2\u00a3"+
		"\t\6\2\2\u00a3\25\3\2\2\2\u00a4\u00a5\t\7\2\2\u00a5\27\3\2\2\2\u00a6\u00a7"+
		"\t\b\2\2\u00a7\31\3\2\2\2\u00a8\u00b4\7\'\2\2\u00a9\u00b4\7(\2\2\u00aa"+
		"\u00ab\7\66\2\2\u00ab\u00ac\5`\61\2\u00ac\u00ad\7K\2\2\u00ad\u00b4\3\2"+
		"\2\2\u00ae\u00b4\5F$\2\u00af\u00b0\7E\2\2\u00b0\u00b1\5\36\20\2\u00b1"+
		"\u00b2\7F\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00a8\3\2\2\2\u00b3\u00a9\3\2"+
		"\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4"+
		"\33\3\2\2\2\u00b5\u00b6\t\t\2\2\u00b6\35\3\2\2\2\u00b7\u00b8\5 \21\2\u00b8"+
		"\37\3\2\2\2\u00b9\u00c1\5\"\22\2\u00ba\u00bb\5`\61\2\u00bb\u00bc\79\2"+
		"\2\u00bc\u00bd\5`\61\2\u00bd\u00be\5\"\22\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00ba\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2!\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00cc\5$\23\2\u00c5\u00c6"+
		"\5`\61\2\u00c6\u00c7\78\2\2\u00c7\u00c8\5`\61\2\u00c8\u00c9\5$\23\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c5\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd#\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d7"+
		"\5&\24\2\u00d0\u00d1\5`\61\2\u00d1\u00d2\5\16\b\2\u00d2\u00d3\5`\61\2"+
		"\u00d3\u00d4\5&\24\2\u00d4\u00d6\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8%\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00e0\5(\25\2\u00db\u00dc\5`\61\2\u00dc\u00dd\5\20"+
		"\t\2\u00dd\u00de\5`\61\2\u00de\u00df\5(\25\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00db\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\'\3\2\2\2\u00e2\u00ea\5*\26\2"+
		"\u00e3\u00e4\5`\61\2\u00e4\u00e5\5\22\n\2\u00e5\u00e6\5`\61\2\u00e6\u00e7"+
		"\5*\26\2\u00e7\u00e9\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb)\3\2\2\2\u00ec\u00ea\3\2\2\2"+
		"\u00ed\u00f5\5,\27\2\u00ee\u00ef\5`\61\2\u00ef\u00f0\7%\2\2\u00f0\u00f1"+
		"\5`\61\2\u00f1\u00f2\5,\27\2\u00f2\u00f4\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6+\3\2\2\2"+
		"\u00f7\u00f5\3\2\2\2\u00f8\u0100\5.\30\2\u00f9\u00fa\5`\61\2\u00fa\u00fb"+
		"\t\n\2\2\u00fb\u00fc\5`\61\2\u00fc\u00fd\5.\30\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00f9\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101-\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u010b\5\60\31\2\u0104\u0105"+
		"\5`\61\2\u0105\u0106\7\65\2\2\u0106\u0107\5`\61\2\u0107\u0108\5\60\31"+
		"\2\u0108\u010a\3\2\2\2\u0109\u0104\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c/\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u0116\5\62\32\2\u010f\u0110\5`\61\2\u0110\u0111\5\24\13\2\u0111\u0112"+
		"\5`\61\2\u0112\u0113\5\62\32\2\u0113\u0115\3\2\2\2\u0114\u010f\3\2\2\2"+
		"\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\61"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u0121\5\64\33\2\u011a\u011b\5`\61\2"+
		"\u011b\u011c\5\26\f\2\u011c\u011d\5`\61\2\u011d\u011e\5\64\33\2\u011e"+
		"\u0120\3\2\2\2\u011f\u011a\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\63\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125"+
		"\5\30\r\2\u0125\u0126\5`\61\2\u0126\u0128\3\2\2\2\u0127\u0124\3\2\2\2"+
		"\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\5\66\34\2\u012d\65\3\2\2\2\u012e"+
		"\u0134\58\35\2\u012f\u0130\5`\61\2\u0130\u0131\5\32\16\2\u0131\u0133\3"+
		"\2\2\2\u0132\u012f\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\67\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u013e\7\24\2"+
		"\2\u0138\u013e\7K\2\2\u0139\u013e\5H%\2\u013a\u013e\5:\36\2\u013b\u013e"+
		"\5<\37\2\u013c\u013e\5> \2\u013d\u0137\3\2\2\2\u013d\u0138\3\2\2\2\u013d"+
		"\u0139\3\2\2\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2"+
		"\2\2\u013e9\3\2\2\2\u013f\u0140\7C\2\2\u0140\u0141\5`\61\2\u0141\u0142"+
		"\5\36\20\2\u0142\u0143\5`\61\2\u0143\u0144\7D\2\2\u0144;\3\2\2\2\u0145"+
		"\u0146\7\f\2\2\u0146\u0147\5`\61\2\u0147\u014f\5:\36\2\u0148\u0149\5`"+
		"\61\2\u0149\u014a\5^\60\2\u014a\u0150\3\2\2\2\u014b\u014c\5`\61\2\u014c"+
		"\u014d\5T+\2\u014d\u0150\3\2\2\2\u014e\u0150\5b\62\2\u014f\u0148\3\2\2"+
		"\2\u014f\u014b\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0159\3\2\2\2\u0151\u0152"+
		"\5`\61\2\u0152\u0153\7\r\2\2\u0153\u0157\5`\61\2\u0154\u0158\5^\60\2\u0155"+
		"\u0158\5T+\2\u0156\u0158\7M\2\2\u0157\u0154\3\2\2\2\u0157\u0155\3\2\2"+
		"\2\u0157\u0156\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0151\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a=\3\2\2\2\u015b\u0163\7\25\2\2\u015c\u0163\7\26\2\2\u015d"+
		"\u015e\7\13\2\2\u015e\u0160\5`\61\2\u015f\u0161\5\36\20\2\u0160\u015f"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u015b\3\2\2\2\u0162"+
		"\u015c\3\2\2\2\u0162\u015d\3\2\2\2\u0163?\3\2\2\2\u0164\u0166\5\34\17"+
		"\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\5`\61\2\u016b"+
		"\u016c\7\b\2\2\u016c\u016d\5`\61\2\u016d\u016e\7K\2\2\u016e\u016f\5`\61"+
		"\2\u016f\u0170\5D#\2\u0170\u0172\5`\61\2\u0171\u0173\5Z.\2\u0172\u0171"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\5`\61\2\u0175"+
		"\u0177\5B\"\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177A\3\2\2\2\u0178"+
		"\u017b\5^\60\2\u0179\u017b\5L\'\2\u017a\u0178\3\2\2\2\u017a\u0179\3\2"+
		"\2\2\u017bC\3\2\2\2\u017c\u017d\7C\2\2\u017d\u018d\5`\61\2\u017e\u017f"+
		"\7K\2\2\u017f\u0180\5`\61\2\u0180\u018a\5Z.\2\u0181\u0182\5`\61\2\u0182"+
		"\u0183\7\64\2\2\u0183\u0184\5`\61\2\u0184\u0185\7K\2\2\u0185\u0186\5`"+
		"\61\2\u0186\u0187\5Z.\2\u0187\u0189\3\2\2\2\u0188\u0181\3\2\2\2\u0189"+
		"\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018e\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018d\u017e\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0190\5`\61\2\u0190\u0191\7D\2\2\u0191E\3\2\2\2\u0192"+
		"\u0193\7C\2\2\u0193\u019f\5`\61\2\u0194\u019c\5\36\20\2\u0195\u0196\5"+
		"`\61\2\u0196\u0197\7\64\2\2\u0197\u0198\5`\61\2\u0198\u0199\5\36\20\2"+
		"\u0199\u019b\3\2\2\2\u019a\u0195\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019f"+
		"\u0194\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\5`"+
		"\61\2\u01a2\u01a3\7D\2\2\u01a3G\3\2\2\2\u01a4\u01ab\7O\2\2\u01a5\u01ab"+
		"\7N\2\2\u01a6\u01ab\7Q\2\2\u01a7\u01ab\7P\2\2\u01a8\u01ab\5J&\2\u01a9"+
		"\u01ab\7\21\2\2\u01aa\u01a4\3\2\2\2\u01aa\u01a5\3\2\2\2\u01aa\u01a6\3"+
		"\2\2\2\u01aa\u01a7\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab"+
		"I\3\2\2\2\u01ac\u01b0\7\37\2\2\u01ad\u01af\7R\2\2\u01ae\u01ad\3\2\2\2"+
		"\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\7\37\2\2\u01b4K\3\2\2\2\u01b5"+
		"\u01b6\7J\2\2\u01b6\u01b7\5`\61\2\u01b7\u01b8\5\36\20\2\u01b8M\3\2\2\2"+
		"\u01b9\u01ba\5\f\7\2\u01ba\u01bb\5`\61\2\u01bb\u01bc\5\36\20\2\u01bcO"+
		"\3\2\2\2\u01bd\u01bf\5\34\17\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2"+
		"\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0"+
		"\3\2\2\2\u01c3\u01c4\5`\61\2\u01c4\u01c5\t\13\2\2\u01c5\u01c6\5`\61\2"+
		"\u01c6\u01c7\7K\2\2\u01c7\u01c9\5`\61\2\u01c8\u01ca\5Z.\2\u01c9\u01c8"+
		"\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\5`\61\2\u01cc"+
		"\u01ce\5L\'\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ceQ\3\2\2\2\u01cf"+
		"\u01d0\58\35\2\u01d0\u01d1\5`\61\2\u01d1\u01d2\5N(\2\u01d2S\3\2\2\2\u01d3"+
		"\u01d8\5\36\20\2\u01d4\u01d8\5R*\2\u01d5\u01d8\5\n\6\2\u01d6\u01d8\5V"+
		",\2\u01d7\u01d3\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d6\3\2\2\2\u01d8U\3\2\2\2\u01d9\u01dc\5P)\2\u01da\u01dc\5@!\2\u01db"+
		"\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dcW\3\2\2\2\u01dd\u01e2\7K\2\2\u01de"+
		"\u01df\7\66\2\2\u01df\u01e1\7K\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e4\3\2"+
		"\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3Y\3\2\2\2\u01e4\u01e2"+
		"\3\2\2\2\u01e5\u01e6\7\63\2\2\u01e6\u01e7\5`\61\2\u01e7\u01e8\5\\/\2\u01e8"+
		"[\3\2\2\2\u01e9\u01f1\5X-\2\u01ea\u01eb\5`\61\2\u01eb\u01ec\7A\2\2\u01ec"+
		"\u01ed\5`\61\2\u01ed\u01ee\5\\/\2\u01ee\u01ef\5`\61\2\u01ef\u01f0\7?\2"+
		"\2\u01f0\u01f2\3\2\2\2\u01f1\u01ea\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3"+
		"\3\2\2\2\u01f3\u01f5\5`\61\2\u01f4\u01f6\7B\2\2\u01f5\u01f4\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6]\3\2\2\2\u01f7\u01f8\7I\2\2\u01f8\u0205\5`\61\2\u01f9"+
		"\u01ff\5T+\2\u01fa\u01fb\5b\62\2\u01fb\u01fc\5T+\2\u01fc\u01fe\3\2\2\2"+
		"\u01fd\u01fa\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200"+
		"\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0204\5b\62\2\u0203"+
		"\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u01f9\3\2"+
		"\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\7H\2\2\u0208"+
		"_\3\2\2\2\u0209\u020b\7L\2\2\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020da\3\2\2\2\u020e\u020c\3\2\2\2"+
		"\u020f\u0210\t\f\2\2\u0210\u0211\5`\61\2\u0211c\3\2\2\2\62ejnx|\u0085"+
		"\u0098\u00b3\u00c1\u00cc\u00d7\u00e0\u00ea\u00f5\u0100\u010b\u0116\u0121"+
		"\u0129\u0134\u013d\u014f\u0157\u0159\u0160\u0162\u0167\u0172\u0176\u017a"+
		"\u018a\u018d\u019c\u019f\u01aa\u01b0\u01c0\u01c9\u01cd\u01d7\u01db\u01e2"+
		"\u01f1\u01f5\u01ff\u0203\u0205\u020c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}