package com.mahbubalam.algorithms.recurtion;

public class MinCoinChange {
    public static void main(String[] args) {
        int n=20;
        int[] coins = {10,5,1};
        System.out.println(minCoin(n,coins));
    }
    static int minCoin(int m, int[] coins){
        if (m==0) return 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if (m>= coins[i]){
                int subAns = minCoin(m-coins[i],coins);
                if (subAns!=Integer.MAX_VALUE && subAns+1<ans)ans=subAns+1;
            }
        }
        return ans;
    }
}
