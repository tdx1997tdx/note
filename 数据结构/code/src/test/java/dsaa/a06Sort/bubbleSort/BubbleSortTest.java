package dsaa.a06Sort.bubbleSort;

import dsaa.a06sort.bubbleSort.BubbleSort;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {
    int[] arr = {1, 3, 4, 2, 5, 8, 6};

    @Test
    public void test() {
        BubbleSort.bubbleSort(arr, 7);
        System.out.println(Arrays.toString(arr));
    }
}
