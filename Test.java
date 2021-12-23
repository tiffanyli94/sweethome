import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 11/21.  Queue and Stack practices
//        QueueAndStackTest();
        // 11/22.  Binary Search
//        BinarySearchTest();
        //11/30 test case closest in sorted array
//        testClosestInSortedArray();
        //12/2 test case for findRange
//        testFindRange();
        //12/3 test case for kthClosest
//        testKthBS();

        //12/04 findSubsets - maxGu
//        FindSubset.printAllSubsets(new char[]{'a', 'b', 'c'});

     //12/05
        // testGraphTraversalTree();
    //12/05
      //  testPrintNeighbors();
//        GraphNode root = constructGraph();
//        levelPrintGraph(root);
//        testTopKWords();

       // testRemoveChar();
        //testRemoveDuplicate();
       // testSubString();
        // testNQueen();

       //testFib();
        testFib4();


    }
    private static void testFib4() {
        int i = 10;
        System.out.print(Fib.getFib4(i));
    }

    private static void testFib3() {
        int i = 10;
        System.out.print(Fib.getFib3(i));
    }

    private static void testFib() {
        int i = 10;
        int[] m = new int[i + 1];
        System.out.println(Fib.getFib2(i, m));
    }

    private static void testNQueen() {
        List<List<Integer>> solution = NQueen.NQueen(8);
        for (int i = 0; i < solution.size(); i++) {
            for (int j = 0; j < solution.get(i).size(); j++) {
                System.out.print(solution.get(i).get(j));
            }
            System.out.println(" ");
        }


    }

    private static void testSubString() {
        String one = "helloworld";
        String two = "low";
        System.out.print(Substring.substring(one, two));
    }

    private static void testRemoveDuplicate() {
        String a = "aaabbbbbbcccccddddd";
        System.out.print(RemoveDuplicate.removeDuplicate(a));
    }
    private static void testRemoveChar() {
        String a = "student";
        char[] targets = {'u', 'e'};
        System.out.println(RemoveChar.removeChar(a, targets));
    }

    private static void testTopKWords() {
        String[] s = new String[]{"a", "b", "c", "b", "a", "a", "c", "c", "c"};
        String[] result = TopKWords.topKWords(s ,2);
        for (String s1 : result) {
            System.out.println(s1);
        }
    }

    private static void levelPrintGraph(GraphNode root) {
        //null check
        if (root == null) {
            return;
        }
        //construct visited Map
        Map<Integer, Boolean> visited = new HashMap<>();
        //construct a queue and set parameters
        Queue<GraphNode> q = new LinkedList<>();
        q.offer(root);
        visited.put(root.value, true);
        int length = q.size();
        //traverse map using queue
        while (!q.isEmpty()){
            GraphNode cur = q.poll();
            System.out.print(cur.value);
            length--;
            for (Map.Entry<Integer, GraphNode> entry : cur.neighbors.entrySet()) {

                if (visited.containsKey(entry.getKey())) {
                  continue;
                }
                q.offer(entry.getValue());
                visited.put(entry.getValue().value, true);
            }
            if (length == 0) {
                System.out.println(" ");
                length = q.size();
            }
        }
    }

    public static void testPrintNeighbors(){
        GraphNode root = constructGraph();
        root.printNeighbors();
    }

    public static GraphNode constructGraph() {
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        GraphNode node5 = new GraphNode(5);
        node1.neighbors.put(2, node2);
        node1.neighbors.put(3, node3);
        node1.neighbors.put(4, node4);
        node2.neighbors.put(1, node1);
        node2.neighbors.put(5, node5);
        node3.neighbors.put(1, node1);
        node3.neighbors.put(5, node5);
        node3.neighbors.put(4, node4);
        node4.neighbors.put(1, node1);
        node4.neighbors.put(3, node3);
        node5.neighbors.put(2, node2);
        node5.neighbors.put(3, node3);
        return node1;
    }

    public static void testGraphTraversalTree () {
        //12/05 build tree
        TreeNode root = constructTree();
        //   GraphTraversal.graphTraversal(root);
        List<Integer> res = GraphTraversal.getLevelSum(root);
        System.out.println(res);
    }

    public static TreeNode constructTree() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode (2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);
        return root;
    }

    public static void testKthBS()
    {
        int[] nums= new int[]{1, 2, 4, 4, 4, 5, 9};
        int target = 4;
        int k = 2;
        int[] result = KthClosestBS.kthClosestBS(nums, target, k);
        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }
    }
    public static void testFindRange() {
        int[] nums= new int[]{1, 2, 4, 4, 4, 5, 9};
        int target = 4;
        SearchRange searchRangeTest = new SearchRange();
        int[] result = searchRangeTest.searchRange(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
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
        PracticeQueue testQ = new PracticeQueue();
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

