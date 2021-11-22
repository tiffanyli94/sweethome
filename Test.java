public class Test {
    public static void main(String[] args) {
        // Stack test case
        Stack testStack = new Stack();
        testStack.push(5);
        testStack.push(6);
        testStack.push(7);
        System.out.println(testStack.size());
        System.out.println(testStack.peek());
        int a = testStack.pop();
        System.out.println(testStack.peek());
        System.out.println(a);
        int b = testStack.pop();
        System.out.println(b);

        // Queue test case
        Queue testQ = new Queue();
        testQ.offer(1);
        testQ.offer(2);
        testQ.offer(3);
        System.out.println(testQ.size());
        System.out.println(testQ.peek());
        System.out.println(testQ.poll());
        System.out.println(testQ.size());

        int size = testQ.size();
        for (int i = 0; i < size; i++) {
            System.out.println(testQ.poll());
        }
        System.out.println(testQ.size());
    }
}

