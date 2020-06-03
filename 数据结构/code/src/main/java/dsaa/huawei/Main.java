package dsaa.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int x = cin.nextInt();
            int y = cin.nextInt();
            list.add(new Pair(x, y));
        }
    }

    public static double twoPointSum(Pair p1, Pair p2) {
        return Math.sqrt(Math.pow(p1.x + p2.x, 2) + Math.pow(p1.y + p2.y, 2));
    }

    public static void calRes(List<Pair> list) {
        long[][] disGraph = new long[5][5];
        boolean[] isVisit = new boolean[5];


    }

    public static void recursion(List<Pair> list, boolean[] isVisit, int visitNum, int beginPair, int nowPair, long[][] disGraph, long sumNow) {
        if (visitNum == 5) {
            disGraph[beginPair][nowPair] = sumNow;
            return;
        }
        for (int i = 0; i < 5; i++) {
            if (!isVisit[i]) {
                Pair p = list.get(i);

            }
        }

    }


}

class Pair {
    public int x;
    public int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}