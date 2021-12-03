public class BinarySearchFirstOccurrence {
    public static int binarySearchFirstOccurrence (int[] array, int target) {
        //corner case
        if (array == null || array.length == 0) {
            return -1;
        }
        //maintain an array with length = 2
        int left = 0;
        int right = array.length - 1;
        int mid = left + (right - left) / 2;

        while (left < right - 1) {
            if (array[mid] >= target) {
                right = mid;
            } else {
                left = mid;
            }
        }

        //post-processing
        if (array[left] == target) {
            return left;
        }
        if (array[right] == target) {
            return right;
        } else {
            return -1;
        }
    }
}
