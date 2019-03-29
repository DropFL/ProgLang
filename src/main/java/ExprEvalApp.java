import java.io.Console;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ExprEvalApp {

    private static ParseTreeWalker walker = new ParseTreeWalker();
    private static ExprEvalListener listener = new ExprEvalListener();

    public static void main (String[] args) throws IOException {
        String input;

        if (args.length > 0) input = args[0];
        else {
            Console c = System.console();
            if (c == null) {
                System.err.println("No Console Found.");
                System.exit(1);
            }
            input = c.readLine();
        }

        if (input.equals("interactive")) {
            Console c = System.console();
            while (!(input = c.readLine(" >> ")).equals("exit"))
                eval(CharStreams.fromString(input));
            
            System.out.println("terminated.");
        }
        else
            eval(CharStreams.fromFileName(input));
    }

    public static void testFile (String fileName) throws IOException {
        System.out.println("** Unit test - File **");
        eval(CharStreams.fromFileName(fileName));
    }

    public static void testString (String str) throws IOException {
        System.out.println("** Unit test - String **");
        eval(CharStreams.fromString(str));
    }

    private static void eval (CharStream stream) throws IOException {
        ExprLexer lexer = new ExprLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        
        walker.walk(listener, parser.prog());
    }
}
