import java.util.HashMap;
import java.util.Map;

public class KotlinOperationUtil
{
    public static final Map<Integer, KotlinBinaryOperation> map;

    public interface KotlinBinaryOperation
    {
        KotlinType operate (KotlinType t1, KotlinType t2);
    }

    static
    {
        map = new HashMap<>();
        
        // expr_or
        map.put(KotlinParser.OR         , KotlinType::or);
        // expr_and
        map.put(KotlinParser.AND        , KotlinType::and);
        // expr_eq
        map.put(KotlinParser.EQUAL      , KotlinType::eq);
        map.put(KotlinParser.REF_EQUAL  , KotlinType::eq);
        map.put(KotlinParser.NEQUAL     , KotlinType::neq);
        map.put(KotlinParser.REF_NEQUAL , KotlinType::neq);
        // expr_comp
        map.put(KotlinParser.GRTR       , KotlinType::grtr);
        map.put(KotlinParser.GRTR_EQ    , KotlinType::gteq);
        map.put(KotlinParser.LESS       , KotlinType::less);
        map.put(KotlinParser.LESS_EQ    , KotlinType::lseq);
        // expr_check
        map.put(KotlinParser.IS         , KotlinType::is);
        map.put(KotlinParser.NOT_IS     , KotlinType::notIs);
        map.put(KotlinParser.IN         , KotlinType::in);
        map.put(KotlinParser.NOT_IN     , KotlinType::notIn);
        // expr_elvis
        map.put(KotlinParser.ELVIS      , KotlinType::elvis);
        // expr_infix
        map.put(KotlinParser.DOWNTO     , KotlinType::down2);
        map.put(KotlinParser.STEP       , KotlinType::step);
        // expr_range
        map.put(KotlinParser.RANGE      , KotlinType::range);
        // expr_add
        map.put(KotlinParser.PLUS       , KotlinType::add);
        map.put(KotlinParser.MINUS      , KotlinType::sub);
        // expr_mult
        map.put(KotlinParser.MULTI      , KotlinType::mult);
        map.put(KotlinParser.DIVIDE     , KotlinType::div);
        map.put(KotlinParser.REMAIN     , KotlinType::rem);
    }
}