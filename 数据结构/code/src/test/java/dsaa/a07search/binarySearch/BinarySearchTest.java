package dsaa.a07search.binarySearch;

import org.junit.Test;

public class BinarySearchTest {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    public void test() {
        int a = BinarySearch.binarySearch(arr, 3);
        System.out.println(a);
    }

    @Test
    public void test2() {
        int a = BinarySearch.binarySearch(arr, 11);
        System.out.println(a);
    }

    @Test
    public void test3() {
        int a = BinarySearch.binarySearch(arr, -1);
        System.out.println(a);
    }
}
