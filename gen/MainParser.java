// Generated from C:/Users/hr.iglesias.2018/IdeaProjects/PracticaAntlr/src\Main.g4 by ANTLR 4.9.1

    import java.util.Arrays;
    import java.util.HashMap;
    import java.util.Map;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, NUMERIC_INTEGER_CONST=42, NUMERIC_REAL_CONST=43, 
		STRING_CONST=44, COMMENT_LINE=45, COMMENT_BLOCK=46, IDENTIFIER=47, IGNORE=48, 
		DIG=49, INT=50;
	public static final int
		RULE_prg = 0, RULE_blq = 1, RULE_dcllist = 2, RULE_sentlist = 3, RULE_sentlistFactor = 4, 
		RULE_dcl = 5, RULE_defcte = 6, RULE_ctelist = 7, RULE_ctelistFactor = 8, 
		RULE_simpvalue = 9, RULE_defvar = 10, RULE_defvarlist = 11, RULE_defvarlistFactor = 12, 
		RULE_varlist = 13, RULE_varlistFactor = 14, RULE_defproc = 15, RULE_deffun = 16, 
		RULE_formal_paramlist = 17, RULE_formal_param = 18, RULE_formal_paramFactor = 19, 
		RULE_tbas = 20, RULE_sent = 21, RULE_sentFactor = 22, RULE_asig = 23, 
		RULE_exp = 24, RULE_expFactor = 25, RULE_op = 26, RULE_factor = 27, RULE_subpparamlist = 28, 
		RULE_explist = 29, RULE_explistFactor = 30, RULE_proc_call = 31, RULE_inc = 32, 
		RULE_expcond = 33, RULE_expcondFactor = 34, RULE_oplog = 35, RULE_factorcond = 36, 
		RULE_opcomp = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "blq", "dcllist", "sentlist", "sentlistFactor", "dcl", "defcte", 
			"ctelist", "ctelistFactor", "simpvalue", "defvar", "defvarlist", "defvarlistFactor", 
			"varlist", "varlistFactor", "defproc", "deffun", "formal_paramlist", 
			"formal_param", "formal_paramFactor", "tbas", "sent", "sentFactor", "asig", 
			"exp", "expFactor", "op", "factor", "subpparamlist", "explist", "explistFactor", 
			"proc_call", "inc", "expcond", "expcondFactor", "oplog", "factorcond", 
			"opcomp"
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

	@Override
	public String getGrammarFileName() { return "Main.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public String formatearReservada(String cadena){
	            return "<SPAN CLASS=\"palres\">"+cadena+"</SPAN>";
	    }

	    public String formatear(String cadenaUnica, String cadenaBloque, Map<String,String> identificadores) {
	        if(!identificadores.containsKey(cadenaUnica)){
	            return "<SPAN CLASS=\"ctesindeclarar\">"+cadenaBloque+"</SPAN>";
	        }
	        return "<SPAN CLASS=\""+identificadores.get(cadenaUnica)+"\"> <a href=\"#"+cadenaUnica+"\">"+cadenaBloque+"</a></SPAN>";
	    }

	public MainParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrgContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public BlqContext blq;
		public TerminalNode IDENTIFIER() { return getToken(MainParser.IDENTIFIER, 0); }
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitPrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitPrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__0);
			setState(77);
			((PrgContext)_localctx).IDENTIFIER = match(IDENTIFIER);

			            System.out.println("<a NAME=\"inicioPrograma\"><H1> Programa: "+(((PrgContext)_localctx).IDENTIFIER!=null?((PrgContext)_localctx).IDENTIFIER.getText():null)+"</H1></a>");
			        
			setState(79);
			match(T__1);

			            System.out.println("<UL>");
			            HashMap<String,String> map = new HashMap<String,String>();
			            String nombreBloque = "0main"; // aprovechamos que no se pueden declarar variables que empiecen por un número
			        
			setState(81);
			((PrgContext)_localctx).blq = blq(map, nombreBloque);

			            // Lista de cabeceras de procedimientos y funciones
			            System.out.println(((PrgContext)_localctx).blq.procYFunc+"</UL>\n<HR/>");

			            // Código de todas las funciones y procedimientos
			            System.out.println(((PrgContext)_localctx).blq.codigoProc);
			            System.out.println(((PrgContext)_localctx).blq.codigoFunc);

			            // Declaraciones y sentencias del programa principal
			            System.out.println("<a NAME=\"inicioMain\"><HR/> \n <H2> Programa principal </H2></a>");
			                // Mostramos primero constantes y variables
			            //System.out.println(((PrgContext)_localctx).blq.constantes);
			            //System.out.println(((PrgContext)_localctx).blq.variables);
			                // Mostrar el código principal
			            System.out.println(((PrgContext)_localctx).blq.codigo + ".");
			            System.out.println("<div class=\"moverse\"><a href=\"#inicioPrograma\">Al principio de la página</a></div>");
			            System.out.println("<div class=\"moverse\"><a href=\"#inicioMain\">Al principio del programa principal</a></div>");
			        
			setState(83);
			match(T__2);
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

	public static class BlqContext extends ParserRuleContext {
		public Map<String,String> map;
		public String nombreBloque;
		public String procYFunc;
		public String codigo;
		public String constantes;
		public String variables;
		public String codigoProc;
		public String codigoFunc;
		public DcllistContext dcllist;
		public SentlistContext sentlist;
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public BlqContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BlqContext(ParserRuleContext parent, int invokingState, Map<String,String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_blq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterBlq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitBlq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitBlq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlqContext blq(Map<String,String> map,String nombreBloque) throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 2, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{

			        Map<String,String> dcllistMap = new HashMap<>();
			        dcllistMap.putAll(_localctx.map);
			    
			setState(86);
			((BlqContext)_localctx).dcllist = dcllist(dcllistMap, nombreBloque);

			            ((BlqContext)_localctx).procYFunc =  ((BlqContext)_localctx).dcllist.procYFunc;
			            ((BlqContext)_localctx).codigo =  ((BlqContext)_localctx).dcllist.codigo;
			            ((BlqContext)_localctx).constantes =  ((BlqContext)_localctx).dcllist.constantes;
			            ((BlqContext)_localctx).variables =  ((BlqContext)_localctx).dcllist.variables;
			            ((BlqContext)_localctx).codigoProc =  ((BlqContext)_localctx).dcllist.codigoProc;
			            ((BlqContext)_localctx).codigoFunc =  ((BlqContext)_localctx).dcllist.codigoFunc;
			    
			setState(88);
			match(T__3);
			setState(89);
			((BlqContext)_localctx).sentlist = sentlist(dcllistMap, nombreBloque);
			setState(90);
			match(T__4);

			        _localctx.codigo += ((BlqContext)_localctx).dcllist.variables + ((BlqContext)_localctx).dcllist.constantes;
			        _localctx.codigo += formatearReservada("BEGIN") + "<div style=\"margin-left:1cm\">" +
			                                    ((BlqContext)_localctx).sentlist.codigo +
			                                    "</div>"+ formatearReservada("END");
			    
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

	public static class DcllistContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String procYFunc;
		public String codigo;
		public String constantes;
		public String variables;
		public String codigoProc;
		public String codigoFunc;
		public DclContext dcl;
		public DcllistContext dcllist;
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DcllistContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitDcllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist(Map<String, String> map,String nombreBloque) throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 4, RULE_dcllist);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{

				        ((DcllistContext)_localctx).procYFunc =  "";
				        ((DcllistContext)_localctx).codigo =  "";
				        ((DcllistContext)_localctx).constantes =  "";
				        ((DcllistContext)_localctx).variables =  "";
				        ((DcllistContext)_localctx).codigoProc =  "";
				        ((DcllistContext)_localctx).codigoFunc =  "";
				    
				}
				break;
			case T__5:
			case T__7:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				((DcllistContext)_localctx).dcl = dcl(_localctx.map, _localctx.nombreBloque);
				setState(95);
				((DcllistContext)_localctx).dcllist = dcllist(_localctx.map, _localctx.nombreBloque);

				        ((DcllistContext)_localctx).procYFunc =  ((DcllistContext)_localctx).dcl.procYFunc+((DcllistContext)_localctx).dcllist.procYFunc;
				        ((DcllistContext)_localctx).codigo =  ((DcllistContext)_localctx).dcl.codigo+((DcllistContext)_localctx).dcllist.codigo;
				        ((DcllistContext)_localctx).constantes =  ((DcllistContext)_localctx).dcl.constantes + ((DcllistContext)_localctx).dcllist.constantes;
				        ((DcllistContext)_localctx).variables =  ((DcllistContext)_localctx).dcl.variables + ((DcllistContext)_localctx).dcllist.variables;
				        ((DcllistContext)_localctx).codigoProc =  ((DcllistContext)_localctx).dcl.codigoProc + ((DcllistContext)_localctx).dcllist.codigoProc;
				        ((DcllistContext)_localctx).codigoFunc =  ((DcllistContext)_localctx).dcl.codigoFunc + ((DcllistContext)_localctx).dcllist.codigoFunc;
				    
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

	public static class SentlistContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String codigo;
		public SentContext sent;
		public SentlistFactorContext sentlistFactor;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistFactorContext sentlistFactor() {
			return getRuleContext(SentlistFactorContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentlistContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist(Map<String, String> map,String nombreBloque) throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 6, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((SentlistContext)_localctx).sent = sent(_localctx.map, _localctx.nombreBloque);
			setState(101);
			((SentlistContext)_localctx).sentlistFactor = sentlistFactor(_localctx.map, _localctx.nombreBloque);

			        ((SentlistContext)_localctx).codigo =  ((SentlistContext)_localctx).sent.sentencia+((SentlistContext)_localctx).sentlistFactor.codigo;
			    
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

	public static class SentlistFactorContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String codigo;
		public SentlistContext sentlist;
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SentlistFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentlistFactorContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_sentlistFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSentlistFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSentlistFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitSentlistFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistFactorContext sentlistFactor(Map<String, String> map,String nombreBloque) throws RecognitionException {
		SentlistFactorContext _localctx = new SentlistFactorContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 8, RULE_sentlistFactor);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{

				    ((SentlistFactorContext)_localctx).codigo =  "";
				  
				}
				break;
			case T__16:
			case T__19:
			case T__21:
			case T__23:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				((SentlistFactorContext)_localctx).sentlist = sentlist(_localctx.map, _localctx.nombreBloque);

				        ((SentlistFactorContext)_localctx).codigo =  ((SentlistFactorContext)_localctx).sentlist.codigo;
				   
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

	public static class DclContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String procYFunc;
		public String codigo;
		public String constantes;
		public String variables;
		public String codigoProc;
		public String codigoFunc;
		public DefcteContext defcte;
		public DefvarContext defvar;
		public DefprocContext defproc;
		public DeffunContext deffun;
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public DefprocContext defproc() {
			return getRuleContext(DefprocContext.class,0);
		}
		public DeffunContext deffun() {
			return getRuleContext(DeffunContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DclContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl(Map<String, String> map,String nombreBloque) throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 10, RULE_dcl);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				((DclContext)_localctx).defcte = defcte(_localctx.map, _localctx.nombreBloque);

				        ((DclContext)_localctx).procYFunc =  "";
				        ((DclContext)_localctx).codigo =  "";
				        ((DclContext)_localctx).constantes =  ((DclContext)_localctx).defcte.defConstantes;
				        ((DclContext)_localctx).variables =  "";
				        ((DclContext)_localctx).codigoProc =  "";
				        ((DclContext)_localctx).codigoFunc =  "";
				    
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				((DclContext)_localctx).defvar = defvar(_localctx.map, _localctx.nombreBloque);

				        ((DclContext)_localctx).procYFunc = "";
				        ((DclContext)_localctx).codigo =  "";
				        ((DclContext)_localctx).constantes =  "";
				        ((DclContext)_localctx).variables =  ((DclContext)_localctx).defvar.defVariables;
				        ((DclContext)_localctx).codigoProc =  "";
				        ((DclContext)_localctx).codigoFunc =  "";
				    
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				((DclContext)_localctx).defproc = defproc(_localctx.map, _localctx.nombreBloque);

				        ((DclContext)_localctx).procYFunc =  ((DclContext)_localctx).defproc.procedimiento;
				        ((DclContext)_localctx).codigo =  "";
				        ((DclContext)_localctx).constantes =  "";
				        ((DclContext)_localctx).variables =  "";
				        ((DclContext)_localctx).codigoProc =  ((DclContext)_localctx).defproc.codigo;
				        ((DclContext)_localctx).codigoFunc =  "";
				    
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				((DclContext)_localctx).deffun = deffun(_localctx.map, _localctx.nombreBloque);

				        ((DclContext)_localctx).procYFunc =  ((DclContext)_localctx).deffun.funcion;
				        ((DclContext)_localctx).codigo =  "";
				        ((DclContext)_localctx).constantes =  "";
				        ((DclContext)_localctx).variables =  "";
				        ((DclContext)_localctx).codigoProc =  "";
				        ((DclContext)_localctx).codigoFunc =  ((DclContext)_localctx).deffun.codigo;
				    
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

	public static class DefcteContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String defConstantes;
		public CtelistContext ctelist;
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefcteContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_defcte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterDefcte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitDefcte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitDefcte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcteContext defcte(Map<String, String> map,String nombreBloque) throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 12, RULE_defcte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__5);
			setState(125);
			((DefcteContext)_localctx).ctelist = ctelist(_localctx.map, _localctx.nombreBloque);
			((DefcteContext)_localctx).defConstantes =  formatearReservada("CONST")+" <br>" + ((DefcteContext)_localctx).ctelist.constantes + " <br>";
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

	public static class CtelistContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String constantes;
		public String tipoId;
		public Token IDENTIFIER;
		public SimpvalueContext simpvalue;
		public CtelistFactorContext ctelistFactor;
		public TerminalNode IDENTIFIER() { return getToken(MainParser.IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistFactorContext ctelistFactor() {
			return getRuleContext(CtelistFactorContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CtelistContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitCtelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitCtelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistContext ctelist(Map<String, String> map,String nombreBloque) throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 14, RULE_ctelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((CtelistContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(129);
			match(T__6);
			setState(130);
			((CtelistContext)_localctx).simpvalue = simpvalue();
			setState(131);
			match(T__1);
			setState(132);
			((CtelistContext)_localctx).ctelistFactor = ctelistFactor(_localctx.map, _localctx.nombreBloque);

			           String claveNombre = _localctx.nombreBloque + "::" + (((CtelistContext)_localctx).IDENTIFIER!=null?((CtelistContext)_localctx).IDENTIFIER.getText():null);
			           String nombre = (((CtelistContext)_localctx).IDENTIFIER!=null?((CtelistContext)_localctx).IDENTIFIER.getText():null);
			           while(_localctx.map.containsKey(nombre)){
			                nombre += "1";
			                claveNombre += "1";
			           }

			           ((CtelistContext)_localctx).constantes =  "<a NAME=\""+claveNombre+"\">"+nombre+ "</a> = " + formatear(((CtelistContext)_localctx).simpvalue.constante, ((CtelistContext)_localctx).simpvalue.constante, _localctx.map) + ";" + ((CtelistContext)_localctx).ctelistFactor.constantes;
			           _localctx.map.put(claveNombre, "cte"); // añadimos al mapa después de la declaración para que se pinte correctamente en instrucciones sucesivas
			        
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

	public static class CtelistFactorContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String constantes;
		public CtelistContext ctelist;
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public CtelistFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CtelistFactorContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_ctelistFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterCtelistFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitCtelistFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitCtelistFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistFactorContext ctelistFactor(Map<String, String> map,String nombreBloque) throws RecognitionException {
		CtelistFactorContext _localctx = new CtelistFactorContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 16, RULE_ctelistFactor);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__5:
			case T__7:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				((CtelistFactorContext)_localctx).constantes =  "";
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				((CtelistFactorContext)_localctx).ctelist = ctelist(_localctx.map,_localctx.nombreBloque);
				((CtelistFactorContext)_localctx).constantes =  "<br>" + ((CtelistFactorContext)_localctx).ctelist.constantes;
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

	public static class SimpvalueContext extends ParserRuleContext {
		public String constante;
		public Token NUMERIC_INTEGER_CONST;
		public Token NUMERIC_REAL_CONST;
		public Token STRING_CONST;
		public TerminalNode NUMERIC_INTEGER_CONST() { return getToken(MainParser.NUMERIC_INTEGER_CONST, 0); }
		public TerminalNode NUMERIC_REAL_CONST() { return getToken(MainParser.NUMERIC_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(MainParser.STRING_CONST, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSimpvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpvalue);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST = match(NUMERIC_INTEGER_CONST);
				((SimpvalueContext)_localctx).constante =  (((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST.getText():null);
				}
				break;
			case NUMERIC_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				((SimpvalueContext)_localctx).NUMERIC_REAL_CONST = match(NUMERIC_REAL_CONST);
				((SimpvalueContext)_localctx).constante =  (((SimpvalueContext)_localctx).NUMERIC_REAL_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_REAL_CONST.getText():null);
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((SimpvalueContext)_localctx).constante =  (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null);
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

	public static class DefvarContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String defVariables;
		public DefvarlistContext defvarlist;
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefvarContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitDefvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitDefvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarContext defvar(Map<String, String> map,String nombreBloque) throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 20, RULE_defvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__7);
			setState(150);
			((DefvarContext)_localctx).defvarlist = defvarlist(_localctx.map, _localctx.nombreBloque);
			setState(151);
			match(T__1);

			    ((DefvarContext)_localctx).defVariables =  formatearReservada("VAR")+" <br>" + ((DefvarContext)_localctx).defvarlist.variables + ";<br>";

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

	public static class DefvarlistContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String variables;
		public VarlistContext varlist;
		public TbasContext tbas;
		public DefvarlistFactorContext defvarlistFactor;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public DefvarlistFactorContext defvarlistFactor() {
			return getRuleContext(DefvarlistFactorContext.class,0);
		}
		public DefvarlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefvarlistContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_defvarlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterDefvarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitDefvarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitDefvarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarlistContext defvarlist(Map<String, String> map,String nombreBloque) throws RecognitionException {
		DefvarlistContext _localctx = new DefvarlistContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 22, RULE_defvarlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((DefvarlistContext)_localctx).varlist = varlist(_localctx.map, _localctx.nombreBloque);
			setState(155);
			match(T__8);
			setState(156);
			((DefvarlistContext)_localctx).tbas = tbas();
			setState(157);
			((DefvarlistContext)_localctx).defvarlistFactor = defvarlistFactor(_localctx.map, _localctx.nombreBloque);

			        ((DefvarlistContext)_localctx).variables =  ((DefvarlistContext)_localctx).varlist.nombreVariables + ": " + ((DefvarlistContext)_localctx).tbas.tipoDevuelto + ((DefvarlistContext)_localctx).defvarlistFactor.variables;
			    
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

	public static class DefvarlistFactorContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String variables;
		public DefvarlistContext defvarlist;
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
		public DefvarlistFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefvarlistFactorContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_defvarlistFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterDefvarlistFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitDefvarlistFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitDefvarlistFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarlistFactorContext defvarlistFactor(Map<String, String> map,String nombreBloque) throws RecognitionException {
		DefvarlistFactorContext _localctx = new DefvarlistFactorContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 24, RULE_defvarlistFactor);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((DefvarlistFactorContext)_localctx).variables =  "";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(T__1);
				setState(162);
				((DefvarlistFactorContext)_localctx).defvarlist = defvarlist(_localctx.map, _localctx.nombreBloque);
				((DefvarlistFactorContext)_localctx).variables =  "; " + ((DefvarlistFactorContext)_localctx).defvarlist.variables;
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

	public static class VarlistContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String nombreVariables;
		public Token IDENTIFIER;
		public VarlistFactorContext varlistFactor;
		public TerminalNode IDENTIFIER() { return getToken(MainParser.IDENTIFIER, 0); }
		public VarlistFactorContext varlistFactor() {
			return getRuleContext(VarlistFactorContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarlistContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist(Map<String, String> map,String nombreBloque) throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 26, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((VarlistContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(168);
			((VarlistContext)_localctx).varlistFactor = varlistFactor(_localctx.map, _localctx.nombreBloque);

			        String claveNombre = _localctx.nombreBloque + "::" + (((VarlistContext)_localctx).IDENTIFIER!=null?((VarlistContext)_localctx).IDENTIFIER.getText():null);
			        String nombre = (((VarlistContext)_localctx).IDENTIFIER!=null?((VarlistContext)_localctx).IDENTIFIER.getText():null);
			        while(_localctx.map.containsKey(claveNombre)){
			            nombre += "1";
			            claveNombre += "1";
			        }
			        _localctx.map.put(claveNombre, "var");
			        //System.err.println("Declaracion de variable: " + claveNombre);
			        ((VarlistContext)_localctx).nombreVariables =  "<a NAME=\""+claveNombre+"\">" + nombre + "</a>" + ((VarlistContext)_localctx).varlistFactor.nombreVariables;
			    
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

	public static class VarlistFactorContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String nombreVariables;
		public VarlistContext varlist;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public VarlistFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarlistFactorContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_varlistFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterVarlistFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitVarlistFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitVarlistFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistFactorContext varlistFactor(Map<String, String> map,String nombreBloque) throws RecognitionException {
		VarlistFactorContext _localctx = new VarlistFactorContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 28, RULE_varlistFactor);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				((VarlistFactorContext)_localctx).nombreVariables =  "";
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(T__9);
				setState(173);
				((VarlistFactorContext)_localctx).varlist = varlist(_localctx.map, _localctx.nombreBloque);
				((VarlistFactorContext)_localctx).nombreVariables =  ", " + ((VarlistFactorContext)_localctx).varlist.nombreVariables;
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

	public static class DefprocContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String procedimiento;
		public String codigo;
		public Token IDENTIFIER;
		public Formal_paramlistContext formal_paramlist;
		public BlqContext blq;
		public TerminalNode IDENTIFIER() { return getToken(MainParser.IDENTIFIER, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public DefprocContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefprocContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_defproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterDefproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitDefproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitDefproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefprocContext defproc(Map<String, String> map,String nombreBloque) throws RecognitionException {
		DefprocContext _localctx = new DefprocContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 30, RULE_defproc);
		try {
			enterOuterAlt(_localctx, 1);
			{

			        Map<String,String> mapConParams = new HashMap<>();
			        mapConParams.putAll(_localctx.map);
			    
			setState(179);
			match(T__10);
			setState(180);
			((DefprocContext)_localctx).IDENTIFIER = match(IDENTIFIER);

			        String claveNombre = _localctx.nombreBloque + "::" + (((DefprocContext)_localctx).IDENTIFIER!=null?((DefprocContext)_localctx).IDENTIFIER.getText():null);
			        String nombre = (((DefprocContext)_localctx).IDENTIFIER!=null?((DefprocContext)_localctx).IDENTIFIER.getText():null);
			        while(_localctx.map.containsKey(claveNombre)){
			            nombre += "1";
			            claveNombre += "1";
			        }
			        _localctx.map.put(claveNombre, "procFunc");
			        mapConParams.put(claveNombre, "procFunc");
			        String nombreBloqueInterno = _localctx.nombreBloque + "::" + (((DefprocContext)_localctx).IDENTIFIER!=null?((DefprocContext)_localctx).IDENTIFIER.getText():null);
			    
			setState(182);
			((DefprocContext)_localctx).formal_paramlist = formal_paramlist(mapConParams, nombreBloqueInterno);
			setState(183);
			match(T__1);
			setState(184);
			((DefprocContext)_localctx).blq = blq(mapConParams, nombreBloqueInterno);
			setState(185);
			match(T__1);

			        ((DefprocContext)_localctx).procedimiento = "<LI> <a href=\"#"+claveNombre+"\">"+claveNombre.substring(7)+" "+((DefprocContext)_localctx).formal_paramlist.variables+";</a></LI>\n";
			        _localctx.procedimiento += ((DefprocContext)_localctx).blq.procYFunc;
			        ((DefprocContext)_localctx).codigo =  "<a NAME= \""+ claveNombre +"\" >"+ formatearReservada("PROCEDURE") + "  " + claveNombre.substring(7) + " " + ((DefprocContext)_localctx).formal_paramlist.variables + ";</a> <br/>";
			        // Propagamos hacia arriba posibles códigos de procedimientos y funciones que estuviesen anidados
			        _localctx.codigo += "<div style=\"margin-left:1cm\">" + ((DefprocContext)_localctx).blq.codigoFunc + ((DefprocContext)_localctx).blq.codigoProc + "</div>";
			        _localctx.codigo += ((DefprocContext)_localctx).blq.codigo + ";<br>";
			        _localctx.codigo += "<div class=\"moverse\"><a href=\"#inicioPrograma\">Al principio de la página</a></div>";
			        _localctx.codigo += "<div class=\"moverse\"><a href=\"#"+claveNombre+"\">Al principio del procedimiento "+claveNombre.substring(7)+"</a></div><br>";
			    
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

	public static class DeffunContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String funcion;
		public String codigo;
		public Token IDENTIFIER;
		public Formal_paramlistContext formal_paramlist;
		public BlqContext blq;
		public TerminalNode IDENTIFIER() { return getToken(MainParser.IDENTIFIER, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public DeffunContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DeffunContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_deffun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterDeffun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitDeffun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitDeffun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeffunContext deffun(Map<String, String> map,String nombreBloque) throws RecognitionException {
		DeffunContext _localctx = new DeffunContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 32, RULE_deffun);
		try {
			enterOuterAlt(_localctx, 1);
			{

			        Map<String,String> mapConParams = new HashMap<>();
			        mapConParams.putAll(_localctx.map);
			    
			setState(189);
			match(T__11);
			setState(190);
			((DeffunContext)_localctx).IDENTIFIER = match(IDENTIFIER);

			        String claveNombre = _localctx.nombreBloque + "::" + (((DeffunContext)_localctx).IDENTIFIER!=null?((DeffunContext)_localctx).IDENTIFIER.getText():null);
			        String nombre = (((DeffunContext)_localctx).IDENTIFIER!=null?((DeffunContext)_localctx).IDENTIFIER.getText():null);
			        while(_localctx.map.containsKey(claveNombre)){
			            nombre += "1";
			            claveNombre +="1";
			        }

			        _localctx.map.put(claveNombre, "procFunc");
			        mapConParams.put(claveNombre, "procFunc");
			        String nombreBloqueInterno = _localctx.nombreBloque + "::" + (((DeffunContext)_localctx).IDENTIFIER!=null?((DeffunContext)_localctx).IDENTIFIER.getText():null);
			    
			setState(192);
			((DeffunContext)_localctx).formal_paramlist = formal_paramlist(mapConParams, nombreBloqueInterno);
			setState(193);
			match(T__8);
			setState(194);
			tbas();
			setState(195);
			match(T__1);
			setState(196);
			((DeffunContext)_localctx).blq = blq(mapConParams, nombreBloqueInterno);
			setState(197);
			match(T__1);

			        ((DeffunContext)_localctx).funcion =  "<LI> <a href=\"#"+claveNombre+"\">"+claveNombre.substring(7)+" "+((DeffunContext)_localctx).formal_paramlist.variables+";</a></LI>\n";
			        _localctx.funcion += ((DeffunContext)_localctx).blq.procYFunc;
			        ((DeffunContext)_localctx).codigo =  "<a NAME= \""+ claveNombre +"\" >"+ formatearReservada("FUNCTION") + "  " + claveNombre.substring(7) + " " + ((DeffunContext)_localctx).formal_paramlist.variables + ";</a> <br/><br>";
			        _localctx.codigo += "<div style=\"margin-left:1cm\">" + ((DeffunContext)_localctx).blq.codigoFunc + ((DeffunContext)_localctx).blq.codigoProc + "</div>";
			        _localctx.codigo += ((DeffunContext)_localctx).blq.codigo + ";<br>";
			        _localctx.codigo += "<div class=\"moverse\"><a href=\"#inicioPrograma\">Al principio de la página</a></div>";
			        _localctx.codigo += "<div class=\"moverse\"><a href=\"#"+claveNombre+"\">Al principio de la función "+claveNombre.substring(7)+"</a></div><br>";
			    
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

	public static class Formal_paramlistContext extends ParserRuleContext {
		public Map<String,String> map;
		public String nombreBloque;
		public String variables;
		public Formal_paramContext formal_param;
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState, Map<String,String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFormal_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitFormal_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist(Map<String,String> map,String nombreBloque) throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 34, RULE_formal_paramlist);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(T__12);
				setState(201);
				((Formal_paramlistContext)_localctx).formal_param = formal_param(map, nombreBloque);
				setState(202);
				match(T__13);
				((Formal_paramlistContext)_localctx).variables =  "("+((Formal_paramlistContext)_localctx).formal_param.variables+")";
				}
				break;
			case T__1:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				((Formal_paramlistContext)_localctx).variables =  "";
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

	public static class Formal_paramContext extends ParserRuleContext {
		public Map<String,String> map;
		public String nombreBloque;
		public String variables;
		public VarlistContext varlist;
		public TbasContext tbas;
		public Formal_paramFactorContext formal_paramFactor;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Formal_paramFactorContext formal_paramFactor() {
			return getRuleContext(Formal_paramFactorContext.class,0);
		}
		public Formal_paramContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Formal_paramContext(ParserRuleContext parent, int invokingState, Map<String,String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_formal_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFormal_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFormal_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitFormal_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramContext formal_param(Map<String,String> map,String nombreBloque) throws RecognitionException {
		Formal_paramContext _localctx = new Formal_paramContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 36, RULE_formal_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			((Formal_paramContext)_localctx).varlist = varlist(map, nombreBloque);
			setState(209);
			match(T__8);
			setState(210);
			((Formal_paramContext)_localctx).tbas = tbas();
			setState(211);
			((Formal_paramContext)_localctx).formal_paramFactor = formal_paramFactor(map, nombreBloque);

			        //map.put(((Formal_paramContext)_localctx).varlist.nombreVariables, "var");
			        ((Formal_paramContext)_localctx).variables =  ((Formal_paramContext)_localctx).varlist.nombreVariables+": "+((Formal_paramContext)_localctx).tbas.tipoDevuelto+((Formal_paramContext)_localctx).formal_paramFactor.variables;
			    
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

	public static class Formal_paramFactorContext extends ParserRuleContext {
		public Map<String,String> map;
		public String nombreBloque;
		public String variables;
		public Formal_paramContext formal_param;
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_paramFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Formal_paramFactorContext(ParserRuleContext parent, int invokingState, Map<String,String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_formal_paramFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFormal_paramFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFormal_paramFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitFormal_paramFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramFactorContext formal_paramFactor(Map<String,String> map,String nombreBloque) throws RecognitionException {
		Formal_paramFactorContext _localctx = new Formal_paramFactorContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 38, RULE_formal_paramFactor);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				((Formal_paramFactorContext)_localctx).variables =  "";
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(T__1);
				setState(216);
				((Formal_paramFactorContext)_localctx).formal_param = formal_param(map, nombreBloque);
				((Formal_paramFactorContext)_localctx).variables =  "; " + ((Formal_paramFactorContext)_localctx).formal_param.variables ;
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

	public static class TbasContext extends ParserRuleContext {
		public String tipoDevuelto;
		public TbasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterTbas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitTbas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitTbas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TbasContext tbas() throws RecognitionException {
		TbasContext _localctx = new TbasContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tbas);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(T__14);
				((TbasContext)_localctx).tipoDevuelto =  formatearReservada("integer");
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(T__15);
				((TbasContext)_localctx).tipoDevuelto =  formatearReservada("real");
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

	public static class SentContext extends ParserRuleContext {
		public Map<String,String> map;
		public String nombreBloque;
		public String sentencia;
		public Token IDENTIFIER;
		public SentFactorContext sentFactor;
		public ExpcondContext expcond;
		public BlqContext b1;
		public BlqContext b2;
		public BlqContext blq;
		public ExpContext exp;
		public IncContext inc;
		public TerminalNode IDENTIFIER() { return getToken(MainParser.IDENTIFIER, 0); }
		public SentFactorContext sentFactor() {
			return getRuleContext(SentFactorContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public List<BlqContext> blq() {
			return getRuleContexts(BlqContext.class);
		}
		public BlqContext blq(int i) {
			return getRuleContext(BlqContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentContext(ParserRuleContext parent, int invokingState, Map<String,String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent(Map<String,String> map,String nombreBloque) throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 42, RULE_sent);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				((SentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(228);
				((SentContext)_localctx).sentFactor = sentFactor(_localctx.map, _localctx.nombreBloque, (((SentContext)_localctx).IDENTIFIER!=null?((SentContext)_localctx).IDENTIFIER.getText():null));
				setState(229);
				match(T__1);

				        ((SentContext)_localctx).sentencia =  "<div>" + formatear(_localctx.nombreBloque+"::"+(((SentContext)_localctx).IDENTIFIER!=null?((SentContext)_localctx).IDENTIFIER.getText():null), (((SentContext)_localctx).IDENTIFIER!=null?((SentContext)_localctx).IDENTIFIER.getText():null),_localctx.map) + ((SentContext)_localctx).sentFactor.sentencia + ";</div>";
				     
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(T__16);
				setState(233);
				((SentContext)_localctx).expcond = expcond(_localctx.map,_localctx.nombreBloque);
				setState(234);
				match(T__17);

				        Map<String,String> mapB1 = new HashMap<>();
				        mapB1.putAll(_localctx.map);
				     
				setState(236);
				((SentContext)_localctx).b1 = blq(mapB1, _localctx.nombreBloque);
				setState(237);
				match(T__18);

				        Map<String,String> mapB2 = new HashMap<>();
				        mapB2.putAll(_localctx.map);
				    
				setState(239);
				((SentContext)_localctx).b2 = blq(mapB2, _localctx.nombreBloque);

				        ((SentContext)_localctx).sentencia =  "<div> "+formatearReservada("IF")+" " + ((SentContext)_localctx).expcond.condicion + " "+formatearReservada("THEN")+" </div> <div style=\"margin-left:1cm\">" + ((SentContext)_localctx).b1.codigo + "</div> <div> "+formatearReservada("ELSE")+" </div> <div style=\"margin-left:1cm\"> " + ((SentContext)_localctx).b2.codigo + "</div>";
				     
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(T__19);
				setState(243);
				((SentContext)_localctx).expcond = expcond(_localctx.map, _localctx.nombreBloque);
				setState(244);
				match(T__20);

				        Map<String,String> mapBlq = new HashMap<>();
				        mapBlq.putAll(_localctx.map);
				     
				setState(246);
				((SentContext)_localctx).blq = blq(mapBlq, _localctx.nombreBloque);

				        ((SentContext)_localctx).sentencia =  "<div> "+formatearReservada("WHILE")+" " + ((SentContext)_localctx).expcond.condicion + " "+formatearReservada("DO")+" <br> <div style=\"margin-left:1cm\">" + ((SentContext)_localctx).blq.codigo + "</div></div>";
				     
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				match(T__21);

				        Map<String,String> mapBlq = new HashMap<>();
				        mapBlq.putAll(_localctx.map);
				     
				setState(251);
				((SentContext)_localctx).blq = blq(mapBlq, _localctx.nombreBloque);
				setState(252);
				match(T__22);
				setState(253);
				((SentContext)_localctx).expcond = expcond(_localctx.map,_localctx.nombreBloque);
				setState(254);
				match(T__1);

				        ((SentContext)_localctx).sentencia =  "<div> "+formatearReservada("REPEAT")+" </div> <div style=\"margin-left:1cm\">" + ((SentContext)_localctx).blq.codigo + "</div> "+formatearReservada("UNTIL")+" " + ((SentContext)_localctx).expcond.condicion + ";";
				     
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				match(T__23);
				setState(258);
				((SentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(259);
				match(T__24);
				setState(260);
				((SentContext)_localctx).exp = exp(_localctx.map, _localctx.nombreBloque);
				setState(261);
				((SentContext)_localctx).inc = inc();
				setState(262);
				((SentContext)_localctx).exp = exp(_localctx.map, _localctx.nombreBloque);
				setState(263);
				match(T__20);

				        Map<String,String> mapBlq = new HashMap<>();
				        mapBlq.putAll(_localctx.map);
				     
				setState(265);
				((SentContext)_localctx).blq = blq(mapBlq, _localctx.nombreBloque);

				        ((SentContext)_localctx).sentencia =  "<div> "+formatearReservada("FOR")+" " + (((SentContext)_localctx).IDENTIFIER!=null?((SentContext)_localctx).IDENTIFIER.getText():null) + " := " + ((SentContext)_localctx).exp.expresion + ((SentContext)_localctx).inc.incremento + ((SentContext)_localctx).exp.expresion + formatearReservada(" DO ") +" </div> <div style=\"margin-left:1cm\"> " + ((SentContext)_localctx).blq.codigo + "</div>";
				     
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

	public static class SentFactorContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String proc_o_asignacion;
		public String sentencia;
		public Proc_callContext proc_call;
		public AsigContext asig;
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public SentFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentFactorContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque, String proc_o_asignacion) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
			this.proc_o_asignacion = proc_o_asignacion;
		}
		@Override public int getRuleIndex() { return RULE_sentFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSentFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSentFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitSentFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentFactorContext sentFactor(Map<String, String> map,String nombreBloque,String proc_o_asignacion) throws RecognitionException {
		SentFactorContext _localctx = new SentFactorContext(_ctx, getState(), map, nombreBloque, proc_o_asignacion);
		enterRule(_localctx, 44, RULE_sentFactor);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				((SentFactorContext)_localctx).proc_call = proc_call(_localctx.map, _localctx.nombreBloque);

				        ((SentFactorContext)_localctx).sentencia =  ((SentFactorContext)_localctx).proc_call.parametros;
				        _localctx.map.put(nombreBloque+"::"+proc_o_asignacion,"procFunc");
				    
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				((SentFactorContext)_localctx).asig = asig(_localctx.map, _localctx.nombreBloque);

				        ((SentFactorContext)_localctx).sentencia =  ((SentFactorContext)_localctx).asig.asignacion;
				    
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

	public static class AsigContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String asignacion;
		public ExpContext exp;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AsigContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig(Map<String, String> map,String nombreBloque) throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 46, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__24);
			setState(279);
			((AsigContext)_localctx).exp = exp(_localctx.map, _localctx.nombreBloque);

			    ((AsigContext)_localctx).asignacion =  " := "+((AsigContext)_localctx).exp.expresion;
			    
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

	public static class ExpContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String expresion;
		public FactorContext factor;
		public ExpFactorContext expFactor;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpFactorContext expFactor() {
			return getRuleContext(ExpFactorContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp(Map<String, String> map,String nombreBloque) throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 48, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			((ExpContext)_localctx).factor = factor(_localctx.map, _localctx.nombreBloque);
			setState(283);
			((ExpContext)_localctx).expFactor = expFactor(_localctx.map, _localctx.nombreBloque);

			        ((ExpContext)_localctx).expresion =  ((ExpContext)_localctx).factor.variable+((ExpContext)_localctx).expFactor.operacion;
			    
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

	public static class ExpFactorContext extends ParserRuleContext {
		public Map<String,String> map;
		public String nombreBloque;
		public String operacion;
		public OpContext op;
		public ExpContext exp;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpFactorContext(ParserRuleContext parent, int invokingState, Map<String,String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_expFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExpFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExpFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExpFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpFactorContext expFactor(Map<String,String> map,String nombreBloque) throws RecognitionException {
		ExpFactorContext _localctx = new ExpFactorContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 50, RULE_expFactor);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__6:
			case T__9:
			case T__13:
			case T__17:
			case T__20:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				((ExpFactorContext)_localctx).operacion =  "";
				}
				break;
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				((ExpFactorContext)_localctx).op = op();
				setState(288);
				((ExpFactorContext)_localctx).exp = exp(_localctx.map, _localctx.nombreBloque);

				        ((ExpFactorContext)_localctx).operacion =  " " + ((ExpFactorContext)_localctx).op.simbolo + " " + ((ExpFactorContext)_localctx).exp.expresion;
				    
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

	public static class OpContext extends ParserRuleContext {
		public String simbolo;
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_op);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(T__25);
				((OpContext)_localctx).simbolo =  " + ";
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(T__26);
				((OpContext)_localctx).simbolo =  " - ";
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				match(T__27);
				((OpContext)_localctx).simbolo =  " * ";
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				match(T__28);
				((OpContext)_localctx).simbolo =  formatearReservada(" DIV ");
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				match(T__29);
				((OpContext)_localctx).simbolo =  formatearReservada(" MOD ");
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

	public static class FactorContext extends ParserRuleContext {
		public Map<String,String> map;
		public String nombreBloque;
		public String variable;
		public SimpvalueContext simpvalue;
		public ExpContext exp;
		public Token IDENTIFIER;
		public SubpparamlistContext subpparamlist;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MainParser.IDENTIFIER, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactorContext(ParserRuleContext parent, int invokingState, Map<String,String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor(Map<String,String> map,String nombreBloque) throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 54, RULE_factor);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
			case NUMERIC_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				((FactorContext)_localctx).simpvalue = simpvalue();

				        ((FactorContext)_localctx).variable =  formatear(_localctx.nombreBloque+"::"+((FactorContext)_localctx).simpvalue.constante, ((FactorContext)_localctx).simpvalue.constante,_localctx.map);
				    
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(T__12);
				setState(309);
				((FactorContext)_localctx).exp = exp(_localctx.map, _localctx.nombreBloque);
				setState(310);
				match(T__13);

				        ((FactorContext)_localctx).variable =  "("+((FactorContext)_localctx).exp.expresion+")";
				    
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				((FactorContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(314);
				((FactorContext)_localctx).subpparamlist = subpparamlist(_localctx.map, _localctx.nombreBloque);

				        if(!_localctx.map.containsKey(_localctx.nombreBloque+"::"+(((FactorContext)_localctx).IDENTIFIER!=null?((FactorContext)_localctx).IDENTIFIER.getText():null))){
				            _localctx.map.put(_localctx.nombreBloque+"::"+(((FactorContext)_localctx).IDENTIFIER!=null?((FactorContext)_localctx).IDENTIFIER.getText():null),"procFunc");
				        }
				        ((FactorContext)_localctx).variable =  formatear(_localctx.nombreBloque+"::"+(((FactorContext)_localctx).IDENTIFIER!=null?((FactorContext)_localctx).IDENTIFIER.getText():null),(((FactorContext)_localctx).IDENTIFIER!=null?((FactorContext)_localctx).IDENTIFIER.getText():null),_localctx.map) +" " + ((FactorContext)_localctx).subpparamlist.parametros;
				    
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

	public static class SubpparamlistContext extends ParserRuleContext {
		public Map<String,String> map;
		public String nombreBloque;
		public String parametros;
		public ExplistContext explist;
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SubpparamlistContext(ParserRuleContext parent, int invokingState, Map<String,String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_subpparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSubpparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSubpparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitSubpparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubpparamlistContext subpparamlist(Map<String,String> map,String nombreBloque) throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 56, RULE_subpparamlist);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__6:
			case T__9:
			case T__13:
			case T__17:
			case T__20:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				((SubpparamlistContext)_localctx).parametros = "";
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(T__12);
				setState(321);
				((SubpparamlistContext)_localctx).explist = explist(_localctx.map, _localctx.nombreBloque);
				setState(322);
				match(T__13);
				((SubpparamlistContext)_localctx).parametros =  "("+((SubpparamlistContext)_localctx).explist.expresiones+")";
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

	public static class ExplistContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String expresiones;
		public ExpContext exp;
		public ExplistFactorContext explistFactor;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistFactorContext explistFactor() {
			return getRuleContext(ExplistFactorContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExplistContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist(Map<String, String> map,String nombreBloque) throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 58, RULE_explist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			((ExplistContext)_localctx).exp = exp(_localctx.map, _localctx.nombreBloque);
			setState(328);
			((ExplistContext)_localctx).explistFactor = explistFactor(_localctx.map,_localctx.nombreBloque);

			        ((ExplistContext)_localctx).expresiones =  ((ExplistContext)_localctx).exp.expresion + ((ExplistContext)_localctx).explistFactor.expresiones;
			    
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

	public static class ExplistFactorContext extends ParserRuleContext {
		public Map<String,String> map;
		public String nombreBloque;
		public String expresiones;
		public ExplistContext explist;
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExplistFactorContext(ParserRuleContext parent, int invokingState, Map<String,String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_explistFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExplistFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExplistFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExplistFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistFactorContext explistFactor(Map<String,String> map,String nombreBloque) throws RecognitionException {
		ExplistFactorContext _localctx = new ExplistFactorContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 60, RULE_explistFactor);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				((ExplistFactorContext)_localctx).expresiones = "";
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(T__9);
				setState(333);
				((ExplistFactorContext)_localctx).explist = explist(_localctx.map,_localctx.nombreBloque);
				((ExplistFactorContext)_localctx).expresiones =  ", "+((ExplistFactorContext)_localctx).explist.expresiones;
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

	public static class Proc_callContext extends ParserRuleContext {
		public Map<String, String> map;
		public String nombreBloque;
		public String parametros;
		public SubpparamlistContext subpparamlist;
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Proc_callContext(ParserRuleContext parent, int invokingState, Map<String, String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitProc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitProc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_callContext proc_call(Map<String, String> map,String nombreBloque) throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 62, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			((Proc_callContext)_localctx).subpparamlist = subpparamlist(_localctx.map,_localctx.nombreBloque);
			((Proc_callContext)_localctx).parametros =  ((Proc_callContext)_localctx).subpparamlist.parametros;
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

	public static class IncContext extends ParserRuleContext {
		public String incremento;
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_inc);
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(T__30);
				((IncContext)_localctx).incremento =  formatearReservada(" TO ");
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(T__31);
				((IncContext)_localctx).incremento =  formatearReservada(" DOWNTO ");
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

	public static class ExpcondContext extends ParserRuleContext {
		public Map<String,String> map;
		public String nombreBloque;
		public String condicion;
		public FactorcondContext factorcond;
		public ExpcondFactorContext expcondFactor;
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public ExpcondFactorContext expcondFactor() {
			return getRuleContext(ExpcondFactorContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpcondContext(ParserRuleContext parent, int invokingState, Map<String,String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExpcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExpcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondContext expcond(Map<String,String> map,String nombreBloque) throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 66, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			((ExpcondContext)_localctx).factorcond = factorcond(_localctx.map, _localctx.nombreBloque);
			setState(348);
			((ExpcondContext)_localctx).expcondFactor = expcondFactor(_localctx.map, _localctx.nombreBloque);
			((ExpcondContext)_localctx).condicion =  ((ExpcondContext)_localctx).factorcond.condicion + ((ExpcondContext)_localctx).expcondFactor.condicion;
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

	public static class ExpcondFactorContext extends ParserRuleContext {
		public Map<String,String> map;
		public String nombreBloque;
		public String condicion;
		public OplogContext oplog;
		public ExpcondContext expcond;
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public ExpcondFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpcondFactorContext(ParserRuleContext parent, int invokingState, Map<String,String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_expcondFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExpcondFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExpcondFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitExpcondFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondFactorContext expcondFactor(Map<String,String> map,String nombreBloque) throws RecognitionException {
		ExpcondFactorContext _localctx = new ExpcondFactorContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 68, RULE_expcondFactor);
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__13:
			case T__17:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				((ExpcondFactorContext)_localctx).condicion =  "";
				}
				break;
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				((ExpcondFactorContext)_localctx).oplog = oplog();
				setState(353);
				((ExpcondFactorContext)_localctx).expcond = expcond(_localctx.map, _localctx.nombreBloque);
				((ExpcondFactorContext)_localctx).condicion =  ((ExpcondFactorContext)_localctx).oplog.bool + ((ExpcondFactorContext)_localctx).expcond.condicion;
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

	public static class OplogContext extends ParserRuleContext {
		public String bool;
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitOplog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitOplog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_oplog);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(T__32);
				((OplogContext)_localctx).bool =  formatearReservada(" OR ");
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(T__33);
				((OplogContext)_localctx).bool =  formatearReservada(" AND ");
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

	public static class FactorcondContext extends ParserRuleContext {
		public Map<String,String> map;
		public String nombreBloque;
		public String condicion;
		public ExpContext e1;
		public OpcompContext opcomp;
		public ExpContext e2;
		public ExpcondContext expcond;
		public FactorcondContext factorcond;
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public FactorcondContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactorcondContext(ParserRuleContext parent, int invokingState, Map<String,String> map, String nombreBloque) {
			super(parent, invokingState);
			this.map = map;
			this.nombreBloque = nombreBloque;
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFactorcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitFactorcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorcondContext factorcond(Map<String,String> map,String nombreBloque) throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState(), map, nombreBloque);
		enterRule(_localctx, 72, RULE_factorcond);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				((FactorcondContext)_localctx).e1 = exp(_localctx.map, _localctx.nombreBloque);
				setState(365);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(366);
				((FactorcondContext)_localctx).e2 = exp(_localctx.map, _localctx.nombreBloque);
				((FactorcondContext)_localctx).condicion =  ((FactorcondContext)_localctx).e1.expresion + ((FactorcondContext)_localctx).opcomp.comparador + ((FactorcondContext)_localctx).e2.expresion;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(T__12);
				setState(370);
				((FactorcondContext)_localctx).expcond = expcond(_localctx.map, _localctx.nombreBloque);
				setState(371);
				match(T__13);
				((FactorcondContext)_localctx).condicion =  "(" + ((FactorcondContext)_localctx).expcond.condicion + ")";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				match(T__34);
				setState(375);
				((FactorcondContext)_localctx).factorcond = factorcond(_localctx.map, _localctx.nombreBloque);
				((FactorcondContext)_localctx).condicion = formatearReservada("NOT")+ " " + ((FactorcondContext)_localctx).factorcond.condicion;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				match(T__35);
				((FactorcondContext)_localctx).condicion = formatearReservada("TRUE");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				match(T__36);
				((FactorcondContext)_localctx).condicion = formatearReservada("FALSE");
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

	public static class OpcompContext extends ParserRuleContext {
		public String comparador;
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitOpcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitOpcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_opcomp);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(T__37);
				((OpcompContext)_localctx).comparador =  " < ";
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(T__38);
				((OpcompContext)_localctx).comparador =  " > ";
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				match(T__39);
				((OpcompContext)_localctx).comparador =  " <= ";
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				match(T__40);
				((OpcompContext)_localctx).comparador =  " >= ";
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
				match(T__6);
				((OpcompContext)_localctx).comparador =  " = ";
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u018f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4e\n"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6o\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0096\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00a8\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00b3\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00d1\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00de\n\25\3\26\3\26\3\26\3\26\5\26\u00e4\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010f"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0117\n\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u0126\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0132\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0140\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0148\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \5 \u0153\n \3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u015c\n\"\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\5$\u0167\n$\3%\3%\3%\3%\5%\u016d\n%\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0181\n&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u018d\n\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\2\2\u018e\2N\3\2\2\2\4W\3\2\2"+
		"\2\6d\3\2\2\2\bf\3\2\2\2\nn\3\2\2\2\f|\3\2\2\2\16~\3\2\2\2\20\u0082\3"+
		"\2\2\2\22\u008d\3\2\2\2\24\u0095\3\2\2\2\26\u0097\3\2\2\2\30\u009c\3\2"+
		"\2\2\32\u00a7\3\2\2\2\34\u00a9\3\2\2\2\36\u00b2\3\2\2\2 \u00b4\3\2\2\2"+
		"\"\u00be\3\2\2\2$\u00d0\3\2\2\2&\u00d2\3\2\2\2(\u00dd\3\2\2\2*\u00e3\3"+
		"\2\2\2,\u010e\3\2\2\2.\u0116\3\2\2\2\60\u0118\3\2\2\2\62\u011c\3\2\2\2"+
		"\64\u0125\3\2\2\2\66\u0131\3\2\2\28\u013f\3\2\2\2:\u0147\3\2\2\2<\u0149"+
		"\3\2\2\2>\u0152\3\2\2\2@\u0154\3\2\2\2B\u015b\3\2\2\2D\u015d\3\2\2\2F"+
		"\u0166\3\2\2\2H\u016c\3\2\2\2J\u0180\3\2\2\2L\u018c\3\2\2\2NO\7\3\2\2"+
		"OP\7\61\2\2PQ\b\2\1\2QR\7\4\2\2RS\b\2\1\2ST\5\4\3\2TU\b\2\1\2UV\7\5\2"+
		"\2V\3\3\2\2\2WX\b\3\1\2XY\5\6\4\2YZ\b\3\1\2Z[\7\6\2\2[\\\5\b\5\2\\]\7"+
		"\7\2\2]^\b\3\1\2^\5\3\2\2\2_e\b\4\1\2`a\5\f\7\2ab\5\6\4\2bc\b\4\1\2ce"+
		"\3\2\2\2d_\3\2\2\2d`\3\2\2\2e\7\3\2\2\2fg\5,\27\2gh\5\n\6\2hi\b\5\1\2"+
		"i\t\3\2\2\2jo\b\6\1\2kl\5\b\5\2lm\b\6\1\2mo\3\2\2\2nj\3\2\2\2nk\3\2\2"+
		"\2o\13\3\2\2\2pq\5\16\b\2qr\b\7\1\2r}\3\2\2\2st\5\26\f\2tu\b\7\1\2u}\3"+
		"\2\2\2vw\5 \21\2wx\b\7\1\2x}\3\2\2\2yz\5\"\22\2z{\b\7\1\2{}\3\2\2\2|p"+
		"\3\2\2\2|s\3\2\2\2|v\3\2\2\2|y\3\2\2\2}\r\3\2\2\2~\177\7\b\2\2\177\u0080"+
		"\5\20\t\2\u0080\u0081\b\b\1\2\u0081\17\3\2\2\2\u0082\u0083\7\61\2\2\u0083"+
		"\u0084\7\t\2\2\u0084\u0085\5\24\13\2\u0085\u0086\7\4\2\2\u0086\u0087\5"+
		"\22\n\2\u0087\u0088\b\t\1\2\u0088\21\3\2\2\2\u0089\u008e\b\n\1\2\u008a"+
		"\u008b\5\20\t\2\u008b\u008c\b\n\1\2\u008c\u008e\3\2\2\2\u008d\u0089\3"+
		"\2\2\2\u008d\u008a\3\2\2\2\u008e\23\3\2\2\2\u008f\u0090\7,\2\2\u0090\u0096"+
		"\b\13\1\2\u0091\u0092\7-\2\2\u0092\u0096\b\13\1\2\u0093\u0094\7.\2\2\u0094"+
		"\u0096\b\13\1\2\u0095\u008f\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0093\3"+
		"\2\2\2\u0096\25\3\2\2\2\u0097\u0098\7\n\2\2\u0098\u0099\5\30\r\2\u0099"+
		"\u009a\7\4\2\2\u009a\u009b\b\f\1\2\u009b\27\3\2\2\2\u009c\u009d\5\34\17"+
		"\2\u009d\u009e\7\13\2\2\u009e\u009f\5*\26\2\u009f\u00a0\5\32\16\2\u00a0"+
		"\u00a1\b\r\1\2\u00a1\31\3\2\2\2\u00a2\u00a8\b\16\1\2\u00a3\u00a4\7\4\2"+
		"\2\u00a4\u00a5\5\30\r\2\u00a5\u00a6\b\16\1\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a2\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\33\3\2\2\2\u00a9\u00aa\7\61\2"+
		"\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac\b\17\1\2\u00ac\35\3\2\2\2\u00ad\u00b3"+
		"\b\20\1\2\u00ae\u00af\7\f\2\2\u00af\u00b0\5\34\17\2\u00b0\u00b1\b\20\1"+
		"\2\u00b1\u00b3\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\37"+
		"\3\2\2\2\u00b4\u00b5\b\21\1\2\u00b5\u00b6\7\r\2\2\u00b6\u00b7\7\61\2\2"+
		"\u00b7\u00b8\b\21\1\2\u00b8\u00b9\5$\23\2\u00b9\u00ba\7\4\2\2\u00ba\u00bb"+
		"\5\4\3\2\u00bb\u00bc\7\4\2\2\u00bc\u00bd\b\21\1\2\u00bd!\3\2\2\2\u00be"+
		"\u00bf\b\22\1\2\u00bf\u00c0\7\16\2\2\u00c0\u00c1\7\61\2\2\u00c1\u00c2"+
		"\b\22\1\2\u00c2\u00c3\5$\23\2\u00c3\u00c4\7\13\2\2\u00c4\u00c5\5*\26\2"+
		"\u00c5\u00c6\7\4\2\2\u00c6\u00c7\5\4\3\2\u00c7\u00c8\7\4\2\2\u00c8\u00c9"+
		"\b\22\1\2\u00c9#\3\2\2\2\u00ca\u00cb\7\17\2\2\u00cb\u00cc\5&\24\2\u00cc"+
		"\u00cd\7\20\2\2\u00cd\u00ce\b\23\1\2\u00ce\u00d1\3\2\2\2\u00cf\u00d1\b"+
		"\23\1\2\u00d0\u00ca\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1%\3\2\2\2\u00d2\u00d3"+
		"\5\34\17\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5\5*\26\2\u00d5\u00d6\5(\25"+
		"\2\u00d6\u00d7\b\24\1\2\u00d7\'\3\2\2\2\u00d8\u00de\b\25\1\2\u00d9\u00da"+
		"\7\4\2\2\u00da\u00db\5&\24\2\u00db\u00dc\b\25\1\2\u00dc\u00de\3\2\2\2"+
		"\u00dd\u00d8\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de)\3\2\2\2\u00df\u00e0\7"+
		"\21\2\2\u00e0\u00e4\b\26\1\2\u00e1\u00e2\7\22\2\2\u00e2\u00e4\b\26\1\2"+
		"\u00e3\u00df\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4+\3\2\2\2\u00e5\u00e6\7"+
		"\61\2\2\u00e6\u00e7\5.\30\2\u00e7\u00e8\7\4\2\2\u00e8\u00e9\b\27\1\2\u00e9"+
		"\u010f\3\2\2\2\u00ea\u00eb\7\23\2\2\u00eb\u00ec\5D#\2\u00ec\u00ed\7\24"+
		"\2\2\u00ed\u00ee\b\27\1\2\u00ee\u00ef\5\4\3\2\u00ef\u00f0\7\25\2\2\u00f0"+
		"\u00f1\b\27\1\2\u00f1\u00f2\5\4\3\2\u00f2\u00f3\b\27\1\2\u00f3\u010f\3"+
		"\2\2\2\u00f4\u00f5\7\26\2\2\u00f5\u00f6\5D#\2\u00f6\u00f7\7\27\2\2\u00f7"+
		"\u00f8\b\27\1\2\u00f8\u00f9\5\4\3\2\u00f9\u00fa\b\27\1\2\u00fa\u010f\3"+
		"\2\2\2\u00fb\u00fc\7\30\2\2\u00fc\u00fd\b\27\1\2\u00fd\u00fe\5\4\3\2\u00fe"+
		"\u00ff\7\31\2\2\u00ff\u0100\5D#\2\u0100\u0101\7\4\2\2\u0101\u0102\b\27"+
		"\1\2\u0102\u010f\3\2\2\2\u0103\u0104\7\32\2\2\u0104\u0105\7\61\2\2\u0105"+
		"\u0106\7\33\2\2\u0106\u0107\5\62\32\2\u0107\u0108\5B\"\2\u0108\u0109\5"+
		"\62\32\2\u0109\u010a\7\27\2\2\u010a\u010b\b\27\1\2\u010b\u010c\5\4\3\2"+
		"\u010c\u010d\b\27\1\2\u010d\u010f\3\2\2\2\u010e\u00e5\3\2\2\2\u010e\u00ea"+
		"\3\2\2\2\u010e\u00f4\3\2\2\2\u010e\u00fb\3\2\2\2\u010e\u0103\3\2\2\2\u010f"+
		"-\3\2\2\2\u0110\u0111\5@!\2\u0111\u0112\b\30\1\2\u0112\u0117\3\2\2\2\u0113"+
		"\u0114\5\60\31\2\u0114\u0115\b\30\1\2\u0115\u0117\3\2\2\2\u0116\u0110"+
		"\3\2\2\2\u0116\u0113\3\2\2\2\u0117/\3\2\2\2\u0118\u0119\7\33\2\2\u0119"+
		"\u011a\5\62\32\2\u011a\u011b\b\31\1\2\u011b\61\3\2\2\2\u011c\u011d\58"+
		"\35\2\u011d\u011e\5\64\33\2\u011e\u011f\b\32\1\2\u011f\63\3\2\2\2\u0120"+
		"\u0126\b\33\1\2\u0121\u0122\5\66\34\2\u0122\u0123\5\62\32\2\u0123\u0124"+
		"\b\33\1\2\u0124\u0126\3\2\2\2\u0125\u0120\3\2\2\2\u0125\u0121\3\2\2\2"+
		"\u0126\65\3\2\2\2\u0127\u0128\7\34\2\2\u0128\u0132\b\34\1\2\u0129\u012a"+
		"\7\35\2\2\u012a\u0132\b\34\1\2\u012b\u012c\7\36\2\2\u012c\u0132\b\34\1"+
		"\2\u012d\u012e\7\37\2\2\u012e\u0132\b\34\1\2\u012f\u0130\7 \2\2\u0130"+
		"\u0132\b\34\1\2\u0131\u0127\3\2\2\2\u0131\u0129\3\2\2\2\u0131\u012b\3"+
		"\2\2\2\u0131\u012d\3\2\2\2\u0131\u012f\3\2\2\2\u0132\67\3\2\2\2\u0133"+
		"\u0134\5\24\13\2\u0134\u0135\b\35\1\2\u0135\u0140\3\2\2\2\u0136\u0137"+
		"\7\17\2\2\u0137\u0138\5\62\32\2\u0138\u0139\7\20\2\2\u0139\u013a\b\35"+
		"\1\2\u013a\u0140\3\2\2\2\u013b\u013c\7\61\2\2\u013c\u013d\5:\36\2\u013d"+
		"\u013e\b\35\1\2\u013e\u0140\3\2\2\2\u013f\u0133\3\2\2\2\u013f\u0136\3"+
		"\2\2\2\u013f\u013b\3\2\2\2\u01409\3\2\2\2\u0141\u0148\b\36\1\2\u0142\u0143"+
		"\7\17\2\2\u0143\u0144\5<\37\2\u0144\u0145\7\20\2\2\u0145\u0146\b\36\1"+
		"\2\u0146\u0148\3\2\2\2\u0147\u0141\3\2\2\2\u0147\u0142\3\2\2\2\u0148;"+
		"\3\2\2\2\u0149\u014a\5\62\32\2\u014a\u014b\5> \2\u014b\u014c\b\37\1\2"+
		"\u014c=\3\2\2\2\u014d\u0153\b \1\2\u014e\u014f\7\f\2\2\u014f\u0150\5<"+
		"\37\2\u0150\u0151\b \1\2\u0151\u0153\3\2\2\2\u0152\u014d\3\2\2\2\u0152"+
		"\u014e\3\2\2\2\u0153?\3\2\2\2\u0154\u0155\5:\36\2\u0155\u0156\b!\1\2\u0156"+
		"A\3\2\2\2\u0157\u0158\7!\2\2\u0158\u015c\b\"\1\2\u0159\u015a\7\"\2\2\u015a"+
		"\u015c\b\"\1\2\u015b\u0157\3\2\2\2\u015b\u0159\3\2\2\2\u015cC\3\2\2\2"+
		"\u015d\u015e\5J&\2\u015e\u015f\5F$\2\u015f\u0160\b#\1\2\u0160E\3\2\2\2"+
		"\u0161\u0167\b$\1\2\u0162\u0163\5H%\2\u0163\u0164\5D#\2\u0164\u0165\b"+
		"$\1\2\u0165\u0167\3\2\2\2\u0166\u0161\3\2\2\2\u0166\u0162\3\2\2\2\u0167"+
		"G\3\2\2\2\u0168\u0169\7#\2\2\u0169\u016d\b%\1\2\u016a\u016b\7$\2\2\u016b"+
		"\u016d\b%\1\2\u016c\u0168\3\2\2\2\u016c\u016a\3\2\2\2\u016dI\3\2\2\2\u016e"+
		"\u016f\5\62\32\2\u016f\u0170\5L\'\2\u0170\u0171\5\62\32\2\u0171\u0172"+
		"\b&\1\2\u0172\u0181\3\2\2\2\u0173\u0174\7\17\2\2\u0174\u0175\5D#\2\u0175"+
		"\u0176\7\20\2\2\u0176\u0177\b&\1\2\u0177\u0181\3\2\2\2\u0178\u0179\7%"+
		"\2\2\u0179\u017a\5J&\2\u017a\u017b\b&\1\2\u017b\u0181\3\2\2\2\u017c\u017d"+
		"\7&\2\2\u017d\u0181\b&\1\2\u017e\u017f\7\'\2\2\u017f\u0181\b&\1\2\u0180"+
		"\u016e\3\2\2\2\u0180\u0173\3\2\2\2\u0180\u0178\3\2\2\2\u0180\u017c\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0181K\3\2\2\2\u0182\u0183\7(\2\2\u0183\u018d"+
		"\b\'\1\2\u0184\u0185\7)\2\2\u0185\u018d\b\'\1\2\u0186\u0187\7*\2\2\u0187"+
		"\u018d\b\'\1\2\u0188\u0189\7+\2\2\u0189\u018d\b\'\1\2\u018a\u018b\7\t"+
		"\2\2\u018b\u018d\b\'\1\2\u018c\u0182\3\2\2\2\u018c\u0184\3\2\2\2\u018c"+
		"\u0186\3\2\2\2\u018c\u0188\3\2\2\2\u018c\u018a\3\2\2\2\u018dM\3\2\2\2"+
		"\30dn|\u008d\u0095\u00a7\u00b2\u00d0\u00dd\u00e3\u010e\u0116\u0125\u0131"+
		"\u013f\u0147\u0152\u015b\u0166\u016c\u0180\u018c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}