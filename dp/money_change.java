package dp;

public class money_change {
    
    public int coinChange(int[] coins, int amount) {

        if (amount == 0) {
            return 0;
        }

        int result = cacu_min(coins, amount, 0);
        return result;
    }

    private int cacu_min(int[] coins, int remain_amount, int min_cost) {
        int temp_max = -1;
        int length = coins.length;

        for (int i=0; i<length; i++) {
            if (coins[i] <= remain_amount && coins[i] > temp_max) {
                temp_max = coins[i];
            }
        }
     
        if (temp_max == -1) {
            return -1;
        }

        min_cost += remain_amount/temp_max;
        remain_amount = remain_amount%temp_max;
        System.out.println(min_cost);
        if (remain_amount == 0) {
            return min_cost;
        }

        return cacu_min(coins, remain_amount, min_cost);
    }
}
