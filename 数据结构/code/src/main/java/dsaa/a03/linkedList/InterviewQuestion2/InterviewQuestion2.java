package dsaa.a03.linkedList.InterviewQuestion2;

import dsaa.a03.linkedList.Node;

public class InterviewQuestion2 {

    public static Integer findReverseK(int k,Node head){
        if(head==null||head.next==null){
            return null;
        }
        Node front=head.next;
        Node rear=head.next;

        int temp=0;
        while(front.next!=null&&temp<k-1){
            front=front.next;
            temp++;
        }
        if(temp+1<k){
            return null;
        }

        while(front.next!=null){
            front=front.next;
            rear=rear.next;
        }
        return rear.value;

    }
}
