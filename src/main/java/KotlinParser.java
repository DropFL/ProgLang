// Generated from KotlinParser.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, SNGL_CMNT=2, MLTI_CMNT=3, PACKAGE=4, IMPORT=5, CLASS=6, INTERFACE=7, 
		FUN=8, VAR=9, VAL=10, RETURN=11, IF=12, ELSE=13, FOR=14, WHILE=15, WHEN=16, 
		DOWNTO=17, STEP=18, NULL=19, TRUE=20, FALSE=21, THIS=22, CONTINUE=23, 
		BREAK=24, OVERRIDE=25, PUBLIC=26, PRIVATE=27, INTERNAL=28, PROTECTED=29, 
		ABSTRACT=30, FINAL=31, OPEN=32, DBLE_Q=33, TMPL_ENTRY=34, IS=35, NOT_IS=36, 
		IN=37, NOT_IN=38, CASE=39, ELVIS=40, ALL=41, INCR=42, DECR=43, PLUS_ASSN=44, 
		MINUS_ASSN=45, MULTI_ASSN=46, DIVIDE_ASSN=47, REMAIN_ASSN=48, PLUS=49, 
		MINUS=50, MULTI=51, DIVIDE=52, REMAIN=53, COLON=54, COMMA=55, RANGE=56, 
		DOT=57, NEGATE=58, AND=59, OR=60, REF_EQUAL=61, REF_NEQUAL=62, EQUAL=63, 
		NEQUAL=64, GRTR_EQ=65, GRTR=66, LESS_EQ=67, LESS=68, QUESTION=69, L_PAREN=70, 
		R_PAREN=71, L_BRACKET=72, R_BRACKET=73, SNGL_Q=74, R_BRACE=75, L_BRACE=76, 
		DOLLAR=77, ASSIGN=78, REAL=79, INT=80, BOOL=81, SINGLE_CH=82, ID=83, CHAR=84, 
		NL=85, SEMICOLON=86;
	public static final int
		RULE_prog = 0, RULE_root_elem = 1, RULE_package_def = 2, RULE_import_stmt = 3, 
		RULE_loop = 4, RULE_for_loop = 5, RULE_while_loop = 6, RULE_assign_op = 7, 
		RULE_equal_op = 8, RULE_comp_op = 9, RULE_check_op = 10, RULE_add_op = 11, 
		RULE_mult_op = 12, RULE_prefix = 13, RULE_postfix = 14, RULE_modifier = 15, 
		RULE_expr = 16, RULE_expr_or = 17, RULE_expr_and = 18, RULE_expr_eq = 19, 
		RULE_expr_comp = 20, RULE_expr_check = 21, RULE_expr_elvis = 22, RULE_expr_infix = 23, 
		RULE_expr_range = 24, RULE_expr_add = 25, RULE_expr_mult = 26, RULE_expr_pre = 27, 
		RULE_expr_post = 28, RULE_expr_term = 29, RULE_paren_expr = 30, RULE_if_expr = 31, 
		RULE_when_expr = 32, RULE_when_targ = 33, RULE_when_case = 34, RULE_jumps = 35, 
		RULE_class_decl = 36, RULE_class_body = 37, RULE_prim_cstr = 38, RULE_inherit = 39, 
		RULE_func_decl = 40, RULE_func_body = 41, RULE_param_list = 42, RULE_arg_list = 43, 
		RULE_literal = 44, RULE_str = 45, RULE_str_elem = 46, RULE_smpl_tmpl = 47, 
		RULE_expr_tmpl = 48, RULE_assn_rhs = 49, RULE_reassn_rhs = 50, RULE_var_decl = 51, 
		RULE_assn = 52, RULE_stmt = 53, RULE_decl = 54, RULE_identifier = 55, 
		RULE_type_def = 56, RULE_type = 57, RULE_block = 58, RULE_n = 59, RULE_sep = 60;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "root_elem", "package_def", "import_stmt", "loop", "for_loop", 
			"while_loop", "assign_op", "equal_op", "comp_op", "check_op", "add_op", 
			"mult_op", "prefix", "postfix", "modifier", "expr", "expr_or", "expr_and", 
			"expr_eq", "expr_comp", "expr_check", "expr_elvis", "expr_infix", "expr_range", 
			"expr_add", "expr_mult", "expr_pre", "expr_post", "expr_term", "paren_expr", 
			"if_expr", "when_expr", "when_targ", "when_case", "jumps", "class_decl", 
			"class_body", "prim_cstr", "inherit", "func_decl", "func_body", "param_list", 
			"arg_list", "literal", "str", "str_elem", "smpl_tmpl", "expr_tmpl", "assn_rhs", 
			"reassn_rhs", "var_decl", "assn", "stmt", "decl", "identifier", "type_def", 
			"type", "block", "n", "sep"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'package '", "'import '", "'class'", "'interface'", 
			"'fun'", "'var'", "'val'", "'return'", "'if'", "'else'", "'for'", "'while'", 
			"'when'", "'downTo'", "'step'", "'null'", "'true'", "'false'", "'this'", 
			"'continue'", "'break'", "'override'", "'public'", "'private'", "'internal'", 
			"'protected'", "'abstract'", "'final'", "'open'", "'\"'", "'${'", "'is'", 
			"'!is'", "'in'", "'!in'", "'->'", "'?:'", "'.*'", "'++'", "'--'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'+'", "'-'", "'*'", "'/'", "'%'", "':'", 
			"','", "'..'", "'.'", "'!'", "'&&'", "'||'", "'==='", "'!=='", "'=='", 
			"'!='", "'>='", "'>'", "'<='", "'<'", "'?'", "'('", "')'", "'['", "']'", 
			"'''", "'}'", "'{'", "'$'", "'='", null, null, null, null, null, null, 
			null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "SNGL_CMNT", "MLTI_CMNT", "PACKAGE", "IMPORT", "CLASS", "INTERFACE", 
			"FUN", "VAR", "VAL", "RETURN", "IF", "ELSE", "FOR", "WHILE", "WHEN", 
			"DOWNTO", "STEP", "NULL", "TRUE", "FALSE", "THIS", "CONTINUE", "BREAK", 
			"OVERRIDE", "PUBLIC", "PRIVATE", "INTERNAL", "PROTECTED", "ABSTRACT", 
			"FINAL", "OPEN", "DBLE_Q", "TMPL_ENTRY", "IS", "NOT_IS", "IN", "NOT_IN", 
			"CASE", "ELVIS", "ALL", "INCR", "DECR", "PLUS_ASSN", "MINUS_ASSN", "MULTI_ASSN", 
			"DIVIDE_ASSN", "REMAIN_ASSN", "PLUS", "MINUS", "MULTI", "DIVIDE", "REMAIN", 
			"COLON", "COMMA", "RANGE", "DOT", "NEGATE", "AND", "OR", "REF_EQUAL", 
			"REF_NEQUAL", "EQUAL", "NEQUAL", "GRTR_EQ", "GRTR", "LESS_EQ", "LESS", 
			"QUESTION", "L_PAREN", "R_PAREN", "L_BRACKET", "R_BRACKET", "SNGL_Q", 
			"R_BRACE", "L_BRACE", "DOLLAR", "ASSIGN", "REAL", "INT", "BOOL", "SINGLE_CH", 
			"ID", "CHAR", "NL", "SEMICOLON"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(122);
				package_def();
				}
			}

			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(125);
				import_stmt();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << FUN) | (1L << VAR) | (1L << VAL) | (1L << OVERRIDE) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << INTERNAL) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << FINAL) | (1L << OPEN))) != 0) || _la==NL) {
				{
				setState(131);
				root_elem();
				}
			}

			setState(134);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitRoot_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Root_elemContext root_elem() throws RecognitionException {
		Root_elemContext _localctx = new Root_elemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_root_elem);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			decl();
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					sep();
					setState(138);
					decl();
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(145);
				sep();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPackage_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_defContext package_def() throws RecognitionException {
		Package_defContext _localctx = new Package_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_package_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(PACKAGE);
			setState(149);
			identifier();
			setState(150);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitImport_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_import_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(IMPORT);
			setState(153);
			identifier();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL) {
				{
				setState(154);
				match(ALL);
				}
			}

			setState(157);
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
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				for_loop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				while_loop();
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

	public static class For_loopContext extends ParserRuleContext {
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
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(FOR);
			setState(164);
			n();
			setState(165);
			match(L_PAREN);
			setState(166);
			n();
			setState(167);
			match(ID);
			setState(168);
			n();
			setState(169);
			match(IN);
			setState(170);
			n();
			setState(171);
			expr();
			setState(172);
			n();
			setState(173);
			match(R_PAREN);
			setState(174);
			n();
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BRACE:
				{
				setState(175);
				block();
				}
				break;
			case CLASS:
			case INTERFACE:
			case FUN:
			case VAR:
			case VAL:
			case RETURN:
			case IF:
			case FOR:
			case WHILE:
			case WHEN:
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
			case REAL:
			case INT:
			case BOOL:
			case SINGLE_CH:
			case ID:
			case NL:
				{
				setState(176);
				stmt();
				}
				break;
			case SEMICOLON:
				{
				setState(177);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(KotlinParser.WHILE, 0); }
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public TerminalNode L_PAREN() { return getToken(KotlinParser.L_PAREN, 0); }
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
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(WHILE);
			setState(181);
			n();
			setState(182);
			match(L_PAREN);
			setState(183);
			n();
			setState(184);
			expr();
			setState(185);
			n();
			setState(186);
			match(R_PAREN);
			setState(187);
			n();
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BRACE:
				{
				setState(188);
				block();
				}
				break;
			case CLASS:
			case INTERFACE:
			case FUN:
			case VAR:
			case VAL:
			case RETURN:
			case IF:
			case FOR:
			case WHILE:
			case WHEN:
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
			case REAL:
			case INT:
			case BOOL:
			case SINGLE_CH:
			case ID:
			case NL:
				{
				setState(189);
				stmt();
				}
				break;
			case SEMICOLON:
				{
				setState(190);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAssign_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (PLUS_ASSN - 44)) | (1L << (MINUS_ASSN - 44)) | (1L << (MULTI_ASSN - 44)) | (1L << (DIVIDE_ASSN - 44)) | (1L << (REMAIN_ASSN - 44)) | (1L << (ASSIGN - 44)))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitEqual_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equal_opContext equal_op() throws RecognitionException {
		Equal_opContext _localctx = new Equal_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_equal_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (REF_EQUAL - 61)) | (1L << (REF_NEQUAL - 61)) | (1L << (EQUAL - 61)) | (1L << (NEQUAL - 61)))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (GRTR_EQ - 65)) | (1L << (GRTR - 65)) | (1L << (LESS_EQ - 65)) | (1L << (LESS - 65)))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitCheck_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Check_opContext check_op() throws RecognitionException {
		Check_opContext _localctx = new Check_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_check_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAdd_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMult_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mult_opContext mult_op() throws RecognitionException {
		Mult_opContext _localctx = new Mult_opContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mult_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
		public Expr_termContext expr_term() {
			return getRuleContext(Expr_termContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_postfix);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCR:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(INCR);
				}
				break;
			case DECR:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(DECR);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(DOT);
				setState(210);
				n();
				setState(211);
				expr_term();
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				arg_list();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(L_BRACKET);
				setState(215);
				expr();
				setState(216);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpr_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		Expr_orContext _localctx = new Expr_orContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_or);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			expr_and();
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					n();
					setState(226);
					match(OR);
					setState(227);
					n();
					setState(228);
					expr_and();
					}
					} 
				}
				setState(234);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpr_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_and);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			expr_eq();
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					n();
					setState(237);
					match(AND);
					setState(238);
					n();
					setState(239);
					expr_eq();
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpr_eq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_eq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			expr_comp();
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					n();
					setState(248);
					equal_op();
					setState(249);
					n();
					setState(250);
					expr_comp();
					}
					} 
				}
				setState(256);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpr_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_compContext expr_comp() throws RecognitionException {
		Expr_compContext _localctx = new Expr_compContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			expr_check();
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(258);
				n();
				setState(259);
				comp_op();
				setState(260);
				n();
				setState(261);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpr_check(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_checkContext expr_check() throws RecognitionException {
		Expr_checkContext _localctx = new Expr_checkContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr_check);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			expr_elvis();
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(266);
					n();
					setState(267);
					check_op();
					setState(268);
					n();
					setState(269);
					expr_elvis();
					}
					} 
				}
				setState(275);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpr_elvis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_elvisContext expr_elvis() throws RecognitionException {
		Expr_elvisContext _localctx = new Expr_elvisContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr_elvis);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			expr_infix();
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					n();
					setState(278);
					match(ELVIS);
					setState(279);
					n();
					setState(280);
					expr_infix();
					}
					} 
				}
				setState(286);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpr_infix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_infixContext expr_infix() throws RecognitionException {
		Expr_infixContext _localctx = new Expr_infixContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_infix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			expr_range();
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					n();
					setState(289);
					_la = _input.LA(1);
					if ( !(_la==DOWNTO || _la==STEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(290);
					n();
					setState(291);
					expr_range();
					}
					} 
				}
				setState(297);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpr_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_rangeContext expr_range() throws RecognitionException {
		Expr_rangeContext _localctx = new Expr_rangeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_range);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			expr_add();
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(299);
					n();
					setState(300);
					match(RANGE);
					setState(301);
					n();
					setState(302);
					expr_add();
					}
					} 
				}
				setState(308);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpr_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_addContext expr_add() throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_add);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			expr_mult();
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310);
					n();
					setState(311);
					add_op();
					setState(312);
					n();
					setState(313);
					expr_mult();
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpr_mult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_mult);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			expr_pre();
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(321);
					n();
					setState(322);
					mult_op();
					setState(323);
					n();
					setState(324);
					expr_pre();
					}
					} 
				}
				setState(330);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpr_pre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_preContext expr_pre() throws RecognitionException {
		Expr_preContext _localctx = new Expr_preContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCR) | (1L << DECR) | (1L << PLUS) | (1L << MINUS) | (1L << NEGATE))) != 0)) {
				{
				{
				setState(331);
				prefix();
				setState(332);
				n();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpr_post(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_postContext expr_post() throws RecognitionException {
		Expr_postContext _localctx = new Expr_postContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr_post);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			expr_term();
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(342);
					n();
					setState(343);
					postfix();
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public When_exprContext when_expr() {
			return getRuleContext(When_exprContext.class,0);
		}
		public JumpsContext jumps() {
			return getRuleContext(JumpsContext.class,0);
		}
		public Expr_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpr_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_termContext expr_term() throws RecognitionException {
		Expr_termContext _localctx = new Expr_termContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr_term);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(THIS);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
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
				setState(352);
				literal();
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
				paren_expr();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(354);
				if_expr();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(355);
				when_expr();
				}
				break;
			case RETURN:
			case CONTINUE:
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(356);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitParen_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paren_exprContext paren_expr() throws RecognitionException {
		Paren_exprContext _localctx = new Paren_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_paren_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(L_PAREN);
			setState(360);
			n();
			setState(361);
			expr();
			setState(362);
			n();
			setState(363);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitIf_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_exprContext if_expr() throws RecognitionException {
		If_exprContext _localctx = new If_exprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_if_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(IF);
			setState(366);
			n();
			setState(367);
			paren_expr();
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(368);
				n();
				setState(369);
				block();
				}
				break;
			case 2:
				{
				setState(371);
				n();
				setState(372);
				stmt();
				}
				break;
			case 3:
				{
				setState(374);
				sep();
				}
				break;
			}
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(377);
				n();
				setState(378);
				match(ELSE);
				setState(379);
				n();
				setState(383);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_BRACE:
					{
					setState(380);
					block();
					}
					break;
				case CLASS:
				case INTERFACE:
				case FUN:
				case VAR:
				case VAL:
				case RETURN:
				case IF:
				case FOR:
				case WHILE:
				case WHEN:
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
				case REAL:
				case INT:
				case BOOL:
				case SINGLE_CH:
				case ID:
				case NL:
					{
					setState(381);
					stmt();
					}
					break;
				case SEMICOLON:
					{
					setState(382);
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

	public static class When_exprContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(KotlinParser.WHEN, 0); }
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public TerminalNode L_BRACE() { return getToken(KotlinParser.L_BRACE, 0); }
		public List<When_caseContext> when_case() {
			return getRuleContexts(When_caseContext.class);
		}
		public When_caseContext when_case(int i) {
			return getRuleContext(When_caseContext.class,i);
		}
		public TerminalNode R_BRACE() { return getToken(KotlinParser.R_BRACE, 0); }
		public When_targContext when_targ() {
			return getRuleContext(When_targContext.class,0);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public When_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitWhen_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final When_exprContext when_expr() throws RecognitionException {
		When_exprContext _localctx = new When_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_when_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(WHEN);
			setState(388);
			n();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_PAREN) {
				{
				setState(389);
				when_targ();
				}
			}

			setState(392);
			n();
			setState(393);
			match(L_BRACE);
			setState(394);
			n();
			setState(395);
			when_case();
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(396);
					sep();
					setState(397);
					when_case();
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(404);
			n();
			setState(405);
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

	public static class When_targContext extends ParserRuleContext {
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
		public TerminalNode VAL() { return getToken(KotlinParser.VAL, 0); }
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(KotlinParser.ASSIGN, 0); }
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public When_targContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_targ; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitWhen_targ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final When_targContext when_targ() throws RecognitionException {
		When_targContext _localctx = new When_targContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_when_targ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(L_PAREN);
			setState(408);
			n();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAL) {
				{
				setState(409);
				match(VAL);
				setState(410);
				n();
				setState(411);
				match(ID);
				setState(412);
				n();
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(413);
					type_def();
					}
				}

				setState(416);
				n();
				setState(417);
				match(ASSIGN);
				setState(418);
				n();
				}
			}

			setState(422);
			expr();
			setState(423);
			n();
			setState(424);
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

	public static class When_caseContext extends ParserRuleContext {
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CASE() { return getToken(KotlinParser.CASE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public List<Check_opContext> check_op() {
			return getRuleContexts(Check_opContext.class);
		}
		public Check_opContext check_op(int i) {
			return getRuleContext(Check_opContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(KotlinParser.ELSE, 0); }
		public When_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_case; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitWhen_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final When_caseContext when_case() throws RecognitionException {
		When_caseContext _localctx = new When_caseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_when_case);
		int _la;
		try {
			int _alt;
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case IF:
			case WHEN:
			case NULL:
			case THIS:
			case CONTINUE:
			case BREAK:
			case DBLE_Q:
			case IS:
			case NOT_IS:
			case IN:
			case NOT_IN:
			case INCR:
			case DECR:
			case PLUS:
			case MINUS:
			case NEGATE:
			case L_PAREN:
			case REAL:
			case INT:
			case BOOL:
			case SINGLE_CH:
			case ID:
			case NL:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IS) | (1L << NOT_IS) | (1L << IN) | (1L << NOT_IN))) != 0)) {
					{
					setState(426);
					check_op();
					}
				}

				setState(429);
				n();
				setState(430);
				expr();
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(431);
						n();
						setState(433);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IS) | (1L << NOT_IS) | (1L << IN) | (1L << NOT_IN))) != 0)) {
							{
							setState(432);
							check_op();
							}
						}

						setState(435);
						n();
						setState(436);
						expr();
						}
						} 
					}
					setState(442);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(443);
				n();
				setState(444);
				match(CASE);
				setState(445);
				n();
				setState(448);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_BRACE:
					{
					setState(446);
					block();
					}
					break;
				case CLASS:
				case INTERFACE:
				case FUN:
				case VAR:
				case VAL:
				case RETURN:
				case IF:
				case FOR:
				case WHILE:
				case WHEN:
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
				case REAL:
				case INT:
				case BOOL:
				case SINGLE_CH:
				case ID:
				case NL:
					{
					setState(447);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(ELSE);
				setState(451);
				n();
				setState(452);
				match(CASE);
				setState(453);
				n();
				setState(456);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_BRACE:
					{
					setState(454);
					block();
					}
					break;
				case CLASS:
				case INTERFACE:
				case FUN:
				case VAR:
				case VAL:
				case RETURN:
				case IF:
				case FOR:
				case WHILE:
				case WHEN:
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
				case REAL:
				case INT:
				case BOOL:
				case SINGLE_CH:
				case ID:
				case NL:
					{
					setState(455);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitJumps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpsContext jumps() throws RecognitionException {
		JumpsContext _localctx = new JumpsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_jumps);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(CONTINUE);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				match(BREAK);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				match(RETURN);
				setState(463);
				n();
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(464);
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

	public static class Class_declContext extends ParserRuleContext {
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(KotlinParser.CLASS, 0); }
		public TerminalNode INTERFACE() { return getToken(KotlinParser.INTERFACE, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public Prim_cstrContext prim_cstr() {
			return getRuleContext(Prim_cstrContext.class,0);
		}
		public InheritContext inherit() {
			return getRuleContext(InheritContext.class,0);
		}
		public Class_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitClass_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declContext class_decl() throws RecognitionException {
		Class_declContext _localctx = new Class_declContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_class_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OVERRIDE) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << INTERNAL) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << FINAL) | (1L << OPEN))) != 0)) {
				{
				{
				setState(469);
				modifier();
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
			n();
			setState(476);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==INTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(477);
			n();
			setState(478);
			match(ID);
			setState(479);
			n();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_PAREN) {
				{
				setState(480);
				prim_cstr();
				}
			}

			setState(483);
			n();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(484);
				inherit();
				}
			}

			setState(487);
			n();
			setState(488);
			class_body();
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

	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(KotlinParser.L_BRACE, 0); }
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public TerminalNode R_BRACE() { return getToken(KotlinParser.R_BRACE, 0); }
		public Root_elemContext root_elem() {
			return getRuleContext(Root_elemContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_class_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(L_BRACE);
			setState(491);
			n();
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(492);
				root_elem();
				}
				break;
			}
			setState(495);
			n();
			setState(496);
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

	public static class Prim_cstrContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(KotlinParser.L_PAREN, 0); }
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public TerminalNode R_PAREN() { return getToken(KotlinParser.R_PAREN, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public Prim_cstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prim_cstr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPrim_cstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prim_cstrContext prim_cstr() throws RecognitionException {
		Prim_cstrContext _localctx = new Prim_cstrContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_prim_cstr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(L_PAREN);
			setState(499);
			n();
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(500);
				var_decl();
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(501);
						n();
						setState(502);
						match(COMMA);
						setState(503);
						n();
						setState(504);
						var_decl();
						}
						} 
					}
					setState(510);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
				break;
			}
			setState(513);
			n();
			setState(514);
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

	public static class InheritContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<Arg_listContext> arg_list() {
			return getRuleContexts(Arg_listContext.class);
		}
		public Arg_listContext arg_list(int i) {
			return getRuleContext(Arg_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public InheritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitInherit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritContext inherit() throws RecognitionException {
		InheritContext _localctx = new InheritContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_inherit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(COLON);
			setState(517);
			n();
			setState(518);
			identifier();
			setState(519);
			n();
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_PAREN) {
				{
				setState(520);
				arg_list();
				}
			}

			setState(533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(523);
					n();
					setState(524);
					match(COMMA);
					setState(525);
					n();
					setState(526);
					identifier();
					setState(527);
					n();
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==L_PAREN) {
						{
						setState(528);
						arg_list();
						}
					}

					}
					} 
				}
				setState(535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunc_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OVERRIDE) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << INTERNAL) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << FINAL) | (1L << OPEN))) != 0)) {
				{
				{
				setState(536);
				modifier();
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(542);
			n();
			setState(543);
			match(FUN);
			setState(544);
			n();
			setState(545);
			match(ID);
			setState(546);
			n();
			setState(547);
			param_list();
			setState(548);
			n();
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(549);
				type_def();
				}
			}

			setState(552);
			n();
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(553);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunc_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_func_body);
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				block();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_param_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(L_PAREN);
			setState(561);
			n();
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(562);
				match(ID);
				setState(563);
				n();
				setState(564);
				type_def();
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(565);
						n();
						setState(566);
						match(COMMA);
						setState(567);
						n();
						setState(568);
						match(ID);
						setState(569);
						n();
						setState(570);
						type_def();
						}
						} 
					}
					setState(576);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
			}

			setState(579);
			n();
			setState(580);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitArg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arg_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(L_PAREN);
			setState(583);
			n();
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << WHEN) | (1L << NULL) | (1L << THIS) | (1L << CONTINUE) | (1L << BREAK) | (1L << DBLE_Q) | (1L << INCR) | (1L << DECR) | (1L << PLUS) | (1L << MINUS) | (1L << NEGATE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (L_PAREN - 70)) | (1L << (REAL - 70)) | (1L << (INT - 70)) | (1L << (BOOL - 70)) | (1L << (SINGLE_CH - 70)) | (1L << (ID - 70)))) != 0)) {
				{
				setState(584);
				expr();
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(585);
						n();
						setState(586);
						match(COMMA);
						setState(587);
						n();
						setState(588);
						expr();
						}
						} 
					}
					setState(594);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				}
			}

			setState(597);
			n();
			setState(598);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_literal);
		try {
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				match(INT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				match(REAL);
				}
				break;
			case SINGLE_CH:
				enterOuterAlt(_localctx, 3);
				{
				setState(602);
				match(SINGLE_CH);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(603);
				match(BOOL);
				}
				break;
			case DBLE_Q:
				enterOuterAlt(_localctx, 5);
				{
				setState(604);
				str();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(605);
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
		public List<Str_elemContext> str_elem() {
			return getRuleContexts(Str_elemContext.class);
		}
		public Str_elemContext str_elem(int i) {
			return getRuleContext(Str_elemContext.class,i);
		}
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_str);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(DBLE_Q);
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (TMPL_ENTRY - 34)) | (1L << (DOLLAR - 34)) | (1L << (CHAR - 34)))) != 0)) {
				{
				{
				setState(609);
				str_elem();
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(615);
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

	public static class Str_elemContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(KotlinParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(KotlinParser.CHAR, i);
		}
		public Expr_tmplContext expr_tmpl() {
			return getRuleContext(Expr_tmplContext.class,0);
		}
		public Smpl_tmplContext smpl_tmpl() {
			return getRuleContext(Smpl_tmplContext.class,0);
		}
		public Str_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_elem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitStr_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_elemContext str_elem() throws RecognitionException {
		Str_elemContext _localctx = new Str_elemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_str_elem);
		try {
			int _alt;
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(618); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(617);
						match(CHAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(620); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TMPL_ENTRY:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				expr_tmpl();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				smpl_tmpl();
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

	public static class Smpl_tmplContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(KotlinParser.DOLLAR, 0); }
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public Smpl_tmplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smpl_tmpl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitSmpl_tmpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Smpl_tmplContext smpl_tmpl() throws RecognitionException {
		Smpl_tmplContext _localctx = new Smpl_tmplContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_smpl_tmpl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(DOLLAR);
			setState(627);
			match(ID);
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

	public static class Expr_tmplContext extends ParserRuleContext {
		public TerminalNode TMPL_ENTRY() { return getToken(KotlinParser.TMPL_ENTRY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(KotlinParser.R_BRACE, 0); }
		public Expr_tmplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_tmpl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpr_tmpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_tmplContext expr_tmpl() throws RecognitionException {
		Expr_tmplContext _localctx = new Expr_tmplContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expr_tmpl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(TMPL_ENTRY);
			setState(630);
			expr();
			setState(631);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAssn_rhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assn_rhsContext assn_rhs() throws RecognitionException {
		Assn_rhsContext _localctx = new Assn_rhsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_assn_rhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(ASSIGN);
			setState(634);
			n();
			setState(635);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitReassn_rhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reassn_rhsContext reassn_rhs() throws RecognitionException {
		Reassn_rhsContext _localctx = new Reassn_rhsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_reassn_rhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			assign_op();
			setState(638);
			n();
			setState(639);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OVERRIDE) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << INTERNAL) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << FINAL) | (1L << OPEN))) != 0)) {
				{
				{
				setState(641);
				modifier();
				}
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(647);
			n();
			setState(648);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==VAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(649);
			n();
			setState(650);
			match(ID);
			setState(651);
			n();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(652);
				type_def();
				}
			}

			setState(655);
			n();
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(656);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAssn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssnContext assn() throws RecognitionException {
		AssnContext _localctx = new AssnContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_assn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			expr_term();
			setState(660);
			n();
			setState(661);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_stmt);
		try {
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				assn();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(666);
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
		public Class_declContext class_decl() {
			return getRuleContext(Class_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_decl);
		try {
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				func_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
				class_decl();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(ID);
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(675);
					match(DOT);
					setState(676);
					match(ID);
					}
					} 
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitType_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_type_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(COLON);
			setState(683);
			n();
			setState(684);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			identifier();
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(687);
				n();
				setState(688);
				match(LESS);
				setState(689);
				n();
				setState(690);
				type();
				setState(691);
				n();
				setState(692);
				match(GRTR);
				}
				break;
			}
			setState(696);
			n();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(697);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(L_BRACE);
			setState(701);
			n();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << FUN) | (1L << VAR) | (1L << VAL) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << WHEN) | (1L << NULL) | (1L << THIS) | (1L << CONTINUE) | (1L << BREAK) | (1L << OVERRIDE) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << INTERNAL) | (1L << PROTECTED) | (1L << ABSTRACT) | (1L << FINAL) | (1L << OPEN) | (1L << DBLE_Q) | (1L << INCR) | (1L << DECR) | (1L << PLUS) | (1L << MINUS) | (1L << NEGATE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (L_PAREN - 70)) | (1L << (REAL - 70)) | (1L << (INT - 70)) | (1L << (BOOL - 70)) | (1L << (SINGLE_CH - 70)) | (1L << (ID - 70)) | (1L << (NL - 70)))) != 0)) {
				{
				setState(702);
				stmt();
				setState(708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(703);
						sep();
						setState(704);
						stmt();
						}
						} 
					}
					setState(710);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL || _la==SEMICOLON) {
					{
					setState(711);
					sep();
					}
				}

				}
			}

			setState(716);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NContext n() throws RecognitionException {
		NContext _localctx = new NContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_n);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(718);
					match(NL);
					}
					} 
				}
				setState(723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SepContext sep() throws RecognitionException {
		SepContext _localctx = new SepContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_sep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_la = _input.LA(1);
			if ( !(_la==NL || _la==SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(725);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3X\u02da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\5\2~\n\2\3\2\7\2\u0081\n\2\f\2\16\2\u0084\13\2\3\2\5\2\u0087"+
		"\n\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u008f\n\3\f\3\16\3\u0092\13\3\3\3\5\3"+
		"\u0095\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\u009e\n\5\3\5\3\5\3\6\3\6\5"+
		"\6\u00a4\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00b5\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c2"+
		"\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00dd\n\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e9\n\23\f\23\16"+
		"\23\u00ec\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00f4\n\24\f\24\16"+
		"\24\u00f7\13\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00ff\n\25\f\25\16"+
		"\25\u0102\13\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u010a\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0112\n\27\f\27\16\27\u0115\13\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u011d\n\30\f\30\16\30\u0120\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u0128\n\31\f\31\16\31\u012b\13\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\7\32\u0133\n\32\f\32\16\32\u0136\13\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u013e\n\33\f\33\16\33\u0141\13\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\7\34\u0149\n\34\f\34\16\34\u014c\13\34\3\35\3\35"+
		"\3\35\7\35\u0151\n\35\f\35\16\35\u0154\13\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\7\36\u015c\n\36\f\36\16\36\u015f\13\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0168\n\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\5!\u017a\n!\3!\3!\3!\3!\3!\3!\5!\u0182\n!\5!\u0184\n!\3\"\3\"\3\""+
		"\5\"\u0189\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0192\n\"\f\"\16\"\u0195"+
		"\13\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\5#\u01a1\n#\3#\3#\3#\3#\5#\u01a7"+
		"\n#\3#\3#\3#\3#\3$\5$\u01ae\n$\3$\3$\3$\3$\5$\u01b4\n$\3$\3$\3$\7$\u01b9"+
		"\n$\f$\16$\u01bc\13$\3$\3$\3$\3$\3$\5$\u01c3\n$\3$\3$\3$\3$\3$\3$\5$\u01cb"+
		"\n$\5$\u01cd\n$\3%\3%\3%\3%\3%\5%\u01d4\n%\5%\u01d6\n%\3&\7&\u01d9\n&"+
		"\f&\16&\u01dc\13&\3&\3&\3&\3&\3&\3&\5&\u01e4\n&\3&\3&\5&\u01e8\n&\3&\3"+
		"&\3&\3\'\3\'\3\'\5\'\u01f0\n\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\7("+
		"\u01fd\n(\f(\16(\u0200\13(\5(\u0202\n(\3(\3(\3(\3)\3)\3)\3)\3)\5)\u020c"+
		"\n)\3)\3)\3)\3)\3)\3)\5)\u0214\n)\7)\u0216\n)\f)\16)\u0219\13)\3*\7*\u021c"+
		"\n*\f*\16*\u021f\13*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0229\n*\3*\3*\5*\u022d"+
		"\n*\3+\3+\5+\u0231\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u023f\n,"+
		"\f,\16,\u0242\13,\5,\u0244\n,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0251"+
		"\n-\f-\16-\u0254\13-\5-\u0256\n-\3-\3-\3-\3.\3.\3.\3.\3.\3.\5.\u0261\n"+
		".\3/\3/\7/\u0265\n/\f/\16/\u0268\13/\3/\3/\3\60\6\60\u026d\n\60\r\60\16"+
		"\60\u026e\3\60\3\60\5\60\u0273\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\7\65\u0285\n\65\f\65\16"+
		"\65\u0288\13\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0290\n\65\3\65\3\65"+
		"\5\65\u0294\n\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\5\67\u029e\n"+
		"\67\38\38\38\58\u02a3\n8\39\39\39\79\u02a8\n9\f9\169\u02ab\139\3:\3:\3"+
		":\3:\3;\3;\3;\3;\3;\3;\3;\3;\5;\u02b9\n;\3;\3;\5;\u02bd\n;\3<\3<\3<\3"+
		"<\3<\3<\7<\u02c5\n<\f<\16<\u02c8\13<\3<\5<\u02cb\n<\5<\u02cd\n<\3<\3<"+
		"\3=\7=\u02d2\n=\f=\16=\u02d5\13=\3>\3>\3>\3>\2\2?\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz\2\16\4\2.\62PP\3\2?B\3\2CF\3\2%(\3\2\63\64\3\2\65\67\5\2,-\63\64"+
		"<<\3\2\33\"\3\2\23\24\3\2\b\t\3\2\13\f\3\2WX\2\u02f8\2}\3\2\2\2\4\u008a"+
		"\3\2\2\2\6\u0096\3\2\2\2\b\u009a\3\2\2\2\n\u00a3\3\2\2\2\f\u00a5\3\2\2"+
		"\2\16\u00b6\3\2\2\2\20\u00c3\3\2\2\2\22\u00c5\3\2\2\2\24\u00c7\3\2\2\2"+
		"\26\u00c9\3\2\2\2\30\u00cb\3\2\2\2\32\u00cd\3\2\2\2\34\u00cf\3\2\2\2\36"+
		"\u00dc\3\2\2\2 \u00de\3\2\2\2\"\u00e0\3\2\2\2$\u00e2\3\2\2\2&\u00ed\3"+
		"\2\2\2(\u00f8\3\2\2\2*\u0103\3\2\2\2,\u010b\3\2\2\2.\u0116\3\2\2\2\60"+
		"\u0121\3\2\2\2\62\u012c\3\2\2\2\64\u0137\3\2\2\2\66\u0142\3\2\2\28\u0152"+
		"\3\2\2\2:\u0157\3\2\2\2<\u0167\3\2\2\2>\u0169\3\2\2\2@\u016f\3\2\2\2B"+
		"\u0185\3\2\2\2D\u0199\3\2\2\2F\u01cc\3\2\2\2H\u01d5\3\2\2\2J\u01da\3\2"+
		"\2\2L\u01ec\3\2\2\2N\u01f4\3\2\2\2P\u0206\3\2\2\2R\u021d\3\2\2\2T\u0230"+
		"\3\2\2\2V\u0232\3\2\2\2X\u0248\3\2\2\2Z\u0260\3\2\2\2\\\u0262\3\2\2\2"+
		"^\u0272\3\2\2\2`\u0274\3\2\2\2b\u0277\3\2\2\2d\u027b\3\2\2\2f\u027f\3"+
		"\2\2\2h\u0286\3\2\2\2j\u0295\3\2\2\2l\u029d\3\2\2\2n\u02a2\3\2\2\2p\u02a4"+
		"\3\2\2\2r\u02ac\3\2\2\2t\u02b0\3\2\2\2v\u02be\3\2\2\2x\u02d3\3\2\2\2z"+
		"\u02d6\3\2\2\2|~\5\6\4\2}|\3\2\2\2}~\3\2\2\2~\u0082\3\2\2\2\177\u0081"+
		"\5\b\5\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\5\4"+
		"\3\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\7\2\2\3\u0089\3\3\2\2\2\u008a\u0090\5n8\2\u008b\u008c\5z>\2\u008c"+
		"\u008d\5n8\2\u008d\u008f\3\2\2\2\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2"+
		"\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0095\5z>\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\5\3\2\2\2\u0096\u0097\7\6\2\2\u0097\u0098\5p9\2\u0098\u0099\5z>\2\u0099"+
		"\7\3\2\2\2\u009a\u009b\7\7\2\2\u009b\u009d\5p9\2\u009c\u009e\7+\2\2\u009d"+
		"\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\5z"+
		">\2\u00a0\t\3\2\2\2\u00a1\u00a4\5\f\7\2\u00a2\u00a4\5\16\b\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\13\3\2\2\2\u00a5\u00a6\7\20\2\2\u00a6"+
		"\u00a7\5x=\2\u00a7\u00a8\7H\2\2\u00a8\u00a9\5x=\2\u00a9\u00aa\7U\2\2\u00aa"+
		"\u00ab\5x=\2\u00ab\u00ac\7\'\2\2\u00ac\u00ad\5x=\2\u00ad\u00ae\5\"\22"+
		"\2\u00ae\u00af\5x=\2\u00af\u00b0\7I\2\2\u00b0\u00b4\5x=\2\u00b1\u00b5"+
		"\5v<\2\u00b2\u00b5\5l\67\2\u00b3\u00b5\7X\2\2\u00b4\u00b1\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\r\3\2\2\2\u00b6\u00b7\7\21\2"+
		"\2\u00b7\u00b8\5x=\2\u00b8\u00b9\7H\2\2\u00b9\u00ba\5x=\2\u00ba\u00bb"+
		"\5\"\22\2\u00bb\u00bc\5x=\2\u00bc\u00bd\7I\2\2\u00bd\u00c1\5x=\2\u00be"+
		"\u00c2\5v<\2\u00bf\u00c2\5l\67\2\u00c0\u00c2\7X\2\2\u00c1\u00be\3\2\2"+
		"\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\17\3\2\2\2\u00c3\u00c4"+
		"\t\2\2\2\u00c4\21\3\2\2\2\u00c5\u00c6\t\3\2\2\u00c6\23\3\2\2\2\u00c7\u00c8"+
		"\t\4\2\2\u00c8\25\3\2\2\2\u00c9\u00ca\t\5\2\2\u00ca\27\3\2\2\2\u00cb\u00cc"+
		"\t\6\2\2\u00cc\31\3\2\2\2\u00cd\u00ce\t\7\2\2\u00ce\33\3\2\2\2\u00cf\u00d0"+
		"\t\b\2\2\u00d0\35\3\2\2\2\u00d1\u00dd\7,\2\2\u00d2\u00dd\7-\2\2\u00d3"+
		"\u00d4\7;\2\2\u00d4\u00d5\5x=\2\u00d5\u00d6\5<\37\2\u00d6\u00dd\3\2\2"+
		"\2\u00d7\u00dd\5X-\2\u00d8\u00d9\7J\2\2\u00d9\u00da\5\"\22\2\u00da\u00db"+
		"\7K\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d1\3\2\2\2\u00dc\u00d2\3\2\2\2\u00dc"+
		"\u00d3\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd\37\3\2\2"+
		"\2\u00de\u00df\t\t\2\2\u00df!\3\2\2\2\u00e0\u00e1\5$\23\2\u00e1#\3\2\2"+
		"\2\u00e2\u00ea\5&\24\2\u00e3\u00e4\5x=\2\u00e4\u00e5\7>\2\2\u00e5\u00e6"+
		"\5x=\2\u00e6\u00e7\5&\24\2\u00e7\u00e9\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb%\3\2\2\2"+
		"\u00ec\u00ea\3\2\2\2\u00ed\u00f5\5(\25\2\u00ee\u00ef\5x=\2\u00ef\u00f0"+
		"\7=\2\2\u00f0\u00f1\5x=\2\u00f1\u00f2\5(\25\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00ee\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\'\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u0100\5*\26\2\u00f9\u00fa"+
		"\5x=\2\u00fa\u00fb\5\22\n\2\u00fb\u00fc\5x=\2\u00fc\u00fd\5*\26\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00f9\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101)\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0109"+
		"\5,\27\2\u0104\u0105\5x=\2\u0105\u0106\5\24\13\2\u0106\u0107\5x=\2\u0107"+
		"\u0108\5,\27\2\u0108\u010a\3\2\2\2\u0109\u0104\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a+\3\2\2\2\u010b\u0113\5.\30\2\u010c\u010d\5x=\2\u010d\u010e"+
		"\5\26\f\2\u010e\u010f\5x=\2\u010f\u0110\5.\30\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010c\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114-\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011e\5\60\31\2\u0117\u0118"+
		"\5x=\2\u0118\u0119\7*\2\2\u0119\u011a\5x=\2\u011a\u011b\5\60\31\2\u011b"+
		"\u011d\3\2\2\2\u011c\u0117\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f/\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0129"+
		"\5\62\32\2\u0122\u0123\5x=\2\u0123\u0124\t\n\2\2\u0124\u0125\5x=\2\u0125"+
		"\u0126\5\62\32\2\u0126\u0128\3\2\2\2\u0127\u0122\3\2\2\2\u0128\u012b\3"+
		"\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\61\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u0134\5\64\33\2\u012d\u012e\5x=\2\u012e\u012f\7:"+
		"\2\2\u012f\u0130\5x=\2\u0130\u0131\5\64\33\2\u0131\u0133\3\2\2\2\u0132"+
		"\u012d\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\63\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u013f\5\66\34\2\u0138"+
		"\u0139\5x=\2\u0139\u013a\5\30\r\2\u013a\u013b\5x=\2\u013b\u013c\5\66\34"+
		"\2\u013c\u013e\3\2\2\2\u013d\u0138\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\65\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u014a\58\35\2\u0143\u0144\5x=\2\u0144\u0145\5\32\16\2\u0145\u0146\5x"+
		"=\2\u0146\u0147\58\35\2\u0147\u0149\3\2\2\2\u0148\u0143\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\67\3\2\2"+
		"\2\u014c\u014a\3\2\2\2\u014d\u014e\5\34\17\2\u014e\u014f\5x=\2\u014f\u0151"+
		"\3\2\2\2\u0150\u014d\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\5:"+
		"\36\2\u01569\3\2\2\2\u0157\u015d\5<\37\2\u0158\u0159\5x=\2\u0159\u015a"+
		"\5\36\20\2\u015a\u015c\3\2\2\2\u015b\u0158\3\2\2\2\u015c\u015f\3\2\2\2"+
		"\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e;\3\2\2\2\u015f\u015d\3"+
		"\2\2\2\u0160\u0168\7\30\2\2\u0161\u0168\7U\2\2\u0162\u0168\5Z.\2\u0163"+
		"\u0168\5> \2\u0164\u0168\5@!\2\u0165\u0168\5B\"\2\u0166\u0168\5H%\2\u0167"+
		"\u0160\3\2\2\2\u0167\u0161\3\2\2\2\u0167\u0162\3\2\2\2\u0167\u0163\3\2"+
		"\2\2\u0167\u0164\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168"+
		"=\3\2\2\2\u0169\u016a\7H\2\2\u016a\u016b\5x=\2\u016b\u016c\5\"\22\2\u016c"+
		"\u016d\5x=\2\u016d\u016e\7I\2\2\u016e?\3\2\2\2\u016f\u0170\7\16\2\2\u0170"+
		"\u0171\5x=\2\u0171\u0179\5> \2\u0172\u0173\5x=\2\u0173\u0174\5v<\2\u0174"+
		"\u017a\3\2\2\2\u0175\u0176\5x=\2\u0176\u0177\5l\67\2\u0177\u017a\3\2\2"+
		"\2\u0178\u017a\5z>\2\u0179\u0172\3\2\2\2\u0179\u0175\3\2\2\2\u0179\u0178"+
		"\3\2\2\2\u017a\u0183\3\2\2\2\u017b\u017c\5x=\2\u017c\u017d\7\17\2\2\u017d"+
		"\u0181\5x=\2\u017e\u0182\5v<\2\u017f\u0182\5l\67\2\u0180\u0182\7X\2\2"+
		"\u0181\u017e\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182\u0184"+
		"\3\2\2\2\u0183\u017b\3\2\2\2\u0183\u0184\3\2\2\2\u0184A\3\2\2\2\u0185"+
		"\u0186\7\22\2\2\u0186\u0188\5x=\2\u0187\u0189\5D#\2\u0188\u0187\3\2\2"+
		"\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5x=\2\u018b\u018c"+
		"\7N\2\2\u018c\u018d\5x=\2\u018d\u0193\5F$\2\u018e\u018f\5z>\2\u018f\u0190"+
		"\5F$\2\u0190\u0192\3\2\2\2\u0191\u018e\3\2\2\2\u0192\u0195\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2"+
		"\2\2\u0196\u0197\5x=\2\u0197\u0198\7M\2\2\u0198C\3\2\2\2\u0199\u019a\7"+
		"H\2\2\u019a\u01a6\5x=\2\u019b\u019c\7\f\2\2\u019c\u019d\5x=\2\u019d\u019e"+
		"\7U\2\2\u019e\u01a0\5x=\2\u019f\u01a1\5r:\2\u01a0\u019f\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\5x=\2\u01a3\u01a4\7P\2"+
		"\2\u01a4\u01a5\5x=\2\u01a5\u01a7\3\2\2\2\u01a6\u019b\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\5\"\22\2\u01a9\u01aa\5x=\2\u01aa"+
		"\u01ab\7I\2\2\u01abE\3\2\2\2\u01ac\u01ae\5\26\f\2\u01ad\u01ac\3\2\2\2"+
		"\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\5x=\2\u01b0\u01ba"+
		"\5\"\22\2\u01b1\u01b3\5x=\2\u01b2\u01b4\5\26\f\2\u01b3\u01b2\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\5x=\2\u01b6\u01b7\5\"\22"+
		"\2\u01b7\u01b9\3\2\2\2\u01b8\u01b1\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8"+
		"\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd"+
		"\u01be\5x=\2\u01be\u01bf\7)\2\2\u01bf\u01c2\5x=\2\u01c0\u01c3\5v<\2\u01c1"+
		"\u01c3\5l\67\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01cd\3\2"+
		"\2\2\u01c4\u01c5\7\17\2\2\u01c5\u01c6\5x=\2\u01c6\u01c7\7)\2\2\u01c7\u01ca"+
		"\5x=\2\u01c8\u01cb\5v<\2\u01c9\u01cb\5l\67\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01c9\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ad\3\2\2\2\u01cc\u01c4\3\2"+
		"\2\2\u01cdG\3\2\2\2\u01ce\u01d6\7\31\2\2\u01cf\u01d6\7\32\2\2\u01d0\u01d1"+
		"\7\r\2\2\u01d1\u01d3\5x=\2\u01d2\u01d4\5\"\22\2\u01d3\u01d2\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01ce\3\2\2\2\u01d5\u01cf\3\2"+
		"\2\2\u01d5\u01d0\3\2\2\2\u01d6I\3\2\2\2\u01d7\u01d9\5 \21\2\u01d8\u01d7"+
		"\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\5x=\2\u01de\u01df\t\13"+
		"\2\2\u01df\u01e0\5x=\2\u01e0\u01e1\7U\2\2\u01e1\u01e3\5x=\2\u01e2\u01e4"+
		"\5N(\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e7\5x=\2\u01e6\u01e8\5P)\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2"+
		"\u01e8\u01e9\3\2\2\2\u01e9\u01ea\5x=\2\u01ea\u01eb\5L\'\2\u01ebK\3\2\2"+
		"\2\u01ec\u01ed\7N\2\2\u01ed\u01ef\5x=\2\u01ee\u01f0\5\4\3\2\u01ef\u01ee"+
		"\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\5x=\2\u01f2"+
		"\u01f3\7M\2\2\u01f3M\3\2\2\2\u01f4\u01f5\7H\2\2\u01f5\u0201\5x=\2\u01f6"+
		"\u01fe\5h\65\2\u01f7\u01f8\5x=\2\u01f8\u01f9\79\2\2\u01f9\u01fa\5x=\2"+
		"\u01fa\u01fb\5h\65\2\u01fb\u01fd\3\2\2\2\u01fc\u01f7\3\2\2\2\u01fd\u0200"+
		"\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0202\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0201\u01f6\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203\u0204\5x=\2\u0204\u0205\7I\2\2\u0205O\3\2\2\2\u0206\u0207\7"+
		"8\2\2\u0207\u0208\5x=\2\u0208\u0209\5p9\2\u0209\u020b\5x=\2\u020a\u020c"+
		"\5X-\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u0217\3\2\2\2\u020d"+
		"\u020e\5x=\2\u020e\u020f\79\2\2\u020f\u0210\5x=\2\u0210\u0211\5p9\2\u0211"+
		"\u0213\5x=\2\u0212\u0214\5X-\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2"+
		"\u0214\u0216\3\2\2\2\u0215\u020d\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218Q\3\2\2\2\u0219\u0217\3\2\2\2\u021a"+
		"\u021c\5 \21\2\u021b\u021a\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2"+
		"\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u021d\3\2\2\2\u0220"+
		"\u0221\5x=\2\u0221\u0222\7\n\2\2\u0222\u0223\5x=\2\u0223\u0224\7U\2\2"+
		"\u0224\u0225\5x=\2\u0225\u0226\5V,\2\u0226\u0228\5x=\2\u0227\u0229\5r"+
		":\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022c\5x=\2\u022b\u022d\5T+\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2"+
		"\u022dS\3\2\2\2\u022e\u0231\5v<\2\u022f\u0231\5d\63\2\u0230\u022e\3\2"+
		"\2\2\u0230\u022f\3\2\2\2\u0231U\3\2\2\2\u0232\u0233\7H\2\2\u0233\u0243"+
		"\5x=\2\u0234\u0235\7U\2\2\u0235\u0236\5x=\2\u0236\u0240\5r:\2\u0237\u0238"+
		"\5x=\2\u0238\u0239\79\2\2\u0239\u023a\5x=\2\u023a\u023b\7U\2\2\u023b\u023c"+
		"\5x=\2\u023c\u023d\5r:\2\u023d\u023f\3\2\2\2\u023e\u0237\3\2\2\2\u023f"+
		"\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0244\3\2"+
		"\2\2\u0242\u0240\3\2\2\2\u0243\u0234\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0246\5x=\2\u0246\u0247\7I\2\2\u0247W\3\2\2\2\u0248"+
		"\u0249\7H\2\2\u0249\u0255\5x=\2\u024a\u0252\5\"\22\2\u024b\u024c\5x=\2"+
		"\u024c\u024d\79\2\2\u024d\u024e\5x=\2\u024e\u024f\5\"\22\2\u024f\u0251"+
		"\3\2\2\2\u0250\u024b\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u024a\3\2"+
		"\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\5x=\2\u0258\u0259"+
		"\7I\2\2\u0259Y\3\2\2\2\u025a\u0261\7R\2\2\u025b\u0261\7Q\2\2\u025c\u0261"+
		"\7T\2\2\u025d\u0261\7S\2\2\u025e\u0261\5\\/\2\u025f\u0261\7\25\2\2\u0260"+
		"\u025a\3\2\2\2\u0260\u025b\3\2\2\2\u0260\u025c\3\2\2\2\u0260\u025d\3\2"+
		"\2\2\u0260\u025e\3\2\2\2\u0260\u025f\3\2\2\2\u0261[\3\2\2\2\u0262\u0266"+
		"\7#\2\2\u0263\u0265\5^\60\2\u0264\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266"+
		"\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u0266\3\2"+
		"\2\2\u0269\u026a\7#\2\2\u026a]\3\2\2\2\u026b\u026d\7V\2\2\u026c\u026b"+
		"\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0273\3\2\2\2\u0270\u0273\5b\62\2\u0271\u0273\5`\61\2\u0272\u026c\3\2"+
		"\2\2\u0272\u0270\3\2\2\2\u0272\u0271\3\2\2\2\u0273_\3\2\2\2\u0274\u0275"+
		"\7O\2\2\u0275\u0276\7U\2\2\u0276a\3\2\2\2\u0277\u0278\7$\2\2\u0278\u0279"+
		"\5\"\22\2\u0279\u027a\7M\2\2\u027ac\3\2\2\2\u027b\u027c\7P\2\2\u027c\u027d"+
		"\5x=\2\u027d\u027e\5\"\22\2\u027ee\3\2\2\2\u027f\u0280\5\20\t\2\u0280"+
		"\u0281\5x=\2\u0281\u0282\5\"\22\2\u0282g\3\2\2\2\u0283\u0285\5 \21\2\u0284"+
		"\u0283\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2"+
		"\2\2\u0287\u0289\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028a\5x=\2\u028a\u028b"+
		"\t\f\2\2\u028b\u028c\5x=\2\u028c\u028d\7U\2\2\u028d\u028f\5x=\2\u028e"+
		"\u0290\5r:\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2"+
		"\2\u0291\u0293\5x=\2\u0292\u0294\5d\63\2\u0293\u0292\3\2\2\2\u0293\u0294"+
		"\3\2\2\2\u0294i\3\2\2\2\u0295\u0296\5<\37\2\u0296\u0297\5x=\2\u0297\u0298"+
		"\5f\64\2\u0298k\3\2\2\2\u0299\u029e\5\"\22\2\u029a\u029e\5j\66\2\u029b"+
		"\u029e\5\n\6\2\u029c\u029e\5n8\2\u029d\u0299\3\2\2\2\u029d\u029a\3\2\2"+
		"\2\u029d\u029b\3\2\2\2\u029d\u029c\3\2\2\2\u029em\3\2\2\2\u029f\u02a3"+
		"\5h\65\2\u02a0\u02a3\5R*\2\u02a1\u02a3\5J&\2\u02a2\u029f\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a2\u02a1\3\2\2\2\u02a3o\3\2\2\2\u02a4\u02a9\7U\2\2\u02a5"+
		"\u02a6\7;\2\2\u02a6\u02a8\7U\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02ab\3\2\2"+
		"\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aaq\3\2\2\2\u02ab\u02a9"+
		"\3\2\2\2\u02ac\u02ad\78\2\2\u02ad\u02ae\5x=\2\u02ae\u02af\5t;\2\u02af"+
		"s\3\2\2\2\u02b0\u02b8\5p9\2\u02b1\u02b2\5x=\2\u02b2\u02b3\7F\2\2\u02b3"+
		"\u02b4\5x=\2\u02b4\u02b5\5t;\2\u02b5\u02b6\5x=\2\u02b6\u02b7\7D\2\2\u02b7"+
		"\u02b9\3\2\2\2\u02b8\u02b1\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2"+
		"\2\2\u02ba\u02bc\5x=\2\u02bb\u02bd\7G\2\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd"+
		"\3\2\2\2\u02bdu\3\2\2\2\u02be\u02bf\7N\2\2\u02bf\u02cc\5x=\2\u02c0\u02c6"+
		"\5l\67\2\u02c1\u02c2\5z>\2\u02c2\u02c3\5l\67\2\u02c3\u02c5\3\2\2\2\u02c4"+
		"\u02c1\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2"+
		"\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02cb\5z>\2\u02ca\u02c9"+
		"\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02c0\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\7M\2\2\u02cfw\3\2\2\2\u02d0"+
		"\u02d2\7W\2\2\u02d1\u02d0\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2"+
		"\2\2\u02d3\u02d4\3\2\2\2\u02d4y\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d7"+
		"\t\r\2\2\u02d7\u02d8\5x=\2\u02d8{\3\2\2\2I}\u0082\u0086\u0090\u0094\u009d"+
		"\u00a3\u00b4\u00c1\u00dc\u00ea\u00f5\u0100\u0109\u0113\u011e\u0129\u0134"+
		"\u013f\u014a\u0152\u015d\u0167\u0179\u0181\u0183\u0188\u0193\u01a0\u01a6"+
		"\u01ad\u01b3\u01ba\u01c2\u01ca\u01cc\u01d3\u01d5\u01da\u01e3\u01e7\u01ef"+
		"\u01fe\u0201\u020b\u0213\u0217\u021d\u0228\u022c\u0230\u0240\u0243\u0252"+
		"\u0255\u0260\u0266\u026e\u0272\u0286\u028f\u0293\u029d\u02a2\u02a9\u02b8"+
		"\u02bc\u02c6\u02ca\u02cc\u02d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}