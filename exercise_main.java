import java.util.ArrayList;
import java.util.List;

import dp.delete_and_earn;
import dp.knapsack_problem;
import list.basic;
import list.matrix_to_zero;
import list.three_num_of_sum;
import list_node.ListNode;
import list_node.combine_order_listNode;
import list_node.delete_last_n_num;
import list_node.listNode_utils;
import list_node.reverse_listnode;
import list_node.ring_linked_listnode;
import list_node.rotating_listnode;
import list_node.split_node;
import list_node.two_num_add;
import math.rotate_image;
import sliding_window.contains_duplicate;
import utils.readWrite;



public class exercise_main {
    
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 1;
        contains_duplicate contains_duplicate = new contains_duplicate();
        boolean result = contains_duplicate.containsNearbyDuplicate(nums, k);
        System.err.println(result);
    }

}
