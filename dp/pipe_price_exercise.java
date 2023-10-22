package dp;
public class pipe_price_exercise {
   
    int[] price_tab = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};

    int material_length;

    public pipe_price_exercise(int n) {
        this.material_length = n;
    }

    public int[] cacu_part_max_price(){

        int length = material_length;
        int[] max_part_price = new int[length];
        int[] max_part_left_length = new int[length];

        max_part_left_length[0] = 0;
        max_part_price[0] = price_tab[0];

        for (int i=1; i<length; i++) {

            int real_part_length = i+1;
            int temp_max_price = i < price_tab.length ? price_tab[i] : 0;
            int temp_max_left_length = 0;

            int max_step = real_part_length/2;
            for (int j=0; j<max_step; j++) {

                int temp_price = max_part_price[j] + max_part_price[i-1-j];

                if (temp_price > temp_max_price) {
                    temp_max_price = temp_price;
                    temp_max_left_length = j+1;
                }

            }

            max_part_price[i] = temp_max_price;
            max_part_left_length[i] = temp_max_left_length;
        }
 
        String result = find_max_path(max_part_left_length, length - 1, "");

        System.out.println(max_part_price[length - 1] + ": " + result);
        return max_part_price;
    }


    private String find_max_path(int[] max_part_left_length, int start_index, String result) {

        int left_index = max_part_left_length[start_index];

        int right_index = start_index + 1 - left_index;

        if (left_index == 0) {
            result += right_index + "-";
            return result;
        }

        return find_max_path(max_part_left_length, left_index - 1, result) + find_max_path(max_part_left_length, right_index - 1, result);
    }
}
