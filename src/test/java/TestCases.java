import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {
    Solution solution = new Solution();

    @Test
    public void testCase1() {
        IntegerList list1 = new IntegerList(new int[]{1,2,4});
        IntegerList list2 = new IntegerList (new int[]{1,3,4});
        IntegerList expected = new IntegerList (new int[]{1,1,2,3,4,4});

        Assertions.assertEquals(expected, solution.mergeTwoLists(list1, list2));

    }
//
//    @Test
//    public void testCase2() {
//        ListNode list1 = new ListNode(new int[]{1,1,1});
//        ListNode list2 = new ListNode(new int[]{2,2,2});
//        ListNode expected = new ListNode(new int[]{1,1,1,2,2,2});
//
//        Assertions.assertEquals(expected, solution.mergeTwoLists(list1, list2));
//
//    }
//
//    @Test
//    public void testCase3() {
//        ListNode list1 = new ListNode(new int[]{1,1,1});
//        ListNode list2 = new ListNode();
//        ListNode expected = new ListNode(new int[]{1,1,1});
//
//        Assertions.assertEquals(expected, solution.mergeTwoLists(list1, list2));
//
//    }
//
//    @Test
//    public void testCase4() {
//        ListNode list1 = new ListNode(new int[]{-1,31,16});
//        ListNode list2 = new ListNode(new int[]{1,-1,-111,55,112});
//        ListNode expected = new ListNode(new int[]{-111,-1,-1,1,16,31,55,112 });
//
//        Assertions.assertEquals(expected, solution.mergeTwoLists(list1, list2));
//
//    }
}
