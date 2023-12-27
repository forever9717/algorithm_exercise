package list_node;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class reverse_listnode {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head.next == null) {
            return head;
        }

        ListNode temp = new ListNode();
        temp.next = head;
        
        ListNode before_temp = temp;
        for (int i=1; i<left; i++) {
            before_temp = before_temp.next;
        }

        List<ListNode> record = new ArrayList<>();
        ListNode record_brfore_reverse_list_node = before_temp;

        for (int i=left; i<=right; i++) {
            before_temp = before_temp.next;
            record.add(before_temp);
        }
        
        ListNode trail = before_temp.next;
        ListNode new_head = reverse(record);
        record_brfore_reverse_list_node.next = new_head;
        record.get(0).next = trail;
        return temp.next;
    } 


    private ListNode reverse(List<ListNode> listNodes) {
        int size = listNodes.size() - 1;
        for (int i=size; i>0; i--) {
            listNodes.get(i).next = listNodes.get(i-1);
        }
        return listNodes.get(size);
    }

}
