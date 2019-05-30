// Generated from KotlinParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KotlinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KotlinParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KotlinParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(KotlinParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#root_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot_elem(KotlinParser.Root_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#package_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_def(KotlinParser.Package_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(KotlinParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(KotlinParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_op(KotlinParser.Assign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#equal_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual_op(KotlinParser.Equal_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(KotlinParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#check_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_op(KotlinParser.Check_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#add_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_op(KotlinParser.Add_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#mult_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_op(KotlinParser.Mult_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(KotlinParser.PrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(KotlinParser.PostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(KotlinParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(KotlinParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expr_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_or(KotlinParser.Expr_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expr_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_and(KotlinParser.Expr_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expr_eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_eq(KotlinParser.Expr_eqContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expr_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_comp(KotlinParser.Expr_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expr_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_check(KotlinParser.Expr_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expr_elvis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_elvis(KotlinParser.Expr_elvisContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expr_infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_infix(KotlinParser.Expr_infixContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expr_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_range(KotlinParser.Expr_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expr_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_add(KotlinParser.Expr_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expr_mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_mult(KotlinParser.Expr_multContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expr_pre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_pre(KotlinParser.Expr_preContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expr_post}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_post(KotlinParser.Expr_postContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expr_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_term(KotlinParser.Expr_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#paren_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_expr(KotlinParser.Paren_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#if_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expr(KotlinParser.If_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#jumps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumps(KotlinParser.JumpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#func_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl(KotlinParser.Func_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(KotlinParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(KotlinParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(KotlinParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(KotlinParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(KotlinParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#assn_rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssn_rhs(KotlinParser.Assn_rhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#reassn_rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReassn_rhs(KotlinParser.Reassn_rhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(KotlinParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#assn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssn(KotlinParser.AssnContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(KotlinParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(KotlinParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(KotlinParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def(KotlinParser.Type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(KotlinParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(KotlinParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#n}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN(KotlinParser.NContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSep(KotlinParser.SepContext ctx);
}