package list;

public class ln_place {
    
    public int ln_place_main(int[] sort_vector) {
        int length = sort_vector.length;
        int temp = sort_vector[0];
        int temp_index = 1;
        for (int i=1; i<length; i++){

            if (sort_vector[i] == temp) {
                continue;
            }
            sort_vector[temp_index++] = sort_vector[i];
            temp = sort_vector[i];
        }

        return temp_index;
    }
}
