// Generated from C:/Users/nish/projects/antlr4-datalog\Datalog.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DatalogParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DatalogVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DatalogParser#dlog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlog(DatalogParser.DlogContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(DatalogParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(DatalogParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(DatalogParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(DatalogParser.BodyContext ctx);
}