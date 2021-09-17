package com.donnieluo.javaplayground;

import java.util.ArrayList;
import java.util.List;

public class Solution5 {
    public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int[][] dp = new int[s.length()][s.length()];
        int max = 1;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
        }
        for (int j = 1; j < s.length(); j++) {
            for (int i = 0; i < j; i++) {

                if (chars[i] == chars[j] && (dp[i+1][j-1] == 1 || j-i<3)) {
                    dp[i][j] = 1;
                    if (j-i+1 >max) {
                        max = j-i+1;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start+max);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aabbba"));
    }
}
