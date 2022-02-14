// Generated from R:/Documents/IdeaProjects/PracticaAntlr/src\Main.g4 by ANTLR 4.9.1
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
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, NUMERIC_INTEGER_CONST=2, NUMERIC_REAL_CONST=3, STRING_CONST=4, 
		CCOMMENT_LINE=5, COMMENT_BLOCK=6, IGNORE=7, LETTER=8, DIG=9, INT=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFIER", "NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", "STRING_CONST", 
			"CCOMMENT_LINE", "COMMENT_BLOCK", "IGNORE", "CHAR", "LETTER", "DIG", 
			"INT"
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
			"CCOMMENT_LINE", "COMMENT_BLOCK", "IGNORE", "LETTER", "DIG", "INT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\ft\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\5\2\34\n\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2\3\2"+
		"\3\2\3\3\5\3)\n\3\3\3\3\3\3\3\3\4\5\4/\n\4\3\4\3\4\3\4\5\4\64\n\4\3\4"+
		"\3\4\5\48\n\4\3\4\5\4;\n\4\3\4\3\4\3\5\3\5\7\5A\n\5\f\5\16\5D\13\5\3\5"+
		"\3\5\3\5\3\6\3\6\6\6K\n\6\r\6\16\6L\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7W\n\7\f\7\16\7Z\13\7\3\7\6\7]\n\7\r\7\16\7^\3\7\3\7\3\b\3\b\3\b\5\b"+
		"f\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fq\n\f\r\f\16\fr\2\2\r\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\n\25\13\27\f\3\2\t\4\2--//\4\2GG"+
		"gg\4\2\f\f\17\17\3\2,,\3\2++\4\2C\\c|\3\2\62;\2\u0082\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\33\3\2\2\2\5(\3\2\2\2\7.\3\2"+
		"\2\2\t>\3\2\2\2\13H\3\2\2\2\rP\3\2\2\2\17e\3\2\2\2\21i\3\2\2\2\23k\3\2"+
		"\2\2\25m\3\2\2\2\27p\3\2\2\2\31\34\7a\2\2\32\34\5\23\n\2\33\31\3\2\2\2"+
		"\33\32\3\2\2\2\34\"\3\2\2\2\35!\7a\2\2\36!\5\25\13\2\37!\5\23\n\2 \35"+
		"\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2"+
		"\2\2$\"\3\2\2\2%&\b\2\2\2&\4\3\2\2\2\')\t\2\2\2(\'\3\2\2\2()\3\2\2\2)"+
		"*\3\2\2\2*+\5\27\f\2+,\b\3\3\2,\6\3\2\2\2-/\t\2\2\2.-\3\2\2\2./\3\2\2"+
		"\2/\60\3\2\2\2\60\63\5\27\f\2\61\62\7\60\2\2\62\64\5\27\f\2\63\61\3\2"+
		"\2\2\63\64\3\2\2\2\64:\3\2\2\2\65\67\t\3\2\2\668\t\2\2\2\67\66\3\2\2\2"+
		"\678\3\2\2\289\3\2\2\29;\5\27\f\2:\65\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\b"+
		"\4\4\2=\b\3\2\2\2>B\7)\2\2?A\5\23\n\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC"+
		"\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7)\2\2FG\b\5\5\2G\n\3\2\2\2HJ\7}\2\2IK"+
		"\n\4\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\177\2\2"+
		"O\f\3\2\2\2PQ\7*\2\2QR\7,\2\2RX\3\2\2\2SW\n\5\2\2TU\7,\2\2UW\n\6\2\2V"+
		"S\3\2\2\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2"+
		"[]\7,\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7+\2\2"+
		"a\16\3\2\2\2bf\7\"\2\2cd\7\17\2\2df\7\f\2\2eb\3\2\2\2ec\3\2\2\2fg\3\2"+
		"\2\2gh\b\b\6\2h\20\3\2\2\2ij\3\2\2\2j\22\3\2\2\2kl\t\7\2\2l\24\3\2\2\2"+
		"mn\t\b\2\2n\26\3\2\2\2oq\5\25\13\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2"+
		"\2\2s\30\3\2\2\2\22\2\33 \"(.\63\67:BLVX^er\7\3\2\2\3\3\3\3\4\4\3\5\5"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}