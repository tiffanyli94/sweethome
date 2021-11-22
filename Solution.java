public class Solution {
    public int[] removeDuplicate(int[] array, int duplicate){
        //count the number of duplicates
        int count = 0;
        for (int num : array) {
            if (num == duplicate) {
                count ++;
            }
        }
        int [] result = new int[array.length - count];
        int index = 0;
        for (int num : array) {
            if (num == duplicate){
                continue;
            }
            else {
                result[index] = num;
            }
        }
        return result;
    }

    public static int[] search(int[][] matrix, int target) {
        //corner case
        if (matrix == null || matrix.length == 0 || matrix[0].length ==0) {
            return new int[] {-1, -1};
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m * n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int rowIndex = mid / n;
            int colIndex = mid % n;
            if (matrix[rowIndex][colIndex] == target) {
                return new int[] {rowIndex, colIndex};
            }
            else if (matrix[rowIndex][colIndex] < target) {
                left = mid + 1;
            }
            else if (matrix[rowIndex][colIndex] > target) {
                right = mid -1;
            }
        }
        return new int[] {-1, -1};

    }
}
