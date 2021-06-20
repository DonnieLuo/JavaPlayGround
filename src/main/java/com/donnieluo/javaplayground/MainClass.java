package com.donnieluo.javaplayground;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int max = 0;
        int right = 0;
        Set set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (i != 0) {
                set.remove(s.charAt(i));
            }
            right = i;
            while (right < s.length() && !set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            }
            max = Math.max(max, set.size());
        }

        return max;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("pwwkew");
//        noRepeat("abca");
    }
}
