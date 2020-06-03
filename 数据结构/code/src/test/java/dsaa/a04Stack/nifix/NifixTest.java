package dsaa.a04Stack.nifix;

import org.junit.Test;

import static org.junit.Assert.*;

public class NifixTest {
    Main nifix=new Main();

    @Test
    public void test1() {
        float res=nifix.nifix("3+2*6-2");
        assertEquals(13,res);
    }

    @Test
    public void test2() {
        float res=nifix.nifix("1-10/4+6+6-4-9-6/4+7");
        assertEquals(3,res);
    }
    @Test
    public void test3() {
        float res=nifix.nifix("9-1*9-10*4-4-4+7-3+6");
        assertEquals(-38,res);
    }
}
