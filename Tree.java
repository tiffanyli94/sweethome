public class Tree {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        System.out.println("running...");

        node1.print();
        int sum = node1.getSum();
        System.out.println(sum);
        int sum2 = node2.getSum();
        System.out.println(sum2);

    }
}

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(int value) {
        this.value = value;
    }

    public void print() {
        if (right != null) {
            right.print();
        }
        System.out.println(this.value);
        if (left != null) {
            left.print();
        }
    }

    public int getSum() {
        int sum = this.value;

        if (left != null) {
            sum = sum + left.getSum();
        }

        if (right != null) {
            sum = sum + right.getSum();
        }

        return sum;
    }


}