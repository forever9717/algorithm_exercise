package dp;

public class min_path_sum {

    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;

        for (int i=1; i<column; i++) {
            grid[0][i] += grid[0][i-1];
        }

        if (row == 1) {
            return grid[0][column-1];
        }

        int result = cacu_min_cost(row, column, 1, grid);
        return result;
    }

    private int cacu_min_cost(int row, int column, int count, int[][] grid) {

        grid[count][0] += grid[count-1][0];
        for (int i=1; i<column; i++) {
            grid[count][i] += Math.min(grid[count-1][i], grid[count][i-1]);
        }

        if (++count == row) {
            return grid[count-1][column-1];
        }
        return cacu_min_cost(row, column, count, grid);
    }
}
