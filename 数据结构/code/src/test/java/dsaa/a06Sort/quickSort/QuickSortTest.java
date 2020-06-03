package dsaa.a06Sort.quickSort;

import dsaa.a06sort.quickSort.QuickSort;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {

    int[] arr = {1, 3, 4, 2, 5, 8, 6};

    @Test
    public void test() {
        QuickSort.quickSort(arr, 0, 6);
        System.out.println(Arrays.toString(arr));
    }
}
