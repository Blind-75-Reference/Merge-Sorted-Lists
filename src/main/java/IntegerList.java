import java.util.Objects;

public class IntegerList {
    public ListNode head;

    public IntegerList() {

    }

    public IntegerList(int[] array) {
        if(array.length > 0) {
            head = new ListNode(array[0]);

            ListNode cursor = head;
            for(int i = 1; i < array.length; i++) {
                cursor.next = new ListNode(array[i]);
                cursor = cursor.next;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode cursor1 = this.head;
        ListNode cursor2 = ((IntegerList)o).head;
        while(cursor1 != null && cursor2 != null) {
            if(!cursor1.equals(cursor2)) {
                return false;
            }
            cursor1 = cursor1.next;
            cursor2 = cursor2.next;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(head);
    }

    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }
}


