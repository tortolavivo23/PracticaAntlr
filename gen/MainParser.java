// Generated from R:/Documents/IdeaProjects/PracticaAntlr/src\Main.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MainParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LSS=1, GRT=2, EQL=3, LSSQ=4, GRTQ=5, IF=6, THEN=7, ELSE=8, WHILE=9, DO=10, 
		REPEAT=11, FOR=12, ASIG=13, TO=14, DOWNTO=15, SEMICOLON=16, OR=17, AND=18, 
		OPEN_PAR=19, CLOSE_PAR=20, TRUE=21, FALSE=22, NUMERIC_INTEGER_CONST=23, 
		NUMERIC_REAL_CONST=24, STRING_CONST=25, COMMENT_LINE=26, COMMENT_BLOCK=27, 
		IDENTIFIER=28, IGNORE=29, LETTER=30, DIG=31, INT=32, NOT=33;
	public static final int
		RULE_r = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"r"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'='", "'<='", "'>='", "'IF'", "'THEN'", "'ELSE'", 
			"'WHILE'", "'DO'", "'REPEAT'", "'FOR'", "':='", "'TO'", "'DOWNTO'", "';'", 
			"'OR'", "'AND'", "'('", "')'", "'TRUE'", "'FALSE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LSS", "GRT", "EQL", "LSSQ", "GRTQ", "IF", "THEN", "ELSE", "WHILE", 
			"DO", "REPEAT", "FOR", "ASIG", "TO", "DOWNTO", "SEMICOLON", "OR", "AND", 
			"OPEN_PAR", "CLOSE_PAR", "TRUE", "FALSE", "NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", 
			"STRING_CONST", "COMMENT_LINE", "COMMENT_BLOCK", "IDENTIFIER", "IGNORE", 
			"LETTER", "DIG", "INT", "NOT"
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
	public String getGrammarFileName() { return "Main.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MainParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public List<TerminalNode> LSS() { return getTokens(MainParser.LSS); }
		public TerminalNode LSS(int i) {
			return getToken(MainParser.LSS, i);
		}
		public List<TerminalNode> GRT() { return getTokens(MainParser.GRT); }
		public TerminalNode GRT(int i) {
			return getToken(MainParser.GRT, i);
		}
		public List<TerminalNode> EQL() { return getTokens(MainParser.EQL); }
		public TerminalNode EQL(int i) {
			return getToken(MainParser.EQL, i);
		}
		public List<TerminalNode> LSSQ() { return getTokens(MainParser.LSSQ); }
		public TerminalNode LSSQ(int i) {
			return getToken(MainParser.LSSQ, i);
		}
		public List<TerminalNode> GRTQ() { return getTokens(MainParser.GRTQ); }
		public TerminalNode GRTQ(int i) {
			return getToken(MainParser.GRTQ, i);
		}
		public List<TerminalNode> IF() { return getTokens(MainParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(MainParser.IF, i);
		}
		public List<TerminalNode> THEN() { return getTokens(MainParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(MainParser.THEN, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(MainParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(MainParser.ELSE, i);
		}
		public List<TerminalNode> WHILE() { return getTokens(MainParser.WHILE); }
		public TerminalNode WHILE(int i) {
			return getToken(MainParser.WHILE, i);
		}
		public List<TerminalNode> DO() { return getTokens(MainParser.DO); }
		public TerminalNode DO(int i) {
			return getToken(MainParser.DO, i);
		}
		public List<TerminalNode> REPEAT() { return getTokens(MainParser.REPEAT); }
		public TerminalNode REPEAT(int i) {
			return getToken(MainParser.REPEAT, i);
		}
		public List<TerminalNode> FOR() { return getTokens(MainParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(MainParser.FOR, i);
		}
		public List<TerminalNode> ASIG() { return getTokens(MainParser.ASIG); }
		public TerminalNode ASIG(int i) {
			return getToken(MainParser.ASIG, i);
		}
		public List<TerminalNode> TO() { return getTokens(MainParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(MainParser.TO, i);
		}
		public List<TerminalNode> DOWNTO() { return getTokens(MainParser.DOWNTO); }
		public TerminalNode DOWNTO(int i) {
			return getToken(MainParser.DOWNTO, i);
		}
		public List<TerminalNode> OR() { return getTokens(MainParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MainParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(MainParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(MainParser.AND, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MainParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MainParser.SEMICOLON, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(MainParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(MainParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(MainParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(MainParser.CLOSE_PAR, i);
		}
		public List<TerminalNode> TRUE() { return getTokens(MainParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(MainParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(MainParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(MainParser.FALSE, i);
		}
		public List<TerminalNode> NOT() { return getTokens(MainParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(MainParser.NOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MainParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MainParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMERIC_INTEGER_CONST() { return getTokens(MainParser.NUMERIC_INTEGER_CONST); }
		public TerminalNode NUMERIC_INTEGER_CONST(int i) {
			return getToken(MainParser.NUMERIC_INTEGER_CONST, i);
		}
		public List<TerminalNode> NUMERIC_REAL_CONST() { return getTokens(MainParser.NUMERIC_REAL_CONST); }
		public TerminalNode NUMERIC_REAL_CONST(int i) {
			return getToken(MainParser.NUMERIC_REAL_CONST, i);
		}
		public List<TerminalNode> COMMENT_LINE() { return getTokens(MainParser.COMMENT_LINE); }
		public TerminalNode COMMENT_LINE(int i) {
			return getToken(MainParser.COMMENT_LINE, i);
		}
		public List<TerminalNode> COMMENT_BLOCK() { return getTokens(MainParser.COMMENT_BLOCK); }
		public TerminalNode COMMENT_BLOCK(int i) {
			return getToken(MainParser.COMMENT_BLOCK, i);
		}
		public List<TerminalNode> STRING_CONST() { return getTokens(MainParser.STRING_CONST); }
		public TerminalNode STRING_CONST(int i) {
			return getToken(MainParser.STRING_CONST, i);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSS) | (1L << GRT) | (1L << EQL) | (1L << LSSQ) | (1L << GRTQ) | (1L << IF) | (1L << THEN) | (1L << ELSE) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << FOR) | (1L << ASIG) | (1L << TO) | (1L << DOWNTO) | (1L << SEMICOLON) | (1L << OR) | (1L << AND) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << TRUE) | (1L << FALSE) | (1L << NUMERIC_INTEGER_CONST) | (1L << NUMERIC_REAL_CONST) | (1L << STRING_CONST) | (1L << COMMENT_LINE) | (1L << COMMENT_BLOCK) | (1L << IDENTIFIER) | (1L << NOT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(5); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSS) | (1L << GRT) | (1L << EQL) | (1L << LSSQ) | (1L << GRTQ) | (1L << IF) | (1L << THEN) | (1L << ELSE) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << FOR) | (1L << ASIG) | (1L << TO) | (1L << DOWNTO) | (1L << SEMICOLON) | (1L << OR) | (1L << AND) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << TRUE) | (1L << FALSE) | (1L << NUMERIC_INTEGER_CONST) | (1L << NUMERIC_REAL_CONST) | (1L << STRING_CONST) | (1L << COMMENT_LINE) | (1L << COMMENT_BLOCK) | (1L << IDENTIFIER) | (1L << NOT))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\n\4\2\t\2\3\2\6"+
		"\2\6\n\2\r\2\16\2\7\3\2\2\2\3\2\2\3\4\2\3\36##\2\t\2\5\3\2\2\2\4\6\t\2"+
		"\2\2\5\4\3\2\2\2\6\7\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}