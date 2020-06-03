package dsaa.a12Hanoi;

import java.util.ArrayList;

public class Hanoi {
    public static void recursion(ArrayList<String> result, int n, String from, String mid, String to) {
        if (n == 1) {
            result.add("move from " + from + " to " + to);
            return;
        }
        recursion(result, n - 1, from, to, mid);
        recursion(result, 1, from, mid, to);
        recursion(result, n - 1, mid, from, to);
    }

    public ArrayList<String> getSolution(int n) {
        ArrayList<String> result = new ArrayList<>();
        recursion(result, n, "left", "mid", "right");
        return result;
    }
}
