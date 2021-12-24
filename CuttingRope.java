public class CuttingRope {
    public static int getMaxProduct(int n) {
        // for each length i of the rope, find the max product of all possible combination of cuts
        //and store the max product in int[] m[i];
        int[] m = new int[n + 1];
        m[0] = -1;
        m[1] = -1;
        m[2] = 1;
        // i is length of the rope
        for (int i = 3; i <= n; i ++) {
            int max = Integer.MIN_VALUE;
            //j is the length of the left part
            for (int j = i - 1; j >= 1; j--) {
                max = Math.max((Math.max(m[j], j) * (i - j)), max);
            }
            m[i] = max;
        }
        return m[n];
    }
}
