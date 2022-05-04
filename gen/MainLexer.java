// Generated from /home/heqro/IdeaProjects/PracticaAntlr/src/Main.g4 by ANTLR 4.10.1

    import java.util.Set;
    import java.util.HashSet;
    import java.util.Arrays;
    import java.util.Map;
    import java.util.HashMap;

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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

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



	    Set<String> constantesDeclaradas = new HashSet<>();
	    Set<String> palabrasReservadas = new HashSet<String>(Arrays.asList("PROGRAM,BEGIN,END,PROCEDURE,FUNCTION,IF,THEN,ELSE,WHILE,DO,REPEAT,UNTIL,FOR,DO,DIV,MOD,NOT,TRUE,FALSE,CONST,VAR,integer,real".split(",")));


	    public String formatear(String cadena) {
	        if (constantesDeclaradas.contains(cadena))
	            return "<SPAN CLASS=\"cte\">"+cadena+"</SPAN>";
	        if (palabrasReservadas.contains(cadena))
	            return "<SPAN CLASS=\"palres\">"+cadena+"</SPAN>";
	        return cadena;
	    }

	    public String cteSinDeclarar(String cte) {
	        return "<SPAN CLASS=\"ctesindeclarar\">"+cte+"</SPAN>";
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
		"\u0004\u00002\u0174\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		")\u0003)\u0115\b)\u0001)\u0001)\u0001*\u0003*\u011a\b*\u0001*\u0001*\u0001"+
		"*\u0003*\u011f\b*\u0001*\u0001*\u0003*\u0123\b*\u0001*\u0003*\u0126\b"+
		"*\u0001+\u0001+\u0001+\u0001+\u0005+\u012c\b+\n+\f+\u012f\t+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0005+\u0136\b+\n+\f+\u0139\t+\u0001+\u0003+\u013c"+
		"\b+\u0001,\u0001,\u0004,\u0140\b,\u000b,\f,\u0141\u0001,\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u014e\b-\n-"+
		"\f-\u0151\t-\u0001-\u0004-\u0154\b-\u000b-\f-\u0155\u0001-\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0003.\u015e\b.\u0001.\u0001.\u0001.\u0005.\u0163"+
		"\b.\n.\f.\u0166\t.\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00011\u0001"+
		"1\u00012\u00042\u0171\b2\u000b2\f2\u0172\u0000\u00003\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/"+
		"_0a\u0000c1e2\u0001\u0000\n\u0002\u0000++--\u0002\u0000EEee\u0001\u0000"+
		"\'\'\u0001\u0000\"\"\u0002\u0000\n\n\r\r\u0001\u0000**\u0001\u0000))\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000AZaz\u0001\u000009\u0185\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000"+
		"\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000"+
		"\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q"+
		"\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000"+
		"\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000"+
		"\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_"+
		"\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000"+
		"\u0000\u0000\u0001g\u0001\u0000\u0000\u0000\u0003o\u0001\u0000\u0000\u0000"+
		"\u0005q\u0001\u0000\u0000\u0000\u0007s\u0001\u0000\u0000\u0000\ty\u0001"+
		"\u0000\u0000\u0000\u000b}\u0001\u0000\u0000\u0000\r\u0083\u0001\u0000"+
		"\u0000\u0000\u000f\u0085\u0001\u0000\u0000\u0000\u0011\u0089\u0001\u0000"+
		"\u0000\u0000\u0013\u008b\u0001\u0000\u0000\u0000\u0015\u008d\u0001\u0000"+
		"\u0000\u0000\u0017\u0097\u0001\u0000\u0000\u0000\u0019\u00a0\u0001\u0000"+
		"\u0000\u0000\u001b\u00a2\u0001\u0000\u0000\u0000\u001d\u00a4\u0001\u0000"+
		"\u0000\u0000\u001f\u00ac\u0001\u0000\u0000\u0000!\u00b1\u0001\u0000\u0000"+
		"\u0000#\u00b4\u0001\u0000\u0000\u0000%\u00b9\u0001\u0000\u0000\u0000\'"+
		"\u00be\u0001\u0000\u0000\u0000)\u00c4\u0001\u0000\u0000\u0000+\u00c7\u0001"+
		"\u0000\u0000\u0000-\u00ce\u0001\u0000\u0000\u0000/\u00d4\u0001\u0000\u0000"+
		"\u00001\u00d8\u0001\u0000\u0000\u00003\u00db\u0001\u0000\u0000\u00005"+
		"\u00dd\u0001\u0000\u0000\u00007\u00df\u0001\u0000\u0000\u00009\u00e1\u0001"+
		"\u0000\u0000\u0000;\u00e5\u0001\u0000\u0000\u0000=\u00e9\u0001\u0000\u0000"+
		"\u0000?\u00ec\u0001\u0000\u0000\u0000A\u00f3\u0001\u0000\u0000\u0000C"+
		"\u00f6\u0001\u0000\u0000\u0000E\u00fa\u0001\u0000\u0000\u0000G\u00fe\u0001"+
		"\u0000\u0000\u0000I\u0103\u0001\u0000\u0000\u0000K\u0109\u0001\u0000\u0000"+
		"\u0000M\u010b\u0001\u0000\u0000\u0000O\u010d\u0001\u0000\u0000\u0000Q"+
		"\u0110\u0001\u0000\u0000\u0000S\u0114\u0001\u0000\u0000\u0000U\u0119\u0001"+
		"\u0000\u0000\u0000W\u013b\u0001\u0000\u0000\u0000Y\u013d\u0001\u0000\u0000"+
		"\u0000[\u0147\u0001\u0000\u0000\u0000]\u015d\u0001\u0000\u0000\u0000_"+
		"\u0167\u0001\u0000\u0000\u0000a\u016b\u0001\u0000\u0000\u0000c\u016d\u0001"+
		"\u0000\u0000\u0000e\u0170\u0001\u0000\u0000\u0000gh\u0005P\u0000\u0000"+
		"hi\u0005R\u0000\u0000ij\u0005O\u0000\u0000jk\u0005G\u0000\u0000kl\u0005"+
		"R\u0000\u0000lm\u0005A\u0000\u0000mn\u0005M\u0000\u0000n\u0002\u0001\u0000"+
		"\u0000\u0000op\u0005;\u0000\u0000p\u0004\u0001\u0000\u0000\u0000qr\u0005"+
		".\u0000\u0000r\u0006\u0001\u0000\u0000\u0000st\u0005B\u0000\u0000tu\u0005"+
		"E\u0000\u0000uv\u0005G\u0000\u0000vw\u0005I\u0000\u0000wx\u0005N\u0000"+
		"\u0000x\b\u0001\u0000\u0000\u0000yz\u0005E\u0000\u0000z{\u0005N\u0000"+
		"\u0000{|\u0005D\u0000\u0000|\n\u0001\u0000\u0000\u0000}~\u0005C\u0000"+
		"\u0000~\u007f\u0005O\u0000\u0000\u007f\u0080\u0005N\u0000\u0000\u0080"+
		"\u0081\u0005S\u0000\u0000\u0081\u0082\u0005T\u0000\u0000\u0082\f\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005=\u0000\u0000\u0084\u000e\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005V\u0000\u0000\u0086\u0087\u0005A\u0000\u0000"+
		"\u0087\u0088\u0005R\u0000\u0000\u0088\u0010\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005:\u0000\u0000\u008a\u0012\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005,\u0000\u0000\u008c\u0014\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"P\u0000\u0000\u008e\u008f\u0005R\u0000\u0000\u008f\u0090\u0005O\u0000"+
		"\u0000\u0090\u0091\u0005C\u0000\u0000\u0091\u0092\u0005E\u0000\u0000\u0092"+
		"\u0093\u0005D\u0000\u0000\u0093\u0094\u0005U\u0000\u0000\u0094\u0095\u0005"+
		"R\u0000\u0000\u0095\u0096\u0005E\u0000\u0000\u0096\u0016\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005F\u0000\u0000\u0098\u0099\u0005U\u0000\u0000\u0099"+
		"\u009a\u0005N\u0000\u0000\u009a\u009b\u0005C\u0000\u0000\u009b\u009c\u0005"+
		"T\u0000\u0000\u009c\u009d\u0005I\u0000\u0000\u009d\u009e\u0005O\u0000"+
		"\u0000\u009e\u009f\u0005N\u0000\u0000\u009f\u0018\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0005(\u0000\u0000\u00a1\u001a\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005)\u0000\u0000\u00a3\u001c\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005i\u0000\u0000\u00a5\u00a6\u0005n\u0000\u0000\u00a6\u00a7\u0005t"+
		"\u0000\u0000\u00a7\u00a8\u0005e\u0000\u0000\u00a8\u00a9\u0005g\u0000\u0000"+
		"\u00a9\u00aa\u0005e\u0000\u0000\u00aa\u00ab\u0005r\u0000\u0000\u00ab\u001e"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005r\u0000\u0000\u00ad\u00ae\u0005"+
		"e\u0000\u0000\u00ae\u00af\u0005a\u0000\u0000\u00af\u00b0\u0005l\u0000"+
		"\u0000\u00b0 \u0001\u0000\u0000\u0000\u00b1\u00b2\u0005I\u0000\u0000\u00b2"+
		"\u00b3\u0005F\u0000\u0000\u00b3\"\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005T\u0000\u0000\u00b5\u00b6\u0005H\u0000\u0000\u00b6\u00b7\u0005E"+
		"\u0000\u0000\u00b7\u00b8\u0005N\u0000\u0000\u00b8$\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0005E\u0000\u0000\u00ba\u00bb\u0005L\u0000\u0000\u00bb\u00bc"+
		"\u0005S\u0000\u0000\u00bc\u00bd\u0005E\u0000\u0000\u00bd&\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005W\u0000\u0000\u00bf\u00c0\u0005H\u0000\u0000"+
		"\u00c0\u00c1\u0005I\u0000\u0000\u00c1\u00c2\u0005L\u0000\u0000\u00c2\u00c3"+
		"\u0005E\u0000\u0000\u00c3(\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005D"+
		"\u0000\u0000\u00c5\u00c6\u0005O\u0000\u0000\u00c6*\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0005R\u0000\u0000\u00c8\u00c9\u0005E\u0000\u0000\u00c9\u00ca"+
		"\u0005P\u0000\u0000\u00ca\u00cb\u0005E\u0000\u0000\u00cb\u00cc\u0005A"+
		"\u0000\u0000\u00cc\u00cd\u0005T\u0000\u0000\u00cd,\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0005U\u0000\u0000\u00cf\u00d0\u0005N\u0000\u0000\u00d0\u00d1"+
		"\u0005T\u0000\u0000\u00d1\u00d2\u0005I\u0000\u0000\u00d2\u00d3\u0005L"+
		"\u0000\u0000\u00d3.\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005F\u0000\u0000"+
		"\u00d5\u00d6\u0005O\u0000\u0000\u00d6\u00d7\u0005R\u0000\u0000\u00d70"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005:\u0000\u0000\u00d9\u00da\u0005"+
		"=\u0000\u0000\u00da2\u0001\u0000\u0000\u0000\u00db\u00dc\u0005+\u0000"+
		"\u0000\u00dc4\u0001\u0000\u0000\u0000\u00dd\u00de\u0005-\u0000\u0000\u00de"+
		"6\u0001\u0000\u0000\u0000\u00df\u00e0\u0005*\u0000\u0000\u00e08\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0005D\u0000\u0000\u00e2\u00e3\u0005I\u0000"+
		"\u0000\u00e3\u00e4\u0005V\u0000\u0000\u00e4:\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0005M\u0000\u0000\u00e6\u00e7\u0005O\u0000\u0000\u00e7\u00e8\u0005"+
		"D\u0000\u0000\u00e8<\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005T\u0000"+
		"\u0000\u00ea\u00eb\u0005O\u0000\u0000\u00eb>\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0005D\u0000\u0000\u00ed\u00ee\u0005O\u0000\u0000\u00ee\u00ef\u0005"+
		"W\u0000\u0000\u00ef\u00f0\u0005N\u0000\u0000\u00f0\u00f1\u0005T\u0000"+
		"\u0000\u00f1\u00f2\u0005O\u0000\u0000\u00f2@\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005O\u0000\u0000\u00f4\u00f5\u0005R\u0000\u0000\u00f5B\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0005A\u0000\u0000\u00f7\u00f8\u0005N\u0000"+
		"\u0000\u00f8\u00f9\u0005D\u0000\u0000\u00f9D\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0005N\u0000\u0000\u00fb\u00fc\u0005O\u0000\u0000\u00fc\u00fd\u0005"+
		"T\u0000\u0000\u00fdF\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005T\u0000"+
		"\u0000\u00ff\u0100\u0005R\u0000\u0000\u0100\u0101\u0005U\u0000\u0000\u0101"+
		"\u0102\u0005E\u0000\u0000\u0102H\u0001\u0000\u0000\u0000\u0103\u0104\u0005"+
		"F\u0000\u0000\u0104\u0105\u0005A\u0000\u0000\u0105\u0106\u0005L\u0000"+
		"\u0000\u0106\u0107\u0005S\u0000\u0000\u0107\u0108\u0005E\u0000\u0000\u0108"+
		"J\u0001\u0000\u0000\u0000\u0109\u010a\u0005<\u0000\u0000\u010aL\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0005>\u0000\u0000\u010cN\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0005<\u0000\u0000\u010e\u010f\u0005=\u0000\u0000\u010f"+
		"P\u0001\u0000\u0000\u0000\u0110\u0111\u0005>\u0000\u0000\u0111\u0112\u0005"+
		"=\u0000\u0000\u0112R\u0001\u0000\u0000\u0000\u0113\u0115\u0007\u0000\u0000"+
		"\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0003e2\u0000\u0117"+
		"T\u0001\u0000\u0000\u0000\u0118\u011a\u0007\u0000\u0000\u0000\u0119\u0118"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0001\u0000\u0000\u0000\u011b\u011e\u0003e2\u0000\u011c\u011d\u0005."+
		"\u0000\u0000\u011d\u011f\u0003e2\u0000\u011e\u011c\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0125\u0001\u0000\u0000\u0000"+
		"\u0120\u0122\u0007\u0001\u0000\u0000\u0121\u0123\u0007\u0000\u0000\u0000"+
		"\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0126\u0003e2\u0000\u0125\u0120"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126V\u0001"+
		"\u0000\u0000\u0000\u0127\u012d\u0005\'\u0000\u0000\u0128\u0129\u0005\'"+
		"\u0000\u0000\u0129\u012c\u0005\'\u0000\u0000\u012a\u012c\b\u0002\u0000"+
		"\u0000\u012b\u0128\u0001\u0000\u0000\u0000\u012b\u012a\u0001\u0000\u0000"+
		"\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000\u0000"+
		"\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u013c\u0005\'\u0000\u0000"+
		"\u0131\u0137\u0005\"\u0000\u0000\u0132\u0133\u0005\"\u0000\u0000\u0133"+
		"\u0136\u0005\"\u0000\u0000\u0134\u0136\b\u0003\u0000\u0000\u0135\u0132"+
		"\u0001\u0000\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0139"+
		"\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0137"+
		"\u0001\u0000\u0000\u0000\u013a\u013c\u0005\"\u0000\u0000\u013b\u0127\u0001"+
		"\u0000\u0000\u0000\u013b\u0131\u0001\u0000\u0000\u0000\u013cX\u0001\u0000"+
		"\u0000\u0000\u013d\u013f\u0005{\u0000\u0000\u013e\u0140\b\u0004\u0000"+
		"\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000"+
		"\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u0005}\u0000\u0000"+
		"\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0006,\u0000\u0000\u0146"+
		"Z\u0001\u0000\u0000\u0000\u0147\u0148\u0005(\u0000\u0000\u0148\u0149\u0005"+
		"*\u0000\u0000\u0149\u014f\u0001\u0000\u0000\u0000\u014a\u014e\b\u0005"+
		"\u0000\u0000\u014b\u014c\u0005*\u0000\u0000\u014c\u014e\b\u0006\u0000"+
		"\u0000\u014d\u014a\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000"+
		"\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000"+
		"\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0154\u0005*\u0000\u0000"+
		"\u0153\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u0005)\u0000\u0000\u0158"+
		"\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0006-\u0000\u0000\u015a\\"+
		"\u0001\u0000\u0000\u0000\u015b\u015e\u0005_\u0000\u0000\u015c\u015e\u0003"+
		"a0\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000"+
		"\u0000\u015e\u0164\u0001\u0000\u0000\u0000\u015f\u0163\u0005_\u0000\u0000"+
		"\u0160\u0163\u0003c1\u0000\u0161\u0163\u0003a0\u0000\u0162\u015f\u0001"+
		"\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0161\u0001"+
		"\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165^\u0001\u0000"+
		"\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u0168\u0007\u0007"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0006/\u0000"+
		"\u0000\u016a`\u0001\u0000\u0000\u0000\u016b\u016c\u0007\b\u0000\u0000"+
		"\u016cb\u0001\u0000\u0000\u0000\u016d\u016e\u0007\t\u0000\u0000\u016e"+
		"d\u0001\u0000\u0000\u0000\u016f\u0171\u0003c1\u0000\u0170\u016f\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0170\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173f\u0001\u0000"+
		"\u0000\u0000\u0013\u0000\u0114\u0119\u011e\u0122\u0125\u012b\u012d\u0135"+
		"\u0137\u013b\u0141\u014d\u014f\u0155\u015d\u0162\u0164\u0172\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}