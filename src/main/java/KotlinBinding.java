import java.util.Map;
import java.util.HashMap;

public class KotlinBinding {

    /**
     * {@code Binding} class represents a linked list of type,
     * which is bound to a single variable.
     * It forms a list in order of priority, to support binding overwrite.
     * <p>
     * The head of the list is the main binding of the current context.
     */
    public class Binding {

        /**
         * Type of the variable.
         */
        public final KotlinType type;

        /**
         * {@code Binding} object that is shadowed by this instance.
         * It is {@code null} if this object is the head.
         */
        public final Binding prev;
        
        /**
         * @see {@link #type}
         * @see {@link #prev}
         */
        Binding (KotlinType type, Binding prev) {
            this.type = type;
            this.prev = prev;
        }
    }

    /**
     * All the {@code name-type} pairs of variables declared in this context.
     * Key is the name and value is the {@code Binding} object.
     * <p>
     * Every {@code Binding} object that {@code globalBindings} holding is
     * the head of the linked list. It means, the {@code Binding} object can
     * be retrieved by its name represents the type of the variable in
     * the current context.
     * 
     * @see #bindings
     * @see #unregister(KotlinBinding)
     */
    private static final Map<String,Binding> globalBindings = new HashMap<>();

    /**
     * {@code name-type} pairs of variables declared in current block.
     * Key is the name and value is the {@code Binding} object.
     * <p>
     * This object is used for detecting redeclaration and popping out
     * the variables when this block is ended.
     * 
     * @see #globalBindings
     * @see #unregister(KotlinBinding)
     */
    private final Map<String, Binding> bindings;

    /**
     * @see #bindings
     */
    public KotlinBinding () {
        bindings = new HashMap<>();
    }

    /**
     * Generate a new {@code Binding} with given parameters.
     * It both affects {@code globalBindings} and {@code bindings}.
     * 
     * @param name name of the variable to be declared
     * @param type type of the declaring variable
     * 
     * @exception IllegalArgumentException
     * if given variable is already declared in the namespace
     * that this {@code KotlinBinding} represents.
     */
    public void put(String name, KotlinType type) {
        if (bindings.containsKey(name))
            throw new IllegalArgumentException(name + " already assigned in the same context.");
        
        Binding b = new Binding(type, globalBindings.get(name));

        bindings.put(name, b);
        globalBindings.put(name, b);
    }

    /**
     * Pops out the variable definition in given block({@code bindings})
     * from the whole namespace. 
     * 
     * @param bindings namespace to remove
     */
    public static void unregister(KotlinBinding bindings) {
        for (String entry : bindings.bindings.keySet()) {
            Binding b = globalBindings.get(entry);
            if (b.prev == null)
                globalBindings.remove(entry);
            else
                globalBindings.put(entry, b.prev);
        }

        bindings.bindings.clear();
    }
}