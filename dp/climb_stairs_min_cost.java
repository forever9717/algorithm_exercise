package dp;

public class climb_stairs_min_cost {
    
    
    public int minCostClimbingStairs_main(int[] cost) {

        //n>=2
        int n = cost.length;
        int sum_cost = 0;

        int[] min_cost_record = {cost[0], cost[1]};
        sum_cost = cacu_subset_min_cost(n, 2, cost, min_cost_record);
        System.out.println(sum_cost);
        
        return sum_cost;
    }

    public int cacu_subset_min_cost(int n, int count, int[] cost, int[] min_cost_record) {

        int min_cost = Math.min(min_cost_record[0], min_cost_record[1]);

        if ( n == count ) {
            return min_cost;
        }

        min_cost_record[0] = min_cost_record[1];
        min_cost_record[1] = min_cost + cost[count]; 
        count++;
        return cacu_subset_min_cost(n, count, cost, min_cost_record);
    }

}
