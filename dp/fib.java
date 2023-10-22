package dp;

public class fib {

    public int fib_main(int n) {

        if (n < 2) {
            return n;
        }
        
        int[] store = {0, 1};

        int result = cacu_fib(n, 2, store);
        System.out.println(result);
        return result;
    }

    public int cacu_fib(int n, int count, int[] store) {

        int result = store[0] + store[1];

        if (count == n) {
            return result;
        }

        store[0] = store[1];
        store[1] = result;
        return cacu_fib(n, ++count, store);
    }

}
