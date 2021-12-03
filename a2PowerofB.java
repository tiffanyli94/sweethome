public class a2PowerofB {
    public long a2PowerofB(int a, int b) {
        //assumption b>= 0
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        long half = a2PowerofB(a, b / 2);
        return b % 2 == 0 ? half * half : half * half * a;
    }
}
