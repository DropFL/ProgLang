import java.util.HashMap;

public class KotlinUserType implements KotlinType {
    private static HashMap<String, KotlinUserType> types = new HashMap<>();

    private final int id;
    private final KotlinType parent;

    public static KotlinUserType getType (String identifier) {
        KotlinUserType type = types.get(identifier);

        if (type == null) throw new IllegalArgumentException(identifier + " is not registered type.");
        
        return type;
    }

    public static KotlinUserType registerType (String identifier, KotlinType parent) {
        if (types.containsKey(identifier)) throw new IllegalArgumentException(identifier + "is already registered.");
        
        KotlinUserType newType = new KotlinUserType(types.size() + KotlinBaseType.values().length, parent);
        types.put(identifier, newType);
        return newType;
    }

    private KotlinUserType (int id, KotlinType parent) {
        this.id = id;
        this.parent = parent;
    }

    @Override
    public int id() {
        return id;
    }
    
    @Override
    public KotlinType parent() {
        return parent;
    }
}