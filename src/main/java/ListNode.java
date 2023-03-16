public class ListNode {
    private int val;
    private ListNode next;

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int[] listArray) {
        ListNode node = new ListNode(listArray[0]);
        for(int i = 1; i < listArray.length; i++) {
            node.next = new ListNode(listArray[i]);
            node = node.next;
        }
    }
}