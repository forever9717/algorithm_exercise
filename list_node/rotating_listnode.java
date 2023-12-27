package list_node;

public class rotating_listnode {

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) {
            return head;
        }
        int length = cacu_lsitnode_length(head);
        k = k%length;
        for (int i=0; i<k; i++) {
            head = move_a_step(head);
        }
        return head;
    }

    private int cacu_lsitnode_length(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    private ListNode move_a_step(ListNode head) {

        ListNode record = head;
        ListNode temp = null;

        while (head.next != null) {
            temp = head;
            head = head.next;
        }

        if (temp != null) {
            ListNode new_head = temp.next;
            new_head.next = record;
            temp.next = null;
            return new_head;
        }

        return head;
    }
}
