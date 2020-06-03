package dsaa.a04Stack.stack;

public class Stack {
    private int[] stack;
    private int top;
    private int maxSize;
    public Stack(int maxSize){
        this.stack=new int[maxSize];
        this.maxSize=maxSize;
        this.top=0;
    }

    public boolean isFull(){
        return top==maxSize;
    }

    public boolean isEmpty(){
        return top==0;
    }

    public boolean push(int value){
        if(isFull()) return false;
        this.stack[top]=value;
        top++;
        return true;
    }

    public Integer pop(){
        if(isEmpty()) return null;
        int value=stack[top];
        top--;
        return value;
    }
}
