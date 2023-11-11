package dp;

import java.util.ArrayList;
import java.util.List;

public class delete_and_earn {
    
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        //1abandon 2 leave make
        int[] record = new int[n];
        int result = find_max_point(n, 0, 0, record, nums);
        return result;
        
    }

    private int find_max_point(int n, int index, int sum_cost, int[] record, int[] nums) {

        if (index == n) {
            return sum_cost;
        }

        int selected_cost = sum_cost + nums[index];
        int[] temp = new int[n];

        for (int i=0; i<index; i++) {

            if ((nums[i]-1 == nums[index] || nums[i]+1 == nums[index]) && record[i] == 2 ){
                selected_cost -= nums[i];
                temp[i] = 1;
                for (int j=0; j<index; j++) {
                    if ((nums[j]-1 == nums[i] || nums[j]+1 == nums[i]) && record[j] == 1 && temp[j] == 0) {
                        selected_cost += nums[j];
                        temp[j] = 2;
                    }
                }
                continue;
            }
            temp[i] = record[i];
        }

        if (selected_cost > sum_cost) {
            temp[index] = 2;
            return find_max_point(n, index+1, selected_cost, temp, nums);
        }

        record[index] = 1;
        return find_max_point(n, index+1, sum_cost, record, nums);

    }
}
