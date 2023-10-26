package dp;

import java.util.List;

public class triangle_min_path {
    
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size() - 1;
        return cacu_min(0, row, triangle.get(0).get(0), triangle);
    }

    private int cacu_min(int row_index, int row, int sum_cost, List<List<Integer>> triangle) {

        if (row_index == row) {
            return sum_cost;
        }

        int next_row_index = row_index + 1;
        int temp1 = Math.min(triangle.get(next_row_index).get(0), triangle.get(next_row_index).get(1));
        int temp_min = sum_cost + temp1;
        int use_min = temp1;

        for (int i=1; i<=row_index; i++) {
            temp1 = Math.min(triangle.get(next_row_index).get(i), triangle.get(next_row_index).get(i+1));
            int temp = temp1 +  triangle.get(row_index).get(i);
            if (temp < temp_min) {
                temp_min = temp;
                use_min = temp1;
            }
        }

        sum_cost += use_min;
 
        return cacu_min(++row_index, row, sum_cost, triangle);
    }
}
