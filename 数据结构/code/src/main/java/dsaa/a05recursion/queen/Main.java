package dsaa.a05recursion.queen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //存放棋盘和皇后的数量
    private static final int QUEEN_NUM = 8;
    //存储最终结果
    List<String> finalRes;
    //存储皇后位置
    List<Integer> nowRes;

    public Main() {
        finalRes = new ArrayList<>();
        nowRes = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Main m = new Main();
        m.queueProblem(0);

        while (cin.hasNext()) {
            int i = cin.nextInt();
            System.out.println(m.finalRes.get(i - 1));

        }
    }

    public void queueProblem(int i) {

        // 遍历当前行的所有单元格 以行为单元
        for (int j = 0; j < QUEEN_NUM; j++) {
            // 是否能够放置皇后
            if (check(i, j)) {
                nowRes.add(j);
                if (i == QUEEN_NUM - 1) {
                    // 最后行放置完毕 放入空间
                    finalRes.add(listToString());
                } else {
                    // 放置下一行
                    queueProblem(i + 1);
                }

                //回退到当前步骤，把皇后设置为0
                nowRes.remove(i);
            }

        }
    }


    public boolean check(int i, int j) {
        for (int x = 0; x < nowRes.size(); x++) {
            int y = nowRes.get(x);
            //检查列 检查右下 检查左下
            if (y == j || Math.abs(i - x) == Math.abs(y - j)) {
                return false;
            }
        }
        return true;

    }

    public String listToString() {
        String res = "";
        for (int i : nowRes) {
            res += i + 1;
        }
        return res;
    }
}
