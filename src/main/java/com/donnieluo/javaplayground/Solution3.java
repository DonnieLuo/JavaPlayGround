package com.donnieluo.javaplayground;

public class Solution3 {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0)return 0;
        char[] chars = s.toCharArray();
        int length = s.length();
        int max = 1;
        int[] start = new int[length];//最长无重复子串开头位置
        start[0] = 0;
        for (int j = 1; j < length; j++) {
            boolean duplicate = false;
            for (int i = j-1; i >= start[j-1]; i--) {
                if (chars[j] == chars[i]) {
                    duplicate = true;
                    start[j] = i+1;
                    max = Math.max(max, j-i);
                    break;
                }
            }
            if (!duplicate) {
                start[j] = start[j-1];
                max = Math.max(max, j-start[j] + 1);
            }
        }
        return max;
    }

    public static void main(String[] args) {
lengthOfLongestSubstring("abcabcbb");
    }
}
