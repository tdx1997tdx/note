package dsaa.a06sort.insertionSort;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int arrNum = arr.length;
        if (arrNum < 2) return;
        //i代表将要插入的index
        int temp = 0;
        for (int i = 1; i < arrNum; i++) {
            //寻找插入位置
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
