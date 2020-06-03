package dsaa.a03.linkedList;

public class Node {
    public int value;
    public Node next;
    public Node(int value){
        this.value=value;
    }
    public void printContent(){
        Node temp=next;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}
