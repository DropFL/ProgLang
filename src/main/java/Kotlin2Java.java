import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Kotlin2Java {
    public static void main (String[] args) {
        if (args.length == 1 || args.length > 3) {
            System.out.println("usage: " + args[0] + " \"input kotlin file.kt\" [\"output java file.java\"]");
            return;
        }

        CharStream input = null;
        FileWriter output = null;
        try {
            input = CharStreams.fromFileName(args[1]);
            output = new FileWriter((args.length == 3) ? args[2] : "output.java");
        }
        catch (IOException e) {
            e.printStackTrace();
            return;
        }
        
        KotlinLexer lex = new KotlinLexer(input);
        CommonTokenStream tok = new CommonTokenStream(lex);
        KotlinParser psr = new KotlinParser(tok);
        KotlinVisitor vstr = new KotlinVisitor();

        try{
            output.write(vstr.visitProg(psr.prog()));
            output.close();
        }
        catch (IOException e){
            e.printStackTrace();
            return;
        }
    }
}