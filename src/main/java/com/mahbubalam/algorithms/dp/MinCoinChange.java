package com.mahbubalam.algorithms.dp;
import java.util.Arrays;
public class MinCoinChange {

    public static void main(String[] args) {

        int n = 20;
        int[] a = {10, 20, 5, 1};

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        int ans = minCoin(n, a, dp);
        System.out.println(ans);

        for (int x : dp) {
            System.out.print(x + " ");
        }
    }


    static int minCoin(int m, int[] coins,int[] dp){
        if (m==0) return 0;
        int ans = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (m >= coin) {
                int subAns = 0;
                if (dp[m - coin] != -1)
                    subAns = dp[m - coin];
                else {
                    subAns = minCoin(m - coin, coins, dp);
                }
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) ans = subAns + 1;
            }
        }
        return dp[m] = ans;
    }
}
