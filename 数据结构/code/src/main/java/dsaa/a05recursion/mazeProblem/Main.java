package dsaa.a05recursion.mazeProblem;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int rowNum = cin.nextInt();
        int colNum = cin.nextInt();
        int[][] input = new int[rowNum][colNum];
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                input[i][j] = cin.nextInt();
            }
        }

        Stack<String> stack = new Stack<>();
        mazeTrack(input, 0, 0, rowNum, colNum, stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    //i表示当前坐标的横坐标，j表示纵坐标,input代表迷宫，res路径信息
    public static boolean mazeTrack(int[][] input, int i, int j, int rowNum, int colNum, Stack<String> res) {
        //如果到达终点返回true
        if (input[rowNum - 1][colNum - 1] == 2) return true;
        //如果是墙或者路已经走了，返回false
        if (i < 0 || i >= rowNum || j < 0 || j >= colNum || input[i][j] != 0) {
            return false;
        }
        //说明路暂时可以走，标为2
        input[i][j] = 2;
        //递归判断上下左右是否有路，如果都为false,这个地方封路
        if (!mazeTrack(input, i, j + 1, rowNum, colNum, res) && !mazeTrack(input, i + 1, j, rowNum, colNum, res) && !mazeTrack(input, i - 1, j, rowNum, colNum, res) && !mazeTrack(input, i, j - 1, rowNum, colNum, res)) {
            input[i][j] = 1;
            return false;
        }
        res.push("(" + i + "," + j + ")");
        return true;
    }

}

