package dsaa.a03.linkedList.interviewQuestion4;

import dsaa.a03.linkedList.InterviewQuestion3.InterviewQuestion3;
import dsaa.a03.linkedList.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterviewQuestion4Test {
    Node head;
    @Before
    public void before(){
        head=new Node(-1);
    }
    @Test
    public void test1() {
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        InterviewQuestion4.reversePrintList(head.next);
    }
}
