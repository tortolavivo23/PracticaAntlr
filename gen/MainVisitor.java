// Generated from /home/heqro/IdeaProjects/PracticaAntlr/src/Main.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MainParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MainVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MainParser#prg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrg(MainParser.PrgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#blq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlq(MainParser.BlqContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(MainParser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(MainParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#sentlistFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlistFactor(MainParser.SentlistFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(MainParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#defcte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcte(MainParser.DefcteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#ctelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist(MainParser.CtelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#ctelistFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelistFactor(MainParser.CtelistFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(MainParser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#defvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(MainParser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#defvarlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlist(MainParser.DefvarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#defvarlistFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlistFactor(MainParser.DefvarlistFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(MainParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#varlistFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlistFactor(MainParser.VarlistFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#defproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefproc(MainParser.DefprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#deffun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeffun(MainParser.DeffunContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#formal_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramlist(MainParser.Formal_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#formal_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_param(MainParser.Formal_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#formal_paramFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramFactor(MainParser.Formal_paramFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#tbas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbas(MainParser.TbasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(MainParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#sentFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentFactor(MainParser.SentFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(MainParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(MainParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#expFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFactor(MainParser.ExpFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(MainParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MainParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#subpparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpparamlist(MainParser.SubpparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(MainParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#explistFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplistFactor(MainParser.ExplistFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(MainParser.Proc_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#inc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(MainParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#expcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond(MainParser.ExpcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#expcondFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcondFactor(MainParser.ExpcondFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#oplog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOplog(MainParser.OplogContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#factorcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorcond(MainParser.FactorcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#opcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcomp(MainParser.OpcompContext ctx);
}