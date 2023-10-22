package dp;

public class loot {

    public int rob(int[] nums) {

        int n = nums.length;
        int[] max_record = {0, nums[0]};
        int result = cacu_max(n, 1, nums, max_record);
        System.out.println(result);
        return result;
    }

    private int cacu_max(int n, int count, int[] nums, int[] max_record) {

        int temp = nums[count] + max_record[0];
        max_record[0] = max_record[1];
        max_record[1] = Math.max(temp, max_record[1]);
        count++;

        if (count == n) {
            return Math.max(max_record[0], max_record[1]);
        }
        return cacu_max(n, count, nums, max_record);
    }
}
