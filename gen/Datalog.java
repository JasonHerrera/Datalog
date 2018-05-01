import org.antlr.runtime.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Datalog extends DatalogBaseListener {
    public static void main(String[] args) throws Exception {
        ANTLRStringStream in = new ANTLRStringStream("12*(5-6)");
        ExpLexer lexer = new ExpLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpParser parser = new ExpParser(tokens);
        System.out.println(parser.eval()); // print the value
    }
}