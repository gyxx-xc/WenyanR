// Generated from WenyanR.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WenyanRParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WenyanRVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(WenyanRParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(WenyanRParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#expr_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_statement(WenyanRParser.Expr_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code data_primary}
	 * labeled alternative in {@link WenyanRParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_primary(WenyanRParser.Data_primaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code data_child}
	 * labeled alternative in {@link WenyanRParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_child(WenyanRParser.Data_childContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id_last}
	 * labeled alternative in {@link WenyanRParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_last(WenyanRParser.Id_lastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link WenyanRParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(WenyanRParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id_last_with_self}
	 * labeled alternative in {@link WenyanRParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_last_with_self(WenyanRParser.Id_last_with_selfContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#reference_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_statement(WenyanRParser.Reference_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#declare_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_statement(WenyanRParser.Declare_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#init_declare_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declare_statement(WenyanRParser.Init_declare_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#define_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_statement(WenyanRParser.Define_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#mod_math_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_math_statement(WenyanRParser.Mod_math_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#boolean_algebra_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_algebra_statement(WenyanRParser.Boolean_algebra_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_statement(WenyanRParser.Assign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#function_define_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_define_statement(WenyanRParser.Function_define_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_pre_call}
	 * labeled alternative in {@link WenyanRParser#function_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_pre_call(WenyanRParser.Function_pre_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_post_call}
	 * labeled alternative in {@link WenyanRParser#function_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_post_call(WenyanRParser.Function_post_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#key_function_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_function_call_statement(WenyanRParser.Key_function_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#object_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_statement(WenyanRParser.Object_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#object_define_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_define_statement(WenyanRParser.Object_define_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#flush_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlush_statement(WenyanRParser.Flush_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(WenyanRParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#if_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expression(WenyanRParser.If_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_arr_statement}
	 * labeled alternative in {@link WenyanRParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_arr_statement(WenyanRParser.For_arr_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_enum_statement}
	 * labeled alternative in {@link WenyanRParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_enum_statement(WenyanRParser.For_enum_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_while_statement}
	 * labeled alternative in {@link WenyanRParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_while_statement(WenyanRParser.For_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return_data_statement}
	 * labeled alternative in {@link WenyanRParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_data_statement(WenyanRParser.Return_data_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return_last_statement}
	 * labeled alternative in {@link WenyanRParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_last_statement(WenyanRParser.Return_last_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return_void_statement}
	 * labeled alternative in {@link WenyanRParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_void_statement(WenyanRParser.Return_void_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(WenyanRParser.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#arith_binary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_binary_op(WenyanRParser.Arith_binary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#key_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_function(WenyanRParser.Key_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WenyanRParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(WenyanRParser.TypeContext ctx);
}