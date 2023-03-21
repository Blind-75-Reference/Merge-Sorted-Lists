import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {
    Solution solution = new Solution();

    @Test
    public void testCase1() {
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode head2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4))))));

        Assertions.assertEquals(expected, solution.mergeTwoLists(head1, head2));

    }

    @Test
    public void testCase2() {
        ListNode list1 = new ListNode(1, new ListNode(1, new ListNode(1)));
        ListNode list2 = new ListNode(2, new ListNode(2, new ListNode(2)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(2))))));

        Assertions.assertEquals(expected, solution.mergeTwoLists(list1, list2));

    }

    @Test
    public void testCase3() {
        ListNode list1 = new ListNode(1, new ListNode(5, new ListNode(9)));
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(7)));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(7, new ListNode(9))))));

        Assertions.assertEquals(expected, solution.mergeTwoLists(list1, list2));

    }

    @Test
    public void testCase4() {
        ListNode list1 = new ListNode(1, new ListNode(5, new ListNode(9)));
        ListNode list2 = null;
        ListNode expected = new ListNode(1, new ListNode(5, new ListNode(9)));

        Assertions.assertEquals(expected, solution.mergeTwoLists(list1, list2));

    }

}
