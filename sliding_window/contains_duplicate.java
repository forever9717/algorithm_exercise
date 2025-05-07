package sliding_window;

import utils.print_utils;

public class contains_duplicate {
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int m = nums.length;
        if (k == 0 || m == 1) return false;
        if (k >= m) return sub_contains(0, m, nums);
        
        k += 1;
        int n = m - k;

        if (sub_contains(0, k, nums)) return true;

        for (int i=1; i<=n; i++) {
            int e = i + k;
            if (sub_contain(i, e, nums)) return true;
        }
        return false;
    }

    private boolean sub_contains(int s, int e, int[] nums) {

        for (int i=s; i<e - 1; i++) {
            for (int j=i+1; j<e; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean sub_contain(int s, int e, int[] nums) {

        for (int i=s; i<e - 1; i++) {
            if (nums[i] == nums[e-1]) {
                return true;
            }
        }
        return false;
    }

}
