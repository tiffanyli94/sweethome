public class TwoDBinarySearch {
    public int[] twoDBinarySearch (int[][] matrix, int target) {
        //check corner case
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[] {-1, -1};
        }
        int m = matrix.length; //row
        int n = matrix[0].length; //column
        int left = 0;
        int right = m * n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midR = mid / n;
            int midC = mid % n;
            if (matrix[midR][midC] == target) {
                return new int[] {midR, midC};
            }
            if (matrix[midR][midC] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}

