package dsaa.a07search.bs1;

public class BinarySearch {
    public int getPos(int[] A, int n, int val) {
        // write code here
        int left = 0;
        int right = n - 1;
        int mid = 0;
        while (left <= right) {
            mid = (int) (right + left) / 2;
            if (A[mid] == val) {
                while (mid - 1 >= 0 && A[mid - 1] == val) {
                    mid = mid - 1;
                }
                return mid;
            } else if (A[mid] > val) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
