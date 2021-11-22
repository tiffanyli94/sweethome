public class BinarySearch {
    public static int binarySearch(int[] a, int target) {
        //corner case
        if (a == null || a.length == 0) {
            return -1;
        }
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int firstOccur(int[] array, int target) {
        //corner case
        if (array == null || array.length == 0){
            return -1;
        }

        int left = 0;
        int right = array.length - 1;
        while (left < right -1) {
            int mid = left + (right - left) / 2;
            if (array[mid] >= target) {
                right = mid;
            }
            else {
                left = mid;
            }
        }

        //post-process
        if (array[left] == target) {
            return left;
        }
        if (array[right] == target) {
            return right;
        }
        return -1;

    }
}
