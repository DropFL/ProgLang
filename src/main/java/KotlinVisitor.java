public class KotlinVisitor extends KotlinParserBaseVisitor<String> {
    @Override
    public String visitProg (KotlinParser.ProgContext ctx) {
        String result = "";

        // package definition
        if (ctx.package_def() != null)
            result += visitPackage_def(ctx.package_def()) + "\n\n";

        // import list
        for (KotlinParser.Import_stmtContext c : ctx.import_stmt())
            result += visitImport_stmt(c);
        
        // add a blank line if there is import
        if (ctx.import_stmt(0) != null) result += '\n';

        if (ctx.root_elem() != null)
            result += visitRoot_elem(ctx.root_elem());
        
        return result;
    }

    @Override
    public String visitRoot_elem (KotlinParser.Root_elemContext ctx) {
        String result = "";
        int len = ctx.decl().size();

        for (int i = 0; i < len; i ++) {
            result += visitDecl(ctx.decl(i));
            if (i != len - 1)
                result += visitSep(ctx.sep(i));
        }

        if (ctx.sep(len - 1) != null)
            result += visitSep(ctx.sep(len - 1));

        return result;
    }

    @Override
    public String visitPackage_def (KotlinParser.Package_defContext ctx) {
        return ctx.getText() + ";";
    }

    @Override
    public String visitImport_stmt (KotlinParser.Import_stmtContext ctx) {
        return ctx.getText() + ";\n";
    }

    @Override
    public String visitSep (KotlinParser.SepContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitDecl (KotlinParser.DeclContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public String visitVar_decl (KotlinParser.Var_declContext ctx) {
        String result = "";
        for (KotlinParser.ModifierContext c : ctx.modifier())
            result += visitModifier(c);
        
        if (ctx.VAR() == null)
            result += "final ";
        
        if (ctx.type_def() != null)
            result += visitType_def(ctx.type_def()) + ' ';
        else {
            // TODO type inference
            result += "Object ";
        }

        result += ctx.ID().getText();

        return result;
    }

    @Override
    public String visitType_def (KotlinParser.Type_defContext ctx) {
        return visitType(ctx.type());
    }

    @Override
    public String visitType (KotlinParser.TypeContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitModifier (KotlinParser.ModifierContext ctx) {
        if (ctx.getText().equals("open")) return "";
        return ctx.getText() + ' ';
    }

    @Override
    public String visitFunc_decl (KotlinParser.Func_declContext ctx) {
        // TODO function declaration
        return "";
    }
    
    @Override
    public String visitClass_decl (KotlinParser.Class_declContext ctx) {
        // TODO class declaration
        return "";
    }

    // TODO WIP
}