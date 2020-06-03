package dsaa.a03.linkedList.InterviewQuestion5;

import dsaa.a03.linkedList.Node;
import dsaa.a03.linkedList.interviewQuestion4.InterviewQuestion4;
import dsaa.a03.linkedList.interviewQuestion5.InterviewQuestion5;
import org.junit.Before;
import org.junit.Test;

public class InterviewQuestion5Test {
    Node head1;
    Node head2;
    @Before
    public void before(){

        head1=new Node(-1);
        head2=new Node(-1);
    }
    @Test
    public void test1() {
        head1.next=new Node(1);
        head1.next.next=new Node(3);
        head1.next.next.next=new Node(5);
        head2.next=new Node(2);
        head2.next.next=new Node(4);
        head2.next.next.next=new Node(6);
        head2.next.next.next.next=new Node(7);
        Node newNode= InterviewQuestion5.mergeList(head1,head2);
        newNode.printContent();
    }
}
