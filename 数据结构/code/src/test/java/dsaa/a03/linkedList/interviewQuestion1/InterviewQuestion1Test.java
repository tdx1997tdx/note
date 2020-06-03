package dsaa.a03.linkedList.interviewQuestion1;

import static org.junit.Assert.*;

import dsaa.a03.linkedList.Node;
import org.junit.*;

public class InterviewQuestion1Test {
    Node head;
    @Before
    public void before(){
        head=new Node(-1);
    }
    @Test
    public void testEmpty() {
        assertEquals(0,InterviewQuestion1.getNodeNum(head));
    }
    @Test
    public void testOne() {
        head.next=new Node(1);
        assertEquals(1,InterviewQuestion1.getNodeNum(head));
    }
}
