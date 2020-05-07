package collectchange;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-06 18:50
 * <p>
 * 给你 k 种面值的硬币，面值分别为 c1, c2 ... ck，每种硬币的数量无限，再给一个总金额 amount，
 * 问你最少需要几枚硬币凑出这个金额，如果不可能凑出，算法返回 -1 。
 **/
public class CollectChange {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5,7};
        System.out.println(coinChange(coins, 100));
    }

    static int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1]; //dp[0]=0
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                if (j - coins[i] >= 0 && dp[j - coins[i]] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
        }
        if (dp[amount] == Integer.MAX_VALUE) {
            //没被修改过，说明凑不了
            return -1;
        } else {
            return dp[amount];
        }
    }
}
