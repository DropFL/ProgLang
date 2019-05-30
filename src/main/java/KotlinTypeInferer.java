import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class KotlinTypeInferer extends KotlinParserBaseVisitor<KotlinType>
{
    @Override
    public KotlinType visitExpr (KotlinParser.ExprContext ctx)
    {
        return visitExpr_or(ctx.expr_or());
    }

    @Override
    public KotlinType visitExpr_or (KotlinParser.Expr_orContext ctx)
    {
        return binaryTemp(ctx.expr_and(), binaryOperators(ctx));
    }

    @Override
    public KotlinType visitExpr_and (KotlinParser.Expr_andContext ctx)
    {
        return binaryTemp(ctx.expr_eq(), binaryOperators(ctx));
    }

    @Override
    public KotlinType visitExpr_eq (KotlinParser.Expr_eqContext ctx)
    {
        return binaryTemp(ctx.expr_comp(), binaryOperators(ctx));
    }

    @Override
    public KotlinType visitExpr_comp (KotlinParser.Expr_compContext ctx)
    {
        return binaryTemp(ctx.expr_check(), binaryOperators(ctx));
    }

    @Override
    public KotlinType visitExpr_check (KotlinParser.Expr_checkContext ctx)
    {
        return binaryTemp(ctx.expr_elvis(), binaryOperators(ctx));
    }

    @Override
    public KotlinType visitExpr_elvis (KotlinParser.Expr_elvisContext ctx)
    {
        return binaryTemp(ctx.expr_infix(), binaryOperators(ctx));
    }

    @Override
    public KotlinType visitExpr_infix (KotlinParser.Expr_infixContext ctx)
    {
        return binaryTemp(ctx.expr_range(), binaryOperators(ctx));
    }

    @Override
    public KotlinType visitExpr_range (KotlinParser.Expr_rangeContext ctx)
    {
        return binaryTemp(ctx.expr_add(), binaryOperators(ctx));
    }

    @Override
    public KotlinType visitExpr_add (KotlinParser.Expr_addContext ctx)
    {
        return binaryTemp(ctx.expr_mult(), binaryOperators(ctx));        
    }

    @Override
    public KotlinType visitExpr_mult (KotlinParser.Expr_multContext ctx)
    {
        return binaryTemp(ctx.expr_pre(), binaryOperators(ctx));
    }

    @Override
    public KotlinType visitExpr_pre (KotlinParser.Expr_preContext ctx)
    {
        KotlinType type = visit(ctx.expr_post());
        int len = ctx.prefix().size();
        
        for (int i = len - 1; i >= 0 && !type.equals(KotlinType.Error.class); i --)
        {
            int opCode = ctx.prefix(i).start.getType();

            switch (opCode)
            {
                case KotlinParser.INCR:
                    type = type.incr(true);
                    break;
                case KotlinParser.DECR:
                    type = type.decr(true);
                    break;
                case KotlinParser.PLUS:
                case KotlinParser.MINUS:
                    type = type.sign(opCode == KotlinParser.MINUS);
                    break;
            }
        }

        return type;
    }

    @Override
    public KotlinType visitExpr_post (KotlinParser.Expr_postContext ctx)
    {
        KotlinType type = visit(ctx.expr_term());
        int len = ctx.postfix().size();
        
        for (int i = 0; i < len && !type.equals(KotlinType.Error.class); i ++)
        {
            int opCode = ctx.postfix(i).start.getType();

            switch (opCode)
            {
                case KotlinParser.INCR:
                    type = type.incr(false);
                    break;
                case KotlinParser.DECR:
                    type = type.decr(false);
                    break;
                case KotlinParser.DOT:
                    type = type.refer(ctx.postfix(i).ID().getText());
                    break;
                case KotlinParser.L_PAREN:
                    List<KotlinType> params = new ArrayList<>();
                    
                    ctx.postfix(i).arg_list().expr().forEach(
                        (KotlinParser.ExprContext e)->{params.add(visitExpr(e));}
                    );

                    type = type.call(params);
                    break;
                case KotlinParser.L_BRACKET:                
                    List<KotlinType> indice = new ArrayList<>();
                    
                    ctx.postfix(i).arg_list().expr().forEach(
                        (KotlinParser.ExprContext e)->{indice.add(visitExpr(e));}
                    );

                    type = type.index(indice);
                    break;
            }
        }

        return type;
    }

    private KotlinType binaryTemp (List<? extends ParserRuleContext> ctx,
                                   List<TerminalNode> op)
    {
        KotlinType type = visit(ctx.get(0));
        int len = ctx.size();
        
        for (int i = 1; i < len && !type.equals(KotlinType.Error.class); i ++)
        {
            KotlinType argType = visit(ctx.get(i));
            int opCode = op.get(i).getSymbol().getType();

            if (argType.equals(KotlinType.Error.class)) return argType;

            type = KotlinOperationUtil.map.get(opCode).operate(type, argType);
        }

        return type;
    }

    private List<TerminalNode> binaryOperators (ParserRuleContext ctx) {
        List<TerminalNode> list = new ArrayList<>();
        int len = ctx.children.size();

        for (int i = 2; i < len; i += 4)
            list.add((TerminalNode)ctx.getChild(i));
        
        return list;
    }
}