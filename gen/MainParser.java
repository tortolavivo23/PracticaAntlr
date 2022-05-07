// Generated from /home/paco/IdeaProjects/ProgComp/Codeforces/PracticaAntlr/src/Main.g4 by ANTLR 4.10.1

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

	    public String formatear(String cadena, Map<String,String> identificadores) {
	        if(!identificadores.containsKey(cadena)){
	            return "<SPAN CLASS=\"ctesindeclarar\">"+cadena+"</SPAN>";
	        }
	        return "<SPAN CLASS=\""+identificadores.get(cadena)+"\">"+cadena+"</SPAN>";
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

			            System.out.println("<H1> Programa: "+(((PrgContext)_localctx).IDENTIFIER!=null?((PrgContext)_localctx).IDENTIFIER.getText():null)+" </H1>");
			        
			setState(79);
			match(T__1);

			            System.out.println("<UL>");
			        
			setState(81);
			((PrgContext)_localctx).blq = blq();

			            // Lista de cabeceras de procedimientos y funciones
			            System.out.println(((PrgContext)_localctx).blq.procYFunc+"</UL>\n<HR/>");

			            // Código de todas las funciones y procedimientos
			            System.out.println(((PrgContext)_localctx).blq.codigoProc);
			            System.out.println(((PrgContext)_localctx).blq.codigoFunc);

			            // Declaraciones y sentencias del programa principal
			            System.out.println("<HR/> \n <H2> Programa principal </H2>");
			                // Mostramos primero constantes y variables
			            System.out.println(((PrgContext)_localctx).blq.constantes);
			            System.out.println(((PrgContext)_localctx).blq.variables);
			                // Mostrar el código principal
			            System.out.println(((PrgContext)_localctx).blq.codigo + ".");
			        
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
		public BlqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final BlqContext blq() throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			HashMap<String, String> map = new HashMap<String, String>();
			setState(86);
			((BlqContext)_localctx).dcllist = dcllist(map);

			            ((BlqContext)_localctx).procYFunc =  ((BlqContext)_localctx).dcllist.procYFunc;
			            ((BlqContext)_localctx).codigo =  ((BlqContext)_localctx).dcllist.codigo;
			            ((BlqContext)_localctx).constantes =  ((BlqContext)_localctx).dcllist.constantes;
			            ((BlqContext)_localctx).variables =  ((BlqContext)_localctx).dcllist.variables;
			            ((BlqContext)_localctx).codigoProc =  ((BlqContext)_localctx).dcllist.codigoProc;
			            ((BlqContext)_localctx).codigoFunc =  ((BlqContext)_localctx).dcllist.codigoFunc;
			    
			setState(88);
			match(T__3);
			setState(89);
			((BlqContext)_localctx).sentlist = sentlist(map);
			setState(90);
			match(T__4);

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
		public DcllistContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final DcllistContext dcllist(Map<String, String> map) throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState(), map);
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
				((DcllistContext)_localctx).dcl = dcl(_localctx.map);
				setState(95);
				((DcllistContext)_localctx).dcllist = dcllist(_localctx.map);

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
		public SentlistContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final SentlistContext sentlist(Map<String, String> map) throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState(), map);
		enterRule(_localctx, 6, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((SentlistContext)_localctx).sent = sent(_localctx.map);
			setState(101);
			((SentlistContext)_localctx).sentlistFactor = sentlistFactor(_localctx.map);

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
		public String codigo;
		public SentlistContext sentlist;
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SentlistFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentlistFactorContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final SentlistFactorContext sentlistFactor(Map<String, String> map) throws RecognitionException {
		SentlistFactorContext _localctx = new SentlistFactorContext(_ctx, getState(), map);
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
				((SentlistFactorContext)_localctx).sentlist = sentlist(_localctx.map);

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
		public DclContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final DclContext dcl(Map<String, String> map) throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState(), map);
		enterRule(_localctx, 10, RULE_dcl);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				((DclContext)_localctx).defcte = defcte(_localctx.map);

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
				((DclContext)_localctx).defvar = defvar(_localctx.map);

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
				((DclContext)_localctx).defproc = defproc(_localctx.map);

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
				((DclContext)_localctx).deffun = deffun(_localctx.map);

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
		public String defConstantes;
		public CtelistContext ctelist;
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefcteContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final DefcteContext defcte(Map<String, String> map) throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState(), map);
		enterRule(_localctx, 12, RULE_defcte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__5);
			setState(125);
			((DefcteContext)_localctx).ctelist = ctelist(_localctx.map);
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
		public CtelistContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final CtelistContext ctelist(Map<String, String> map) throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState(), map);
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
			((CtelistContext)_localctx).ctelistFactor = ctelistFactor(_localctx.map);

			           String nombre = (((CtelistContext)_localctx).IDENTIFIER!=null?((CtelistContext)_localctx).IDENTIFIER.getText():null);
			           while(_localctx.map.containsKey(nombre)){
			                nombre += "1";
			           }
			           _localctx.map.put(nombre, "cte");
			            ((CtelistContext)_localctx).constantes =  nombre + " = " + formatear(((CtelistContext)_localctx).simpvalue.constante,_localctx.map) + ";" + ((CtelistContext)_localctx).ctelistFactor.constantes;
			        
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
		public String constantes;
		public CtelistContext ctelist;
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public CtelistFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CtelistFactorContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final CtelistFactorContext ctelistFactor(Map<String, String> map) throws RecognitionException {
		CtelistFactorContext _localctx = new CtelistFactorContext(_ctx, getState(), map);
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
				((CtelistFactorContext)_localctx).ctelist = ctelist(_localctx.map);
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
		public String defVariables;
		public DefvarlistContext defvarlist;
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefvarContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final DefvarContext defvar(Map<String, String> map) throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState(), map);
		enterRule(_localctx, 20, RULE_defvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__7);
			setState(150);
			((DefvarContext)_localctx).defvarlist = defvarlist(_localctx.map);
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
		public DefvarlistContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final DefvarlistContext defvarlist(Map<String, String> map) throws RecognitionException {
		DefvarlistContext _localctx = new DefvarlistContext(_ctx, getState(), map);
		enterRule(_localctx, 22, RULE_defvarlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((DefvarlistContext)_localctx).varlist = varlist(_localctx.map);
			setState(155);
			match(T__8);
			setState(156);
			((DefvarlistContext)_localctx).tbas = tbas();
			setState(157);
			((DefvarlistContext)_localctx).defvarlistFactor = defvarlistFactor(_localctx.map);
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
		public String variables;
		public DefvarlistContext defvarlist;
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
		public DefvarlistFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefvarlistFactorContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final DefvarlistFactorContext defvarlistFactor(Map<String, String> map) throws RecognitionException {
		DefvarlistFactorContext _localctx = new DefvarlistFactorContext(_ctx, getState(), map);
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
				((DefvarlistFactorContext)_localctx).defvarlist = defvarlist(_localctx.map);
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
		public String nombreVariables;
		public Token IDENTIFIER;
		public VarlistFactorContext varlistFactor;
		public TerminalNode IDENTIFIER() { return getToken(MainParser.IDENTIFIER, 0); }
		public VarlistFactorContext varlistFactor() {
			return getRuleContext(VarlistFactorContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarlistContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final VarlistContext varlist(Map<String, String> map) throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState(), map);
		enterRule(_localctx, 26, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((VarlistContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(168);
			((VarlistContext)_localctx).varlistFactor = varlistFactor(_localctx.map);

			        String nombre = (((VarlistContext)_localctx).IDENTIFIER!=null?((VarlistContext)_localctx).IDENTIFIER.getText():null);
			        while(_localctx.map.containsKey(nombre)){
			            nombre += "1";
			        }
			        _localctx.map.put(nombre, "var");
			        ((VarlistContext)_localctx).nombreVariables =  nombre + ((VarlistContext)_localctx).varlistFactor.nombreVariables;
			    
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
		public String nombreVariables;
		public VarlistContext varlist;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public VarlistFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarlistFactorContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final VarlistFactorContext varlistFactor(Map<String, String> map) throws RecognitionException {
		VarlistFactorContext _localctx = new VarlistFactorContext(_ctx, getState(), map);
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
				((VarlistFactorContext)_localctx).varlist = varlist(_localctx.map);
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
		public DefprocContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final DefprocContext defproc(Map<String, String> map) throws RecognitionException {
		DefprocContext _localctx = new DefprocContext(_ctx, getState(), map);
		enterRule(_localctx, 30, RULE_defproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__10);
			setState(179);
			((DefprocContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(180);
			((DefprocContext)_localctx).formal_paramlist = formal_paramlist();
			setState(181);
			match(T__1);
			setState(182);
			((DefprocContext)_localctx).blq = blq();
			setState(183);
			match(T__1);

			        String nombre = (((DefprocContext)_localctx).IDENTIFIER!=null?((DefprocContext)_localctx).IDENTIFIER.getText():null);
			        while(_localctx.map.containsKey(nombre)){
			            nombre += "1";
			        }
			        _localctx.map.put(nombre, "procFunc");
			        ((DefprocContext)_localctx).procedimiento = "<LI> <a href=\"#"+nombre+"\">"+nombre+" "+((DefprocContext)_localctx).formal_paramlist.variables+";</a></LI>\n";
			        ((DefprocContext)_localctx).codigo = "<a NAME= \""+ nombre +"\" >"+ formatearReservada("PROCEDURE") + "  " + nombre + " " + ((DefprocContext)_localctx).formal_paramlist.variables + ";</a> <br/>" + ((DefprocContext)_localctx).blq.codigo+";<br>";
			    
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
		public DeffunContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final DeffunContext deffun(Map<String, String> map) throws RecognitionException {
		DeffunContext _localctx = new DeffunContext(_ctx, getState(), map);
		enterRule(_localctx, 32, RULE_deffun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__11);
			setState(187);
			((DeffunContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(188);
			((DeffunContext)_localctx).formal_paramlist = formal_paramlist();
			setState(189);
			match(T__8);
			setState(190);
			tbas();
			setState(191);
			match(T__1);
			setState(192);
			((DeffunContext)_localctx).blq = blq();
			setState(193);
			match(T__1);

			        String nombre = (((DeffunContext)_localctx).IDENTIFIER!=null?((DeffunContext)_localctx).IDENTIFIER.getText():null);
			        while(_localctx.map.containsKey(nombre)){
			            nombre += "1";
			        }
			        _localctx.map.put(nombre, "procFunc");
			        ((DeffunContext)_localctx).funcion = "<LI> <a href=\"#"+nombre+"\">"+nombre+" "+((DeffunContext)_localctx).formal_paramlist.variables+";</a></LI>\n";
			        ((DeffunContext)_localctx).codigo = "<a NAME= \""+ nombre +"\" >"+ formatearReservada("FUNCTION") + "  " + nombre + " " + ((DeffunContext)_localctx).formal_paramlist.variables + ";</a> <br/>" + ((DeffunContext)_localctx).blq.codigo+";<br>";
			    
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
		public String variables;
		public Formal_paramContext formal_param;
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_formal_paramlist);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(T__12);
				setState(197);
				((Formal_paramlistContext)_localctx).formal_param = formal_param();
				setState(198);
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
		public Formal_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Formal_paramContext formal_param() throws RecognitionException {
		Formal_paramContext _localctx = new Formal_paramContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formal_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			((Formal_paramContext)_localctx).varlist = varlist(new HashMap<String, String>());
			setState(205);
			match(T__8);
			setState(206);
			((Formal_paramContext)_localctx).tbas = tbas();
			setState(207);
			((Formal_paramContext)_localctx).formal_paramFactor = formal_paramFactor();
			((Formal_paramContext)_localctx).variables =  ((Formal_paramContext)_localctx).tbas.tipoDevuelto+": "+((Formal_paramContext)_localctx).varlist.nombreVariables+((Formal_paramContext)_localctx).formal_paramFactor.variables;
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
		public String variables;
		public Formal_paramContext formal_param;
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_paramFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Formal_paramFactorContext formal_paramFactor() throws RecognitionException {
		Formal_paramFactorContext _localctx = new Formal_paramFactorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formal_paramFactor);
		try {
			setState(215);
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
				setState(211);
				match(T__1);
				setState(212);
				((Formal_paramFactorContext)_localctx).formal_param = formal_param();
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
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__14);
				((TbasContext)_localctx).tipoDevuelto =  formatearReservada("integer");
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
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
		public String sentencia;
		public Token IDENTIFIER;
		public SentFactorContext sentFactor;
		public ExpcondContext expcond;
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
		public SentContext(ParserRuleContext parent, int invokingState, Map<String,String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final SentContext sent(Map<String,String> map) throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState(), map);
		enterRule(_localctx, 42, RULE_sent);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				((SentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(224);
				((SentContext)_localctx).sentFactor = sentFactor(_localctx.map);
				setState(225);
				match(T__1);

				        ((SentContext)_localctx).sentencia =  "<div>" + formatear((((SentContext)_localctx).IDENTIFIER!=null?((SentContext)_localctx).IDENTIFIER.getText():null),_localctx.map) + " " + ((SentContext)_localctx).sentFactor.sentencia + ";</div>";
				     
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(T__16);
				setState(229);
				((SentContext)_localctx).expcond = expcond(_localctx.map);
				setState(230);
				match(T__17);
				setState(231);
				((SentContext)_localctx).blq = blq();
				setState(232);
				match(T__18);
				setState(233);
				((SentContext)_localctx).blq = blq();

				        ((SentContext)_localctx).sentencia =  "<div> "+formatearReservada("IF")+" " + ((SentContext)_localctx).expcond.condicion + " "+formatearReservada("THEN")+" </div> <div style=\"margin-left:1cm\">" + ((SentContext)_localctx).blq.codigo + "</div> <div> "+formatearReservada("ELSE")+" </div> <div style=\"margin-left:1cm\"> " + ((SentContext)_localctx).blq.codigo + "</div>";
				     
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(T__19);
				setState(237);
				((SentContext)_localctx).expcond = expcond(_localctx.map);
				setState(238);
				match(T__20);
				setState(239);
				((SentContext)_localctx).blq = blq();

				        ((SentContext)_localctx).sentencia =  "<div> "+formatearReservada("WHILE")+" " + ((SentContext)_localctx).expcond.condicion + " "+formatearReservada("DO")+" <br> <div style=\"margin-left:1cm\">" + ((SentContext)_localctx).blq.codigo + "</div></div>";
				     
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(T__21);
				setState(243);
				((SentContext)_localctx).blq = blq();
				setState(244);
				match(T__22);
				setState(245);
				((SentContext)_localctx).expcond = expcond(_localctx.map);
				setState(246);
				match(T__1);

				        ((SentContext)_localctx).sentencia =  "<div> "+formatearReservada("REPEAT")+" </div> <div style=\"margin-left:1cm\">" + ((SentContext)_localctx).blq.codigo + "</div> "+formatearReservada("UNTIL")+" " + ((SentContext)_localctx).expcond.condicion + ";";
				     
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				match(T__23);
				setState(250);
				((SentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(251);
				match(T__24);
				setState(252);
				((SentContext)_localctx).exp = exp(_localctx.map);
				setState(253);
				((SentContext)_localctx).inc = inc();
				setState(254);
				((SentContext)_localctx).exp = exp(_localctx.map);
				setState(255);
				match(T__20);
				setState(256);
				((SentContext)_localctx).blq = blq();

				        ((SentContext)_localctx).sentencia =  "<div> "+formatearReservada("FOR")+" " + (((SentContext)_localctx).IDENTIFIER!=null?((SentContext)_localctx).IDENTIFIER.getText():null) + " := " + ((SentContext)_localctx).exp.expresion + ((SentContext)_localctx).inc.incremento + ((SentContext)_localctx).exp.expresion + formatearReservada("DO") +" </div> <div style=\"margin-left:1cm\"> " + ((SentContext)_localctx).blq.codigo + "</div>";
				     
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
		public SentFactorContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final SentFactorContext sentFactor(Map<String, String> map) throws RecognitionException {
		SentFactorContext _localctx = new SentFactorContext(_ctx, getState(), map);
		enterRule(_localctx, 44, RULE_sentFactor);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				((SentFactorContext)_localctx).proc_call = proc_call(_localctx.map);

				        ((SentFactorContext)_localctx).sentencia =  ((SentFactorContext)_localctx).proc_call.parametros;
				    
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				((SentFactorContext)_localctx).asig = asig(_localctx.map);

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
		public String asignacion;
		public ExpContext exp;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AsigContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final AsigContext asig(Map<String, String> map) throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState(), map);
		enterRule(_localctx, 46, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__24);
			setState(270);
			((AsigContext)_localctx).exp = exp(_localctx.map);

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
		public ExpContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final ExpContext exp(Map<String, String> map) throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState(), map);
		enterRule(_localctx, 48, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			((ExpContext)_localctx).factor = factor(_localctx.map);
			setState(274);
			((ExpContext)_localctx).expFactor = expFactor(_localctx.map);
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
		public ExpFactorContext(ParserRuleContext parent, int invokingState, Map<String,String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final ExpFactorContext expFactor(Map<String,String> map) throws RecognitionException {
		ExpFactorContext _localctx = new ExpFactorContext(_ctx, getState(), map);
		enterRule(_localctx, 50, RULE_expFactor);
		try {
			setState(282);
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
				setState(278);
				((ExpFactorContext)_localctx).op = op();
				setState(279);
				((ExpFactorContext)_localctx).exp = exp(_localctx.map);

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
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(T__25);
				((OpContext)_localctx).simbolo =  "+";
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(T__26);
				((OpContext)_localctx).simbolo =  "-";
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(T__27);
				((OpContext)_localctx).simbolo =  "*";
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				match(T__28);
				((OpContext)_localctx).simbolo =  formatearReservada("DIV");
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				match(T__29);
				((OpContext)_localctx).simbolo =  formatearReservada("MOD");
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
		public FactorContext(ParserRuleContext parent, int invokingState, Map<String,String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final FactorContext factor(Map<String,String> map) throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState(), map);
		enterRule(_localctx, 54, RULE_factor);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
			case NUMERIC_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				((FactorContext)_localctx).simpvalue = simpvalue();

				        ((FactorContext)_localctx).variable =  formatear(((FactorContext)_localctx).simpvalue.constante,_localctx.map);
				    
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(T__12);
				setState(300);
				((FactorContext)_localctx).exp = exp(_localctx.map);
				setState(301);
				match(T__13);

				        ((FactorContext)_localctx).variable =  "("+((FactorContext)_localctx).exp.expresion+")";
				    
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				((FactorContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(305);
				((FactorContext)_localctx).subpparamlist = subpparamlist(_localctx.map);

				        ((FactorContext)_localctx).variable =  formatear((((FactorContext)_localctx).IDENTIFIER!=null?((FactorContext)_localctx).IDENTIFIER.getText():null),_localctx.map) +" " + ((FactorContext)_localctx).subpparamlist.parametros;
				    
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
		public String parametros;
		public ExplistContext explist;
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SubpparamlistContext(ParserRuleContext parent, int invokingState, Map<String,String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final SubpparamlistContext subpparamlist(Map<String,String> map) throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState(), map);
		enterRule(_localctx, 56, RULE_subpparamlist);
		try {
			setState(316);
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
				setState(311);
				match(T__12);
				setState(312);
				((SubpparamlistContext)_localctx).explist = explist(_localctx.map);
				setState(313);
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
		public ExplistContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final ExplistContext explist(Map<String, String> map) throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState(), map);
		enterRule(_localctx, 58, RULE_explist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			((ExplistContext)_localctx).exp = exp(_localctx.map);
			setState(319);
			((ExplistContext)_localctx).explistFactor = explistFactor(_localctx.map);

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
		public String expresiones;
		public ExplistContext explist;
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExplistFactorContext(ParserRuleContext parent, int invokingState, Map<String,String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final ExplistFactorContext explistFactor(Map<String,String> map) throws RecognitionException {
		ExplistFactorContext _localctx = new ExplistFactorContext(_ctx, getState(), map);
		enterRule(_localctx, 60, RULE_explistFactor);
		try {
			setState(327);
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
				setState(323);
				match(T__9);
				setState(324);
				((ExplistFactorContext)_localctx).explist = explist(_localctx.map);
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
		public String parametros;
		public SubpparamlistContext subpparamlist;
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Proc_callContext(ParserRuleContext parent, int invokingState, Map<String, String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final Proc_callContext proc_call(Map<String, String> map) throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState(), map);
		enterRule(_localctx, 62, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			((Proc_callContext)_localctx).subpparamlist = subpparamlist(_localctx.map);
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
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(T__30);
				((IncContext)_localctx).incremento =  formatearReservada("TO");
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(T__31);
				((IncContext)_localctx).incremento =  formatearReservada("DOWNTO");
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
		public ExpcondContext(ParserRuleContext parent, int invokingState, Map<String,String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final ExpcondContext expcond(Map<String,String> map) throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState(), map);
		enterRule(_localctx, 66, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			((ExpcondContext)_localctx).factorcond = factorcond(_localctx.map);
			setState(339);
			((ExpcondContext)_localctx).expcondFactor = expcondFactor(_localctx.map);
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
		public ExpcondFactorContext(ParserRuleContext parent, int invokingState, Map<String,String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final ExpcondFactorContext expcondFactor(Map<String,String> map) throws RecognitionException {
		ExpcondFactorContext _localctx = new ExpcondFactorContext(_ctx, getState(), map);
		enterRule(_localctx, 68, RULE_expcondFactor);
		try {
			setState(347);
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
				setState(343);
				((ExpcondFactorContext)_localctx).oplog = oplog();
				setState(344);
				((ExpcondFactorContext)_localctx).expcond = expcond(_localctx.map);
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
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(T__32);
				((OplogContext)_localctx).bool =  formatearReservada("OR");
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(T__33);
				((OplogContext)_localctx).bool =  formatearReservada("AND");
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
		public FactorcondContext(ParserRuleContext parent, int invokingState, Map<String,String> map) {
			super(parent, invokingState);
			this.map = map;
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

	public final FactorcondContext factorcond(Map<String,String> map) throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState(), map);
		enterRule(_localctx, 72, RULE_factorcond);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				((FactorcondContext)_localctx).e1 = exp(_localctx.map);
				setState(356);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(357);
				((FactorcondContext)_localctx).e2 = exp(_localctx.map);
				((FactorcondContext)_localctx).condicion =  ((FactorcondContext)_localctx).e1.expresion + ((FactorcondContext)_localctx).opcomp.comparador + ((FactorcondContext)_localctx).e2.expresion;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(T__12);
				setState(361);
				((FactorcondContext)_localctx).expcond = expcond(_localctx.map);
				setState(362);
				match(T__13);
				((FactorcondContext)_localctx).condicion =  "(" + ((FactorcondContext)_localctx).expcond.condicion + ")";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				match(T__34);
				setState(366);
				((FactorcondContext)_localctx).factorcond = factorcond(_localctx.map);
				((FactorcondContext)_localctx).condicion = formatearReservada("NOT")+ " " + ((FactorcondContext)_localctx).factorcond.condicion;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				match(T__35);
				((FactorcondContext)_localctx).condicion = formatearReservada("TRUE");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(371);
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
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(T__37);
				((OpcompContext)_localctx).comparador =  " < ";
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(T__38);
				((OpcompContext)_localctx).comparador =  " > ";
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(T__39);
				((OpcompContext)_localctx).comparador =  " <= ";
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				match(T__40);
				((OpcompContext)_localctx).comparador =  " >= ";
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(383);
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
		"\u0004\u00012\u0184\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002c\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"m\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005{\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008c"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0094\b\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00a6\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b1\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00cb\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00d8\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00de\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0104\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u010c\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u011b\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0127\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0135\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u013d\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0148\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0151\b \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u015c\b\"\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0162\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u0176\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u0182\b%\u0001%\u0000\u0000&\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJ\u0000\u0000\u0183\u0000L\u0001\u0000\u0000\u0000\u0002U\u0001"+
		"\u0000\u0000\u0000\u0004b\u0001\u0000\u0000\u0000\u0006d\u0001\u0000\u0000"+
		"\u0000\bl\u0001\u0000\u0000\u0000\nz\u0001\u0000\u0000\u0000\f|\u0001"+
		"\u0000\u0000\u0000\u000e\u0080\u0001\u0000\u0000\u0000\u0010\u008b\u0001"+
		"\u0000\u0000\u0000\u0012\u0093\u0001\u0000\u0000\u0000\u0014\u0095\u0001"+
		"\u0000\u0000\u0000\u0016\u009a\u0001\u0000\u0000\u0000\u0018\u00a5\u0001"+
		"\u0000\u0000\u0000\u001a\u00a7\u0001\u0000\u0000\u0000\u001c\u00b0\u0001"+
		"\u0000\u0000\u0000\u001e\u00b2\u0001\u0000\u0000\u0000 \u00ba\u0001\u0000"+
		"\u0000\u0000\"\u00ca\u0001\u0000\u0000\u0000$\u00cc\u0001\u0000\u0000"+
		"\u0000&\u00d7\u0001\u0000\u0000\u0000(\u00dd\u0001\u0000\u0000\u0000*"+
		"\u0103\u0001\u0000\u0000\u0000,\u010b\u0001\u0000\u0000\u0000.\u010d\u0001"+
		"\u0000\u0000\u00000\u0111\u0001\u0000\u0000\u00002\u011a\u0001\u0000\u0000"+
		"\u00004\u0126\u0001\u0000\u0000\u00006\u0134\u0001\u0000\u0000\u00008"+
		"\u013c\u0001\u0000\u0000\u0000:\u013e\u0001\u0000\u0000\u0000<\u0147\u0001"+
		"\u0000\u0000\u0000>\u0149\u0001\u0000\u0000\u0000@\u0150\u0001\u0000\u0000"+
		"\u0000B\u0152\u0001\u0000\u0000\u0000D\u015b\u0001\u0000\u0000\u0000F"+
		"\u0161\u0001\u0000\u0000\u0000H\u0175\u0001\u0000\u0000\u0000J\u0181\u0001"+
		"\u0000\u0000\u0000LM\u0005\u0001\u0000\u0000MN\u0005/\u0000\u0000NO\u0006"+
		"\u0000\uffff\uffff\u0000OP\u0005\u0002\u0000\u0000PQ\u0006\u0000\uffff"+
		"\uffff\u0000QR\u0003\u0002\u0001\u0000RS\u0006\u0000\uffff\uffff\u0000"+
		"ST\u0005\u0003\u0000\u0000T\u0001\u0001\u0000\u0000\u0000UV\u0006\u0001"+
		"\uffff\uffff\u0000VW\u0003\u0004\u0002\u0000WX\u0006\u0001\uffff\uffff"+
		"\u0000XY\u0005\u0004\u0000\u0000YZ\u0003\u0006\u0003\u0000Z[\u0005\u0005"+
		"\u0000\u0000[\\\u0006\u0001\uffff\uffff\u0000\\\u0003\u0001\u0000\u0000"+
		"\u0000]c\u0006\u0002\uffff\uffff\u0000^_\u0003\n\u0005\u0000_`\u0003\u0004"+
		"\u0002\u0000`a\u0006\u0002\uffff\uffff\u0000ac\u0001\u0000\u0000\u0000"+
		"b]\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000c\u0005\u0001\u0000"+
		"\u0000\u0000de\u0003*\u0015\u0000ef\u0003\b\u0004\u0000fg\u0006\u0003"+
		"\uffff\uffff\u0000g\u0007\u0001\u0000\u0000\u0000hm\u0006\u0004\uffff"+
		"\uffff\u0000ij\u0003\u0006\u0003\u0000jk\u0006\u0004\uffff\uffff\u0000"+
		"km\u0001\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000li\u0001\u0000\u0000"+
		"\u0000m\t\u0001\u0000\u0000\u0000no\u0003\f\u0006\u0000op\u0006\u0005"+
		"\uffff\uffff\u0000p{\u0001\u0000\u0000\u0000qr\u0003\u0014\n\u0000rs\u0006"+
		"\u0005\uffff\uffff\u0000s{\u0001\u0000\u0000\u0000tu\u0003\u001e\u000f"+
		"\u0000uv\u0006\u0005\uffff\uffff\u0000v{\u0001\u0000\u0000\u0000wx\u0003"+
		" \u0010\u0000xy\u0006\u0005\uffff\uffff\u0000y{\u0001\u0000\u0000\u0000"+
		"zn\u0001\u0000\u0000\u0000zq\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000"+
		"\u0000zw\u0001\u0000\u0000\u0000{\u000b\u0001\u0000\u0000\u0000|}\u0005"+
		"\u0006\u0000\u0000}~\u0003\u000e\u0007\u0000~\u007f\u0006\u0006\uffff"+
		"\uffff\u0000\u007f\r\u0001\u0000\u0000\u0000\u0080\u0081\u0005/\u0000"+
		"\u0000\u0081\u0082\u0005\u0007\u0000\u0000\u0082\u0083\u0003\u0012\t\u0000"+
		"\u0083\u0084\u0005\u0002\u0000\u0000\u0084\u0085\u0003\u0010\b\u0000\u0085"+
		"\u0086\u0006\u0007\uffff\uffff\u0000\u0086\u000f\u0001\u0000\u0000\u0000"+
		"\u0087\u008c\u0006\b\uffff\uffff\u0000\u0088\u0089\u0003\u000e\u0007\u0000"+
		"\u0089\u008a\u0006\b\uffff\uffff\u0000\u008a\u008c\u0001\u0000\u0000\u0000"+
		"\u008b\u0087\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000"+
		"\u008c\u0011\u0001\u0000\u0000\u0000\u008d\u008e\u0005*\u0000\u0000\u008e"+
		"\u0094\u0006\t\uffff\uffff\u0000\u008f\u0090\u0005+\u0000\u0000\u0090"+
		"\u0094\u0006\t\uffff\uffff\u0000\u0091\u0092\u0005,\u0000\u0000\u0092"+
		"\u0094\u0006\t\uffff\uffff\u0000\u0093\u008d\u0001\u0000\u0000\u0000\u0093"+
		"\u008f\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094"+
		"\u0013\u0001\u0000\u0000\u0000\u0095\u0096\u0005\b\u0000\u0000\u0096\u0097"+
		"\u0003\u0016\u000b\u0000\u0097\u0098\u0005\u0002\u0000\u0000\u0098\u0099"+
		"\u0006\n\uffff\uffff\u0000\u0099\u0015\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0003\u001a\r\u0000\u009b\u009c\u0005\t\u0000\u0000\u009c\u009d\u0003"+
		"(\u0014\u0000\u009d\u009e\u0003\u0018\f\u0000\u009e\u009f\u0006\u000b"+
		"\uffff\uffff\u0000\u009f\u0017\u0001\u0000\u0000\u0000\u00a0\u00a6\u0006"+
		"\f\uffff\uffff\u0000\u00a1\u00a2\u0005\u0002\u0000\u0000\u00a2\u00a3\u0003"+
		"\u0016\u000b\u0000\u00a3\u00a4\u0006\f\uffff\uffff\u0000\u00a4\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a0\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a6\u0019\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"/\u0000\u0000\u00a8\u00a9\u0003\u001c\u000e\u0000\u00a9\u00aa\u0006\r"+
		"\uffff\uffff\u0000\u00aa\u001b\u0001\u0000\u0000\u0000\u00ab\u00b1\u0006"+
		"\u000e\uffff\uffff\u0000\u00ac\u00ad\u0005\n\u0000\u0000\u00ad\u00ae\u0003"+
		"\u001a\r\u0000\u00ae\u00af\u0006\u000e\uffff\uffff\u0000\u00af\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ab\u0001\u0000\u0000\u0000\u00b0\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b1\u001d\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"\u000b\u0000\u0000\u00b3\u00b4\u0005/\u0000\u0000\u00b4\u00b5\u0003\""+
		"\u0011\u0000\u00b5\u00b6\u0005\u0002\u0000\u0000\u00b6\u00b7\u0003\u0002"+
		"\u0001\u0000\u00b7\u00b8\u0005\u0002\u0000\u0000\u00b8\u00b9\u0006\u000f"+
		"\uffff\uffff\u0000\u00b9\u001f\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005"+
		"\f\u0000\u0000\u00bb\u00bc\u0005/\u0000\u0000\u00bc\u00bd\u0003\"\u0011"+
		"\u0000\u00bd\u00be\u0005\t\u0000\u0000\u00be\u00bf\u0003(\u0014\u0000"+
		"\u00bf\u00c0\u0005\u0002\u0000\u0000\u00c0\u00c1\u0003\u0002\u0001\u0000"+
		"\u00c1\u00c2\u0005\u0002\u0000\u0000\u00c2\u00c3\u0006\u0010\uffff\uffff"+
		"\u0000\u00c3!\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\r\u0000\u0000"+
		"\u00c5\u00c6\u0003$\u0012\u0000\u00c6\u00c7\u0005\u000e\u0000\u0000\u00c7"+
		"\u00c8\u0006\u0011\uffff\uffff\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000"+
		"\u00c9\u00cb\u0006\u0011\uffff\uffff\u0000\u00ca\u00c4\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb#\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0003\u001a\r\u0000\u00cd\u00ce\u0005\t\u0000\u0000\u00ce"+
		"\u00cf\u0003(\u0014\u0000\u00cf\u00d0\u0003&\u0013\u0000\u00d0\u00d1\u0006"+
		"\u0012\uffff\uffff\u0000\u00d1%\u0001\u0000\u0000\u0000\u00d2\u00d8\u0006"+
		"\u0013\uffff\uffff\u0000\u00d3\u00d4\u0005\u0002\u0000\u0000\u00d4\u00d5"+
		"\u0003$\u0012\u0000\u00d5\u00d6\u0006\u0013\uffff\uffff\u0000\u00d6\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d2\u0001\u0000\u0000\u0000\u00d7\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d8\'\u0001\u0000\u0000\u0000\u00d9\u00da\u0005"+
		"\u000f\u0000\u0000\u00da\u00de\u0006\u0014\uffff\uffff\u0000\u00db\u00dc"+
		"\u0005\u0010\u0000\u0000\u00dc\u00de\u0006\u0014\uffff\uffff\u0000\u00dd"+
		"\u00d9\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de"+
		")\u0001\u0000\u0000\u0000\u00df\u00e0\u0005/\u0000\u0000\u00e0\u00e1\u0003"+
		",\u0016\u0000\u00e1\u00e2\u0005\u0002\u0000\u0000\u00e2\u00e3\u0006\u0015"+
		"\uffff\uffff\u0000\u00e3\u0104\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"\u0011\u0000\u0000\u00e5\u00e6\u0003B!\u0000\u00e6\u00e7\u0005\u0012\u0000"+
		"\u0000\u00e7\u00e8\u0003\u0002\u0001\u0000\u00e8\u00e9\u0005\u0013\u0000"+
		"\u0000\u00e9\u00ea\u0003\u0002\u0001\u0000\u00ea\u00eb\u0006\u0015\uffff"+
		"\uffff\u0000\u00eb\u0104\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0014"+
		"\u0000\u0000\u00ed\u00ee\u0003B!\u0000\u00ee\u00ef\u0005\u0015\u0000\u0000"+
		"\u00ef\u00f0\u0003\u0002\u0001\u0000\u00f0\u00f1\u0006\u0015\uffff\uffff"+
		"\u0000\u00f1\u0104\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0016\u0000"+
		"\u0000\u00f3\u00f4\u0003\u0002\u0001\u0000\u00f4\u00f5\u0005\u0017\u0000"+
		"\u0000\u00f5\u00f6\u0003B!\u0000\u00f6\u00f7\u0005\u0002\u0000\u0000\u00f7"+
		"\u00f8\u0006\u0015\uffff\uffff\u0000\u00f8\u0104\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0005\u0018\u0000\u0000\u00fa\u00fb\u0005/\u0000\u0000\u00fb"+
		"\u00fc\u0005\u0019\u0000\u0000\u00fc\u00fd\u00030\u0018\u0000\u00fd\u00fe"+
		"\u0003@ \u0000\u00fe\u00ff\u00030\u0018\u0000\u00ff\u0100\u0005\u0015"+
		"\u0000\u0000\u0100\u0101\u0003\u0002\u0001\u0000\u0101\u0102\u0006\u0015"+
		"\uffff\uffff\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u00df\u0001"+
		"\u0000\u0000\u0000\u0103\u00e4\u0001\u0000\u0000\u0000\u0103\u00ec\u0001"+
		"\u0000\u0000\u0000\u0103\u00f2\u0001\u0000\u0000\u0000\u0103\u00f9\u0001"+
		"\u0000\u0000\u0000\u0104+\u0001\u0000\u0000\u0000\u0105\u0106\u0003>\u001f"+
		"\u0000\u0106\u0107\u0006\u0016\uffff\uffff\u0000\u0107\u010c\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0003.\u0017\u0000\u0109\u010a\u0006\u0016\uffff"+
		"\uffff\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0105\u0001\u0000"+
		"\u0000\u0000\u010b\u0108\u0001\u0000\u0000\u0000\u010c-\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0005\u0019\u0000\u0000\u010e\u010f\u00030\u0018\u0000"+
		"\u010f\u0110\u0006\u0017\uffff\uffff\u0000\u0110/\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u00036\u001b\u0000\u0112\u0113\u00032\u0019\u0000\u0113\u0114"+
		"\u0006\u0018\uffff\uffff\u0000\u01141\u0001\u0000\u0000\u0000\u0115\u011b"+
		"\u0006\u0019\uffff\uffff\u0000\u0116\u0117\u00034\u001a\u0000\u0117\u0118"+
		"\u00030\u0018\u0000\u0118\u0119\u0006\u0019\uffff\uffff\u0000\u0119\u011b"+
		"\u0001\u0000\u0000\u0000\u011a\u0115\u0001\u0000\u0000\u0000\u011a\u0116"+
		"\u0001\u0000\u0000\u0000\u011b3\u0001\u0000\u0000\u0000\u011c\u011d\u0005"+
		"\u001a\u0000\u0000\u011d\u0127\u0006\u001a\uffff\uffff\u0000\u011e\u011f"+
		"\u0005\u001b\u0000\u0000\u011f\u0127\u0006\u001a\uffff\uffff\u0000\u0120"+
		"\u0121\u0005\u001c\u0000\u0000\u0121\u0127\u0006\u001a\uffff\uffff\u0000"+
		"\u0122\u0123\u0005\u001d\u0000\u0000\u0123\u0127\u0006\u001a\uffff\uffff"+
		"\u0000\u0124\u0125\u0005\u001e\u0000\u0000\u0125\u0127\u0006\u001a\uffff"+
		"\uffff\u0000\u0126\u011c\u0001\u0000\u0000\u0000\u0126\u011e\u0001\u0000"+
		"\u0000\u0000\u0126\u0120\u0001\u0000\u0000\u0000\u0126\u0122\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u01275\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0003\u0012\t\u0000\u0129\u012a\u0006\u001b\uffff\uffff"+
		"\u0000\u012a\u0135\u0001\u0000\u0000\u0000\u012b\u012c\u0005\r\u0000\u0000"+
		"\u012c\u012d\u00030\u0018\u0000\u012d\u012e\u0005\u000e\u0000\u0000\u012e"+
		"\u012f\u0006\u001b\uffff\uffff\u0000\u012f\u0135\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0005/\u0000\u0000\u0131\u0132\u00038\u001c\u0000\u0132\u0133"+
		"\u0006\u001b\uffff\uffff\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134"+
		"\u0128\u0001\u0000\u0000\u0000\u0134\u012b\u0001\u0000\u0000\u0000\u0134"+
		"\u0130\u0001\u0000\u0000\u0000\u01357\u0001\u0000\u0000\u0000\u0136\u013d"+
		"\u0006\u001c\uffff\uffff\u0000\u0137\u0138\u0005\r\u0000\u0000\u0138\u0139"+
		"\u0003:\u001d\u0000\u0139\u013a\u0005\u000e\u0000\u0000\u013a\u013b\u0006"+
		"\u001c\uffff\uffff\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u0136"+
		"\u0001\u0000\u0000\u0000\u013c\u0137\u0001\u0000\u0000\u0000\u013d9\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u00030\u0018\u0000\u013f\u0140\u0003<\u001e"+
		"\u0000\u0140\u0141\u0006\u001d\uffff\uffff\u0000\u0141;\u0001\u0000\u0000"+
		"\u0000\u0142\u0148\u0006\u001e\uffff\uffff\u0000\u0143\u0144\u0005\n\u0000"+
		"\u0000\u0144\u0145\u0003:\u001d\u0000\u0145\u0146\u0006\u001e\uffff\uffff"+
		"\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0142\u0001\u0000\u0000"+
		"\u0000\u0147\u0143\u0001\u0000\u0000\u0000\u0148=\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u00038\u001c\u0000\u014a\u014b\u0006\u001f\uffff\uffff\u0000"+
		"\u014b?\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u001f\u0000\u0000\u014d"+
		"\u0151\u0006 \uffff\uffff\u0000\u014e\u014f\u0005 \u0000\u0000\u014f\u0151"+
		"\u0006 \uffff\uffff\u0000\u0150\u014c\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0151A\u0001\u0000\u0000\u0000\u0152\u0153\u0003"+
		"H$\u0000\u0153\u0154\u0003D\"\u0000\u0154\u0155\u0006!\uffff\uffff\u0000"+
		"\u0155C\u0001\u0000\u0000\u0000\u0156\u015c\u0006\"\uffff\uffff\u0000"+
		"\u0157\u0158\u0003F#\u0000\u0158\u0159\u0003B!\u0000\u0159\u015a\u0006"+
		"\"\uffff\uffff\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u0156\u0001"+
		"\u0000\u0000\u0000\u015b\u0157\u0001\u0000\u0000\u0000\u015cE\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0005!\u0000\u0000\u015e\u0162\u0006#\uffff\uffff"+
		"\u0000\u015f\u0160\u0005\"\u0000\u0000\u0160\u0162\u0006#\uffff\uffff"+
		"\u0000\u0161\u015d\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000"+
		"\u0000\u0162G\u0001\u0000\u0000\u0000\u0163\u0164\u00030\u0018\u0000\u0164"+
		"\u0165\u0003J%\u0000\u0165\u0166\u00030\u0018\u0000\u0166\u0167\u0006"+
		"$\uffff\uffff\u0000\u0167\u0176\u0001\u0000\u0000\u0000\u0168\u0169\u0005"+
		"\r\u0000\u0000\u0169\u016a\u0003B!\u0000\u016a\u016b\u0005\u000e\u0000"+
		"\u0000\u016b\u016c\u0006$\uffff\uffff\u0000\u016c\u0176\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0005#\u0000\u0000\u016e\u016f\u0003H$\u0000\u016f"+
		"\u0170\u0006$\uffff\uffff\u0000\u0170\u0176\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0005$\u0000\u0000\u0172\u0176\u0006$\uffff\uffff\u0000\u0173\u0174"+
		"\u0005%\u0000\u0000\u0174\u0176\u0006$\uffff\uffff\u0000\u0175\u0163\u0001"+
		"\u0000\u0000\u0000\u0175\u0168\u0001\u0000\u0000\u0000\u0175\u016d\u0001"+
		"\u0000\u0000\u0000\u0175\u0171\u0001\u0000\u0000\u0000\u0175\u0173\u0001"+
		"\u0000\u0000\u0000\u0176I\u0001\u0000\u0000\u0000\u0177\u0178\u0005&\u0000"+
		"\u0000\u0178\u0182\u0006%\uffff\uffff\u0000\u0179\u017a\u0005\'\u0000"+
		"\u0000\u017a\u0182\u0006%\uffff\uffff\u0000\u017b\u017c\u0005(\u0000\u0000"+
		"\u017c\u0182\u0006%\uffff\uffff\u0000\u017d\u017e\u0005)\u0000\u0000\u017e"+
		"\u0182\u0006%\uffff\uffff\u0000\u017f\u0180\u0005\u0007\u0000\u0000\u0180"+
		"\u0182\u0006%\uffff\uffff\u0000\u0181\u0177\u0001\u0000\u0000\u0000\u0181"+
		"\u0179\u0001\u0000\u0000\u0000\u0181\u017b\u0001\u0000\u0000\u0000\u0181"+
		"\u017d\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182"+
		"K\u0001\u0000\u0000\u0000\u0016blz\u008b\u0093\u00a5\u00b0\u00ca\u00d7"+
		"\u00dd\u0103\u010b\u011a\u0126\u0134\u013c\u0147\u0150\u015b\u0161\u0175"+
		"\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}