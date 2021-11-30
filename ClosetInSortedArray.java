public class ClosetInSortedArray {
    public static int closetInSortedArray (int[] array, int target){
        if (array == null || array.length == 0) {
            return -1;
        }
        if (array.length == 1) {
            return 0;
        }

        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (target == array[mid]) {
                return mid;
            }
            if (target < array[mid]) {
                right = mid;
            }
            if (target > array[mid]) {
                left = mid;
            }
        }

        //post-processing
        if (Math.abs(array[left] - target) <= Math.abs(array[right] - target)){
            return left;
        } else {
            return right;
        }


    }
}
