//Check the Kth number in the Fibonacci Sequence
public class FibonacciLite {
    public long fibonacciLite(int K) {

        if (K <= 0) {
            return 0;
        }
        if (K == 1) {
            return 1;
        }

        return fibonacciLite(K - 1) * fibonacciLite(K - 2);
    }
}
