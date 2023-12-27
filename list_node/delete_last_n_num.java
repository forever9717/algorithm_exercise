package list_node;

import java.util.ArrayList;

public class delete_last_n_num {


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ArrayList<ListNode> record = new ArrayList<>();

        while(head!= null) {
            record.add(head);
            head = head.next;
        }

        int size = record.size();

        if (size - n > 0) {
            ListNode delete = record.get(size - n);
            ListNode delete_before = record.get(size - n - 1);
            delete_before.next = delete.next;
            return record.get(0);
        }
        return record.get(0).next;
    }
}
