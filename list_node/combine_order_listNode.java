package list_node;

public class combine_order_listNode {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode previous = new ListNode();
        ListNode head = previous;
        ListNode temp;

        while (list2 != null) {
            
            while (list1 != null) {

                if (list2.val < list1.val) {
                    previous.next = list2;
                    previous = list2;
                    temp = list2.next;
                    list2.next = list1;
                    list2 = temp;
                    break;
                }

                previous.next = list1;
                previous = list1;
                list1 = list1.next;
            }

            if (list1 == null) {
                previous.next = list2;
                break;
            }
        }

        return head.next;

    }
}
