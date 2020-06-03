package dsaa.a03.linkedList.interviewQuestion1;

import dsaa.a03.linkedList.Node;

public class InterviewQuestion1 {
    public static int getNodeNum(Node head){
        if(head==null||head.next==null){
            return 0;
        }
        Node temp=head;
        int result=0;
        while (temp.next!=null){
            temp=temp.next;
            result++;
        }
        return result;
    }




}
