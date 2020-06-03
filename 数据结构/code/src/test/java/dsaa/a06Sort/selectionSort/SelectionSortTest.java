package dsaa.a06Sort.selectionSort;

import dsaa.a06sort.selectionSort.SelectionSort;
import org.junit.Test;

import java.util.Arrays;

public class SelectionSortTest {

    int[] arr = {1, 3, 4, 2, 5, 8, 6};

    @Test
    public void test() {
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
