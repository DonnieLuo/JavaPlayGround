package com.donnieluo.javaplayground;

public class Solution70 {

    public static int sol(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-1]+ dp[i-2];
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        System.out.println(sol(3));
    }
}
