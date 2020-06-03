package dsaa.a03.linkedList.InterviewQuestion3;

import dsaa.a03.linkedList.Node;

public class InterviewQuestion3 {

    public static Node reverseList(Node head){
        Node newHead=new Node(-1);
        if(head==null) return newHead;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            Node t=newHead.next;
            newHead.next=new Node(temp.value);
            newHead.next.next=t;
        }

        return newHead;
    }
}
