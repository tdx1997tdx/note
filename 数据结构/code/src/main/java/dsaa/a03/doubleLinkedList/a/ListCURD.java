package dsaa.a03.doubleLinkedList.a;

import dsaa.a03.doubleLinkedList.DoubleNode;

public class ListCURD {
    private DoubleNode head;
    private DoubleNode tail;
    //双向链表添加数据到尾部
    public void appendNode(int value){
        if(head==null){
            head=new DoubleNode(value);
        }
        if(tail==null){
            tail=head;
            return;
        }
        tail.next=new DoubleNode(value);
        tail=tail.next;
    }
    //双向链表添加数据到指定位置
    public void insertNode(int value,int position){
        DoubleNode temp=head;
        int index=0;
        while(temp!=null&&index<position){
            temp=temp.next;
        }
    }
}
