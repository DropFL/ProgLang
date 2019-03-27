import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.tree.TerminalNode;

public enum ExprOperator {
    PLUS    ('+', (a, b) -> ExprValue.get(a.val() + b.val()), 1)        ,
    MINUS   ('-', (a, b) -> ExprValue.get(a.val() - b.val()), 1)        ,
    MULTIPLY('*', (a, b) -> ExprValue.get(a.val() * b.val()), 0)        ,
    DIVIDE  ('/', (a, b) -> ExprValue.get(a.val() / b.val()), 0)        ,
    PAREN_L ('(', null, Integer.MAX_VALUE, (o, e, s) -> { o.add(s); })  ,
    PAREN_R (')', null, Integer.MAX_VALUE, (o, e, s) -> {
        for (TerminalNode node = o.pop(); ExprUtil.getOperator(node) != PAREN_L; node = o.pop())
            e.add(node);
    });

    private static Map<Character, ExprOperator> map = new HashMap<>();

    public final char ch;
    public final int order;
    private IBinaryOperation func;
    private IPrecedence pre;

    static {
        for (ExprOperator op : values())
            map.put(op.ch, op);
    }

    ExprOperator (char op, IBinaryOperation func, int order, IPrecedence pre) {
        this.ch = op;
        this.func = func;
        this.order = order;
        this.pre = pre;
    }

    ExprOperator (char op, IBinaryOperation func, int order) {
        this(op, func, order, IPrecedence.LEFT_ASSOCIATIVE);
    }

    public ExprValue calculate (ExprValue a, ExprValue b) { return func.execute(a, b); }
    public void manage (Stack<TerminalNode> operators, Deque<TerminalNode> eval, TerminalNode self) {
        pre.manage(operators, eval, self);
    }

    public static boolean isOperator (char op) { return map.containsKey(op); }
    public static ExprOperator getOperator (char op) { return map.get(op); }

    private interface IBinaryOperation {
        ExprValue execute (ExprValue a, ExprValue b);
    }

    private interface IPrecedence {
        static final IPrecedence LEFT_ASSOCIATIVE = (o, e, s) -> {
            ExprOperator self = ExprUtil.getOperator(s);
            while (!o.isEmpty() && ExprUtil.getOperator(o.peek()).order <= self.order)
                e.add(o.pop());
            o.push(s);
        };
        static final IPrecedence RIGHT_ASSICOATIVE = (o, e, s) -> {
            ExprOperator self = ExprUtil.getOperator(s);
            while (!o.isEmpty() && ExprUtil.getOperator(o.peek()).order < self.order)
                e.add(o.pop());
            o.push(s);
        };
        void manage (Stack<TerminalNode> operators, Deque<TerminalNode> eval, TerminalNode self);
    }
}