class Solution {
    /*
    This solution
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode mergedList = new ListNode();
        if(list1.val < list2.val) {
            mergedList.val = list1.val;
            list1 = list1.next;
        } else {
            mergedList.val = list2.val;
            list2 = list2.next;
        }

        ListNode cursor = mergedList;
        while(list1 != null || list2 != null) {
            if(list1 == null) {
                cursor.next = list2;
                return mergedList;
            } else if(list2 == null) {
                cursor.next = list1;
                return mergedList;
            } else if(list1.val < list2.val) {
                cursor.next = list1;
                cursor = cursor.next;
                list1 = list1.next;
            } else {
                cursor.next = list2;
                cursor = cursor.next;
                list2 = list2.next;
            }
        }


        return mergedList;
    }
}