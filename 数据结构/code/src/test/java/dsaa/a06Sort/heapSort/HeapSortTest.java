package dsaa.a06Sort.heapSort;

import dsaa.a06sort.heapSort.HeapSort;
import org.junit.Test;

import java.util.Arrays;

public class HeapSortTest {
    int[] arr = {1, 3, 4, 2, 5, 8, 6};

    @Test
    public void test() {
        HeapSort.heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
