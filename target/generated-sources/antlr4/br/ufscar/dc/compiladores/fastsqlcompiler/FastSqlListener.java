// Generated from br/ufscar/dc/compiladores/fastsqlcompiler/FastSql.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.fastsqlcompiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FastSqlParser}.
 */
public interface FastSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FastSqlParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(FastSqlParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastSqlParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(FastSqlParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastSqlParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(FastSqlParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastSqlParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(FastSqlParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastSqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(FastSqlParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastSqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(FastSqlParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastSqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(FastSqlParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastSqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(FastSqlParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastSqlParser#find}.
	 * @param ctx the parse tree
	 */
	void enterFind(FastSqlParser.FindContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastSqlParser#find}.
	 * @param ctx the parse tree
	 */
	void exitFind(FastSqlParser.FindContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastSqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(FastSqlParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastSqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(FastSqlParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastSqlParser#decl_column}.
	 * @param ctx the parse tree
	 */
	void enterDecl_column(FastSqlParser.Decl_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastSqlParser#decl_column}.
	 * @param ctx the parse tree
	 */
	void exitDecl_column(FastSqlParser.Decl_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastSqlParser#sized}.
	 * @param ctx the parse tree
	 */
	void enterSized(FastSqlParser.SizedContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastSqlParser#sized}.
	 * @param ctx the parse tree
	 */
	void exitSized(FastSqlParser.SizedContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(FastSqlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(FastSqlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FastSqlParser#itemWhere}.
	 * @param ctx the parse tree
	 */
	void enterItemWhere(FastSqlParser.ItemWhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link FastSqlParser#itemWhere}.
	 * @param ctx the parse tree
	 */
	void exitItemWhere(FastSqlParser.ItemWhereContext ctx);
}