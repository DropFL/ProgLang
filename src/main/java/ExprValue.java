import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

public class ExprValue {

    private static Map<String, ExprValue> map = new HashMap<String, ExprValue>();

    private String id;
    private Double val;

    public static ExprValue get (TerminalNode node) {
        if (!ExprUtil.isValue(node))
            throw new IllegalArgumentException(ExprUtil.toString(node) +" is a non-value token.");
        
        ExprValue result = get(node.getText());

        if (ExprUtil.isNUM(node))
            result.val = Double.parseDouble(node.getText());

        return result;
    }

    public static ExprValue get (String id) {
        if (!map.containsKey(id))
            map.put(id, new ExprValue(id));

        return map.get(id);
    }

    public static ExprValue get (double value) {
        ExprValue result = get(Double.toString(value));
        
        result.val(value);

        return result;
    }

    private ExprValue (String id) {
        this.id = id;
        this.val = null;
    }

    public String id () { return id; }

    public double val () { return val; }
    public void val (double val) { this.val = val; }
}