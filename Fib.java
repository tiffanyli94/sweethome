public class Fib {
    public static int getFib1 (int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return getFib1(n - 1) + getFib1(n - 2);
    }

    public static int getFib2(int n, int[] m) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (m[n] != 0) {
            return m[n];
        }
        m[n] = getFib2(n - 1, m) + getFib2(n - 2, m);
        return m[n];
    }

    public static int getFib3(int n) {

        int[] m = new int[n + 1];
        m[0] = 0;
        m[1] = 1;
        for (int i = 2; i < m.length; i++) {
            m[i] = m[i -1] + m[i -2];
        }
        return m[n];
    }

    public static int getFib4(int n) {
        int[] m = new int[2];
        m[0] = 0;
        m[1] = 1;
        for (int i = 2; i <= n; i ++) {
            int sum = m[0] + m[1];
            m[0] = m[1];
            m[1] = sum;
        }
        return m[1];
    }
}
