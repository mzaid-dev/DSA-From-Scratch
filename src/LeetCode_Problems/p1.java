package LeetCode_Problems;

import java.util.Arrays;

// https://leetcode.com/problems/longest-common-prefix/description/

public class p1 {

    // Medium
    // public static String longestCommonPrefix(String[] strs) {
    //     int strsLen = strs.length;

    //     if (strsLen <= 0) {
    //         return "";
    //     }

    //     Arrays.sort(strs);

    //     int prefixEndIndex = 0;

    //     int minLen = Math.min(strs[0].length(),strs[strsLen - 1].length());


    //     for (int i = 0; i < minLen; i++) {
    //        if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
    //         prefixEndIndex++;
    //        }else{
    //         break;
    //        }
    //     }

    //     return strs[0].substring(0, prefixEndIndex);   
    // }

    // Optimal
    public static String longestCommonPrefix(String[] strs) {
        int strsLen = strs.length;

        if (strs == null || strsLen == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 0; i < strs.length; i++) {
            
        }
        
        return prefix;
    }
    
    public static void main(String[] args) {

        String[][] testCases = {
        {"flower","flow","flight"},
        {"dog","racecar","car"},
        {"prefix","pre","prevent"},
        {"car","car","car"},
        {"","b"}
    };

    for (String[] test : testCases) {
        System.out.println(longestCommonPrefix(test));
    }


    }
}
