import java.util.List;

import dp.delete_and_earn;
import dp.knapsack_problem;
import list.basic;
import list.matrix_to_zero;
import list.three_num_of_sum;
import utils.readWrite;



public class exercise_main {
    
    public static void main(String[] args) {
        int[] nums = {4, 10};
        basic basic = new basic();
        basic.insert(nums, 0, 5);
        readWrite.write_vector_into_txt("testFile", "insert", nums);
        // System.out.println(result);
    }
}
