// Generated from C:/Users/garre/source/repos/csce315-project2/src/project2/parser\DML.g4 by ANTLR 4.7
package project2.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, IDENTIFIER=33, STRING=34, INTEGER=35, OP=36, WS=37;
	public static final int
		RULE_query = 0, RULE_relation_name = 1, RULE_expr = 2, RULE_atomic_expr = 3, 
		RULE_selection = 4, RULE_condition = 5, RULE_conjunction = 6, RULE_comparison = 7, 
		RULE_operand = 8, RULE_attribute_name = 9, RULE_literal = 10, RULE_projection = 11, 
		RULE_attribute_list = 12, RULE_renaming = 13, RULE_union = 14, RULE_difference = 15, 
		RULE_product = 16, RULE_natural_join = 17, RULE_command = 18, RULE_open_cmd = 19, 
		RULE_close_cmd = 20, RULE_write_cmd = 21, RULE_exit_cmd = 22, RULE_show_cmd = 23, 
		RULE_create_cmd = 24, RULE_update_cmd = 25, RULE_insert_cmd = 26, RULE_delete_cmd = 27, 
		RULE_typed_attribute_list = 28, RULE_type = 29;
	public static final String[] ruleNames = {
		"query", "relation_name", "expr", "atomic_expr", "selection", "condition", 
		"conjunction", "comparison", "operand", "attribute_name", "literal", "projection", 
		"attribute_list", "renaming", "union", "difference", "product", "natural_join", 
		"command", "open_cmd", "close_cmd", "write_cmd", "exit_cmd", "show_cmd", 
		"create_cmd", "update_cmd", "insert_cmd", "delete_cmd", "typed_attribute_list", 
		"type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<-'", "';'", "'('", "')'", "'select'", "'||'", "'&&'", "'project'", 
		"' ,'", "'rename'", "'+'", "'-'", "'*'", "'&'", "'OPEN'", "'CLOSE'", "'WRITE'", 
		"'EXIT'", "'SHOW'", "'CREATE TABLE'", "'PRIMARY KEY'", "'UPDATE'", "'SET'", 
		"'='", "','", "'WHERE'", "'INSERT INTO'", "'VALUES FROM'", "'VALUES FROM RELATION'", 
		"'DELETE FROM'", "'VARCHAR'", "'INTEGER'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "IDENTIFIER", "STRING", 
		"INTEGER", "OP", "WS"
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
	public String getGrammarFileName() { return "DML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public Relation_nameContext relation_name() {
			return getRuleContext(Relation_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			relation_name();
			setState(61);
			match(T__0);
			setState(62);
			expr();
			setState(63);
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

	public static class Relation_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DMLParser.IDENTIFIER, 0); }
		public Relation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterRelation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitRelation_name(this);
		}
	}

	public final Relation_nameContext relation_name() throws RecognitionException {
		Relation_nameContext _localctx = new Relation_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_relation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(IDENTIFIER);
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
		public Atomic_exprContext atomic_expr() {
			return getRuleContext(Atomic_exprContext.class,0);
		}
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public RenamingContext renaming() {
			return getRuleContext(RenamingContext.class,0);
		}
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public DifferenceContext difference() {
			return getRuleContext(DifferenceContext.class,0);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public Natural_joinContext natural_join() {
			return getRuleContext(Natural_joinContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				atomic_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				selection();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				projection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				renaming();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				union();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				difference();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				product();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(74);
				natural_join();
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

	public static class Atomic_exprContext extends ParserRuleContext {
		public Relation_nameContext relation_name() {
			return getRuleContext(Relation_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Atomic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterAtomic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitAtomic_expr(this);
		}
	}

	public final Atomic_exprContext atomic_expr() throws RecognitionException {
		Atomic_exprContext _localctx = new Atomic_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atomic_expr);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				relation_name();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(78);
				match(T__2);
				setState(79);
				expr();
				setState(80);
				match(T__3);
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

	public static class SelectionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Atomic_exprContext atomic_expr() {
			return getRuleContext(Atomic_exprContext.class,0);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitSelection(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__4);
			setState(85);
			match(T__2);
			setState(86);
			condition();
			setState(87);
			match(T__3);
			setState(88);
			atomic_expr();
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			conjunction();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(91);
				match(T__5);
				setState(92);
				conjunction();
				}
				}
				setState(97);
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

	public static class ConjunctionContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			comparison();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(99);
				match(T__6);
				setState(100);
				comparison();
				}
				}
				setState(105);
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode OP() { return getToken(DMLParser.OP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparison);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case STRING:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				operand();
				setState(107);
				match(OP);
				setState(108);
				operand();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(T__2);
				setState(111);
				condition();
				setState(112);
				match(T__3);
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

	public static class OperandContext extends ParserRuleContext {
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operand);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				attribute_name();
				}
				break;
			case STRING:
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				literal();
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

	public static class Attribute_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DMLParser.IDENTIFIER, 0); }
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterAttribute_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitAttribute_name(this);
		}
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IDENTIFIER);
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
		public TerminalNode STRING() { return getToken(DMLParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(DMLParser.INTEGER, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INTEGER) ) {
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

	public static class ProjectionContext extends ParserRuleContext {
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Atomic_exprContext atomic_expr() {
			return getRuleContext(Atomic_exprContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitProjection(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_projection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__7);
			setState(125);
			match(T__2);
			setState(126);
			attribute_list();
			setState(127);
			match(T__3);
			setState(128);
			atomic_expr();
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

	public static class Attribute_listContext extends ParserRuleContext {
		public List<Attribute_nameContext> attribute_name() {
			return getRuleContexts(Attribute_nameContext.class);
		}
		public Attribute_nameContext attribute_name(int i) {
			return getRuleContext(Attribute_nameContext.class,i);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterAttribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitAttribute_list(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attribute_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			attribute_name();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(131);
				match(T__8);
				setState(132);
				attribute_name();
				}
				}
				setState(137);
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

	public static class RenamingContext extends ParserRuleContext {
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Atomic_exprContext atomic_expr() {
			return getRuleContext(Atomic_exprContext.class,0);
		}
		public RenamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renaming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterRenaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitRenaming(this);
		}
	}

	public final RenamingContext renaming() throws RecognitionException {
		RenamingContext _localctx = new RenamingContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_renaming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__9);
			setState(139);
			match(T__2);
			setState(140);
			attribute_list();
			setState(141);
			match(T__3);
			setState(142);
			atomic_expr();
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

	public static class UnionContext extends ParserRuleContext {
		public List<Atomic_exprContext> atomic_expr() {
			return getRuleContexts(Atomic_exprContext.class);
		}
		public Atomic_exprContext atomic_expr(int i) {
			return getRuleContext(Atomic_exprContext.class,i);
		}
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitUnion(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			atomic_expr();
			setState(145);
			match(T__10);
			setState(146);
			atomic_expr();
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

	public static class DifferenceContext extends ParserRuleContext {
		public List<Atomic_exprContext> atomic_expr() {
			return getRuleContexts(Atomic_exprContext.class);
		}
		public Atomic_exprContext atomic_expr(int i) {
			return getRuleContext(Atomic_exprContext.class,i);
		}
		public DifferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_difference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterDifference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitDifference(this);
		}
	}

	public final DifferenceContext difference() throws RecognitionException {
		DifferenceContext _localctx = new DifferenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_difference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			atomic_expr();
			setState(149);
			match(T__11);
			setState(150);
			atomic_expr();
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

	public static class ProductContext extends ParserRuleContext {
		public List<Atomic_exprContext> atomic_expr() {
			return getRuleContexts(Atomic_exprContext.class);
		}
		public Atomic_exprContext atomic_expr(int i) {
			return getRuleContext(Atomic_exprContext.class,i);
		}
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitProduct(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			atomic_expr();
			setState(153);
			match(T__12);
			setState(154);
			atomic_expr();
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

	public static class Natural_joinContext extends ParserRuleContext {
		public List<Atomic_exprContext> atomic_expr() {
			return getRuleContexts(Atomic_exprContext.class);
		}
		public Atomic_exprContext atomic_expr(int i) {
			return getRuleContext(Atomic_exprContext.class,i);
		}
		public Natural_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natural_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterNatural_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitNatural_join(this);
		}
	}

	public final Natural_joinContext natural_join() throws RecognitionException {
		Natural_joinContext _localctx = new Natural_joinContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_natural_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			atomic_expr();
			setState(157);
			match(T__13);
			setState(158);
			atomic_expr();
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

	public static class CommandContext extends ParserRuleContext {
		public Open_cmdContext open_cmd() {
			return getRuleContext(Open_cmdContext.class,0);
		}
		public Close_cmdContext close_cmd() {
			return getRuleContext(Close_cmdContext.class,0);
		}
		public Write_cmdContext write_cmd() {
			return getRuleContext(Write_cmdContext.class,0);
		}
		public Exit_cmdContext exit_cmd() {
			return getRuleContext(Exit_cmdContext.class,0);
		}
		public Show_cmdContext show_cmd() {
			return getRuleContext(Show_cmdContext.class,0);
		}
		public Create_cmdContext create_cmd() {
			return getRuleContext(Create_cmdContext.class,0);
		}
		public Update_cmdContext update_cmd() {
			return getRuleContext(Update_cmdContext.class,0);
		}
		public Insert_cmdContext insert_cmd() {
			return getRuleContext(Insert_cmdContext.class,0);
		}
		public Delete_cmdContext delete_cmd() {
			return getRuleContext(Delete_cmdContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_command);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				open_cmd();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				close_cmd();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				write_cmd();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				exit_cmd();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				show_cmd();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				create_cmd();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				update_cmd();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				insert_cmd();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 9);
				{
				setState(168);
				delete_cmd();
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

	public static class Open_cmdContext extends ParserRuleContext {
		public Relation_nameContext relation_name() {
			return getRuleContext(Relation_nameContext.class,0);
		}
		public Open_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterOpen_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitOpen_cmd(this);
		}
	}

	public final Open_cmdContext open_cmd() throws RecognitionException {
		Open_cmdContext _localctx = new Open_cmdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_open_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__14);
			setState(172);
			relation_name();
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

	public static class Close_cmdContext extends ParserRuleContext {
		public Relation_nameContext relation_name() {
			return getRuleContext(Relation_nameContext.class,0);
		}
		public Close_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterClose_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitClose_cmd(this);
		}
	}

	public final Close_cmdContext close_cmd() throws RecognitionException {
		Close_cmdContext _localctx = new Close_cmdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_close_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__15);
			setState(175);
			relation_name();
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

	public static class Write_cmdContext extends ParserRuleContext {
		public Relation_nameContext relation_name() {
			return getRuleContext(Relation_nameContext.class,0);
		}
		public Write_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterWrite_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitWrite_cmd(this);
		}
	}

	public final Write_cmdContext write_cmd() throws RecognitionException {
		Write_cmdContext _localctx = new Write_cmdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_write_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__16);
			setState(178);
			relation_name();
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

	public static class Exit_cmdContext extends ParserRuleContext {
		public Exit_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterExit_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitExit_cmd(this);
		}
	}

	public final Exit_cmdContext exit_cmd() throws RecognitionException {
		Exit_cmdContext _localctx = new Exit_cmdContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exit_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__17);
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

	public static class Show_cmdContext extends ParserRuleContext {
		public Atomic_exprContext atomic_expr() {
			return getRuleContext(Atomic_exprContext.class,0);
		}
		public Show_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterShow_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitShow_cmd(this);
		}
	}

	public final Show_cmdContext show_cmd() throws RecognitionException {
		Show_cmdContext _localctx = new Show_cmdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_show_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__18);
			setState(183);
			atomic_expr();
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

	public static class Create_cmdContext extends ParserRuleContext {
		public Relation_nameContext relation_name() {
			return getRuleContext(Relation_nameContext.class,0);
		}
		public Typed_attribute_listContext typed_attribute_list() {
			return getRuleContext(Typed_attribute_listContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Create_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterCreate_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitCreate_cmd(this);
		}
	}

	public final Create_cmdContext create_cmd() throws RecognitionException {
		Create_cmdContext _localctx = new Create_cmdContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_create_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__19);
			setState(186);
			relation_name();
			setState(187);
			match(T__2);
			setState(188);
			typed_attribute_list();
			setState(189);
			match(T__3);
			setState(190);
			match(T__20);
			setState(191);
			match(T__2);
			setState(192);
			attribute_list();
			setState(193);
			match(T__3);
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

	public static class Update_cmdContext extends ParserRuleContext {
		public Relation_nameContext relation_name() {
			return getRuleContext(Relation_nameContext.class,0);
		}
		public List<Attribute_nameContext> attribute_name() {
			return getRuleContexts(Attribute_nameContext.class);
		}
		public Attribute_nameContext attribute_name(int i) {
			return getRuleContext(Attribute_nameContext.class,i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Update_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterUpdate_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitUpdate_cmd(this);
		}
	}

	public final Update_cmdContext update_cmd() throws RecognitionException {
		Update_cmdContext _localctx = new Update_cmdContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_update_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__21);
			setState(196);
			relation_name();
			setState(197);
			match(T__22);
			setState(198);
			attribute_name();
			setState(199);
			match(T__23);
			setState(200);
			literal();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(201);
				match(T__24);
				setState(202);
				attribute_name();
				setState(203);
				match(T__23);
				setState(204);
				literal();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(T__25);
			setState(212);
			condition();
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

	public static class Insert_cmdContext extends ParserRuleContext {
		public Relation_nameContext relation_name() {
			return getRuleContext(Relation_nameContext.class,0);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Insert_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterInsert_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitInsert_cmd(this);
		}
	}

	public final Insert_cmdContext insert_cmd() throws RecognitionException {
		Insert_cmdContext _localctx = new Insert_cmdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_insert_cmd);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(T__26);
				setState(215);
				relation_name();
				setState(216);
				match(T__27);
				setState(217);
				match(T__2);
				setState(218);
				literal();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(219);
					match(T__24);
					setState(220);
					literal();
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(T__26);
				setState(229);
				relation_name();
				setState(230);
				match(T__28);
				setState(231);
				expr();
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

	public static class Delete_cmdContext extends ParserRuleContext {
		public Relation_nameContext relation_name() {
			return getRuleContext(Relation_nameContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Delete_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterDelete_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitDelete_cmd(this);
		}
	}

	public final Delete_cmdContext delete_cmd() throws RecognitionException {
		Delete_cmdContext _localctx = new Delete_cmdContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_delete_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__29);
			setState(236);
			relation_name();
			setState(237);
			match(T__25);
			setState(238);
			condition();
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

	public static class Typed_attribute_listContext extends ParserRuleContext {
		public List<Attribute_nameContext> attribute_name() {
			return getRuleContexts(Attribute_nameContext.class);
		}
		public Attribute_nameContext attribute_name(int i) {
			return getRuleContext(Attribute_nameContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Typed_attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_attribute_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterTyped_attribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitTyped_attribute_list(this);
		}
	}

	public final Typed_attribute_listContext typed_attribute_list() throws RecognitionException {
		Typed_attribute_listContext _localctx = new Typed_attribute_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typed_attribute_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			attribute_name();
			setState(241);
			type();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(242);
				match(T__24);
				setState(243);
				attribute_name();
				setState(244);
				type();
				}
				}
				setState(250);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(DMLParser.INTEGER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(T__30);
				setState(252);
				match(T__2);
				setState(253);
				match(INTEGER);
				setState(254);
				match(T__3);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(T__31);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0105\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\5\5U\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7`\n\7\f\7\16"+
		"\7c\13\7\3\b\3\b\3\b\7\bh\n\b\f\b\16\bk\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\tu\n\t\3\n\3\n\5\ny\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\7\16\u0088\n\16\f\16\16\16\u008b\13\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u00ac\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u00d1\n\33"+
		"\f\33\16\33\u00d4\13\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\7\34\u00e0\n\34\f\34\16\34\u00e3\13\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u00ec\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\7\36\u00f9\n\36\f\36\16\36\u00fc\13\36\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0103\n\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<\2\3\3\2$%\2\u0100\2>\3\2\2\2\4C\3\2\2\2\6M\3"+
		"\2\2\2\bT\3\2\2\2\nV\3\2\2\2\f\\\3\2\2\2\16d\3\2\2\2\20t\3\2\2\2\22x\3"+
		"\2\2\2\24z\3\2\2\2\26|\3\2\2\2\30~\3\2\2\2\32\u0084\3\2\2\2\34\u008c\3"+
		"\2\2\2\36\u0092\3\2\2\2 \u0096\3\2\2\2\"\u009a\3\2\2\2$\u009e\3\2\2\2"+
		"&\u00ab\3\2\2\2(\u00ad\3\2\2\2*\u00b0\3\2\2\2,\u00b3\3\2\2\2.\u00b6\3"+
		"\2\2\2\60\u00b8\3\2\2\2\62\u00bb\3\2\2\2\64\u00c5\3\2\2\2\66\u00eb\3\2"+
		"\2\28\u00ed\3\2\2\2:\u00f2\3\2\2\2<\u0102\3\2\2\2>?\5\4\3\2?@\7\3\2\2"+
		"@A\5\6\4\2AB\7\4\2\2B\3\3\2\2\2CD\7#\2\2D\5\3\2\2\2EN\5\b\5\2FN\5\n\6"+
		"\2GN\5\30\r\2HN\5\34\17\2IN\5\36\20\2JN\5 \21\2KN\5\"\22\2LN\5$\23\2M"+
		"E\3\2\2\2MF\3\2\2\2MG\3\2\2\2MH\3\2\2\2MI\3\2\2\2MJ\3\2\2\2MK\3\2\2\2"+
		"ML\3\2\2\2N\7\3\2\2\2OU\5\4\3\2PQ\7\5\2\2QR\5\6\4\2RS\7\6\2\2SU\3\2\2"+
		"\2TO\3\2\2\2TP\3\2\2\2U\t\3\2\2\2VW\7\7\2\2WX\7\5\2\2XY\5\f\7\2YZ\7\6"+
		"\2\2Z[\5\b\5\2[\13\3\2\2\2\\a\5\16\b\2]^\7\b\2\2^`\5\16\b\2_]\3\2\2\2"+
		"`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\r\3\2\2\2ca\3\2\2\2di\5\20\t\2ef\7\t\2"+
		"\2fh\5\20\t\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\17\3\2\2\2ki\3"+
		"\2\2\2lm\5\22\n\2mn\7&\2\2no\5\22\n\2ou\3\2\2\2pq\7\5\2\2qr\5\f\7\2rs"+
		"\7\6\2\2su\3\2\2\2tl\3\2\2\2tp\3\2\2\2u\21\3\2\2\2vy\5\24\13\2wy\5\26"+
		"\f\2xv\3\2\2\2xw\3\2\2\2y\23\3\2\2\2z{\7#\2\2{\25\3\2\2\2|}\t\2\2\2}\27"+
		"\3\2\2\2~\177\7\n\2\2\177\u0080\7\5\2\2\u0080\u0081\5\32\16\2\u0081\u0082"+
		"\7\6\2\2\u0082\u0083\5\b\5\2\u0083\31\3\2\2\2\u0084\u0089\5\24\13\2\u0085"+
		"\u0086\7\13\2\2\u0086\u0088\5\24\13\2\u0087\u0085\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\33\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\7\f\2\2\u008d\u008e\7\5\2\2\u008e\u008f\5\32"+
		"\16\2\u008f\u0090\7\6\2\2\u0090\u0091\5\b\5\2\u0091\35\3\2\2\2\u0092\u0093"+
		"\5\b\5\2\u0093\u0094\7\r\2\2\u0094\u0095\5\b\5\2\u0095\37\3\2\2\2\u0096"+
		"\u0097\5\b\5\2\u0097\u0098\7\16\2\2\u0098\u0099\5\b\5\2\u0099!\3\2\2\2"+
		"\u009a\u009b\5\b\5\2\u009b\u009c\7\17\2\2\u009c\u009d\5\b\5\2\u009d#\3"+
		"\2\2\2\u009e\u009f\5\b\5\2\u009f\u00a0\7\20\2\2\u00a0\u00a1\5\b\5\2\u00a1"+
		"%\3\2\2\2\u00a2\u00ac\5(\25\2\u00a3\u00ac\5*\26\2\u00a4\u00ac\5,\27\2"+
		"\u00a5\u00ac\5.\30\2\u00a6\u00ac\5\60\31\2\u00a7\u00ac\5\62\32\2\u00a8"+
		"\u00ac\5\64\33\2\u00a9\u00ac\5\66\34\2\u00aa\u00ac\58\35\2\u00ab\u00a2"+
		"\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab"+
		"\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00aa\3\2\2\2\u00ac\'\3\2\2\2\u00ad\u00ae\7\21\2\2\u00ae\u00af"+
		"\5\4\3\2\u00af)\3\2\2\2\u00b0\u00b1\7\22\2\2\u00b1\u00b2\5\4\3\2\u00b2"+
		"+\3\2\2\2\u00b3\u00b4\7\23\2\2\u00b4\u00b5\5\4\3\2\u00b5-\3\2\2\2\u00b6"+
		"\u00b7\7\24\2\2\u00b7/\3\2\2\2\u00b8\u00b9\7\25\2\2\u00b9\u00ba\5\b\5"+
		"\2\u00ba\61\3\2\2\2\u00bb\u00bc\7\26\2\2\u00bc\u00bd\5\4\3\2\u00bd\u00be"+
		"\7\5\2\2\u00be\u00bf\5:\36\2\u00bf\u00c0\7\6\2\2\u00c0\u00c1\7\27\2\2"+
		"\u00c1\u00c2\7\5\2\2\u00c2\u00c3\5\32\16\2\u00c3\u00c4\7\6\2\2\u00c4\63"+
		"\3\2\2\2\u00c5\u00c6\7\30\2\2\u00c6\u00c7\5\4\3\2\u00c7\u00c8\7\31\2\2"+
		"\u00c8\u00c9\5\24\13\2\u00c9\u00ca\7\32\2\2\u00ca\u00d2\5\26\f\2\u00cb"+
		"\u00cc\7\33\2\2\u00cc\u00cd\5\24\13\2\u00cd\u00ce\7\32\2\2\u00ce\u00cf"+
		"\5\26\f\2\u00cf\u00d1\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d1\u00d4\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d6\7\34\2\2\u00d6\u00d7\5\f\7\2\u00d7\65\3\2\2\2\u00d8"+
		"\u00d9\7\35\2\2\u00d9\u00da\5\4\3\2\u00da\u00db\7\36\2\2\u00db\u00dc\7"+
		"\5\2\2\u00dc\u00e1\5\26\f\2\u00dd\u00de\7\33\2\2\u00de\u00e0\5\26\f\2"+
		"\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\6\2\2\u00e5"+
		"\u00ec\3\2\2\2\u00e6\u00e7\7\35\2\2\u00e7\u00e8\5\4\3\2\u00e8\u00e9\7"+
		"\37\2\2\u00e9\u00ea\5\6\4\2\u00ea\u00ec\3\2\2\2\u00eb\u00d8\3\2\2\2\u00eb"+
		"\u00e6\3\2\2\2\u00ec\67\3\2\2\2\u00ed\u00ee\7 \2\2\u00ee\u00ef\5\4\3\2"+
		"\u00ef\u00f0\7\34\2\2\u00f0\u00f1\5\f\7\2\u00f19\3\2\2\2\u00f2\u00f3\5"+
		"\24\13\2\u00f3\u00fa\5<\37\2\u00f4\u00f5\7\33\2\2\u00f5\u00f6\5\24\13"+
		"\2\u00f6\u00f7\5<\37\2\u00f7\u00f9\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9\u00fc"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb;\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u00fe\7!\2\2\u00fe\u00ff\7\5\2\2\u00ff\u0100\7%\2"+
		"\2\u0100\u0103\7\6\2\2\u0101\u0103\7\"\2\2\u0102\u00fd\3\2\2\2\u0102\u0101"+
		"\3\2\2\2\u0103=\3\2\2\2\17MTaitx\u0089\u00ab\u00d2\u00e1\u00eb\u00fa\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}