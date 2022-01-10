public class LinkedList {
    public static ListNode reverse(ListNode head) {
        // Write your solution here
        if (head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.nextNode;
            cur.nextNode = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
    public static ListNode reverseR(ListNode head) {
        // Write your solution here
        if (head == null) {
            return head;
        }
        ListNode newHead = reverse(head.nextNode);

        ListNode cur = head;
        ListNode prev = null;
        cur.nextNode.nextNode = cur;
        cur.nextNode = prev;

        return newHead;
    }
}
