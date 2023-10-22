package utils;

import java.io.File;
import java.io.FileOutputStream;

public class readWrite {
    static String absolute_path = System.getProperty("user.dir") + "/File/";

    public static void write_matrix_into_txt(String folder, String file_name, int[][] matrix) {
        String path = absolute_path + "/" + folder + "/";
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        path += file_name + ".txt";
        try {
            file = new File(path);
            FileOutputStream fileOutputStream = new FileOutputStream(file); 
            
            int row = matrix.length;
            int column = matrix[0].length;

            for (int i=0; i<row; i++) {
                for (int j=0; j<column; j++) {
                    fileOutputStream.write((matrix[i][j]+",").getBytes());
                }
                fileOutputStream.write(("\n").getBytes());
            }
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("write_matrix_into_txt write wrong");
        }
    }
}
