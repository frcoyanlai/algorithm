package fibonaccisequence;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-06 15:01
 * <p>
 * 斐波那契数列
 **/
public class FibonacciSequence {
    public static void main(String[] args) {

        Long startTime = System.currentTimeMillis();
        System.out.println("方法一结果：" + fib1(40));
        System.out.println("方法一用时：" + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        System.out.println("方法二结果：" + fib2(1000));
        System.out.println("方法二用时：" + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        System.out.println("方法三结果：" + fib3(1000));
        System.out.println("方法三用时：" + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        System.out.println("方法四结果：" + fib4(1000));
        System.out.println("方法四用时：" + (System.currentTimeMillis() - startTime));

    }

    static int fib1(int N) {
        if (N == 1 || N == 2) {
            return 1;
        }
        return fib1(N - 1) + fib1(N - 2);
    }

    /**
     * 使用备忘录
     *
     * @param N
     * @return
     */
    static long fib2(int N) {
        if (N < 1) {
            return 0;
        }
        // 备忘录全初始化为 0
        long[] memo = new long[N + 1];
        // 初始化最简情况
        return helper(memo, N);
    }

    static long helper(long[] memo, int n) {
        // base case
        if (n == 1 || n == 2) {
            return 1;
        }
        // 已经计算过
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = helper(memo, n - 1) +
                helper(memo, n - 2);
        return memo[n];
    }

    /**
     * 使用dp表存储
     *
     * @param N
     * @return
     */
    static long fib3(int N) {
        long[] dp = new long[N + 1];
        // base case
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N];
    }

    static long fib4(int n) {
        if (n == 2 || n == 1) {
            return 1;
        }
        long prev = 1, curr = 1;
        for (int i = 3; i <= n; i++) {
            long sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }
}
