package dp;

public class tribonacci {

    public int tribonacci_main(int n) {

        int[] store = {0, 1, 1};
        if (n < 3) {
            return store[n];
        }
        int result = cacu_tribonacci(n, 3, store);
        System.out.println(result);
        return result;
    }

    public int cacu_tribonacci(int n, int count, int[] store) {

        int result = store[0] + store[1] + store[2];

        if (count == n) {
            return result;
        }

        store[0] = store[1];
        store[1] = store[2];
        store[2] = result;
        return cacu_tribonacci(n, ++count, store);
    }
}
