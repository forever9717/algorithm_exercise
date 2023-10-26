package dp;

public class diff_path_with_barrier {


    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        
        obstacleGrid[0][0] = obstacleGrid[0][0] == 0 ? 1 : 0;
        for (int i=1; i<column; i++) {
            obstacleGrid[0][i] = obstacleGrid[0][i] == 0 ? obstacleGrid[0][i-1] : 0;
        }

        if (row == 1) {
            return obstacleGrid[0][column-1];
        }

        int result = cacu_path_num(row, column, 1, obstacleGrid);
        return result;
    }

    private int cacu_path_num(int row, int column, int count, int[][] obstacleGrid) {

        obstacleGrid[count][0] = obstacleGrid[count][0] == 0 ? obstacleGrid[count-1][0] : 0;
        for (int i=1; i<column; i++) {
            obstacleGrid[count][i] = obstacleGrid[count][i] == 0 ? (obstacleGrid[count][i-1] + obstacleGrid[count-1][i]) : 0;
        }

        if (++count == row) {
            return obstacleGrid[count-1][column-1];
        }

        return cacu_path_num(row, column, count, obstacleGrid);
    }
}
