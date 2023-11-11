package dp;

public class knapsack_problem {
    
    public int solution_problem(int[] weights, int[] values, int bearing_weight) {
    
        int n = weights.length;
        int result = find_max_value(n, 0, 0, weights, values, bearing_weight);
        return result;
    }

    private int find_max_value(int n, int index, int sum_value, int[] weights, int[] values, int bearing_weight) {
        
        if (index == n) {
            return sum_value;
        }

        if (weights[index] > bearing_weight) {
            return find_max_value(n, index+1, sum_value, weights, values, bearing_weight);
        }

        int temp = find_max_value(index, 0, 0, weights, values, bearing_weight - weights[index]);
        int result = Math.max(values[index] + temp, sum_value);

        return find_max_value(n, index+1, result, weights, values, bearing_weight);
    }


}
