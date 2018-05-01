// Generated from C:/Users/nish/projects/antlr4-datalog\Datalog.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DatalogParser}.
 */
public interface DatalogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DatalogParser#dlog}.
	 * @param ctx the parse tree
	 */
	void enterDlog(DatalogParser.DlogContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#dlog}.
	 * @param ctx the parse tree
	 */
	void exitDlog(DatalogParser.DlogContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(DatalogParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(DatalogParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#factList}.
	 * @param ctx the parse tree
	 */
	void enterFactList(DatalogParser.FactListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#factList}.
	 * @param ctx the parse tree
	 */
	void exitFactList(DatalogParser.FactListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(DatalogParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(DatalogParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#ruleList}.
	 * @param ctx the parse tree
	 */
	void enterRuleList(DatalogParser.RuleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#ruleList}.
	 * @param ctx the parse tree
	 */
	void exitRuleList(DatalogParser.RuleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(DatalogParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(DatalogParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#queryList}.
	 * @param ctx the parse tree
	 */
	void enterQueryList(DatalogParser.QueryListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#queryList}.
	 * @param ctx the parse tree
	 */
	void exitQueryList(DatalogParser.QueryListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(DatalogParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(DatalogParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(DatalogParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(DatalogParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(DatalogParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(DatalogParser.BodyContext ctx);
}