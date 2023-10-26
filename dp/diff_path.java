package dp;

public class diff_path {

    public int uniquePaths(int m, int n) {

        int[] temp = new int[n];
        int result = cacu_path_num(m, 0, temp);
        System.out.println(result);
        return result;
    }

    private int cacu_path_num(int m, int count, int[] temp) {
        int length = temp.length;
        temp[0] = 1;
        for (int i=1; i<length; i++) {
            temp[i] += temp[i-1];
        }

        if (++count == m) {
            return temp[length-1];
        }
        
        return cacu_path_num(m, count, temp);
    }
}
