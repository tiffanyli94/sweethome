public class KthClosestBS {
    public static int[] kthClosestBS(int[] array, int target, int k) {
        //corner case
        if (array == null || array.length == 0) {
            return new int[]{-1};
        }
        if (k == 0) {
            return new int[]{0};
        }
        //find the right boarder of the target element, set if as left
        int left = findRightBoarder(array, target);
        int right = left + 1;
        int[] result = new int[k];
        //merge k numbers from here to the result int[]
        for (int i = 0; i < k; i++) {
            // if right is OOB
            if ((right >= array.length) || (left >= 0 && target - array[left] <= array[right] - target)){
                result[i] = array[left--];
            } else {
                result[i] = array[right++];
            }
        }
        return result;
    }

    private static int findRightBoarder(int[] array, int target) {
        //binary search
        int left = 0;
        int right = array.length - 1;

        // we want to find the two closest number to the target before post-processing
        while(left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] <= target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        //post-processing for finding the right boarder of the target element
        if (array[right] <= target) {
            return right;
        }
        if (array[left] <= target) {
            return left;
        }
            return -1;
    }
}
