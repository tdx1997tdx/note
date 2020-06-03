package dsaa.a06sort.shellSort;

public class ShellSort {
    public static void shellSort(int[] arr) {
        int arrNum = arr.length;
        if (arrNum < 2) return;
        int temp = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arrNum; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j + gap];
                        arr[j + gap] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
}
