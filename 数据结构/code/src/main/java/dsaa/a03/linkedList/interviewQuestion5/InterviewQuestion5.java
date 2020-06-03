package dsaa.a03.linkedList.interviewQuestion5;

import dsaa.a03.linkedList.Node;

public class InterviewQuestion5 {

    public static Node mergeList(Node node1,Node node2){
        Node result=new Node(-1);
        Node temp1=node1.next;
        Node temp2=node2.next;
        Node tempRes=result;
        while (temp1!=null&&temp2!=null){
            if(temp1.value>temp2.value){
                tempRes.next=new Node(temp2.value);
                temp2=temp2.next;
            }else {
                tempRes.next=new Node(temp1.value);
                temp1=temp1.next;
            }
            tempRes=tempRes.next;
        }
        while (temp1==null&&temp2!=null){
            tempRes.next=new Node(temp2.value);
            temp2=temp2.next;
            tempRes=tempRes.next;
        }
        while (temp1!=null){
            tempRes.next=new Node(temp1.value);
            temp1=temp1.next;
            tempRes=tempRes.next;
        }

        return result;

    }
}
