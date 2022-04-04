// Generated from /home/sergio/ProcesadoresDeLenguajes/PracticaAntlr/src/Main.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MainParser}.
 */
public interface MainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MainParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(MainParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(MainParser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#blq}.
	 * @param ctx the parse tree
	 */
	void enterBlq(MainParser.BlqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#blq}.
	 * @param ctx the parse tree
	 */
	void exitBlq(MainParser.BlqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(MainParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(MainParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(MainParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(MainParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#sentlistFactor}.
	 * @param ctx the parse tree
	 */
	void enterSentlistFactor(MainParser.SentlistFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#sentlistFactor}.
	 * @param ctx the parse tree
	 */
	void exitSentlistFactor(MainParser.SentlistFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(MainParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(MainParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#defcte}.
	 * @param ctx the parse tree
	 */
	void enterDefcte(MainParser.DefcteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#defcte}.
	 * @param ctx the parse tree
	 */
	void exitDefcte(MainParser.DefcteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(MainParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(MainParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#ctelistFactor}.
	 * @param ctx the parse tree
	 */
	void enterCtelistFactor(MainParser.CtelistFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#ctelistFactor}.
	 * @param ctx the parse tree
	 */
	void exitCtelistFactor(MainParser.CtelistFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(MainParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(MainParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(MainParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(MainParser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlist(MainParser.DefvarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlist(MainParser.DefvarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#defvarlistFactor}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlistFactor(MainParser.DefvarlistFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#defvarlistFactor}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlistFactor(MainParser.DefvarlistFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(MainParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(MainParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#varlistFactor}.
	 * @param ctx the parse tree
	 */
	void enterVarlistFactor(MainParser.VarlistFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#varlistFactor}.
	 * @param ctx the parse tree
	 */
	void exitVarlistFactor(MainParser.VarlistFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#defproc}.
	 * @param ctx the parse tree
	 */
	void enterDefproc(MainParser.DefprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#defproc}.
	 * @param ctx the parse tree
	 */
	void exitDefproc(MainParser.DefprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#deffun}.
	 * @param ctx the parse tree
	 */
	void enterDeffun(MainParser.DeffunContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#deffun}.
	 * @param ctx the parse tree
	 */
	void exitDeffun(MainParser.DeffunContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist(MainParser.Formal_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist(MainParser.Formal_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void enterFormal_param(MainParser.Formal_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void exitFormal_param(MainParser.Formal_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#formal_paramFactor}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramFactor(MainParser.Formal_paramFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#formal_paramFactor}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramFactor(MainParser.Formal_paramFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#tbas}.
	 * @param ctx the parse tree
	 */
	void enterTbas(MainParser.TbasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#tbas}.
	 * @param ctx the parse tree
	 */
	void exitTbas(MainParser.TbasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(MainParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(MainParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#sentFactor}.
	 * @param ctx the parse tree
	 */
	void enterSentFactor(MainParser.SentFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#sentFactor}.
	 * @param ctx the parse tree
	 */
	void exitSentFactor(MainParser.SentFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(MainParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(MainParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(MainParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(MainParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#expFactor}.
	 * @param ctx the parse tree
	 */
	void enterExpFactor(MainParser.ExpFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#expFactor}.
	 * @param ctx the parse tree
	 */
	void exitExpFactor(MainParser.ExpFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(MainParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(MainParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MainParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MainParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubpparamlist(MainParser.SubpparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubpparamlist(MainParser.SubpparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(MainParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(MainParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#explistFactor}.
	 * @param ctx the parse tree
	 */
	void enterExplistFactor(MainParser.ExplistFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#explistFactor}.
	 * @param ctx the parse tree
	 */
	void exitExplistFactor(MainParser.ExplistFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(MainParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(MainParser.Proc_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(MainParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(MainParser.IncContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#expcond}.
	 * @param ctx the parse tree
	 */
	void enterExpcond(MainParser.ExpcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#expcond}.
	 * @param ctx the parse tree
	 */
	void exitExpcond(MainParser.ExpcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#expcondFactor}.
	 * @param ctx the parse tree
	 */
	void enterExpcondFactor(MainParser.ExpcondFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#expcondFactor}.
	 * @param ctx the parse tree
	 */
	void exitExpcondFactor(MainParser.ExpcondFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#oplog}.
	 * @param ctx the parse tree
	 */
	void enterOplog(MainParser.OplogContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#oplog}.
	 * @param ctx the parse tree
	 */
	void exitOplog(MainParser.OplogContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void enterFactorcond(MainParser.FactorcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void exitFactorcond(MainParser.FactorcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void enterOpcomp(MainParser.OpcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void exitOpcomp(MainParser.OpcompContext ctx);
}