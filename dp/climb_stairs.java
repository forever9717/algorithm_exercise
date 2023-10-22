package dp;

class climb_stairs {

    public int climbStairs(int n) {
        
        if (n < 3) {
            return n;
        }
        int[] frontStairs = new int[n];
        frontStairs[0] = 1;
        frontStairs[1] = 2;
        int result = cacuStairs(n, 2, frontStairs);
        System.out.println(result);
        return result;
    }

    private int cacuStairs(int n, int count, int[] frontStairs) {

        frontStairs[count] = frontStairs[count-1] + 
                             frontStairs[count-2];

        count++;
        if (count == n) {
            return frontStairs[n-1];
        }
        return cacuStairs(n, count, frontStairs);
    }
}
