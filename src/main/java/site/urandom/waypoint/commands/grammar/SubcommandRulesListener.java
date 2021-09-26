// Generated from SubcommandRules.g4 by ANTLR 4.9.2
package site.urandom.waypoint.commands.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SubcommandRulesParser}.
 */
public interface SubcommandRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code setNameOnly}
	 * labeled alternative in {@link SubcommandRulesParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSetNameOnly(SubcommandRulesParser.SetNameOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNameOnly}
	 * labeled alternative in {@link SubcommandRulesParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSetNameOnly(SubcommandRulesParser.SetNameOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setWithCoord}
	 * labeled alternative in {@link SubcommandRulesParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSetWithCoord(SubcommandRulesParser.SetWithCoordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setWithCoord}
	 * labeled alternative in {@link SubcommandRulesParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSetWithCoord(SubcommandRulesParser.SetWithCoordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setWithCoordWorld}
	 * labeled alternative in {@link SubcommandRulesParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSetWithCoordWorld(SubcommandRulesParser.SetWithCoordWorldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setWithCoordWorld}
	 * labeled alternative in {@link SubcommandRulesParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSetWithCoordWorld(SubcommandRulesParser.SetWithCoordWorldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubcommandRulesParser#tp}.
	 * @param ctx the parse tree
	 */
	void enterTp(SubcommandRulesParser.TpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubcommandRulesParser#tp}.
	 * @param ctx the parse tree
	 */
	void exitTp(SubcommandRulesParser.TpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubcommandRulesParser#remove}.
	 * @param ctx the parse tree
	 */
	void enterRemove(SubcommandRulesParser.RemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubcommandRulesParser#remove}.
	 * @param ctx the parse tree
	 */
	void exitRemove(SubcommandRulesParser.RemoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubcommandRulesParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(SubcommandRulesParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubcommandRulesParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(SubcommandRulesParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubcommandRulesParser#tpToLastDeath}.
	 * @param ctx the parse tree
	 */
	void enterTpToLastDeath(SubcommandRulesParser.TpToLastDeathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubcommandRulesParser#tpToLastDeath}.
	 * @param ctx the parse tree
	 */
	void exitTpToLastDeath(SubcommandRulesParser.TpToLastDeathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubcommandRulesParser#subcommand}.
	 * @param ctx the parse tree
	 */
	void enterSubcommand(SubcommandRulesParser.SubcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubcommandRulesParser#subcommand}.
	 * @param ctx the parse tree
	 */
	void exitSubcommand(SubcommandRulesParser.SubcommandContext ctx);
}