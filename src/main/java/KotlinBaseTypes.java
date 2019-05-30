import java.lang.reflect.Constructor;

public enum KotlinBaseTypes
{
    ANY     (__KTypes.Any   .class),
    UNIT    (__KTypes.Unit  .class),
    INT     (__KTypes.Int   .class),
    LONG    (__KTypes.Long  .class),
    DOUBLE  (__KTypes.Double.class),
    FLOAT   (__KTypes.Float .class),
    STRING  (__KTypes.String.class);

    public KotlinType nonNull;
    public KotlinType nullable;

    public KotlinType get (boolean nullable)
    {
        return nullable ? this.nullable : this.nonNull;
    }

    public boolean equals (KotlinType type)
    {
        return type.equals(type.nullable ? nullable : nonNull);
    }

    KotlinBaseTypes (Class<? extends KotlinType> t)
    {
        try
        { 
            Constructor<? extends KotlinType> c = t.getConstructor(Boolean.class);
            this.nonNull = c.newInstance(false);
            this.nullable = c.newInstance(true);   
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

class __KTypes
{
    private __KTypes () {}

    public static final class Any extends KotlinType
    {
        Any (boolean nullable)
        {
            super("Object", nullable);
        }
    }
    
    public static final class Unit extends KotlinType
    {
        Unit (boolean nullable)
        {
            super("Void", false, KotlinBaseTypes.ANY.nonNull);
        }
    }

    public static final class Int extends KotlinType
    {
        Int (boolean nullable)
        {
            super("Integer", nullable);
        }

        @Override
        public KotlinType add (KotlinType type)
        {
            if (isInteger(type))
                return KotlinBaseTypes.INT.get(nullable);
            
            return type.add(this);
        }

        @Override
        public KotlinType sub (KotlinType type) { return add(type); }
    }
    
    public static final class Long extends KotlinType
    {
        Long (boolean nullable)
        {
            super("Long", nullable);
        }
    }
    
    public static final class Boolean extends KotlinType
    {
        Boolean (boolean nullable)
        {
            super("Boolean", nullable);
        }
    }
    
    public static final class Float extends KotlinType
    {
        Float (boolean nullable)
        {
            super("Float", nullable);
        }
    }
    
    public static final class Double extends KotlinType
    {
        Double (boolean nullable)
        {
            super("Double", nullable);
        }
    }
    
    public static final class String extends KotlinType
    {
        String (boolean nullable)
        {
            super("String", nullable);
        }
    }

    static boolean isInteger (KotlinType type) {
        return KotlinBaseTypes.INT.equals(type)
            || KotlinBaseTypes.LONG.equals(type);
    }

    static boolean isReal (KotlinType type) {
        return KotlinBaseTypes.DOUBLE.equals(type)
            || KotlinBaseTypes.FLOAT.equals(type);
    }

    static boolean isNumber (KotlinType type) {
        return isInteger(type) || isReal(type);
    }
}