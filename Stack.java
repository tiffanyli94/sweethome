public class Stack {
    private ListNode head;
    private int size;

    public Integer pop() {
        if (head == null) {
            return null;
        }

        ListNode temp = head;
        head = head.nextNode;
        size--;
        return temp.value;
    }

    public Integer peek() {
        if (head == null) {
            return null;
        }
        return head.value;
    }

    public boolean push(int element) {
        ListNode newNode = new ListNode(element);
        newNode.nextNode = head;
        head = newNode;
        size++;
        return true;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
}