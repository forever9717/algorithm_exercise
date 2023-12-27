package list_node;

public class ring_linked_listnode {

    public boolean hasCycle(ListNode head) {

        ListNode mark = new ListNode();
        boolean is_cycle = false;
        ListNode temp = new ListNode();

        while (head != null) {

            if (head == mark) {
                is_cycle = true;
                break;
            }

            temp = head.next;
            head.next = mark;
            head = temp;
        }
        
        return is_cycle;
    }
}
