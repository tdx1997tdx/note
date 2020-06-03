package dsaa.a07search.bs2;

public class BinarySearch {
    public static int binarySearch(int[] A, int left, int right, int val) {
        if (left > right) return -1;
        int ret = 0;
        int mid = (left + right) / 2;
        if (A[mid] == val) {
            while (mid - 1 >= 0 && A[mid - 1] == val) {
                mid = mid - 1;
            }
            return mid;
        } else if (A[mid] > val) {
            ret = binarySearch(A, left, mid - 1, val);
        } else {
            ret = binarySearch(A, mid + 1, right, val);
        }
        return ret;
    }

    public int getPos(int[] A, int n, int val) {
        // write code here
        return binarySearch(A, 0, n - 1, val);
    }
}
