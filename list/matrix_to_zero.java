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
        boolean last_column_is_clear = false;

        for (int j=0; j<column; j++) {
            if (matrix[row-1][j] == 0) {
                last_column_is_clear = true;
            }
        }

        int i;
        for (i=0; i<row-1; i++) {
            
            boolean is_exist_zero = false;
            for (int j=0; j<column; j++) {
                if (matrix[i][j] == 0) {
                    is_exist_zero = true;
                    matrix[row-1][j] = 0;
                }
            }

            if (is_exist_zero)  {
                for (int j=0; j<column; j++) {
                    matrix[i][j] = 0;
                }
            } 
        }

        for (int j=0; j<column; j++) {
                if (matrix[i][j] == 0) {
                    for (int k=i-1; k>=0; k--) {
                        matrix[k][j] = 0;
                    }
                }
        }
        
        if (last_column_is_clear) {
            for (int j=0; j<column; j++) {
                matrix[i][j] = 0;
            }
        } 
        readWrite.write_matrix_into_txt("testFile", "setZeroes", matrix);
    }
}
