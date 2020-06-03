package dsaa.a02.ringQueue;

public class Queue {
    private int[] queue;
    private int maxSize;
    private int front;
    private int rear;
    public Queue(int maxSize){
        this.maxSize=maxSize;
        this.queue=new int[maxSize+1];
        this.front=0;
        this.rear=0;
    }

    public boolean isEmpty(){
        return rear==front;
    }

    public boolean isFull(){
        return front==(rear+1)%(maxSize+1);
    }

    public boolean enQueue(int value){
        if(isFull()) return false;
        queue[rear]=value;
        rear=(rear+1)%(maxSize+1);
        return true;
    }

    public Integer deQueue(){
        if(isEmpty()) return null;
        int value=queue[front];
        front=(front+1)%(maxSize+1);
        return value;
    }

}
