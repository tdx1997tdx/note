package dsaa.a06Sort.radixSort;

import dsaa.a06sort.radixSort.RadixSort;
import org.junit.Test;

import java.util.Arrays;

public class RadixSortTest {

    int[] arr = {1, 3, 4, 12, 5, 8, 6};

    @Test
    public void test() {
        RadixSort.radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
