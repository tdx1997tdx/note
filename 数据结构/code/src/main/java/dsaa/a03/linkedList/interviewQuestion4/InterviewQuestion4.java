package dsaa.a03.linkedList.interviewQuestion4;

import dsaa.a03.linkedList.Node;

public class InterviewQuestion4 {

    public static void reversePrintList(Node head){
        if (head==null) return;
        reversePrintList(head.next);
        System.out.println(head.value);
    }
}
