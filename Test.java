public class Test {
    public static void main(String[] args) {
        // 11/21.  Queue and Stack practices
//        QueueAndStackTest();
        // 11/22.  Binary Search
        BinarySearchTest();
        //11/30 test case closest in sorted array
        testClosestInSortedArray();
    }

    public static void testClosestInSortedArray() {
        int[] testArray = new int[]{1, 2, 3, 7, 8};
        int target = 4;
        System.out.println(ClosetInSortedArray.closetInSortedArray(testArray, target));
        int[] testArray2 = new int[]{0};
        int target2 = 4;
        System.out.println(ClosetInSortedArray.closetInSortedArray(testArray2, target2));
        int[] testArray3 = new int[]{0, 1};
        int target3 = 4;
        System.out.println(ClosetInSortedArray.closetInSortedArray(testArray3, target3));
        int[] testArray4 = new int[]{};
        int target4 = 4;
        System.out.println(ClosetInSortedArray.closetInSortedArray(testArray4, target4));
        int[] testArray5 = new int[]{1,2,3,4};
        int target5 = 4;
        System.out.println(ClosetInSortedArray.closetInSortedArray(testArray5, target5));
    }

    public static void BinarySearchTest() {

    }

    public static void QueueAndStackTest() {
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

