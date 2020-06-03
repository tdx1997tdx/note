package dsaa.a04Stack.niToPost;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner cin = new Scanner(System.in);
        Main m = new Main();
        while (cin.hasNext()) {
            String exp = cin.next();
            String res = m.niToPost(exp);
            System.out.println(res);
        }
    }

    //判断是否是数字
    private static boolean isNumeric(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')')
            return false;
        return true;
    }

    public String niToPost(String expression) {
        char[] res = new char[expression.length()];
        int index = 0;
        Stack<Character> symbolStack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char x = expression.charAt(i);
            if (isNumeric(x)) {
                res[index] = x;
                index++;
            } else if (x == '(') {
                symbolStack.push(x);
            } else if (x == ')') {
                while (symbolStack.peek() != '(') {
                    res[index] = symbolStack.pop();
                    index++;
                }
                symbolStack.pop();
            } else {
                while (!symbolStack.isEmpty() && symbolStack.peek() != '(' && priority(symbolStack.peek()) >= priority(x)) {
                    res[index] = symbolStack.pop();
                    index++;
                }
                symbolStack.push(x);
            }

        }
        while (!symbolStack.isEmpty()) {
            res[index] = symbolStack.pop();
            index++;
        }
        return String.valueOf(res);
    }

    //判断符号的优先级
    private int priority(char x) {

        if (x == '+' || x == '-') {
            return 1;
        } else if (x == '*' || x == '/') {
            return 2;
        }
        return 0;
    }
}
