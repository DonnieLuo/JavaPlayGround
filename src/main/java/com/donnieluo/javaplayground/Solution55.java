package com.donnieluo.javaplayground;

public class Solution55 {
    public static boolean canJump(int[] nums) {
        int len = nums.length;
        boolean[] dp = new boolean[len];
        dp[0] = true;
        for (int i = 0; i < len; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if (dp[j] && nums[j] >= i - j) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len - 1];
    }
}
