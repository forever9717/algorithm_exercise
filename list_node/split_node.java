package list_node;

public class split_node {

    public ListNode partition(ListNode head, int x) {

        ListNode point = new ListNode();
        point.next = head;

        ListNode max = null;
        ListNode aim_head = new ListNode();
        ListNode aim_point = aim_head;

        while(point.next != null) {

            if (point.next.val < x) {
                point.next = point.next.next;
                aim_point.next = point.next;
                aim_point = aim_point.next;
                point = point.next;
                continue;
            }
                         
            if (max == null) {
                max = point.next;
            }
            point = point.next;
        }
        aim_point.next = max;
        return aim_head.next;
    } 
}
