package dsaa.a06sort.selectionSort;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int arrNum = arr.length;
        if (arrNum < 2) return;
        for (int i = 0; i < arrNum; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i; j < arrNum; j++) {
                if (arr[j] < min) {
                    minIndex = j;
                    min = arr[j];
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
    }
}
