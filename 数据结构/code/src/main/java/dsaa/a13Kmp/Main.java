package dsaa.a13Kmp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String mainStr = cin.next();
        String patternStr = cin.next();
        System.out.println(kmp(mainStr, patternStr));
    }

    public static boolean kmp(String mainStr, String patternStr) {
        System.out.println(Arrays.toString(kmpNext(patternStr)));
        return false;
    }

    //获取next数组
    public static int[] kmpNext(String patternStr) {
        int strNum = patternStr.length();
        int[] nextTable = new int[strNum + 1];
        nextTable[1] = 0;
        nextTable[2] = 1;
        int j = 1;
        for (int i = 3; i <= strNum; i++) {
            while (j > 0 && patternStr.charAt(i - 1) != patternStr.charAt(j - 1)) {
                j = nextTable[j];
            }
            nextTable[i] = j;
            j++;
        }

        return nextTable;
    }
}
