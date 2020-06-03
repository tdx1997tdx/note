package dsaa.a06sort.mergeSort;

public class MergeSort {
    private static int[] aux;

    public static void mergeSort(int[] arr) {
        aux = new int[arr.length];
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int beginIndex, int endIndex) {
        if (beginIndex >= endIndex) {
            return;
        }
        int mid = (beginIndex + endIndex) / 2;
        sort(arr, beginIndex, mid);
        sort(arr, mid + 1, endIndex);
        //合并操作
        int lowIndex = beginIndex;
        int highIndex = mid + 1;
        int auxIndex = beginIndex;
        while (auxIndex <= endIndex) {
            if (lowIndex <= mid && highIndex <= endIndex) {
                if (arr[lowIndex] > arr[highIndex]) {
                    aux[auxIndex] = arr[highIndex];
                    highIndex++;
                } else if (arr[lowIndex] <= arr[highIndex]) {
                    aux[auxIndex] = arr[lowIndex];
                    lowIndex++;
                }
            } else if (highIndex <= endIndex) {
                aux[auxIndex] = arr[highIndex];
                highIndex++;
            } else {
                aux[auxIndex] = arr[lowIndex];
                lowIndex++;
            }
            auxIndex++;
        }
        //将辅助数组中的值赋值给arr
        for (int i = beginIndex; i <= endIndex; i++) {
            arr[i] = aux[i];
        }
    }
}
