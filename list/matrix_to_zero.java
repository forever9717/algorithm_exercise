package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import utils.readWrite;

public class matrix_to_zero {
    
    public void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int column = matrix[0].length;
        int[] record_column = new int[column];

        for (int i=0; i<row; i++) {
            
            boolean is_exist_zero = false;
            for (int j=0; j<column; j++) {
                if (matrix[i][j] == 0) {
                    is_exist_zero = true;
                    record_column[j] = 1;
                    for (int k=i; k>=0; k--) {
                        matrix[k][j] = 0;
                    }
                }
            }

            if (is_exist_zero)  {

                for (int j=0; j<column; j++) {
                    matrix[i][j] = 0;
                }

                continue;
            } 

            for (int j=0; j<column; j++) {
                if (record_column[j] == 1) {
                    matrix[i][j] = 0;
                }
            }

        }

        readWrite.write_matrix_into_txt("testFile", "setZeroes", matrix);
    }
}
