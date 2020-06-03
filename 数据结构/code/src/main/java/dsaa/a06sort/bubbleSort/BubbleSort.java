package dsaa.a06sort.bubbleSort;

public class BubbleSort {

    public static void bubbleSort(int[] arr, int arrNum) {
        if (arrNum < 2) return;
        for (int i = 0; i < arrNum; i++) {
            for (int j = arrNum - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
