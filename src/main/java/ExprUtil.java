import org.antlr.v4.runtime.tree.TerminalNode;

public class ExprUtil {

    private ExprUtil () {}

    public static String toString (TerminalNode node) {
        return "[" + ExprParser.VOCABULARY.getSymbolicName(node.getSymbol().getType()) + ": " + node.getText() + "]";
    }

    public static boolean isValue (TerminalNode node) {
        return isID(node) || isNUM(node);
    }

    public static boolean isID (TerminalNode node) {
        return node.getSymbol().getType() == ExprParser.ID;
    }

    public static boolean isNUM (TerminalNode node) {
        return node.getSymbol().getType() == ExprParser.NUM;
    }

    public static boolean isOperator (TerminalNode node) {
        return ExprOperator.isOperator(node.getText().charAt(0));
    }

    public static ExprOperator getOperator (TerminalNode node) {
        ExprOperator op =  ExprOperator.getOperator(node.getText().charAt(0));

        if (op == null)
            throw new IllegalArgumentException("tried to extract operator from non-operator token " + toString(node) +".");

        return op;
    }
}