package dsaa.a06Sort.mergeSort;

import dsaa.a06sort.mergeSort.MergeSort;
import org.junit.Test;

import java.util.Arrays;

public class MergeSortTest {

    int[] arr = {1, 3, 4, 2, 5, 8, 6};

    @Test
    public void test() {
        MergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
