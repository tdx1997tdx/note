package dsaa.a07search.binarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (value > arr[mid]) {
                left = mid - 1;
            } else if (value < arr[mid]) {
                right = mid + 1;
            } else {
                res = mid;
                break;
            }
        }
        return res;
    }
}
