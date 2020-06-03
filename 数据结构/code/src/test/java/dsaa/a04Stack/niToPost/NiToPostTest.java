package dsaa.a04Stack.niToPost;

import dsaa.a04Stack.niToPost.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NiToPostTest {
    Main psf=new Main();

    @Test
    public void test1() {
        String res=psf.niToPost("a+b*c/d-a+f/b");
        assertEquals("abc*d/+a-fb/+",res);
    }
    @Test
    public void test2() {
        String res=psf.niToPost("(3+4)*5-6");
        assertEquals("34+5*6-",res);
    }
}
