import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void test()
    {
        boolean isPassed = false;
        try {
            ExprEvalApp.testFile("test.txt");
            isPassed = true;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
        assertTrue("IOException Occurred", isPassed);
    }
}
