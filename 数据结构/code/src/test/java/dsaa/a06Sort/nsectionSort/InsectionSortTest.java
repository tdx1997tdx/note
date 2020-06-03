package dsaa.a06Sort.nsectionSort;

import dsaa.a06sort.insertionSort.InsertionSort;
import org.junit.Test;

import java.util.Arrays;

public class InsectionSortTest {

    int[] arr = {1, 3, 4, 2, 5, 8, 6};

    @Test
    public void test() {
        InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
