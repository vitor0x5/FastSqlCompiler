// Generated from br/ufscar/dc/compiladores/fastsqlcompiler/FastSql.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.fastsqlcompiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FastSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FastSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FastSqlParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(FastSqlParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link FastSqlParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(FastSqlParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FastSqlParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(FastSqlParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FastSqlParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(FastSqlParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link FastSqlParser#find}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFind(FastSqlParser.FindContext ctx);
	/**
	 * Visit a parse tree produced by {@link FastSqlParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(FastSqlParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link FastSqlParser#decl_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_column(FastSqlParser.Decl_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FastSqlParser#sized}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSized(FastSqlParser.SizedContext ctx);
	/**
	 * Visit a parse tree produced by {@link FastSqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(FastSqlParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FastSqlParser#itemWhere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemWhere(FastSqlParser.ItemWhereContext ctx);
}