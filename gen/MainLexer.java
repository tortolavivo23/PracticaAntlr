// Generated from C:/Users/hr.iglesias.2018/IdeaProjects/PracticaAntlr/src\Main.g4 by ANTLR 4.9.1

    import java.util.Arrays;
    import java.util.HashMap;
    import java.util.Map;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, NUMERIC_INTEGER_CONST=42, NUMERIC_REAL_CONST=43, 
		STRING_CONST=44, COMMENT_LINE=45, COMMENT_BLOCK=46, IDENTIFIER=47, IGNORE=48, 
		DIG=49, INT=50;
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
			"COMMENT_BLOCK", "IDENTIFIER", "IGNORE", "LETTER", "DIG", "INT"
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
			"DIG", "INT"
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


	    public String formatearReservada(String cadena){
	            return "<SPAN CLASS=\"palres\">"+cadena+"</SPAN>";
	    }

	    public String formatear(String cadenaUnica, String cadenaBloque, Map<String,String> identificadores) {
	        if(!identificadores.containsKey(cadenaUnica)){
	            return "<SPAN CLASS=\"ctesindeclarar\">"+cadenaBloque+"</SPAN>";
	        }
	        return "<SPAN CLASS=\""+identificadores.get(cadenaUnica)+"\"> <a href=\"#"+cadenaUnica+"\">"+cadenaBloque+"</a></SPAN>";
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0176\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\5+\u0117\n+\3+\3+\3,\5,\u011c\n,"+
		"\3,\3,\3,\5,\u0121\n,\3,\3,\5,\u0125\n,\3,\5,\u0128\n,\3-\3-\3-\3-\7-"+
		"\u012e\n-\f-\16-\u0131\13-\3-\3-\3-\3-\3-\7-\u0138\n-\f-\16-\u013b\13"+
		"-\3-\5-\u013e\n-\3.\3.\6.\u0142\n.\r.\16.\u0143\3.\3.\3.\3.\3/\3/\3/\3"+
		"/\3/\3/\7/\u0150\n/\f/\16/\u0153\13/\3/\6/\u0156\n/\r/\16/\u0157\3/\3"+
		"/\3/\3/\3\60\3\60\5\60\u0160\n\60\3\60\3\60\3\60\7\60\u0165\n\60\f\60"+
		"\16\60\u0168\13\60\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\6\64\u0173"+
		"\n\64\r\64\16\64\u0174\2\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\2e\63g\64\3\2\f\4\2--//\4\2GGgg\3\2))\3\2$$\4\2\f\f\17\17\3\2,,"+
		"\3\2++\5\2\13\f\17\17\"\"\4\2C\\c|\3\2\62;\2\u0187\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\3i\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13{\3\2\2\2\r\177\3"+
		"\2\2\2\17\u0085\3\2\2\2\21\u0087\3\2\2\2\23\u008b\3\2\2\2\25\u008d\3\2"+
		"\2\2\27\u008f\3\2\2\2\31\u0099\3\2\2\2\33\u00a2\3\2\2\2\35\u00a4\3\2\2"+
		"\2\37\u00a6\3\2\2\2!\u00ae\3\2\2\2#\u00b3\3\2\2\2%\u00b6\3\2\2\2\'\u00bb"+
		"\3\2\2\2)\u00c0\3\2\2\2+\u00c6\3\2\2\2-\u00c9\3\2\2\2/\u00d0\3\2\2\2\61"+
		"\u00d6\3\2\2\2\63\u00da\3\2\2\2\65\u00dd\3\2\2\2\67\u00df\3\2\2\29\u00e1"+
		"\3\2\2\2;\u00e3\3\2\2\2=\u00e7\3\2\2\2?\u00eb\3\2\2\2A\u00ee\3\2\2\2C"+
		"\u00f5\3\2\2\2E\u00f8\3\2\2\2G\u00fc\3\2\2\2I\u0100\3\2\2\2K\u0105\3\2"+
		"\2\2M\u010b\3\2\2\2O\u010d\3\2\2\2Q\u010f\3\2\2\2S\u0112\3\2\2\2U\u0116"+
		"\3\2\2\2W\u011b\3\2\2\2Y\u013d\3\2\2\2[\u013f\3\2\2\2]\u0149\3\2\2\2_"+
		"\u015f\3\2\2\2a\u0169\3\2\2\2c\u016d\3\2\2\2e\u016f\3\2\2\2g\u0172\3\2"+
		"\2\2ij\7R\2\2jk\7T\2\2kl\7Q\2\2lm\7I\2\2mn\7T\2\2no\7C\2\2op\7O\2\2p\4"+
		"\3\2\2\2qr\7=\2\2r\6\3\2\2\2st\7\60\2\2t\b\3\2\2\2uv\7D\2\2vw\7G\2\2w"+
		"x\7I\2\2xy\7K\2\2yz\7P\2\2z\n\3\2\2\2{|\7G\2\2|}\7P\2\2}~\7F\2\2~\f\3"+
		"\2\2\2\177\u0080\7E\2\2\u0080\u0081\7Q\2\2\u0081\u0082\7P\2\2\u0082\u0083"+
		"\7U\2\2\u0083\u0084\7V\2\2\u0084\16\3\2\2\2\u0085\u0086\7?\2\2\u0086\20"+
		"\3\2\2\2\u0087\u0088\7X\2\2\u0088\u0089\7C\2\2\u0089\u008a\7T\2\2\u008a"+
		"\22\3\2\2\2\u008b\u008c\7<\2\2\u008c\24\3\2\2\2\u008d\u008e\7.\2\2\u008e"+
		"\26\3\2\2\2\u008f\u0090\7R\2\2\u0090\u0091\7T\2\2\u0091\u0092\7Q\2\2\u0092"+
		"\u0093\7E\2\2\u0093\u0094\7G\2\2\u0094\u0095\7F\2\2\u0095\u0096\7W\2\2"+
		"\u0096\u0097\7T\2\2\u0097\u0098\7G\2\2\u0098\30\3\2\2\2\u0099\u009a\7"+
		"H\2\2\u009a\u009b\7W\2\2\u009b\u009c\7P\2\2\u009c\u009d\7E\2\2\u009d\u009e"+
		"\7V\2\2\u009e\u009f\7K\2\2\u009f\u00a0\7Q\2\2\u00a0\u00a1\7P\2\2\u00a1"+
		"\32\3\2\2\2\u00a2\u00a3\7*\2\2\u00a3\34\3\2\2\2\u00a4\u00a5\7+\2\2\u00a5"+
		"\36\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7v\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa\u00ab\7i\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7t\2\2"+
		"\u00ad \3\2\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7c\2"+
		"\2\u00b1\u00b2\7n\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7K\2\2\u00b4\u00b5\7"+
		"H\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7V\2\2\u00b7\u00b8\7J\2\2\u00b8\u00b9"+
		"\7G\2\2\u00b9\u00ba\7P\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7G\2\2\u00bc\u00bd"+
		"\7N\2\2\u00bd\u00be\7U\2\2\u00be\u00bf\7G\2\2\u00bf(\3\2\2\2\u00c0\u00c1"+
		"\7Y\2\2\u00c1\u00c2\7J\2\2\u00c2\u00c3\7K\2\2\u00c3\u00c4\7N\2\2\u00c4"+
		"\u00c5\7G\2\2\u00c5*\3\2\2\2\u00c6\u00c7\7F\2\2\u00c7\u00c8\7Q\2\2\u00c8"+
		",\3\2\2\2\u00c9\u00ca\7T\2\2\u00ca\u00cb\7G\2\2\u00cb\u00cc\7R\2\2\u00cc"+
		"\u00cd\7G\2\2\u00cd\u00ce\7C\2\2\u00ce\u00cf\7V\2\2\u00cf.\3\2\2\2\u00d0"+
		"\u00d1\7W\2\2\u00d1\u00d2\7P\2\2\u00d2\u00d3\7V\2\2\u00d3\u00d4\7K\2\2"+
		"\u00d4\u00d5\7N\2\2\u00d5\60\3\2\2\2\u00d6\u00d7\7H\2\2\u00d7\u00d8\7"+
		"Q\2\2\u00d8\u00d9\7T\2\2\u00d9\62\3\2\2\2\u00da\u00db\7<\2\2\u00db\u00dc"+
		"\7?\2\2\u00dc\64\3\2\2\2\u00dd\u00de\7-\2\2\u00de\66\3\2\2\2\u00df\u00e0"+
		"\7/\2\2\u00e08\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2:\3\2\2\2\u00e3\u00e4\7"+
		"F\2\2\u00e4\u00e5\7K\2\2\u00e5\u00e6\7X\2\2\u00e6<\3\2\2\2\u00e7\u00e8"+
		"\7O\2\2\u00e8\u00e9\7Q\2\2\u00e9\u00ea\7F\2\2\u00ea>\3\2\2\2\u00eb\u00ec"+
		"\7V\2\2\u00ec\u00ed\7Q\2\2\u00ed@\3\2\2\2\u00ee\u00ef\7F\2\2\u00ef\u00f0"+
		"\7Q\2\2\u00f0\u00f1\7Y\2\2\u00f1\u00f2\7P\2\2\u00f2\u00f3\7V\2\2\u00f3"+
		"\u00f4\7Q\2\2\u00f4B\3\2\2\2\u00f5\u00f6\7Q\2\2\u00f6\u00f7\7T\2\2\u00f7"+
		"D\3\2\2\2\u00f8\u00f9\7C\2\2\u00f9\u00fa\7P\2\2\u00fa\u00fb\7F\2\2\u00fb"+
		"F\3\2\2\2\u00fc\u00fd\7P\2\2\u00fd\u00fe\7Q\2\2\u00fe\u00ff\7V\2\2\u00ff"+
		"H\3\2\2\2\u0100\u0101\7V\2\2\u0101\u0102\7T\2\2\u0102\u0103\7W\2\2\u0103"+
		"\u0104\7G\2\2\u0104J\3\2\2\2\u0105\u0106\7H\2\2\u0106\u0107\7C\2\2\u0107"+
		"\u0108\7N\2\2\u0108\u0109\7U\2\2\u0109\u010a\7G\2\2\u010aL\3\2\2\2\u010b"+
		"\u010c\7>\2\2\u010cN\3\2\2\2\u010d\u010e\7@\2\2\u010eP\3\2\2\2\u010f\u0110"+
		"\7>\2\2\u0110\u0111\7?\2\2\u0111R\3\2\2\2\u0112\u0113\7@\2\2\u0113\u0114"+
		"\7?\2\2\u0114T\3\2\2\2\u0115\u0117\t\2\2\2\u0116\u0115\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\5g\64\2\u0119V\3\2\2\2\u011a"+
		"\u011c\t\2\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u0120\5g\64\2\u011e\u011f\7\60\2\2\u011f\u0121\5g\64\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0127\3\2\2\2\u0122\u0124\t\3"+
		"\2\2\u0123\u0125\t\2\2\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0128\5g\64\2\u0127\u0122\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128X\3\2\2\2\u0129\u012f\7)\2\2\u012a\u012b\7)\2\2\u012b\u012e"+
		"\7)\2\2\u012c\u012e\n\4\2\2\u012d\u012a\3\2\2\2\u012d\u012c\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0132\u013e\7)\2\2\u0133\u0139\7$\2\2\u0134\u0135"+
		"\7$\2\2\u0135\u0138\7$\2\2\u0136\u0138\n\5\2\2\u0137\u0134\3\2\2\2\u0137"+
		"\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e\7$\2\2\u013d"+
		"\u0129\3\2\2\2\u013d\u0133\3\2\2\2\u013eZ\3\2\2\2\u013f\u0141\7}\2\2\u0140"+
		"\u0142\n\6\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\7\177\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\b.\2\2\u0148\\\3\2\2\2\u0149\u014a\7*\2\2\u014a"+
		"\u014b\7,\2\2\u014b\u0151\3\2\2\2\u014c\u0150\n\7\2\2\u014d\u014e\7,\2"+
		"\2\u014e\u0150\n\b\2\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0156\7,\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\7+\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b/\2\2\u015c^\3\2\2\2\u015d"+
		"\u0160\7a\2\2\u015e\u0160\5c\62\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2"+
		"\2\2\u0160\u0166\3\2\2\2\u0161\u0165\7a\2\2\u0162\u0165\5e\63\2\u0163"+
		"\u0165\5c\62\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2"+
		"\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"`\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\t\t\2\2\u016a\u016b\3\2\2\2"+
		"\u016b\u016c\b\61\2\2\u016cb\3\2\2\2\u016d\u016e\t\n\2\2\u016ed\3\2\2"+
		"\2\u016f\u0170\t\13\2\2\u0170f\3\2\2\2\u0171\u0173\5e\63\2\u0172\u0171"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"h\3\2\2\2\25\2\u0116\u011b\u0120\u0124\u0127\u012d\u012f\u0137\u0139\u013d"+
		"\u0143\u014f\u0151\u0157\u015f\u0164\u0166\u0174\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}