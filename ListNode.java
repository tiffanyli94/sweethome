public class ListNode {
    int value;
    ListNode nextNode;

    public ListNode (int value) {

        this.value = value;
    }

    public void print() {
        ListNode cur = this;
        while (cur != null) {
            System.out.println(cur.value);
            cur = cur.nextNode;

        }
    }
}
