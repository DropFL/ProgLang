public enum KotlinBaseType implements KotlinType {
    ANY("Object", false),
    UNIT("void", false),
    INT("int"),
    LONG("long"),
    BOOLEAN("boolean"),
    DOUBLE("double"),
    STRING("String"),
    RANGE(null);

    public final String inJava;
    public final boolean subOfAny;

    KotlinBaseType (String inJava, boolean subOfAny) {
        this.inJava = inJava;
        this.subOfAny = subOfAny;
    }

    KotlinBaseType (String inJava) { this(inJava, true); }

    @Override
    public int id() {
        return ordinal();
    }

    @Override
    public KotlinType parent() {
        return subOfAny ? ANY : KotlinType.ERROR;
    }

    @Override
    public KotlinType common (KotlinType other) {
        if (!(other instanceof KotlinBaseType))
            return KotlinBaseType.ANY;

        return ConversionTable.refer(this, (KotlinBaseType) other);
    }

    public KotlinBaseType getBaseType (String identifier) {
        return valueOf(KotlinBaseType.class, identifier.toUpperCase());
    }
}

class ConversionTable {
    private ConversionTable () {}

    private static final KotlinType table[][];

    static {
        int num = KotlinBaseType.values().length;
        table = new KotlinType[num][num];
        
        for (int i = 1; i < num; i ++)
            for (int j = 0; j < i; j ++)
                register(i, j, KotlinBaseType.ANY);
        
        for (int i = 0; i < num; i ++)
            register(KotlinBaseType.UNIT.id(), i, KotlinType.ERROR);
        
        for (KotlinBaseType t : KotlinBaseType.values())
            register(t.id(), t.id(), t);
        
        register(KotlinBaseType.INT.id(), KotlinBaseType.LONG.id(), KotlinBaseType.LONG);
        register(KotlinBaseType.INT.id(), KotlinBaseType.DOUBLE.id(), KotlinBaseType.DOUBLE);
        register(KotlinBaseType.LONG.id(), KotlinBaseType.DOUBLE.id(), KotlinBaseType.DOUBLE);
    }

    private static void register (int id1, int id2, KotlinType t) {
        table[id1][id2] = table[id2][id1] = t;
    }

    public static KotlinType refer (KotlinBaseType t1, KotlinBaseType t2) {
        return table[t1.id()][t2.id()];
    }
}