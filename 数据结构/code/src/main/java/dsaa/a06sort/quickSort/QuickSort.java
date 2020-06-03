package dsaa.a06sort.quickSort;

public class QuickSort {

    public static void quickSort(int[] arr, int beginIndex, int endIndex) {
        if (beginIndex >= endIndex) {
            return;
        }
        int base = arr[beginIndex];
        int i = beginIndex + 1;
        int j = endIndex;
        int temp = 0;
        while (i < j) {
            if (arr[j] >= base) {
                j--;
            } else if (arr[i] <= base) {
                i++;
            } else {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (base > arr[i]) {
            arr[beginIndex] = arr[i];
            arr[i] = base;
        }
        quickSort(arr, beginIndex, i - 1);
        quickSort(arr, i, endIndex);
    }
}
