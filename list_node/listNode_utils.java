package list_node;

public class listNode_utils {

    public static ListNode generate(int[] nums) {
        int lengths = nums.length;
        ListNode head = new ListNode();
        ListNode record = head;
        for (int i=0; i<lengths; i++) {
            ListNode current_node = new ListNode(nums[i]);
            record.next = current_node;
            record = current_node;
        }
        return head.next;
    }


    public static ListNode generate_cycle(int[] nums, int pos) {
        int lengths = nums.length;
        ListNode head = new ListNode();
        ListNode record = head;
        ListNode record_cycle = null;
        for (int i=0; i<lengths; i++) {
            ListNode current_node = new ListNode(nums[i]);
            record.next = current_node;
            record = current_node;
            if (i == pos) {
                record_cycle = current_node;
            }
        }
        record.next = record_cycle;
        return head.next;
    }

    public static ListNode generate_with_head(int[] nums) {
        int lengths = nums.length;
        ListNode head = new ListNode();
        ListNode record = head;
        for (int i=0; i<lengths; i++) {
            ListNode current_node = new ListNode(nums[i]);
            record.next = current_node;
            record = current_node;
        }
        return head;
    }

    public static void print_list_node(ListNode l) {
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }

    public static void print_list_node(String state, ListNode l) {

        System.out.print("\n" + state);
        while (l != null) {
            System.out.print(l.val + ",");
            l = l.next;
        }
        System.out.print("\n");
    }
}
