package dsaa.a04Stack.nifix;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        Main m=new Main();
        while (cin.hasNext()){
            String exp=cin.next();
            float res=m.nifix(exp);
            System.out.println((int)res);
        }

    }
    public float nifix(String expression){
        Stack<Float> numberStack=new Stack<>();
        Stack<Character> symbolStack=new Stack<>();
        String digit="";
        for(int i=0;i<expression.length();i++){
            char x=expression.charAt(i);
            if(Character.isDigit(x)){
                digit+=String.valueOf(x);
                if(i+1>=expression.length()||!Character.isDigit(expression.charAt(i+1))){
                    numberStack.push(Float.parseFloat(digit));
                    digit="";
                }

            }else {
                while (!symbolStack.isEmpty()&&priority(symbolStack.peek())>=priority(x)){
                    char y=symbolStack.pop();
                    float res=calRes(y,numberStack.pop(),numberStack.pop());
                    numberStack.push(res);
                }
                symbolStack.push(x);
            }
        }
        while (!symbolStack.isEmpty()){
            char y=symbolStack.pop();
            float res=calRes(y,numberStack.pop(),numberStack.pop());
            numberStack.push(res);
        }
        return numberStack.pop();
    }
    //判断符号的优先级
    private int priority(char x){
        if(x =='+'|| x =='-'){
            return 1;
        }else{
            return 2;
        }

    }
    //计算结果
    private float calRes(char x,float num1,float num2){
        float res=0;
        switch (x){
            case '+':
                res=num1+num2;
                break;
            case '-':
                res=num2-num1;
                break;
            case '*':
                res=num1*num2;
                break;
            case '/':
                res=num2/num1;
                break;
        }
        return res;

    }
}
