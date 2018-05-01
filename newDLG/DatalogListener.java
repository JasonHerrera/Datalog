// Generated from Datalog.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DatalogParser}.
 */
public interface DatalogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DatalogParser#datalog}.
	 * @param ctx the parse tree
	 */
	void enterDatalog(DatalogParser.DatalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#datalog}.
	 * @param ctx the parse tree
	 */
	void exitDatalog(DatalogParser.DatalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DatalogParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DatalogParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(DatalogParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(DatalogParser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#retraction}.
	 * @param ctx the parse tree
	 */
	void enterRetraction(DatalogParser.RetractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#retraction}.
	 * @param ctx the parse tree
	 */
	void exitRetraction(DatalogParser.RetractionContext ctx);
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
	 * Enter a parse tree produced by {@link DatalogParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(DatalogParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(DatalogParser.ClauseContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DatalogParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DatalogParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#predSym}.
	 * @param ctx the parse tree
	 */
	void enterPredSym(DatalogParser.PredSymContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#predSym}.
	 * @param ctx the parse tree
	 */
	void exitPredSym(DatalogParser.PredSymContext ctx);
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
	 * Enter a parse tree produced by {@link DatalogParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(DatalogParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(DatalogParser.ConstantContext ctx);
}