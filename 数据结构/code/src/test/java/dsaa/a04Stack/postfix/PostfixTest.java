package dsaa.a04Stack.postfix;

import dsaa.a04Stack.postfixExpression.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PostfixTest {
    Main psf=new Main();

    @Test
    public void test1() {
        int res=(int)psf.postfix("3 4 + 5 * 6 -");
        assertEquals(29,res);
    }
}
