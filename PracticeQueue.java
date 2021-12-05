public class PracticeQueue {
    private int size;
    private ListNode tail;
    private ListNode head;

    public Integer poll() {
        if (head == null) {
            return null;
        }
        if (size == 1) {
            tail = null;
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

    public boolean offer(int element) {
        ListNode newNode = new ListNode(element);
        if (tail == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
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
