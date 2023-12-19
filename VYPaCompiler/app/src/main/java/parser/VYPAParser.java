// Generated from VYPAParser.g4 by ANTLR 4.13.0
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VYPAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, ELSE=2, IF=3, INT=4, RETURN=5, STRING=6, SUPER=7, THIS=8, VOID=9, 
		WHILE=10, NEW=11, LPAR=12, RPAR=13, LBRACE=14, RBRACE=15, SEMICOLON=16, 
		COMMA=17, DOT=18, ASSIGN=19, GT=20, LT=21, NOT=22, COLON=23, EQ=24, LE=25, 
		GE=26, NEQ=27, AND=28, OR=29, ADD=30, SUB=31, MUL=32, DIV=33, WHITESPACES=34, 
		COMMENT=35, LINECOMMENT=36, INTEGER_LIT=37, STRING_LIT=38, IDENTIFIER=39, 
		ERROR_TOKEN=40;
	public static final int
		RULE_program = 0, RULE_genericDef = 1, RULE_funcDef = 2, RULE_paramDefList = 3, 
		RULE_paramDef = 4, RULE_classDef = 5, RULE_classExtends = 6, RULE_classBody = 7, 
		RULE_methodDef = 8, RULE_codeBlock = 9, RULE_statementList = 10, RULE_statement = 11, 
		RULE_ifStatement = 12, RULE_elseStatement = 13, RULE_whileStatement = 14, 
		RULE_returnStatement = 15, RULE_singleDefStatement = 16, RULE_varDefStatement = 17, 
		RULE_expressionStatement = 18, RULE_sideEffectExpression = 19, RULE_superConstructor = 20, 
		RULE_variable = 21, RULE_superMethod = 22, RULE_variableStart = 23, RULE_fieldAccess = 24, 
		RULE_invocation = 25, RULE_newObjParams = 26, RULE_newObject = 27, RULE_expUnary = 28, 
		RULE_expMul = 29, RULE_expAdd = 30, RULE_expRel = 31, RULE_expComparation = 32, 
		RULE_expAnd = 33, RULE_expOr = 34, RULE_expr = 35, RULE_literal = 36, 
		RULE_expressionList = 37, RULE_primitiveType = 38, RULE_dataType = 39, 
		RULE_returnType = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "genericDef", "funcDef", "paramDefList", "paramDef", "classDef", 
			"classExtends", "classBody", "methodDef", "codeBlock", "statementList", 
			"statement", "ifStatement", "elseStatement", "whileStatement", "returnStatement", 
			"singleDefStatement", "varDefStatement", "expressionStatement", "sideEffectExpression", 
			"superConstructor", "variable", "superMethod", "variableStart", "fieldAccess", 
			"invocation", "newObjParams", "newObject", "expUnary", "expMul", "expAdd", 
			"expRel", "expComparation", "expAnd", "expOr", "expr", "literal", "expressionList", 
			"primitiveType", "dataType", "returnType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'else'", "'if'", "'int'", "'return'", "'string'", "'super'", 
			"'this'", "'void'", "'while'", "'new'", "'('", "')'", "'{'", "'}'", "';'", 
			"','", "'.'", "'='", "'>'", "'<'", "'!'", "':'", "'=='", "'<='", "'>='", 
			"'!='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "ELSE", "IF", "INT", "RETURN", "STRING", "SUPER", "THIS", 
			"VOID", "WHILE", "NEW", "LPAR", "RPAR", "LBRACE", "RBRACE", "SEMICOLON", 
			"COMMA", "DOT", "ASSIGN", "GT", "LT", "NOT", "COLON", "EQ", "LE", "GE", 
			"NEQ", "AND", "OR", "ADD", "SUB", "MUL", "DIV", "WHITESPACES", "COMMENT", 
			"LINECOMMENT", "INTEGER_LIT", "STRING_LIT", "IDENTIFIER", "ERROR_TOKEN"
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
	public String getGrammarFileName() { return "VYPAParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VYPAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VYPAParser.EOF, 0); }
		public List<GenericDefContext> genericDef() {
			return getRuleContexts(GenericDefContext.class);
		}
		public GenericDefContext genericDef(int i) {
			return getRuleContext(GenericDefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549755814482L) != 0)) {
				{
				{
				setState(82);
				genericDef();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
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
	public static class GenericDefContext extends ParserRuleContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public VarDefStatementContext varDefStatement() {
			return getRuleContext(VarDefStatementContext.class,0);
		}
		public GenericDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterGenericDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitGenericDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitGenericDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericDefContext genericDef() throws RecognitionException {
		GenericDefContext _localctx = new GenericDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_genericDef);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				funcDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				classDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				varDefStatement();
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
	public static class FuncDefContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(VYPAParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(VYPAParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(VYPAParser.RPAR, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode VOID() { return getToken(VYPAParser.VOID, 0); }
		public ParamDefListContext paramDefList() {
			return getRuleContext(ParamDefListContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			returnType();
			setState(96);
			match(IDENTIFIER);
			setState(97);
			match(LPAR);
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(98);
				match(VOID);
				}
				break;
			case INT:
			case STRING:
			case IDENTIFIER:
				{
				setState(99);
				paramDefList();
				}
				break;
			case RPAR:
				break;
			default:
				break;
			}
			setState(102);
			match(RPAR);
			setState(103);
			codeBlock();
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
	public static class ParamDefListContext extends ParserRuleContext {
		public List<ParamDefContext> paramDef() {
			return getRuleContexts(ParamDefContext.class);
		}
		public ParamDefContext paramDef(int i) {
			return getRuleContext(ParamDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VYPAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VYPAParser.COMMA, i);
		}
		public ParamDefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDefList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterParamDefList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitParamDefList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitParamDefList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamDefListContext paramDefList() throws RecognitionException {
		ParamDefListContext _localctx = new ParamDefListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramDefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			paramDef();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(106);
				match(COMMA);
				setState(107);
				paramDef();
				}
				}
				setState(112);
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
	public static class ParamDefContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(VYPAParser.IDENTIFIER, 0); }
		public ParamDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterParamDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitParamDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitParamDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamDefContext paramDef() throws RecognitionException {
		ParamDefContext _localctx = new ParamDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			dataType();
			setState(114);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(VYPAParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VYPAParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(VYPAParser.LBRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(VYPAParser.RBRACE, 0); }
		public ClassExtendsContext classExtends() {
			return getRuleContext(ClassExtendsContext.class,0);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(CLASS);
			setState(117);
			match(IDENTIFIER);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(118);
				classExtends();
				}
			}

			setState(121);
			match(LBRACE);
			setState(122);
			classBody();
			setState(123);
			match(RBRACE);
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
	public static class ClassExtendsContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(VYPAParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VYPAParser.IDENTIFIER, 0); }
		public ClassExtendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExtends; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterClassExtends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitClassExtends(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitClassExtends(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassExtendsContext classExtends() throws RecognitionException {
		ClassExtendsContext _localctx = new ClassExtendsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classExtends);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(COLON);
			setState(126);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<VarDefStatementContext> varDefStatement() {
			return getRuleContexts(VarDefStatementContext.class);
		}
		public VarDefStatementContext varDefStatement(int i) {
			return getRuleContext(VarDefStatementContext.class,i);
		}
		public List<MethodDefContext> methodDef() {
			return getRuleContexts(MethodDefContext.class);
		}
		public MethodDefContext methodDef(int i) {
			return getRuleContext(MethodDefContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549755814480L) != 0)) {
				{
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(128);
					varDefStatement();
					}
					break;
				case 2:
					{
					setState(129);
					methodDef();
					}
					break;
				}
				}
				setState(134);
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
	public static class MethodDefContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(VYPAParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(VYPAParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(VYPAParser.RPAR, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode VOID() { return getToken(VYPAParser.VOID, 0); }
		public ParamDefListContext paramDefList() {
			return getRuleContext(ParamDefListContext.class,0);
		}
		public MethodDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterMethodDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitMethodDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitMethodDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefContext methodDef() throws RecognitionException {
		MethodDefContext _localctx = new MethodDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			returnType();
			setState(136);
			match(IDENTIFIER);
			setState(137);
			match(LPAR);
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(138);
				match(VOID);
				}
				break;
			case INT:
			case STRING:
			case IDENTIFIER:
				{
				setState(139);
				paramDefList();
				}
				break;
			case RPAR:
				break;
			default:
				break;
			}
			setState(142);
			match(RPAR);
			setState(143);
			codeBlock();
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
	public static class CodeBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(VYPAParser.LBRACE, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(VYPAParser.RBRACE, 0); }
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_codeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(LBRACE);
			setState(146);
			statementList();
			setState(147);
			match(RBRACE);
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
	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549755837944L) != 0)) {
				{
				{
				setState(149);
				statement();
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
	public static class StatementContext extends ParserRuleContext {
		public VarDefStatementContext varDefStatement() {
			return getRuleContext(VarDefStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				varDefStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				codeBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				returnStatement();
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
	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(VYPAParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(VYPAParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(VYPAParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfElseContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfThenContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(VYPAParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(VYPAParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(VYPAParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterIfThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitIfThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitIfThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(IF);
				setState(164);
				match(LPAR);
				setState(165);
				expr();
				setState(166);
				match(RPAR);
				setState(167);
				statement();
				setState(168);
				elseStatement();
				}
				break;
			case 2:
				_localctx = new IfThenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(IF);
				setState(171);
				match(LPAR);
				setState(172);
				expr();
				setState(173);
				match(RPAR);
				setState(174);
				statement();
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
	public static class ElseStatementContext extends ParserRuleContext {
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
	 
		public ElseStatementContext() { }
		public void copyFrom(ElseStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ElseStatementContext {
		public TerminalNode ELSE() { return getToken(VYPAParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseContext(ElseStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elseStatement);
		try {
			_localctx = new ElseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ELSE);
			setState(179);
			statement();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(VYPAParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(VYPAParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(VYPAParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(WHILE);
			setState(182);
			match(LPAR);
			setState(183);
			expr();
			setState(184);
			match(RPAR);
			setState(185);
			statement();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnVoidContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(VYPAParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(VYPAParser.SEMICOLON, 0); }
		public ReturnVoidContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterReturnVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitReturnVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitReturnVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnWithTypeContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(VYPAParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(VYPAParser.SEMICOLON, 0); }
		public ReturnWithTypeContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterReturnWithType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitReturnWithType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitReturnWithType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnStatement);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ReturnWithTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(RETURN);
				setState(188);
				expr();
				setState(189);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new ReturnVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(RETURN);
				setState(192);
				match(SEMICOLON);
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
	public static class SingleDefStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VYPAParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(VYPAParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SingleDefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDefStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterSingleDefStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitSingleDefStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitSingleDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDefStatementContext singleDefStatement() throws RecognitionException {
		SingleDefStatementContext _localctx = new SingleDefStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_singleDefStatement);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(IDENTIFIER);
				setState(197);
				match(ASSIGN);
				setState(198);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDefStatementContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<SingleDefStatementContext> singleDefStatement() {
			return getRuleContexts(SingleDefStatementContext.class);
		}
		public SingleDefStatementContext singleDefStatement(int i) {
			return getRuleContext(SingleDefStatementContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(VYPAParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VYPAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VYPAParser.COMMA, i);
		}
		public VarDefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterVarDefStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitVarDefStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitVarDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefStatementContext varDefStatement() throws RecognitionException {
		VarDefStatementContext _localctx = new VarDefStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_varDefStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			dataType();
			setState(202);
			singleDefStatement();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(203);
				match(COMMA);
				setState(204);
				singleDefStatement();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(SEMICOLON);
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	 
		public ExpressionStatementContext() { }
		public void copyFrom(ExpressionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementDeclareContext extends ExpressionStatementContext {
		public SideEffectExpressionContext sideEffectExpression() {
			return getRuleContext(SideEffectExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(VYPAParser.SEMICOLON, 0); }
		public ExpressionStatementDeclareContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterExpressionStatementDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitExpressionStatementDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitExpressionStatementDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionStatement);
		try {
			_localctx = new ExpressionStatementDeclareContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			sideEffectExpression();
			setState(213);
			match(SEMICOLON);
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
	public static class SideEffectExpressionContext extends ParserRuleContext {
		public SideEffectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sideEffectExpression; }
	 
		public SideEffectExpressionContext() { }
		public void copyFrom(SideEffectExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SideEffectInvokeFunctionContext extends SideEffectExpressionContext {
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public SideEffectInvokeFunctionContext(SideEffectExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterSideEffectInvokeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitSideEffectInvokeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitSideEffectInvokeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SideEffectAssingContext extends SideEffectExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(VYPAParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SideEffectAssingContext(SideEffectExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterSideEffectAssing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitSideEffectAssing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitSideEffectAssing(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SideEffectNoneContext extends SideEffectExpressionContext {
		public SuperConstructorContext superConstructor() {
			return getRuleContext(SuperConstructorContext.class,0);
		}
		public NewObjectContext newObject() {
			return getRuleContext(NewObjectContext.class,0);
		}
		public SideEffectNoneContext(SideEffectExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterSideEffectNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitSideEffectNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitSideEffectNone(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SideEffectInvokeMethodContext extends SideEffectExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(VYPAParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VYPAParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(VYPAParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(VYPAParser.RPAR, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SideEffectInvokeMethodContext(SideEffectExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterSideEffectInvokeMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitSideEffectInvokeMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitSideEffectInvokeMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SideEffectExpressionContext sideEffectExpression() throws RecognitionException {
		SideEffectExpressionContext _localctx = new SideEffectExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sideEffectExpression);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new SideEffectAssingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				variable();
				setState(216);
				match(ASSIGN);
				setState(217);
				expr();
				}
				break;
			case 2:
				_localctx = new SideEffectInvokeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				invocation();
				}
				break;
			case 3:
				_localctx = new SideEffectInvokeMethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				variable();
				setState(221);
				match(DOT);
				setState(222);
				match(IDENTIFIER);
				setState(223);
				match(LPAR);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 962076875136L) != 0)) {
					{
					setState(224);
					expressionList();
					}
				}

				setState(227);
				match(RPAR);
				}
				break;
			case 4:
				_localctx = new SideEffectNoneContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				superConstructor();
				}
				break;
			case 5:
				_localctx = new SideEffectNoneContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				newObject();
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
	public static class SuperConstructorContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(VYPAParser.SUPER, 0); }
		public TerminalNode LPAR() { return getToken(VYPAParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(VYPAParser.RPAR, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SuperConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterSuperConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitSuperConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitSuperConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperConstructorContext superConstructor() throws RecognitionException {
		SuperConstructorContext _localctx = new SuperConstructorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_superConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(SUPER);
			setState(234);
			match(LPAR);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 962076875136L) != 0)) {
				{
				setState(235);
				expressionList();
				}
			}

			setState(238);
			match(RPAR);
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
	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarNoneContext extends VariableContext {
		public SuperMethodContext superMethod() {
			return getRuleContext(SuperMethodContext.class,0);
		}
		public VarNoneContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterVarNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitVarNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitVarNone(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarMultipleAccessContext extends VariableContext {
		public VariableStartContext variableStart() {
			return getRuleContext(VariableStartContext.class,0);
		}
		public List<FieldAccessContext> fieldAccess() {
			return getRuleContexts(FieldAccessContext.class);
		}
		public FieldAccessContext fieldAccess(int i) {
			return getRuleContext(FieldAccessContext.class,i);
		}
		public VarMultipleAccessContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterVarMultipleAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitVarMultipleAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitVarMultipleAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable);
		try {
			int _alt;
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				_localctx = new VarNoneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				superMethod();
				}
				break;
			case THIS:
			case NEW:
			case LPAR:
			case IDENTIFIER:
				_localctx = new VarMultipleAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				variableStart();
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(242);
						fieldAccess();
						}
						} 
					}
					setState(247);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SuperMethodContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(VYPAParser.SUPER, 0); }
		public TerminalNode DOT() { return getToken(VYPAParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VYPAParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(VYPAParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(VYPAParser.RPAR, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SuperMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterSuperMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitSuperMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitSuperMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperMethodContext superMethod() throws RecognitionException {
		SuperMethodContext _localctx = new SuperMethodContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_superMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(SUPER);
			setState(251);
			match(DOT);
			setState(252);
			match(IDENTIFIER);
			setState(253);
			match(LPAR);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 962076875136L) != 0)) {
				{
				setState(254);
				expressionList();
				}
			}

			setState(257);
			match(RPAR);
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
	public static class VariableStartContext extends ParserRuleContext {
		public VariableStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStart; }
	 
		public VariableStartContext() { }
		public void copyFrom(VariableStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableParContext extends VariableStartContext {
		public TerminalNode LPAR() { return getToken(VYPAParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(VYPAParser.RPAR, 0); }
		public VariableParContext(VariableStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterVariablePar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitVariablePar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitVariablePar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends VariableStartContext {
		public TerminalNode IDENTIFIER() { return getToken(VYPAParser.IDENTIFIER, 0); }
		public IdentifierContext(VariableStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableThisContext extends VariableStartContext {
		public TerminalNode THIS() { return getToken(VYPAParser.THIS, 0); }
		public VariableThisContext(VariableStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterVariableThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitVariableThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitVariableThis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableNoneContext extends VariableStartContext {
		public NewObjectContext newObject() {
			return getRuleContext(NewObjectContext.class,0);
		}
		public VariableNoneContext(VariableStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterVariableNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitVariableNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitVariableNone(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableInvokeFunctionContext extends VariableStartContext {
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public VariableInvokeFunctionContext(VariableStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterVariableInvokeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitVariableInvokeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitVariableInvokeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStartContext variableStart() throws RecognitionException {
		VariableStartContext _localctx = new VariableStartContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableStart);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new VariableThisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(THIS);
				}
				break;
			case 2:
				_localctx = new VariableParContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(LPAR);
				setState(261);
				expr();
				setState(262);
				match(RPAR);
				}
				break;
			case 3:
				_localctx = new VariableNoneContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				newObject();
				}
				break;
			case 4:
				_localctx = new VariableInvokeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				invocation();
				}
				break;
			case 5:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				match(IDENTIFIER);
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
	public static class FieldAccessContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(VYPAParser.DOT, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(VYPAParser.IDENTIFIER, 0); }
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fieldAccess);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(DOT);
				setState(270);
				invocation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(DOT);
				setState(272);
				match(IDENTIFIER);
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
	public static class InvocationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VYPAParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(VYPAParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(VYPAParser.RPAR, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(IDENTIFIER);
			setState(276);
			match(LPAR);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 962076875136L) != 0)) {
				{
				setState(277);
				expressionList();
				}
			}

			setState(280);
			match(RPAR);
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
	public static class NewObjParamsContext extends ParserRuleContext {
		public NewObjParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newObjParams; }
	 
		public NewObjParamsContext() { }
		public void copyFrom(NewObjParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjParamsEmptyContext extends NewObjParamsContext {
		public TerminalNode LPAR() { return getToken(VYPAParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(VYPAParser.RPAR, 0); }
		public ObjParamsEmptyContext(NewObjParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterObjParamsEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitObjParamsEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitObjParamsEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjParamsContext extends NewObjParamsContext {
		public TerminalNode LPAR() { return getToken(VYPAParser.LPAR, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(VYPAParser.RPAR, 0); }
		public ObjParamsContext(NewObjParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterObjParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitObjParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitObjParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewObjParamsContext newObjParams() throws RecognitionException {
		NewObjParamsContext _localctx = new NewObjParamsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_newObjParams);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new ObjParamsEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(LPAR);
				setState(283);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new ObjParamsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(LPAR);
				setState(285);
				expressionList();
				setState(286);
				match(RPAR);
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
	public static class NewObjectContext extends ParserRuleContext {
		public NewObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newObject; }
	 
		public NewObjectContext() { }
		public void copyFrom(NewObjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewObjContext extends NewObjectContext {
		public TerminalNode NEW() { return getToken(VYPAParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VYPAParser.IDENTIFIER, 0); }
		public NewObjParamsContext newObjParams() {
			return getRuleContext(NewObjParamsContext.class,0);
		}
		public NewObjContext(NewObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterNewObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitNewObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitNewObj(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewObjnoParamsContext extends NewObjectContext {
		public TerminalNode NEW() { return getToken(VYPAParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VYPAParser.IDENTIFIER, 0); }
		public NewObjnoParamsContext(NewObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterNewObjnoParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitNewObjnoParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitNewObjnoParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewObjectContext newObject() throws RecognitionException {
		NewObjectContext _localctx = new NewObjectContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_newObject);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new NewObjContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(NEW);
				setState(291);
				match(IDENTIFIER);
				setState(292);
				newObjParams();
				}
				break;
			case 2:
				_localctx = new NewObjnoParamsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(NEW);
				setState(294);
				match(IDENTIFIER);
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
	public static class ExpUnaryContext extends ParserRuleContext {
		public ExpUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expUnary; }
	 
		public ExpUnaryContext() { }
		public void copyFrom(ExpUnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastContext extends ExpUnaryContext {
		public TerminalNode LPAR() { return getToken(VYPAParser.LPAR, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(VYPAParser.RPAR, 0); }
		public ExpUnaryContext expUnary() {
			return getRuleContext(ExpUnaryContext.class,0);
		}
		public CastContext(ExpUnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExpUnaryContext {
		public TerminalNode NOT() { return getToken(VYPAParser.NOT, 0); }
		public ExpUnaryContext expUnary() {
			return getRuleContext(ExpUnaryContext.class,0);
		}
		public NotContext(ExpUnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaNoneContext extends ExpUnaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public UnaNoneContext(ExpUnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterUnaNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitUnaNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitUnaNone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpUnaryContext expUnary() throws RecognitionException {
		ExpUnaryContext _localctx = new ExpUnaryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expUnary);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(NOT);
				setState(298);
				expUnary();
				}
				break;
			case 2:
				_localctx = new CastContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(LPAR);
				setState(300);
				dataType();
				setState(301);
				match(RPAR);
				setState(302);
				expUnary();
				}
				break;
			case 3:
				_localctx = new UnaNoneContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				literal();
				}
				break;
			case 4:
				_localctx = new UnaNoneContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				variable();
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
	public static class ExpMulContext extends ParserRuleContext {
		public ExpMulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expMul; }
	 
		public ExpMulContext() { }
		public void copyFrom(ExpMulContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends ExpMulContext {
		public Token op;
		public ExpMulContext expMul() {
			return getRuleContext(ExpMulContext.class,0);
		}
		public ExpUnaryContext expUnary() {
			return getRuleContext(ExpUnaryContext.class,0);
		}
		public TerminalNode MUL() { return getToken(VYPAParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(VYPAParser.DIV, 0); }
		public MultContext(ExpMulContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultNoneContext extends ExpMulContext {
		public ExpUnaryContext expUnary() {
			return getRuleContext(ExpUnaryContext.class,0);
		}
		public MultNoneContext(ExpMulContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterMultNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitMultNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitMultNone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpMulContext expMul() throws RecognitionException {
		return expMul(0);
	}

	private ExpMulContext expMul(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpMulContext _localctx = new ExpMulContext(_ctx, _parentState);
		ExpMulContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expMul, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MultNoneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(309);
			expUnary();
			}
			_ctx.stop = _input.LT(-1);
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultContext(new ExpMulContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expMul);
					setState(311);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(312);
					((MultContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==MUL || _la==DIV) ) {
						((MultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(313);
					expUnary();
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
	public static class ExpAddContext extends ParserRuleContext {
		public ExpAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAdd; }
	 
		public ExpAddContext() { }
		public void copyFrom(ExpAddContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends ExpAddContext {
		public Token op;
		public ExpAddContext expAdd() {
			return getRuleContext(ExpAddContext.class,0);
		}
		public ExpMulContext expMul() {
			return getRuleContext(ExpMulContext.class,0);
		}
		public TerminalNode ADD() { return getToken(VYPAParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(VYPAParser.SUB, 0); }
		public AddContext(ExpAddContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddNoneContext extends ExpAddContext {
		public ExpMulContext expMul() {
			return getRuleContext(ExpMulContext.class,0);
		}
		public AddNoneContext(ExpAddContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterAddNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitAddNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitAddNone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpAddContext expAdd() throws RecognitionException {
		return expAdd(0);
	}

	private ExpAddContext expAdd(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpAddContext _localctx = new ExpAddContext(_ctx, _parentState);
		ExpAddContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expAdd, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AddNoneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(320);
			expMul(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddContext(new ExpAddContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expAdd);
					setState(322);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(323);
					((AddContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
						((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(324);
					expMul(0);
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
	public static class ExpRelContext extends ParserRuleContext {
		public ExpRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expRel; }
	 
		public ExpRelContext() { }
		public void copyFrom(ExpRelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelContext extends ExpRelContext {
		public Token op;
		public List<ExpAddContext> expAdd() {
			return getRuleContexts(ExpAddContext.class);
		}
		public ExpAddContext expAdd(int i) {
			return getRuleContext(ExpAddContext.class,i);
		}
		public TerminalNode GT() { return getToken(VYPAParser.GT, 0); }
		public TerminalNode LT() { return getToken(VYPAParser.LT, 0); }
		public TerminalNode LE() { return getToken(VYPAParser.LE, 0); }
		public TerminalNode GE() { return getToken(VYPAParser.GE, 0); }
		public RelContext(ExpRelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitRel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelNoneContext extends ExpRelContext {
		public ExpAddContext expAdd() {
			return getRuleContext(ExpAddContext.class,0);
		}
		public RelNoneContext(ExpRelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterRelNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitRelNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitRelNone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpRelContext expRel() throws RecognitionException {
		ExpRelContext _localctx = new ExpRelContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expRel);
		int _la;
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new RelNoneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				expAdd(0);
				}
				break;
			case 2:
				_localctx = new RelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				expAdd(0);
				setState(332);
				((RelContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 103809024L) != 0)) ) {
					((RelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(333);
				expAdd(0);
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
	public static class ExpComparationContext extends ParserRuleContext {
		public ExpComparationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expComparation; }
	 
		public ExpComparationContext() { }
		public void copyFrom(ExpComparationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareContext extends ExpComparationContext {
		public Token op;
		public ExpComparationContext expComparation() {
			return getRuleContext(ExpComparationContext.class,0);
		}
		public ExpRelContext expRel() {
			return getRuleContext(ExpRelContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VYPAParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(VYPAParser.NEQ, 0); }
		public CompareContext(ExpComparationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareNoneContext extends ExpComparationContext {
		public ExpRelContext expRel() {
			return getRuleContext(ExpRelContext.class,0);
		}
		public CompareNoneContext(ExpComparationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterCompareNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitCompareNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitCompareNone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpComparationContext expComparation() throws RecognitionException {
		return expComparation(0);
	}

	private ExpComparationContext expComparation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpComparationContext _localctx = new ExpComparationContext(_ctx, _parentState);
		ExpComparationContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expComparation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CompareNoneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(338);
			expRel();
			}
			_ctx.stop = _input.LT(-1);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompareContext(new ExpComparationContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expComparation);
					setState(340);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(341);
					((CompareContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EQ || _la==NEQ) ) {
						((CompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(342);
					expRel();
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
	public static class ExpAndContext extends ParserRuleContext {
		public ExpAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAnd; }
	 
		public ExpAndContext() { }
		public void copyFrom(ExpAndContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ExpAndContext {
		public ExpAndContext expAnd() {
			return getRuleContext(ExpAndContext.class,0);
		}
		public TerminalNode AND() { return getToken(VYPAParser.AND, 0); }
		public ExpComparationContext expComparation() {
			return getRuleContext(ExpComparationContext.class,0);
		}
		public AndContext(ExpAndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndNoneContext extends ExpAndContext {
		public ExpComparationContext expComparation() {
			return getRuleContext(ExpComparationContext.class,0);
		}
		public AndNoneContext(ExpAndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterAndNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitAndNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitAndNone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpAndContext expAnd() throws RecognitionException {
		return expAnd(0);
	}

	private ExpAndContext expAnd(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpAndContext _localctx = new ExpAndContext(_ctx, _parentState);
		ExpAndContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expAnd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndNoneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(349);
			expComparation(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndContext(new ExpAndContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expAnd);
					setState(351);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(352);
					match(AND);
					setState(353);
					expComparation(0);
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
	public static class ExpOrContext extends ParserRuleContext {
		public ExpOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expOr; }
	 
		public ExpOrContext() { }
		public void copyFrom(ExpOrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrNoneContext extends ExpOrContext {
		public ExpAndContext expAnd() {
			return getRuleContext(ExpAndContext.class,0);
		}
		public OrNoneContext(ExpOrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterOrNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitOrNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitOrNone(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends ExpOrContext {
		public ExpOrContext expOr() {
			return getRuleContext(ExpOrContext.class,0);
		}
		public TerminalNode OR() { return getToken(VYPAParser.OR, 0); }
		public ExpAndContext expAnd() {
			return getRuleContext(ExpAndContext.class,0);
		}
		public OrContext(ExpOrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpOrContext expOr() throws RecognitionException {
		return expOr(0);
	}

	private ExpOrContext expOr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpOrContext _localctx = new ExpOrContext(_ctx, _parentState);
		ExpOrContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expOr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OrNoneContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(360);
			expAnd(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrContext(new ExpOrContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expOr);
					setState(362);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(363);
					match(OR);
					setState(364);
					expAnd(0);
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
	public static class ExprContext extends ParserRuleContext {
		public ExpOrContext expOr() {
			return getRuleContext(ExpOrContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			expOr(0);
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
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends LiteralContext {
		public Token type;
		public TerminalNode STRING_LIT() { return getToken(VYPAParser.STRING_LIT, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends LiteralContext {
		public Token type;
		public TerminalNode INTEGER_LIT() { return getToken(VYPAParser.INTEGER_LIT, 0); }
		public IntLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_literal);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LIT:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				((IntLiteralContext)_localctx).type = match(INTEGER_LIT);
				}
				break;
			case STRING_LIT:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				((StringLiteralContext)_localctx).type = match(STRING_LIT);
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
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VYPAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VYPAParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			expr();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(377);
				match(COMMA);
				setState(378);
				expr();
				}
				}
				setState(383);
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
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(VYPAParser.INT, 0); }
		public TerminalNode STRING() { return getToken(VYPAParser.STRING, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==STRING) ) {
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
	public static class DataTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(VYPAParser.IDENTIFIER, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dataType);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(IDENTIFIER);
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
	public static class ReturnTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(VYPAParser.VOID, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPAParserListener ) ((VYPAParserListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPAParserVisitor ) return ((VYPAParserVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_returnType);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				dataType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(VOID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return expMul_sempred((ExpMulContext)_localctx, predIndex);
		case 30:
			return expAdd_sempred((ExpAddContext)_localctx, predIndex);
		case 32:
			return expComparation_sempred((ExpComparationContext)_localctx, predIndex);
		case 33:
			return expAnd_sempred((ExpAndContext)_localctx, predIndex);
		case 34:
			return expOr_sempred((ExpOrContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expMul_sempred(ExpMulContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expAdd_sempred(ExpAddContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expComparation_sempred(ExpComparationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expAnd_sempred(ExpAndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expOr_sempred(ExpOrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u018b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0001\u0000\u0005\u0000T\b\u0000\n\u0000\f\u0000W\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001^\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002e\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003m\b\u0003\n\u0003\f\u0003p\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005x\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007\u0083"+
		"\b\u0007\n\u0007\f\u0007\u0086\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u008d\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0005\n\u0097\b\n\n\n\f\n\u009a\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a2"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b1\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00c2\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00c8\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00ce\b\u0011\n\u0011\f\u0011\u00d1\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00e2\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00e8\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00ed\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00f4\b\u0015\n\u0015\f\u0015"+
		"\u00f7\t\u0015\u0003\u0015\u00f9\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0100\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u010c\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0112\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0117\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0121\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0128\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u0133\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u013b\b\u001d\n\u001d\f\u001d\u013e\t\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u0146\b\u001e\n\u001e\f\u001e\u0149\t\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0150\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0158\b \n \f \u015b\t \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0163\b!\n!\f!\u0166\t!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u016e\b\"\n\"\f\"\u0171"+
		"\t\"\u0001#\u0001#\u0001$\u0001$\u0003$\u0177\b$\u0001%\u0001%\u0001%"+
		"\u0005%\u017c\b%\n%\f%\u017f\t%\u0001&\u0001&\u0001\'\u0001\'\u0003\'"+
		"\u0185\b\'\u0001(\u0001(\u0003(\u0189\b(\u0001(\u0000\u0005:<@BD)\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNP\u0000\u0005\u0001\u0000 !\u0001\u0000"+
		"\u001e\u001f\u0002\u0000\u0014\u0015\u0019\u001a\u0002\u0000\u0018\u0018"+
		"\u001b\u001b\u0002\u0000\u0004\u0004\u0006\u0006\u0194\u0000U\u0001\u0000"+
		"\u0000\u0000\u0002]\u0001\u0000\u0000\u0000\u0004_\u0001\u0000\u0000\u0000"+
		"\u0006i\u0001\u0000\u0000\u0000\bq\u0001\u0000\u0000\u0000\nt\u0001\u0000"+
		"\u0000\u0000\f}\u0001\u0000\u0000\u0000\u000e\u0084\u0001\u0000\u0000"+
		"\u0000\u0010\u0087\u0001\u0000\u0000\u0000\u0012\u0091\u0001\u0000\u0000"+
		"\u0000\u0014\u0098\u0001\u0000\u0000\u0000\u0016\u00a1\u0001\u0000\u0000"+
		"\u0000\u0018\u00b0\u0001\u0000\u0000\u0000\u001a\u00b2\u0001\u0000\u0000"+
		"\u0000\u001c\u00b5\u0001\u0000\u0000\u0000\u001e\u00c1\u0001\u0000\u0000"+
		"\u0000 \u00c7\u0001\u0000\u0000\u0000\"\u00c9\u0001\u0000\u0000\u0000"+
		"$\u00d4\u0001\u0000\u0000\u0000&\u00e7\u0001\u0000\u0000\u0000(\u00e9"+
		"\u0001\u0000\u0000\u0000*\u00f8\u0001\u0000\u0000\u0000,\u00fa\u0001\u0000"+
		"\u0000\u0000.\u010b\u0001\u0000\u0000\u00000\u0111\u0001\u0000\u0000\u0000"+
		"2\u0113\u0001\u0000\u0000\u00004\u0120\u0001\u0000\u0000\u00006\u0127"+
		"\u0001\u0000\u0000\u00008\u0132\u0001\u0000\u0000\u0000:\u0134\u0001\u0000"+
		"\u0000\u0000<\u013f\u0001\u0000\u0000\u0000>\u014f\u0001\u0000\u0000\u0000"+
		"@\u0151\u0001\u0000\u0000\u0000B\u015c\u0001\u0000\u0000\u0000D\u0167"+
		"\u0001\u0000\u0000\u0000F\u0172\u0001\u0000\u0000\u0000H\u0176\u0001\u0000"+
		"\u0000\u0000J\u0178\u0001\u0000\u0000\u0000L\u0180\u0001\u0000\u0000\u0000"+
		"N\u0184\u0001\u0000\u0000\u0000P\u0188\u0001\u0000\u0000\u0000RT\u0003"+
		"\u0002\u0001\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000XY\u0005\u0000\u0000\u0001Y\u0001\u0001"+
		"\u0000\u0000\u0000Z^\u0003\u0004\u0002\u0000[^\u0003\n\u0005\u0000\\^"+
		"\u0003\"\u0011\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"]\\\u0001\u0000\u0000\u0000^\u0003\u0001\u0000\u0000\u0000_`\u0003P(\u0000"+
		"`a\u0005\'\u0000\u0000ad\u0005\f\u0000\u0000be\u0005\t\u0000\u0000ce\u0003"+
		"\u0006\u0003\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005\r\u0000\u0000"+
		"gh\u0003\u0012\t\u0000h\u0005\u0001\u0000\u0000\u0000in\u0003\b\u0004"+
		"\u0000jk\u0005\u0011\u0000\u0000km\u0003\b\u0004\u0000lj\u0001\u0000\u0000"+
		"\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000o\u0007\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qr\u0003N\'\u0000rs\u0005\'\u0000\u0000s\t\u0001\u0000\u0000\u0000tu\u0005"+
		"\u0001\u0000\u0000uw\u0005\'\u0000\u0000vx\u0003\f\u0006\u0000wv\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yz\u0005\u000e\u0000\u0000z{\u0003\u000e\u0007\u0000{|\u0005\u000f\u0000"+
		"\u0000|\u000b\u0001\u0000\u0000\u0000}~\u0005\u0017\u0000\u0000~\u007f"+
		"\u0005\'\u0000\u0000\u007f\r\u0001\u0000\u0000\u0000\u0080\u0083\u0003"+
		"\"\u0011\u0000\u0081\u0083\u0003\u0010\b\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u000f\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0003P(\u0000\u0088\u0089\u0005\'\u0000\u0000"+
		"\u0089\u008c\u0005\f\u0000\u0000\u008a\u008d\u0005\t\u0000\u0000\u008b"+
		"\u008d\u0003\u0006\u0003\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0005\r\u0000\u0000\u008f\u0090"+
		"\u0003\u0012\t\u0000\u0090\u0011\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"\u000e\u0000\u0000\u0092\u0093\u0003\u0014\n\u0000\u0093\u0094\u0005\u000f"+
		"\u0000\u0000\u0094\u0013\u0001\u0000\u0000\u0000\u0095\u0097\u0003\u0016"+
		"\u000b\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u0015\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009b\u00a2\u0003\"\u0011\u0000\u009c\u00a2\u0003$\u0012"+
		"\u0000\u009d\u00a2\u0003\u0012\t\u0000\u009e\u00a2\u0003\u0018\f\u0000"+
		"\u009f\u00a2\u0003\u001c\u000e\u0000\u00a0\u00a2\u0003\u001e\u000f\u0000"+
		"\u00a1\u009b\u0001\u0000\u0000\u0000\u00a1\u009c\u0001\u0000\u0000\u0000"+
		"\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1\u009e\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u0017\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0003\u0000\u0000"+
		"\u00a4\u00a5\u0005\f\u0000\u0000\u00a5\u00a6\u0003F#\u0000\u00a6\u00a7"+
		"\u0005\r\u0000\u0000\u00a7\u00a8\u0003\u0016\u000b\u0000\u00a8\u00a9\u0003"+
		"\u001a\r\u0000\u00a9\u00b1\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0003"+
		"\u0000\u0000\u00ab\u00ac\u0005\f\u0000\u0000\u00ac\u00ad\u0003F#\u0000"+
		"\u00ad\u00ae\u0005\r\u0000\u0000\u00ae\u00af\u0003\u0016\u000b\u0000\u00af"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b0\u00a3\u0001\u0000\u0000\u0000\u00b0"+
		"\u00aa\u0001\u0000\u0000\u0000\u00b1\u0019\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0005\u0002\u0000\u0000\u00b3\u00b4\u0003\u0016\u000b\u0000\u00b4"+
		"\u001b\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\n\u0000\u0000\u00b6\u00b7"+
		"\u0005\f\u0000\u0000\u00b7\u00b8\u0003F#\u0000\u00b8\u00b9\u0005\r\u0000"+
		"\u0000\u00b9\u00ba\u0003\u0016\u000b\u0000\u00ba\u001d\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0005\u0005\u0000\u0000\u00bc\u00bd\u0003F#\u0000\u00bd"+
		"\u00be\u0005\u0010\u0000\u0000\u00be\u00c2\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0005\u0005\u0000\u0000\u00c0\u00c2\u0005\u0010\u0000\u0000\u00c1"+
		"\u00bb\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2"+
		"\u001f\u0001\u0000\u0000\u0000\u00c3\u00c8\u0005\'\u0000\u0000\u00c4\u00c5"+
		"\u0005\'\u0000\u0000\u00c5\u00c6\u0005\u0013\u0000\u0000\u00c6\u00c8\u0003"+
		"F#\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000\u00c7\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c8!\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003N\'\u0000\u00ca"+
		"\u00cf\u0003 \u0010\u0000\u00cb\u00cc\u0005\u0011\u0000\u0000\u00cc\u00ce"+
		"\u0003 \u0010\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005\u0010\u0000\u0000\u00d3#\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0003&\u0013\u0000\u00d5\u00d6\u0005\u0010\u0000"+
		"\u0000\u00d6%\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003*\u0015\u0000\u00d8"+
		"\u00d9\u0005\u0013\u0000\u0000\u00d9\u00da\u0003F#\u0000\u00da\u00e8\u0001"+
		"\u0000\u0000\u0000\u00db\u00e8\u00032\u0019\u0000\u00dc\u00dd\u0003*\u0015"+
		"\u0000\u00dd\u00de\u0005\u0012\u0000\u0000\u00de\u00df\u0005\'\u0000\u0000"+
		"\u00df\u00e1\u0005\f\u0000\u0000\u00e0\u00e2\u0003J%\u0000\u00e1\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\r\u0000\u0000\u00e4\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e8\u0003(\u0014\u0000\u00e6\u00e8\u00036\u001b"+
		"\u0000\u00e7\u00d7\u0001\u0000\u0000\u0000\u00e7\u00db\u0001\u0000\u0000"+
		"\u0000\u00e7\u00dc\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\'\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0005\u0007\u0000\u0000\u00ea\u00ec\u0005\f\u0000\u0000\u00eb"+
		"\u00ed\u0003J%\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005"+
		"\r\u0000\u0000\u00ef)\u0001\u0000\u0000\u0000\u00f0\u00f9\u0003,\u0016"+
		"\u0000\u00f1\u00f5\u0003.\u0017\u0000\u00f2\u00f4\u00030\u0018\u0000\u00f3"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f8\u00f1\u0001\u0000\u0000\u0000\u00f9"+
		"+\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u0007\u0000\u0000\u00fb\u00fc"+
		"\u0005\u0012\u0000\u0000\u00fc\u00fd\u0005\'\u0000\u0000\u00fd\u00ff\u0005"+
		"\f\u0000\u0000\u00fe\u0100\u0003J%\u0000\u00ff\u00fe\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0005\r\u0000\u0000\u0102-\u0001\u0000\u0000\u0000"+
		"\u0103\u010c\u0005\b\u0000\u0000\u0104\u0105\u0005\f\u0000\u0000\u0105"+
		"\u0106\u0003F#\u0000\u0106\u0107\u0005\r\u0000\u0000\u0107\u010c\u0001"+
		"\u0000\u0000\u0000\u0108\u010c\u00036\u001b\u0000\u0109\u010c\u00032\u0019"+
		"\u0000\u010a\u010c\u0005\'\u0000\u0000\u010b\u0103\u0001\u0000\u0000\u0000"+
		"\u010b\u0104\u0001\u0000\u0000\u0000\u010b\u0108\u0001\u0000\u0000\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000"+
		"\u010c/\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0012\u0000\u0000\u010e"+
		"\u0112\u00032\u0019\u0000\u010f\u0110\u0005\u0012\u0000\u0000\u0110\u0112"+
		"\u0005\'\u0000\u0000\u0111\u010d\u0001\u0000\u0000\u0000\u0111\u010f\u0001"+
		"\u0000\u0000\u0000\u01121\u0001\u0000\u0000\u0000\u0113\u0114\u0005\'"+
		"\u0000\u0000\u0114\u0116\u0005\f\u0000\u0000\u0115\u0117\u0003J%\u0000"+
		"\u0116\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0005\r\u0000\u0000\u0119"+
		"3\u0001\u0000\u0000\u0000\u011a\u011b\u0005\f\u0000\u0000\u011b\u0121"+
		"\u0005\r\u0000\u0000\u011c\u011d\u0005\f\u0000\u0000\u011d\u011e\u0003"+
		"J%\u0000\u011e\u011f\u0005\r\u0000\u0000\u011f\u0121\u0001\u0000\u0000"+
		"\u0000\u0120\u011a\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000\u0000"+
		"\u0000\u01215\u0001\u0000\u0000\u0000\u0122\u0123\u0005\u000b\u0000\u0000"+
		"\u0123\u0124\u0005\'\u0000\u0000\u0124\u0128\u00034\u001a\u0000\u0125"+
		"\u0126\u0005\u000b\u0000\u0000\u0126\u0128\u0005\'\u0000\u0000\u0127\u0122"+
		"\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u01287\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0005\u0016\u0000\u0000\u012a\u0133\u0003"+
		"8\u001c\u0000\u012b\u012c\u0005\f\u0000\u0000\u012c\u012d\u0003N\'\u0000"+
		"\u012d\u012e\u0005\r\u0000\u0000\u012e\u012f\u00038\u001c\u0000\u012f"+
		"\u0133\u0001\u0000\u0000\u0000\u0130\u0133\u0003H$\u0000\u0131\u0133\u0003"+
		"*\u0015\u0000\u0132\u0129\u0001\u0000\u0000\u0000\u0132\u012b\u0001\u0000"+
		"\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0131\u0001\u0000"+
		"\u0000\u0000\u01339\u0001\u0000\u0000\u0000\u0134\u0135\u0006\u001d\uffff"+
		"\uffff\u0000\u0135\u0136\u00038\u001c\u0000\u0136\u013c\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\n\u0001\u0000\u0000\u0138\u0139\u0007\u0000\u0000\u0000"+
		"\u0139\u013b\u00038\u001c\u0000\u013a\u0137\u0001\u0000\u0000\u0000\u013b"+
		"\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0001\u0000\u0000\u0000\u013d;\u0001\u0000\u0000\u0000\u013e\u013c"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0006\u001e\uffff\uffff\u0000\u0140"+
		"\u0141\u0003:\u001d\u0000\u0141\u0147\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\n\u0001\u0000\u0000\u0143\u0144\u0007\u0001\u0000\u0000\u0144\u0146\u0003"+
		":\u001d\u0000\u0145\u0142\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000"+
		"\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000"+
		"\u0000\u0000\u0148=\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000"+
		"\u0000\u014a\u0150\u0003<\u001e\u0000\u014b\u014c\u0003<\u001e\u0000\u014c"+
		"\u014d\u0007\u0002\u0000\u0000\u014d\u014e\u0003<\u001e\u0000\u014e\u0150"+
		"\u0001\u0000\u0000\u0000\u014f\u014a\u0001\u0000\u0000\u0000\u014f\u014b"+
		"\u0001\u0000\u0000\u0000\u0150?\u0001\u0000\u0000\u0000\u0151\u0152\u0006"+
		" \uffff\uffff\u0000\u0152\u0153\u0003>\u001f\u0000\u0153\u0159\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\n\u0001\u0000\u0000\u0155\u0156\u0007\u0003\u0000"+
		"\u0000\u0156\u0158\u0003>\u001f\u0000\u0157\u0154\u0001\u0000\u0000\u0000"+
		"\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0001\u0000\u0000\u0000\u015aA\u0001\u0000\u0000\u0000\u015b"+
		"\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0006!\uffff\uffff\u0000\u015d"+
		"\u015e\u0003@ \u0000\u015e\u0164\u0001\u0000\u0000\u0000\u015f\u0160\n"+
		"\u0001\u0000\u0000\u0160\u0161\u0005\u001c\u0000\u0000\u0161\u0163\u0003"+
		"@ \u0000\u0162\u015f\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000"+
		"\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000"+
		"\u0000\u0165C\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0006\"\uffff\uffff\u0000\u0168\u0169\u0003B!\u0000\u0169"+
		"\u016f\u0001\u0000\u0000\u0000\u016a\u016b\n\u0001\u0000\u0000\u016b\u016c"+
		"\u0005\u001d\u0000\u0000\u016c\u016e\u0003B!\u0000\u016d\u016a\u0001\u0000"+
		"\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170E\u0001\u0000\u0000"+
		"\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0173\u0003D\"\u0000"+
		"\u0173G\u0001\u0000\u0000\u0000\u0174\u0177\u0005%\u0000\u0000\u0175\u0177"+
		"\u0005&\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0175\u0001"+
		"\u0000\u0000\u0000\u0177I\u0001\u0000\u0000\u0000\u0178\u017d\u0003F#"+
		"\u0000\u0179\u017a\u0005\u0011\u0000\u0000\u017a\u017c\u0003F#\u0000\u017b"+
		"\u0179\u0001\u0000\u0000\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d"+
		"\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e"+
		"K\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0007\u0004\u0000\u0000\u0181M\u0001\u0000\u0000\u0000\u0182\u0185\u0003"+
		"L&\u0000\u0183\u0185\u0005\'\u0000\u0000\u0184\u0182\u0001\u0000\u0000"+
		"\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185O\u0001\u0000\u0000\u0000"+
		"\u0186\u0189\u0003N\'\u0000\u0187\u0189\u0005\t\u0000\u0000\u0188\u0186"+
		"\u0001\u0000\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0189Q\u0001"+
		"\u0000\u0000\u0000$U]dnw\u0082\u0084\u008c\u0098\u00a1\u00b0\u00c1\u00c7"+
		"\u00cf\u00e1\u00e7\u00ec\u00f5\u00f8\u00ff\u010b\u0111\u0116\u0120\u0127"+
		"\u0132\u013c\u0147\u014f\u0159\u0164\u016f\u0176\u017d\u0184\u0188";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}