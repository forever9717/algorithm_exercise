package list_node;


public class two_num_add {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        ListNode current_node = head;
        ListNode temp = new ListNode();
        int add = 0;

        while (true) {

            int new_val = l1.val + l2.val + add;
            add = new_val/10;
            new_val %= 10; 

            ListNode nextNode = new ListNode(new_val);
            current_node.next = nextNode;
            current_node = nextNode;

            if (l1.next == null && l2.next == null) {
                if (add != 0) {
                    ListNode lastNode = new ListNode(add);
                    current_node.next = lastNode;
                }
                break;
            }

            l1 = l1.next == null ? temp : l1.next;
            l2 = l2.next == null ? temp : l2.next;

        }
        return head.next;
    }

    private ListNode cacu_add(ListNode l1, ListNode l2, ListNode current_node, int count, int add) {

        int value1 = l1.val;
        int value2 = l2.val;
        int new_val = value1 + value2 + add;
        add = new_val/count;
        new_val %= count;

        ListNode nextNode = new ListNode(new_val);
        current_node.next = nextNode;

        if (l1.next == null && l2.next == null) {
            if (add != 0) {
                ListNode lastNode = new ListNode(add);
                nextNode.next = lastNode;
            }
            return current_node;
        }

        ListNode temp = new ListNode();
        l1 = l1.next == null ? temp : l1.next;
        l2 = l2.next == null ? temp : l2.next;
        return cacu_add(l1, l2, nextNode, count, add);
    }
}
