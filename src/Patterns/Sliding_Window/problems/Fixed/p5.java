package Patterns.Sliding_Window.problems.Fixed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-all-anagrams-in-a-string/description/

public class p5 {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i)-'a']++;
            windowCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount,windowCount)) {
            result.add(0);
        }

        int left = 0 ;
        for (int right = p.length(); right < s.length(); right++) {
            windowCount[s.charAt(right) - 'a']++;
            windowCount[s.charAt(left++) - 'a']--;

            if (Arrays.equals(pCount,windowCount)) {
                result.add(left);
            }
        }

        return result;
    }
    public static void main(String[] args) {

        String s = "abab";
        String p = "ab";

        System.out.println(findAnagrams(s, p));
   } 
}
