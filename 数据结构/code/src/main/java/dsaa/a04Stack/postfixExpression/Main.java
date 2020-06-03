package dsaa.a04Stack.postfixExpression;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        Main m=new Main();
        while (cin.hasNext()){
            String exp=cin.next();
            float res=m.postfix(exp);
            System.out.println((int)res);
        }

    }
    public float postfix(String expression){
        String[] expressionItem=expression.split(" ");
        Stack<Float> stack=new Stack<>();
        for(int i=0;i<expressionItem.length;i++){
            String item=expressionItem[i];
            if(isNumeric(item)){
                stack.push(Float.parseFloat(item));
            }else {
                stack.push(cal(item,stack.pop(),stack.pop()));
            }

        }
        return stack.pop();
    }
    private static boolean isNumeric(String str){
        for (int i = str.length();--i>=0;){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
         }
        return true;
    }
    //计算结果
    private float cal(String item,float num1,float num2){
        float res=0;
        if(item.equals("+")){
            res=num2+num1;
        }else if(item.equals("-")){
            res=num2-num1;
        }else if(item.equals("/")){
            res=num2/num1;
        }else if(item.equals("*")){
            res=num2*num1;
        }
        return res;

    }
}
