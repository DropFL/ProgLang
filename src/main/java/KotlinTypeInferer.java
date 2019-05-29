import org.antlr.v4.runtime.tree.TerminalNode;

public class KotlinTypeInferer extends KotlinParserBaseVisitor<KotlinType> {
    @Override
    public KotlinType visitExpr (KotlinParser.ExprContext ctx) {
        return visitExpr_or(ctx.expr_or());
    }

    @Override
    public KotlinType visitExpr_or (KotlinParser.Expr_orContext ctx) {
        if (ctx.expr_and().size() == 1)
            return visitExpr_and(ctx.expr_and(0));
        
        for (KotlinParser.Expr_andContext c : ctx.expr_and())
            if (visitExpr_and(c) != KotlinBaseType.BOOLEAN)
                return KotlinType.ERROR;
        
        return KotlinBaseType.BOOLEAN;
    }

    @Override
    public KotlinType visitExpr_and (KotlinParser.Expr_andContext ctx) {
        if (ctx.expr_eq().size() == 1)
            return visitExpr_eq(ctx.expr_eq(0));
        
        for (KotlinParser.Expr_eqContext c : ctx.expr_eq())
            if (visitExpr_eq(c) != KotlinBaseType.BOOLEAN)
                return KotlinType.ERROR;
        
        return KotlinBaseType.BOOLEAN;
    }

    @Override
    public KotlinType visitExpr_eq (KotlinParser.Expr_eqContext ctx) {
        KotlinType type = null;
        
        for (KotlinParser.Expr_compContext c : ctx.expr_comp())
            if (type == null){
                if ((type = visitExpr_comp(c)) == KotlinType.ERROR)
                    return type;
            }
            else if (!type.compare(visitExpr_comp(c)))
                return KotlinType.ERROR;
            else
                type = KotlinBaseType.BOOLEAN;
        
        return type;
    }

    @Override
    public KotlinType visitExpr_comp (KotlinParser.Expr_compContext ctx) {
        return (ctx.expr_check().size() == 1)
                ? visitExpr_check(ctx.expr_check(0))
                : KotlinBaseType.BOOLEAN;
    }

    @Override
    public KotlinType visitExpr_check (KotlinParser.Expr_checkContext ctx) {
        return (ctx.expr_elvis().size() == 1)
                ? visitExpr_elvis(ctx.expr_elvis(0))
                : KotlinBaseType.BOOLEAN;
    }

    @Override
    public KotlinType visitExpr_elvis (KotlinParser.Expr_elvisContext ctx) {
        KotlinType type = null;
        
        for (KotlinParser.Expr_infixContext c : ctx.expr_infix())
            if (type == null) {
                if ((type = visitExpr_infix(c)) == KotlinType.ERROR)
                    return type;
            }
            else if (!type.compare(visitExpr_infix(c)))
                return KotlinType.ERROR;
        
        return type;
    }

    @Override
    public KotlinType visitExpr_infix (KotlinParser.Expr_infixContext ctx) {
        KotlinType type = visitExpr_range(ctx.expr_range(0));
        
        for (int i = 1; i < ctx.expr_range().size(); i ++) {
            TerminalNode node = (TerminalNode)ctx.getChild(i * 4 - 2);
            KotlinType newType = visitExpr_range(ctx.expr_range(i));
            switch (node.getSymbol().getType()) {
                case KotlinParser.DOWNTO:
                    if (!isInteger(type) || !isInteger(newType))
                        return KotlinType.ERROR;
                    
                    type = KotlinBaseType.RANGE;
                    break;
                case KotlinParser.STEP:
                    if (type != KotlinBaseType.RANGE || !isInteger(newType))
                        return KotlinType.ERROR;
                    break;
            }
        }
        
        return type;
    }

    @Override
    public KotlinType visitExpr_range (KotlinParser.Expr_rangeContext ctx) {
        return (ctx.expr_add().size() == 1)
                ? visitExpr_add(ctx.expr_add(0))
                : KotlinBaseType.RANGE;
    }

    @Override
    public KotlinType visitExpr_add (KotlinParser.Expr_addContext ctx) {
        KotlinType type = null;
        
        for (KotlinParser.Expr_multContext c : ctx.expr_mult())
            if (type == null) {
                if ((type = visitExpr_mult(c)) == KotlinType.ERROR)
                    return type;
            }
            else if (!isAddable(type = type.common(visitExpr_mult(c))))
                return KotlinType.ERROR;
        
        return type;
    }

    @Override
    public KotlinType visitExpr_mult (KotlinParser.Expr_multContext ctx) {
        KotlinType type = null;
        
        for (KotlinParser.Expr_preContext c : ctx.expr_pre())
            if (type == null) {
                if ((type = visitExpr_pre(c)) == KotlinType.ERROR)
                    return type;
            }
            else if (!isNumber(type = type.common(visitExpr_pre(c))))
                return KotlinType.ERROR;
        
        return type;
    }

    @Override
    public KotlinType visitExpr_pre (KotlinParser.Expr_preContext ctx) {
        return visitExpr_post(ctx.expr_post());
    }

    @Override
    public KotlinType visitExpr_post (KotlinParser.Expr_postContext ctx) {
        // TODO
        return visitExpr_term(ctx.expr_term());
    }

    private boolean isInteger (KotlinType type) {
        if (!(type instanceof KotlinBaseType)) return false;
                
        switch ((KotlinBaseType) type) {
            case INT:
            case LONG:
                return true;
            
            default:
                return false;
        }
    }

    private boolean isNumber (KotlinType type) {
        if (!(type instanceof KotlinBaseType)) return false;
                
        switch ((KotlinBaseType) type) {
            case INT:
            case LONG:
            case DOUBLE:
                return true;
            
            default:
                return false;
        }
    }
    
    private boolean isAddable (KotlinType type) {
        if (!(type instanceof KotlinBaseType)) return false;
        
        switch ((KotlinBaseType) type) {
            case INT:
            case LONG:
            case STRING:
            case DOUBLE:
                return true;
            
            default:
                return false;
        }
    }
}