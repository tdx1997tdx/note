package dsaa.a03.circleLinkedList;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class JosephuTest{
    Josephu josephu;
    @Before
    public void before(){
        josephu=new Josephu();
    }
    @Test
    public void test1() {
        assertEquals(4,josephu.getResult(5,3));
    }

}
