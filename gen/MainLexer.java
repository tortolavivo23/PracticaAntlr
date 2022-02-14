// Generated from /home/heqro/Documents/IdeaProjects/PracticaAntlr/src/Main.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MainLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, NUMERIC_INTEGER_CONST=2, NUMERIC_REAL_CONST=3, STRING_CONST=4, 
		COMMENT_LINE=5, COMMENT_BLOCK=6, IGNORE=7, LETTER=8, DIG=9, INT=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFIER", "NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", "STRING_CONST", 
			"COMMENT_LINE", "COMMENT_BLOCK", "IGNORE", "CHAR", "LETTER", "DIG", "INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", "STRING_CONST", 
			"COMMENT_LINE", "COMMENT_BLOCK", "IGNORE", "LETTER", "DIG", "INT"
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


	public MainLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Main.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			IDENTIFIER_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			NUMERIC_INTEGER_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			NUMERIC_REAL_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			STRING_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void IDENTIFIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println(getText()+" -> Identificador");
			break;
		}
	}
	private void NUMERIC_INTEGER_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println(getText()+" -> Entero");
			break;
		}
	}
	private void NUMERIC_REAL_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println(getText()+" -> Real");
			break;
		}
	}
	private void STRING_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println(getText() + " -> String const");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\177\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\5\2\34\n\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2\3"+
		"\2\3\2\3\3\5\3)\n\3\3\3\3\3\3\3\3\4\5\4/\n\4\3\4\3\4\3\4\5\4\64\n\4\3"+
		"\4\3\4\5\48\n\4\3\4\5\4;\n\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5C\n\5\f\5\16\5"+
		"F\13\5\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\5\5\5S\n\5\3\5\3"+
		"\5\3\6\3\6\6\6Y\n\6\r\6\16\6Z\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7e\n\7"+
		"\f\7\16\7h\13\7\3\7\6\7k\n\7\r\7\16\7l\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\6\f|\n\f\r\f\16\f}\2\2\r\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\2\23\n\25\13\27\f\3\2\f\4\2--//\4\2GGgg\3\2))\3\2$$\4\2\f\f"+
		"\17\17\3\2,,\3\2++\5\2\f\f\17\17\"\"\4\2C\\c|\3\2\62;\2\u0090\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\33\3\2\2\2\5(\3\2\2"+
		"\2\7.\3\2\2\2\tR\3\2\2\2\13V\3\2\2\2\r^\3\2\2\2\17p\3\2\2\2\21t\3\2\2"+
		"\2\23v\3\2\2\2\25x\3\2\2\2\27{\3\2\2\2\31\34\7a\2\2\32\34\5\23\n\2\33"+
		"\31\3\2\2\2\33\32\3\2\2\2\34\"\3\2\2\2\35!\7a\2\2\36!\5\25\13\2\37!\5"+
		"\23\n\2 \35\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3"+
		"\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\b\2\2\2&\4\3\2\2\2\')\t\2\2\2(\'\3\2\2\2"+
		"()\3\2\2\2)*\3\2\2\2*+\5\27\f\2+,\b\3\3\2,\6\3\2\2\2-/\t\2\2\2.-\3\2\2"+
		"\2./\3\2\2\2/\60\3\2\2\2\60\63\5\27\f\2\61\62\7\60\2\2\62\64\5\27\f\2"+
		"\63\61\3\2\2\2\63\64\3\2\2\2\64:\3\2\2\2\65\67\t\3\2\2\668\t\2\2\2\67"+
		"\66\3\2\2\2\678\3\2\2\289\3\2\2\29;\5\27\f\2:\65\3\2\2\2:;\3\2\2\2;<\3"+
		"\2\2\2<=\b\4\4\2=\b\3\2\2\2>D\7)\2\2?@\7)\2\2@C\7)\2\2AC\n\4\2\2B?\3\2"+
		"\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GS\7)"+
		"\2\2HN\7$\2\2IJ\7$\2\2JM\7$\2\2KM\n\5\2\2LI\3\2\2\2LK\3\2\2\2MP\3\2\2"+
		"\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QS\7$\2\2R>\3\2\2\2RH\3\2\2"+
		"\2ST\3\2\2\2TU\b\5\5\2U\n\3\2\2\2VX\7}\2\2WY\n\6\2\2XW\3\2\2\2YZ\3\2\2"+
		"\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\177\2\2]\f\3\2\2\2^_\7*\2\2_`\7"+
		",\2\2`f\3\2\2\2ae\n\7\2\2bc\7,\2\2ce\n\b\2\2da\3\2\2\2db\3\2\2\2eh\3\2"+
		"\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2ik\7,\2\2ji\3\2\2\2kl\3\2"+
		"\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7+\2\2o\16\3\2\2\2pq\t\t\2\2qr\3"+
		"\2\2\2rs\b\b\6\2s\20\3\2\2\2tu\3\2\2\2u\22\3\2\2\2vw\t\n\2\2w\24\3\2\2"+
		"\2xy\t\13\2\2y\26\3\2\2\2z|\5\25\13\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~"+
		"\3\2\2\2~\30\3\2\2\2\25\2\33 \"(.\63\67:BDLNRZdfl}\7\3\2\2\3\3\3\3\4\4"+
		"\3\5\5\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}