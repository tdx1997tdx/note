package dsaa.a03.linkedList.InterviewQuestion2;

import dsaa.a03.linkedList.Node;
import dsaa.a03.linkedList.interviewQuestion1.InterviewQuestion1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterviewQuestion2Test {
    Node head;
    @Before
    public void before(){
        head=new Node(-1);
    }
    @Test
    public void test1(){
        assertEquals(null, InterviewQuestion2.findReverseK(1,head));
    }
    @Test
    public void test2() {
        head.next=new Node(1);
        int actual=InterviewQuestion2.findReverseK(1,head);
        assertEquals(1,actual);
    }

    @Test
    public void test3() {
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        int actual=InterviewQuestion2.findReverseK(3,head);
        assertEquals(1,actual);
    }

    @Test
    public void test4() {
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        int actual=InterviewQuestion2.findReverseK(2,head);
        assertEquals(2,actual);
    }

    @Test
    public void test5() {
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        int actual=InterviewQuestion2.findReverseK(3,head);
        assertEquals(1,actual);
    }

    @Test
    public void test6() {
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        Integer actual=InterviewQuestion2.findReverseK(4,head);
        assertEquals(null,actual);
    }
}
