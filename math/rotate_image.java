package math;

import utils.readWrite;

public class rotate_image {

    public void rotate(int[][] matrix) {
        int last_row = matrix.length - 1;
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i=0; i<row/2; i++) {
            column--;
            for (int j=i; j<column; j++) {
                int temp1 = matrix[j][last_row - i];
                int temp2 = matrix[last_row - i][last_row - j];
                matrix[j][last_row - i] = matrix[i][j];
                matrix[last_row - i][last_row - j] = temp1;
                temp1 = matrix[last_row - j][i];
                matrix[last_row - j][i] = temp2;
                matrix[i][j] = temp1;
            }
        }

        readWrite.write_matrix_into_txt("test", "rotate", matrix);
    }
}
