package dsaa.a06Sort.shellSort;

import dsaa.a06sort.shellSort.ShellSort;
import org.junit.Test;

import java.util.Arrays;

public class ShellSortTest {

    int[] arr = {1, 3, 4, 2, 5, 8, 6};

    @Test
    public void test() {
        ShellSort.shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
