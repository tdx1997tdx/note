package dsaa.a03.circleLinkedList;

public class Josephu {
    public int getResult(int n, int m) {
        //保证m和n为正数
        if(n<=0||m<=0) return -1;
        //保证m大于2
        if(m==1) return n;
        // 定义环形链表
        Node head=new Node(1);
        Node temp=head;
        for(int i=2;i<=n;i++){
            temp.next=new Node(i);
            temp=temp.next;
        }
        temp.next=head;
        //定义剩余节点个数
        int leftNodeNum=n;
        //定义指针
        Node point=head;
        //开始
        while(leftNodeNum>1){
            for(int i=1;i<m-1;i++){
                point=point.next;
            }
            point.next=point.next.next;
            point=point.next;
            leftNodeNum--;
        }
        return point.value;

    }
}
class Node{
    public int value;
    public Node next;
    public Node(int value){
        this.value=value;
    }
}
