import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * {@code KotlinType} object represents a type that is valid in given <b>SINGLE</b> source.
 * It means, this program cannot visit other sources nor register types in those files.
 * <p>
 * This class is used for type inference, because of Kotlin's {@code val}/{@code var} keywords
 * and expression-based function definition features.
 * <p>
 * Basically, public types defined in Kotlin are managed by {@code KotlinBaseTypes}, and
 * derived types are dynamically added via {@code KotlinDerivedTypes}.
 * Since both classes implements {@code KotlinType} interface, it can be treated in the same manner.
 * 
 * @see KotlinBaseTypes
 * @see KotlinDerivedTypes
 * @see KotlinTypeInferer
 */

public abstract class KotlinType
{
    /**
     * Information of this {@code KotlinType}:
     * <ol>
     *   <li>If this is not {@code Error}, it means the type in Java.</li>
     *   <li>If this is {@code Error}, it is an error info.</li>
     * </ol>
     * 
     * @see KotlinType#Error
     */
    public final String info;

    /**
     * Super type (a.k.a. parent type) of this {@code KotlinType}.
     * <p>
     * NOTE: interfaces are not counted here,
     *       since its goal is converting Kotlin to Java,
     *       not verifying its validity.
     * 
     * @see #level
     */
    public final KotlinType superType;

    /**
     * An integer indicates how many super-types exists from this type.
     * (E.g. {@code KotlinAny.level == 0})
     * <p>
     * NOTE: interfaces are not counted here,
     *       since its goal is converting Kotlin to Java,
     *       not verifying its validity.
     * 
     * @see #superType
     */
    public final int level;

    /**
     * Boolean value that indicates current type is nullable.
     * It can be interpreted as whether it was declared with
     * question mark.
     */
    public final boolean nullable;

    /**
     * 
     */

    protected final Map<String, KotlinType> members;

    /**
     * @param info {@link #info}
     * @param nullable {@link #nullable}
     * @param superType {@link #superType}
     * <p>
     * Note: {@link #level} is defined by {@code superType}.
     * 
     * @see #KotlinType(String, boolean)
     */

    protected KotlinType (String info, boolean nullable, KotlinType superType)
    {
        this.info = info;
        this.nullable = nullable;
        this.superType = superType;
        this.level = superType.level + 1;
        this.members = new HashMap<>(superType.members);
    }

    /**
     * @param info {@link #info}
     * @param nullable {@link #nullable}
     * <p>
     * Note: This constructor is designed for root elements.
     *       Therefore, {@link #superType} is defined as itself and
     *       {@link #level} is set to 0.
     * 
     * @see #KotlinType(String, boolean)
     */

    protected KotlinType (String info, boolean nullable)
    {
        this.info = info;
        this.nullable = nullable;
        this.superType = this;
        this.level = 0;
        this.members = new HashMap<>();
    }

    /**
     * {@code Error} is a subclass of {@code KotlinType},
     * which means a failure of type inference.
     * Therefore, its instance does <b>NOT</b> represent a
     * real type, actually.
     * @implNote It is obvious that Error type can be replaced to
     *           Java's Exception system. But because of lack of time,
     *           I am leaving it as my future work.
     * 
     * @see KotlinType#error(String)
     * @see KotlinType#info
     */
    
    public static class Error extends KotlinType
    {
        private Error (String info)
        {
            super(info, false);
        }

        @Override
        public boolean equals (KotlinType type) { return type instanceof Error; }
    }

    /**
     * @param info The information about this error (why this error occurred)
     * @return An {@code Error} object
     * @see KotlinType.Error
     */

    public static Error error (String info)
    {
        return new Error(info);
    }

    /**
     * @param t1
     * @param t2
     * @return LCT(Lowest Common Type) between two arguments
     */

    public static KotlinType common (KotlinType t1, KotlinType t2)
    {
        KotlinType h, l;

        if (t1.level > t2.level)
        {
            h = t1;
            l = t2;
        }
        else
        {
            h = t2;
            l = t1;
        }

        while (l.level > h.level)
            l = l.superType;
        
        while (!l.equals(h) && l.level != 0)
        {
            l = l.superType;
            h = h.superType;
        }

        return l.equals(h) ? l : error("root element of " + t1.info + " and " + t2.info + "is different; " +
                                       "one is " + l.info  + ", while the other is " + h.info);
    }

    /**
     * @param type other type to compare.
     * @return {@code true} if they are <b>EXACTLY</b> the same type,
     *         {@code false} otherwise.
     *         This method compares their classes <b>AND</b> nullability.
     * 
     * @see #equals(KotlinType)
     * @see #nullable
     */
    
    public boolean sameTo (KotlinType type)
    {
        return  equals(type)
                && nullable == type.nullable;
    }

    /**
     * @param type other type to compare.
     * @return {@code true} if they are the same type,
     *         {@code false} otherwise.
     *         This method only compares the name of thier types.
     * 
     * @see #sameTo(KotlinType)
     * @see #equals(Class)
     */
    
    public boolean equals (KotlinType type)
    {
        return info.equals(type.info);
    }

    /**
     * @param _class Subclass of {@code KotlinType} to examine.
     * @return {@code true} if this type is a instance of {@code _class},
     *         {@code false} otherwise.
     */
    
    public boolean equals (Class<? extends KotlinType> _class)
    {
        return getClass().equals(_class);
    }

    /* Following methods are about almost every supported operations */
    
    public KotlinType or   (KotlinType type)
    {
        return error("Cannot operate OR(||) on " + info + " with " + type.info);
    }
    public KotlinType and  (KotlinType type)
    {
        return error("Cannot operate AND(&&) on " + info + " with " + type.info);
    }
    public KotlinType eq   (KotlinType type)
    {
        return error("Cannot examine equality between " + info + " and " + type.info);
    }
    public KotlinType neq  (KotlinType type)
    {
        return error("Cannot examine INequality between " + info + " and " + type.info);
    }
    public KotlinType grtr (KotlinType type)
    {
        return error("Cannot compare " + info + " with " + type.info + " (>)");
    }
    public KotlinType gteq (KotlinType type)
    {
        return error("Cannot compare " + info + " with " + type.info + " (>=)");
    }
    public KotlinType less (KotlinType type)
    {
        return error("Cannot compare " + info + " with " + type.info + " (<)");
    }
    public KotlinType lseq (KotlinType type)
    {
        return error("Cannot compare " + info + " with " + type.info + " (<=)");
    }
    public KotlinType is   (KotlinType type)
    {
        return error("Cannot determine instanceality of " + info + " as " + type.info);
    }
    public KotlinType notIs(KotlinType type)
    {
        return error("Cannot determine NON-instanceality of " + info + " as " + type.info);
    }
    public KotlinType in   (KotlinType type)
    {
        return error("Cannot check if " + info + " is included in " + type.info);
    }
    public KotlinType notIn(KotlinType type)
    {
        return error("Cannot check if " + info + " is NOT included in " + type.info);
    }
    public KotlinType elvis(KotlinType type)
    {
        return error("Cannot apply elvis operation on " + info + " and " + type.info);
    }
    public KotlinType down2(KotlinType type)
    {
        return error("Invalid \"downTo\" operation between " + info + " and " + type.info);
    }
    public KotlinType step (KotlinType type)
    {
        return error("Invalid \"step\" operation between " + info + " and " + type.info);
    }
    public KotlinType range(KotlinType type)
    {
        return error("Cannot derive a range from " + info + " to " + type.info);
    }
    public KotlinType add  (KotlinType type)
    {
        return error("Cannot add " + type.info + " to " + info);
    }
    public KotlinType sub  (KotlinType type)
    {
        return error("Cannot subtract " + type.info + " from " + info);
    }
    public KotlinType mult (KotlinType type)
    {
        return error("Cannot multiply " + type.info + " to " + info);
    }
    public KotlinType div  (KotlinType type)
    {
        return error("Cannot divide " + info + " by " + type.info);
    }
    public KotlinType rem  (KotlinType type)
    {
        return error("Cannot calculate remainder after dividing " + info + " by " + type.info);
    }
    
    public KotlinType sign (boolean minus)
    {
        return error("Cannot give " + (minus ? "negative" : "positive") + " sign to " + info);
    }
    public KotlinType incr (boolean isPre)
    {
        return error("Cannot increase " + info + " (" + (isPre ? "prefix" : "postfix") + ")");
    }
    public KotlinType decr (boolean isPre)
    {
        return error("Cannot decrease " + info + " (" + (isPre ? "prefix" : "postfix") + ")");
    }
    public KotlinType neg  ()
    {
        return error("Cannot negate " + info);
    }
    public KotlinType refer(String id)
    {
        if (members.get(id) == null)
            return error("Cannot find refernce of " + info + "." + id);
        else
            return members.get(id);
    }
    public KotlinType index(List<KotlinType> types)
    {
        String str = "Cannot index " + info + " by [";
        for (int i = 0; i < types.size(); i ++)
            str += ((i == 0) ? "" : ", ") + types.get(i).info;
        str += "]";

        return error(str);
    }
    public KotlinType call (List<KotlinType> types)
    {
        String str = info + "(";
        for (int i = 0; i < types.size(); i ++)
            str += ((i == 0) ? "" : ", ") + types.get(i).info;
        str += ") is not callable";
        return error(str);
    }

    public KotlinType cast2(KotlinType type)
    {
        return type;
    }
}