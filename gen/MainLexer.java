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
		LSS=1, GRT=2, EQL=3, LSSQ=4, GRTQ=5, IF=6, THEN=7, ELSE=8, WHILE=9, DO=10, 
		REPEAT=11, FOR=12, ASIG=13, TO=14, DOWNTO=15, SEMICOLON=16, OR=17, AND=18, 
		OPEN_PAR=19, CLOSE_PAR=20, TRUE=21, FALSE=22, NUMERIC_INTEGER_CONST=23, 
		NUMERIC_REAL_CONST=24, STRING_CONST=25, COMMENT_LINE=26, COMMENT_BLOCK=27, 
		IDENTIFIER=28, IGNORE=29, LETTER=30, DIG=31, INT=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LSS", "GRT", "EQL", "LSSQ", "GRTQ", "IF", "THEN", "ELSE", "WHILE", "DO", 
			"REPEAT", "FOR", "ASIG", "TO", "DOWNTO", "SEMICOLON", "OR", "AND", "OPEN_PAR", 
			"CLOSE_PAR", "TRUE", "FALSE", "NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", 
			"STRING_CONST", "COMMENT_LINE", "COMMENT_BLOCK", "IDENTIFIER", "IGNORE", 
			"CHAR", "LETTER", "DIG", "INT"
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
			"LETTER", "DIG", "INT"
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
			LSS_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			GRT_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			EQL_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			LSSQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			GRTQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			THEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			DO_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			REPEAT_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			FOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			ASIG_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			TO_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			DOWNTO_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			SEMICOLON_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			OR_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			AND_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			OPEN_PAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			CLOSE_PAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			TRUE_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			FALSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			NUMERIC_INTEGER_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			NUMERIC_REAL_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			STRING_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			IDENTIFIER_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LSS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println(getText()+" -> <");
			break;
		}
	}
	private void GRT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println(getText()+" -> >");
			break;
		}
	}
	private void EQL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println(getText()+" -> =");
			break;
		}
	}
	private void LSSQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println(getText()+" -> <=");
			break;
		}
	}
	private void GRTQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println(getText()+" -> >=");
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println(getText()+" -> if");
			break;
		}
	}
	private void THEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.println(getText()+" -> then");
			break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			System.out.println(getText()+" -> else");
			break;
		}
	}
	private void WHILE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.println(getText()+" -> while");
			break;
		}
	}
	private void DO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			System.out.println(getText()+" -> do");
			break;
		}
	}
	private void REPEAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			System.out.println(getText()+" -> repeat");
			break;
		}
	}
	private void FOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			System.out.println(getText()+" ->for ");
			break;
		}
	}
	private void ASIG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			System.out.println(getText()+" -> asignación");
			break;
		}
	}
	private void TO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			System.out.println(getText()+" -> to");
			break;
		}
	}
	private void DOWNTO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			System.out.println(getText()+" -> downto");
			break;
		}
	}
	private void SEMICOLON_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			System.out.println(getText()+" -> ;");
			break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			System.out.println(getText() + " -> or ");
			break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			System.out.println(getText() + " -> and ");
			break;
		}
	}
	private void OPEN_PAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			System.out.println(getText() + " -> ( ");
			break;
		}
	}
	private void CLOSE_PAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			System.out.println(getText() + " -> ) ");
			break;
		}
	}
	private void TRUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			System.out.println(getText() + " -> TRUE ");
			break;
		}
	}
	private void FALSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:
			System.out.println(getText() + " -> FALSE ");
			break;
		}
	}
	private void NUMERIC_INTEGER_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			System.out.println(getText()+" -> Entero");
			break;
		}
	}
	private void NUMERIC_REAL_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:
			System.out.println(getText()+" -> Real");
			break;
		}
	}
	private void STRING_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24:
			System.out.println(getText() + " -> String const");
			break;
		}
	}
	private void IDENTIFIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25:
			System.out.println(getText()+" -> Identificador");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0123\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\5\30"+
		"\u00bf\n\30\3\30\3\30\3\30\3\31\5\31\u00c5\n\31\3\31\3\31\3\31\5\31\u00ca"+
		"\n\31\3\31\3\31\5\31\u00ce\n\31\3\31\5\31\u00d1\n\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\7\32\u00d9\n\32\f\32\16\32\u00dc\13\32\3\32\3\32\3\32\3"+
		"\32\3\32\7\32\u00e3\n\32\f\32\16\32\u00e6\13\32\3\32\5\32\u00e9\n\32\3"+
		"\32\3\32\3\33\3\33\6\33\u00ef\n\33\r\33\16\33\u00f0\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\7\34\u00fb\n\34\f\34\16\34\u00fe\13\34\3\34\6\34"+
		"\u0101\n\34\r\34\16\34\u0102\3\34\3\34\3\35\3\35\5\35\u0109\n\35\3\35"+
		"\3\35\3\35\7\35\u010e\n\35\f\35\16\35\u0111\13\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\6\"\u0120\n\"\r\"\16\"\u0121\2\2"+
		"#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"=\2? A!C\"\3\2\f\4\2--//\4\2GGgg\3\2))\3\2$$\4\2\f\f\17\17\3\2,,\3\2+"+
		"+\5\2\f\f\17\17\"\"\4\2C\\c|\3\2\62;\2\u0134\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\3E\3\2\2\2\5H\3\2\2\2\7K\3\2\2\2\tN\3\2\2\2\13S\3\2\2\2"+
		"\rX\3\2\2\2\17]\3\2\2\2\21d\3\2\2\2\23k\3\2\2\2\25s\3\2\2\2\27x\3\2\2"+
		"\2\31\u0081\3\2\2\2\33\u0087\3\2\2\2\35\u008c\3\2\2\2\37\u0091\3\2\2\2"+
		"!\u009a\3\2\2\2#\u009d\3\2\2\2%\u00a2\3\2\2\2\'\u00a8\3\2\2\2)\u00ab\3"+
		"\2\2\2+\u00ae\3\2\2\2-\u00b5\3\2\2\2/\u00be\3\2\2\2\61\u00c4\3\2\2\2\63"+
		"\u00e8\3\2\2\2\65\u00ec\3\2\2\2\67\u00f4\3\2\2\29\u0108\3\2\2\2;\u0114"+
		"\3\2\2\2=\u0118\3\2\2\2?\u011a\3\2\2\2A\u011c\3\2\2\2C\u011f\3\2\2\2E"+
		"F\7>\2\2FG\b\2\2\2G\4\3\2\2\2HI\7@\2\2IJ\b\3\3\2J\6\3\2\2\2KL\7?\2\2L"+
		"M\b\4\4\2M\b\3\2\2\2NO\7>\2\2OP\7?\2\2PQ\3\2\2\2QR\b\5\5\2R\n\3\2\2\2"+
		"ST\7@\2\2TU\7?\2\2UV\3\2\2\2VW\b\6\6\2W\f\3\2\2\2XY\7K\2\2YZ\7H\2\2Z["+
		"\3\2\2\2[\\\b\7\7\2\\\16\3\2\2\2]^\7V\2\2^_\7J\2\2_`\7G\2\2`a\7P\2\2a"+
		"b\3\2\2\2bc\b\b\b\2c\20\3\2\2\2de\7G\2\2ef\7N\2\2fg\7U\2\2gh\7G\2\2hi"+
		"\3\2\2\2ij\b\t\t\2j\22\3\2\2\2kl\7Y\2\2lm\7J\2\2mn\7K\2\2no\7N\2\2op\7"+
		"G\2\2pq\3\2\2\2qr\b\n\n\2r\24\3\2\2\2st\7F\2\2tu\7Q\2\2uv\3\2\2\2vw\b"+
		"\13\13\2w\26\3\2\2\2xy\7T\2\2yz\7G\2\2z{\7R\2\2{|\7G\2\2|}\7C\2\2}~\7"+
		"V\2\2~\177\3\2\2\2\177\u0080\b\f\f\2\u0080\30\3\2\2\2\u0081\u0082\7H\2"+
		"\2\u0082\u0083\7Q\2\2\u0083\u0084\7T\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\b\r\r\2\u0086\32\3\2\2\2\u0087\u0088\7<\2\2\u0088\u0089\7?\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\b\16\16\2\u008b\34\3\2\2\2\u008c\u008d\7V\2"+
		"\2\u008d\u008e\7Q\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\17\17\2\u0090"+
		"\36\3\2\2\2\u0091\u0092\7F\2\2\u0092\u0093\7Q\2\2\u0093\u0094\7Y\2\2\u0094"+
		"\u0095\7P\2\2\u0095\u0096\7V\2\2\u0096\u0097\7Q\2\2\u0097\u0098\3\2\2"+
		"\2\u0098\u0099\b\20\20\2\u0099 \3\2\2\2\u009a\u009b\7=\2\2\u009b\u009c"+
		"\b\21\21\2\u009c\"\3\2\2\2\u009d\u009e\7Q\2\2\u009e\u009f\7T\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\b\22\22\2\u00a1$\3\2\2\2\u00a2\u00a3\7C\2\2"+
		"\u00a3\u00a4\7P\2\2\u00a4\u00a5\7F\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\b\23\23\2\u00a7&\3\2\2\2\u00a8\u00a9\7*\2\2\u00a9\u00aa\b\24\24\2\u00aa"+
		"(\3\2\2\2\u00ab\u00ac\7+\2\2\u00ac\u00ad\b\25\25\2\u00ad*\3\2\2\2\u00ae"+
		"\u00af\7V\2\2\u00af\u00b0\7T\2\2\u00b0\u00b1\7W\2\2\u00b1\u00b2\7G\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\26\26\2\u00b4,\3\2\2\2\u00b5\u00b6"+
		"\7H\2\2\u00b6\u00b7\7C\2\2\u00b7\u00b8\7N\2\2\u00b8\u00b9\7U\2\2\u00b9"+
		"\u00ba\7G\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\b\27\27\2\u00bc.\3\2\2\2"+
		"\u00bd\u00bf\t\2\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c1\5C\"\2\u00c1\u00c2\b\30\30\2\u00c2\60\3\2\2\2\u00c3"+
		"\u00c5\t\2\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c9\5C\"\2\u00c7\u00c8\7\60\2\2\u00c8\u00ca\5C\"\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d0\3\2\2\2\u00cb\u00cd\t\3"+
		"\2\2\u00cc\u00ce\t\2\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d1\5C\"\2\u00d0\u00cb\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b\31\31\2\u00d3\62\3\2\2\2\u00d4"+
		"\u00da\7)\2\2\u00d5\u00d6\7)\2\2\u00d6\u00d9\7)\2\2\u00d7\u00d9\n\4\2"+
		"\2\u00d8\u00d5\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00e9\7)\2\2\u00de\u00e4\7$\2\2\u00df\u00e0\7$\2\2\u00e0\u00e3\7$\2\2"+
		"\u00e1\u00e3\n\5\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e9\7$\2\2\u00e8\u00d4\3\2\2\2\u00e8\u00de\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\32\32\2\u00eb\64\3\2\2\2\u00ec"+
		"\u00ee\7}\2\2\u00ed\u00ef\n\6\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\7\177\2\2\u00f3\66\3\2\2\2\u00f4\u00f5\7*\2\2\u00f5\u00f6\7,\2"+
		"\2\u00f6\u00fc\3\2\2\2\u00f7\u00fb\n\7\2\2\u00f8\u00f9\7,\2\2\u00f9\u00fb"+
		"\n\b\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u0101\7,\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7+"+
		"\2\2\u01058\3\2\2\2\u0106\u0109\7a\2\2\u0107\u0109\5? \2\u0108\u0106\3"+
		"\2\2\2\u0108\u0107\3\2\2\2\u0109\u010f\3\2\2\2\u010a\u010e\7a\2\2\u010b"+
		"\u010e\5A!\2\u010c\u010e\5? \2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2"+
		"\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\b\35\33\2"+
		"\u0113:\3\2\2\2\u0114\u0115\t\t\2\2\u0115\u0116\3\2\2\2\u0116\u0117\b"+
		"\36\34\2\u0117<\3\2\2\2\u0118\u0119\3\2\2\2\u0119>\3\2\2\2\u011a\u011b"+
		"\t\n\2\2\u011b@\3\2\2\2\u011c\u011d\t\13\2\2\u011dB\3\2\2\2\u011e\u0120"+
		"\5A!\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122D\3\2\2\2\25\2\u00be\u00c4\u00c9\u00cd\u00d0\u00d8"+
		"\u00da\u00e2\u00e4\u00e8\u00f0\u00fa\u00fc\u0102\u0108\u010d\u010f\u0121"+
		"\35\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3\7\7\3\b\b\3\t\t\3\n\n\3\13\13\3\f"+
		"\f\3\r\r\3\16\16\3\17\17\3\20\20\3\21\21\3\22\22\3\23\23\3\24\24\3\25"+
		"\25\3\26\26\3\27\27\3\30\30\3\31\31\3\32\32\3\35\33\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}