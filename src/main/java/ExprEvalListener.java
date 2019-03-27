import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

import org.antlr.v4.runtime.tree.TerminalNode;

public class ExprEvalListener extends ExprBaseListener {
    // stack for expression tree evaluation
    private Deque<TerminalNode> eval = new ArrayDeque<>();
    private Stack<TerminalNode> operators = new Stack<>();

    @Override
    public void exitStmt(ExprParser.StmtContext ctx) {
        if (!eval.isEmpty())
            System.out.println(evaluate());

        eval.clear();
        operators.clear();
    }

    @Override
    public void exitAssn(ExprParser.AssnContext ctx) {
        ExprValue.get(ctx.ID()).val(evaluate());
    }
    
    @Override
    public void visitTerminal(TerminalNode node) {
        switch (node.getSymbol().getType()) {
            case ExprParser.NUM:
            case ExprParser.ID:
                eval.add(node);
                return;
            case ExprParser.END:
                return;
            default:
                if (ExprUtil.isOperator(node))
                    ExprUtil.getOperator(node).manage(operators, eval, node);
        }
    }

    private double evaluate () {
        Stack<ExprValue> values = new Stack<>();

        while (!operators.isEmpty())
            eval.add(operators.pop());

        while (!eval.isEmpty()) {
            TerminalNode node = eval.removeFirst();

            if (ExprUtil.isValue(node))
                values.push(ExprValue.get(node));
            else if (ExprUtil.isOperator(node)) {
                ExprOperator op = ExprUtil.getOperator(node);
                ExprValue b = values.pop(), a = values.pop();

                values.push(op.calculate(a, b));
            }
        }
        return values.peek().val();
    }
}