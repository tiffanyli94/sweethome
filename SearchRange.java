public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int firstOccurrence = findBound(nums, target, true);
        //if the number does not exist in the array
        if (firstOccurrence == -1) {
            return new int[]{-1, -1};
        }
        int lastOccurrence = findBound(nums, target, false);
        return new int[]{firstOccurrence, lastOccurrence};
    }

    private static int findBound(int[] nums, int target, boolean isFirst){
        int begin = 0;
        int end = nums.length - 1;

        while(begin <= end) {
            int mid = begin + (end - begin) / 2;
            if (nums[mid] == target) {
                //after you find the target, you are going into the  loop of finding the left and right boundary
                //first, looking for the left boundary
                if (isFirst) {
                    if (mid == begin || nums[mid - 1] != target) {
                        return mid;
                    }
                    end = mid - 1;
                }
               //second, looking for the right boundary
                else {
                    if (mid == end || nums[mid + 1] != target) {
                        return mid;
                    }
                    begin = mid + 1;
                }
            }
            else if (nums[mid] < target) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
