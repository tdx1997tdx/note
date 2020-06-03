package dsaa.a06sort.heapSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        Main.heapSort(arr);
        String res = "";
        for (int i : arr) {
            res += i + " ";
        }
        res = res.trim();
        System.out.println(res);
    }

    public static void heapSort(int[] arr) {
        int temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            buildHeap(arr, i);
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
        }
    }

    public static void buildHeap(int[] arr, int i) {
        for (int j = i; j >= 0; j--) {
            //有节点
            if (j * 2 + 1 <= i) {
                recursionSwap(arr, j, i);
            }
        }
    }

    public static void recursionSwap(int[] arr, int currentNode, int i) {
        if (currentNode > i) return;
        int temp = 0;
        if (currentNode * 2 + 2 <= i) {
            if (arr[currentNode * 2 + 1] > arr[currentNode] && arr[currentNode * 2 + 1] > arr[currentNode * 2 + 2]) {
                //如果与左节点交换
                temp = arr[currentNode];
                arr[currentNode] = arr[currentNode * 2 + 1];
                arr[currentNode * 2 + 1] = temp;
                recursionSwap(arr, currentNode * 2 + 1, i);
            } else if (arr[currentNode * 2 + 2] > arr[currentNode] && arr[currentNode * 2 + 2] > arr[currentNode * 2 + 1]) {
                //如果与右节点交换
                temp = arr[currentNode];
                arr[currentNode] = arr[currentNode * 2 + 2];
                arr[currentNode * 2 + 2] = temp;
                recursionSwap(arr, currentNode * 2 + 2, i);
            }
        } else if (currentNode * 2 + 1 <= i) {
            if (arr[currentNode * 2 + 1] > arr[currentNode]) {
                //如果与左节点交换
                temp = arr[currentNode];
                arr[currentNode] = arr[currentNode * 2 + 1];
                arr[currentNode * 2 + 1] = temp;
            }
        }

    }

}
