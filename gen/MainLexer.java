// Generated from /home/sergio/ProcesadoresDeLenguajes/PracticaAntlr/src/Main.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, NUMERIC_INTEGER_CONST=42, NUMERIC_REAL_CONST=43, 
		STRING_CONST=44, COMMENT_LINE=45, COMMENT_BLOCK=46, IDENTIFIER=47, IGNORE=48, 
		LETTER=49, DIG=50, INT=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", "STRING_CONST", "COMMENT_LINE", 
			"COMMENT_BLOCK", "IDENTIFIER", "IGNORE", "CHAR", "LETTER", "DIG", "INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "';'", "'.'", "'BEGIN'", "'END'", "'CONST'", "'='", 
			"'VAR'", "':'", "','", "'PROCEDURE'", "'FUNCTION'", "'('", "')'", "'integer'", 
			"'real'", "'IF'", "'THEN'", "'ELSE'", "'WHILE'", "'DO'", "'REPEAT'", 
			"'UNTIL'", "'FOR'", "':='", "'+'", "'-'", "'*'", "'DIV'", "'MOD'", "'TO'", 
			"'DOWNTO'", "'OR'", "'AND'", "'NOT'", "'TRUE'", "'FALSE'", "'<'", "'>'", 
			"'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", 
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
		case 41:
			NUMERIC_INTEGER_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			NUMERIC_REAL_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			STRING_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			IDENTIFIER_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NUMERIC_INTEGER_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println(getText()+" -> Entero");
			break;
		}
	}
	private void NUMERIC_REAL_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println(getText()+" -> Real");
			break;
		}
	}
	private void STRING_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println(getText() + " -> String const");
			break;
		}
	}
	private void IDENTIFIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println(getText()+" -> Identificador");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0181\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\5+\u0119\n+\3+\3+\3+\3,"+
		"\5,\u011f\n,\3,\3,\3,\5,\u0124\n,\3,\3,\5,\u0128\n,\3,\5,\u012b\n,\3,"+
		"\3,\3-\3-\3-\3-\7-\u0133\n-\f-\16-\u0136\13-\3-\3-\3-\3-\3-\7-\u013d\n"+
		"-\f-\16-\u0140\13-\3-\5-\u0143\n-\3-\3-\3.\3.\6.\u0149\n.\r.\16.\u014a"+
		"\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\7/\u0157\n/\f/\16/\u015a\13/\3/\6/\u015d"+
		"\n/\r/\16/\u015e\3/\3/\3/\3/\3\60\3\60\5\60\u0167\n\60\3\60\3\60\3\60"+
		"\7\60\u016c\n\60\f\60\16\60\u016f\13\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\6\65\u017e\n\65\r\65\16\65\u017f\2"+
		"\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2e\63g\64i\65\3\2"+
		"\f\4\2--//\4\2GGgg\3\2))\3\2$$\4\2\f\f\17\17\3\2,,\3\2++\5\2\13\f\17\17"+
		"\"\"\4\2C\\c|\3\2\62;\2\u0192\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3"+
		"k\3\2\2\2\5s\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13}\3\2\2\2\r\u0081\3\2\2\2"+
		"\17\u0087\3\2\2\2\21\u0089\3\2\2\2\23\u008d\3\2\2\2\25\u008f\3\2\2\2\27"+
		"\u0091\3\2\2\2\31\u009b\3\2\2\2\33\u00a4\3\2\2\2\35\u00a6\3\2\2\2\37\u00a8"+
		"\3\2\2\2!\u00b0\3\2\2\2#\u00b5\3\2\2\2%\u00b8\3\2\2\2\'\u00bd\3\2\2\2"+
		")\u00c2\3\2\2\2+\u00c8\3\2\2\2-\u00cb\3\2\2\2/\u00d2\3\2\2\2\61\u00d8"+
		"\3\2\2\2\63\u00dc\3\2\2\2\65\u00df\3\2\2\2\67\u00e1\3\2\2\29\u00e3\3\2"+
		"\2\2;\u00e5\3\2\2\2=\u00e9\3\2\2\2?\u00ed\3\2\2\2A\u00f0\3\2\2\2C\u00f7"+
		"\3\2\2\2E\u00fa\3\2\2\2G\u00fe\3\2\2\2I\u0102\3\2\2\2K\u0107\3\2\2\2M"+
		"\u010d\3\2\2\2O\u010f\3\2\2\2Q\u0111\3\2\2\2S\u0114\3\2\2\2U\u0118\3\2"+
		"\2\2W\u011e\3\2\2\2Y\u0142\3\2\2\2[\u0146\3\2\2\2]\u0150\3\2\2\2_\u0166"+
		"\3\2\2\2a\u0172\3\2\2\2c\u0176\3\2\2\2e\u0178\3\2\2\2g\u017a\3\2\2\2i"+
		"\u017d\3\2\2\2kl\7R\2\2lm\7T\2\2mn\7Q\2\2no\7I\2\2op\7T\2\2pq\7C\2\2q"+
		"r\7O\2\2r\4\3\2\2\2st\7=\2\2t\6\3\2\2\2uv\7\60\2\2v\b\3\2\2\2wx\7D\2\2"+
		"xy\7G\2\2yz\7I\2\2z{\7K\2\2{|\7P\2\2|\n\3\2\2\2}~\7G\2\2~\177\7P\2\2\177"+
		"\u0080\7F\2\2\u0080\f\3\2\2\2\u0081\u0082\7E\2\2\u0082\u0083\7Q\2\2\u0083"+
		"\u0084\7P\2\2\u0084\u0085\7U\2\2\u0085\u0086\7V\2\2\u0086\16\3\2\2\2\u0087"+
		"\u0088\7?\2\2\u0088\20\3\2\2\2\u0089\u008a\7X\2\2\u008a\u008b\7C\2\2\u008b"+
		"\u008c\7T\2\2\u008c\22\3\2\2\2\u008d\u008e\7<\2\2\u008e\24\3\2\2\2\u008f"+
		"\u0090\7.\2\2\u0090\26\3\2\2\2\u0091\u0092\7R\2\2\u0092\u0093\7T\2\2\u0093"+
		"\u0094\7Q\2\2\u0094\u0095\7E\2\2\u0095\u0096\7G\2\2\u0096\u0097\7F\2\2"+
		"\u0097\u0098\7W\2\2\u0098\u0099\7T\2\2\u0099\u009a\7G\2\2\u009a\30\3\2"+
		"\2\2\u009b\u009c\7H\2\2\u009c\u009d\7W\2\2\u009d\u009e\7P\2\2\u009e\u009f"+
		"\7E\2\2\u009f\u00a0\7V\2\2\u00a0\u00a1\7K\2\2\u00a1\u00a2\7Q\2\2\u00a2"+
		"\u00a3\7P\2\2\u00a3\32\3\2\2\2\u00a4\u00a5\7*\2\2\u00a5\34\3\2\2\2\u00a6"+
		"\u00a7\7+\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa"+
		"\u00ab\7v\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7i\2\2\u00ad\u00ae\7g\2\2"+
		"\u00ae\u00af\7t\2\2\u00af \3\2\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7g\2"+
		"\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7n\2\2\u00b4\"\3\2\2\2\u00b5\u00b6\7"+
		"K\2\2\u00b6\u00b7\7H\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7V\2\2\u00b9\u00ba"+
		"\7J\2\2\u00ba\u00bb\7G\2\2\u00bb\u00bc\7P\2\2\u00bc&\3\2\2\2\u00bd\u00be"+
		"\7G\2\2\u00be\u00bf\7N\2\2\u00bf\u00c0\7U\2\2\u00c0\u00c1\7G\2\2\u00c1"+
		"(\3\2\2\2\u00c2\u00c3\7Y\2\2\u00c3\u00c4\7J\2\2\u00c4\u00c5\7K\2\2\u00c5"+
		"\u00c6\7N\2\2\u00c6\u00c7\7G\2\2\u00c7*\3\2\2\2\u00c8\u00c9\7F\2\2\u00c9"+
		"\u00ca\7Q\2\2\u00ca,\3\2\2\2\u00cb\u00cc\7T\2\2\u00cc\u00cd\7G\2\2\u00cd"+
		"\u00ce\7R\2\2\u00ce\u00cf\7G\2\2\u00cf\u00d0\7C\2\2\u00d0\u00d1\7V\2\2"+
		"\u00d1.\3\2\2\2\u00d2\u00d3\7W\2\2\u00d3\u00d4\7P\2\2\u00d4\u00d5\7V\2"+
		"\2\u00d5\u00d6\7K\2\2\u00d6\u00d7\7N\2\2\u00d7\60\3\2\2\2\u00d8\u00d9"+
		"\7H\2\2\u00d9\u00da\7Q\2\2\u00da\u00db\7T\2\2\u00db\62\3\2\2\2\u00dc\u00dd"+
		"\7<\2\2\u00dd\u00de\7?\2\2\u00de\64\3\2\2\2\u00df\u00e0\7-\2\2\u00e0\66"+
		"\3\2\2\2\u00e1\u00e2\7/\2\2\u00e28\3\2\2\2\u00e3\u00e4\7,\2\2\u00e4:\3"+
		"\2\2\2\u00e5\u00e6\7F\2\2\u00e6\u00e7\7K\2\2\u00e7\u00e8\7X\2\2\u00e8"+
		"<\3\2\2\2\u00e9\u00ea\7O\2\2\u00ea\u00eb\7Q\2\2\u00eb\u00ec\7F\2\2\u00ec"+
		">\3\2\2\2\u00ed\u00ee\7V\2\2\u00ee\u00ef\7Q\2\2\u00ef@\3\2\2\2\u00f0\u00f1"+
		"\7F\2\2\u00f1\u00f2\7Q\2\2\u00f2\u00f3\7Y\2\2\u00f3\u00f4\7P\2\2\u00f4"+
		"\u00f5\7V\2\2\u00f5\u00f6\7Q\2\2\u00f6B\3\2\2\2\u00f7\u00f8\7Q\2\2\u00f8"+
		"\u00f9\7T\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7C\2\2\u00fb\u00fc\7P\2\2\u00fc"+
		"\u00fd\7F\2\2\u00fdF\3\2\2\2\u00fe\u00ff\7P\2\2\u00ff\u0100\7Q\2\2\u0100"+
		"\u0101\7V\2\2\u0101H\3\2\2\2\u0102\u0103\7V\2\2\u0103\u0104\7T\2\2\u0104"+
		"\u0105\7W\2\2\u0105\u0106\7G\2\2\u0106J\3\2\2\2\u0107\u0108\7H\2\2\u0108"+
		"\u0109\7C\2\2\u0109\u010a\7N\2\2\u010a\u010b\7U\2\2\u010b\u010c\7G\2\2"+
		"\u010cL\3\2\2\2\u010d\u010e\7>\2\2\u010eN\3\2\2\2\u010f\u0110\7@\2\2\u0110"+
		"P\3\2\2\2\u0111\u0112\7>\2\2\u0112\u0113\7?\2\2\u0113R\3\2\2\2\u0114\u0115"+
		"\7@\2\2\u0115\u0116\7?\2\2\u0116T\3\2\2\2\u0117\u0119\t\2\2\2\u0118\u0117"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\5i\65\2\u011b"+
		"\u011c\b+\2\2\u011cV\3\2\2\2\u011d\u011f\t\2\2\2\u011e\u011d\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0123\5i\65\2\u0121\u0122\7\60"+
		"\2\2\u0122\u0124\5i\65\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u012a\3\2\2\2\u0125\u0127\t\3\2\2\u0126\u0128\t\2\2\2\u0127\u0126\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\5i\65\2\u012a"+
		"\u0125\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\b,"+
		"\3\2\u012dX\3\2\2\2\u012e\u0134\7)\2\2\u012f\u0130\7)\2\2\u0130\u0133"+
		"\7)\2\2\u0131\u0133\n\4\2\2\u0132\u012f\3\2\2\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0137\u0143\7)\2\2\u0138\u013e\7$\2\2\u0139\u013a"+
		"\7$\2\2\u013a\u013d\7$\2\2\u013b\u013d\n\5\2\2\u013c\u0139\3\2\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\7$\2\2\u0142"+
		"\u012e\3\2\2\2\u0142\u0138\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b-"+
		"\4\2\u0145Z\3\2\2\2\u0146\u0148\7}\2\2\u0147\u0149\n\6\2\2\u0148\u0147"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014d\7\177\2\2\u014d\u014e\3\2\2\2\u014e\u014f\b"+
		".\5\2\u014f\\\3\2\2\2\u0150\u0151\7*\2\2\u0151\u0152\7,\2\2\u0152\u0158"+
		"\3\2\2\2\u0153\u0157\n\7\2\2\u0154\u0155\7,\2\2\u0155\u0157\n\b\2\2\u0156"+
		"\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015d\7,\2\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\7+\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\b/\5\2\u0163^\3\2\2\2\u0164\u0167\7a\2\2\u0165"+
		"\u0167\5e\63\2\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167\u016d\3\2"+
		"\2\2\u0168\u016c\7a\2\2\u0169\u016c\5g\64\2\u016a\u016c\5e\63\2\u016b"+
		"\u0168\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2"+
		"\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0171\b\60\6\2\u0171`\3\2\2\2\u0172\u0173\t\t\2\2"+
		"\u0173\u0174\3\2\2\2\u0174\u0175\b\61\5\2\u0175b\3\2\2\2\u0176\u0177\3"+
		"\2\2\2\u0177d\3\2\2\2\u0178\u0179\t\n\2\2\u0179f\3\2\2\2\u017a\u017b\t"+
		"\13\2\2\u017bh\3\2\2\2\u017c\u017e\5g\64\2\u017d\u017c\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180j\3\2\2\2\25\2\u0118"+
		"\u011e\u0123\u0127\u012a\u0132\u0134\u013c\u013e\u0142\u014a\u0156\u0158"+
		"\u015e\u0166\u016b\u016d\u017f\7\3+\2\3,\3\3-\4\b\2\2\3\60\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}