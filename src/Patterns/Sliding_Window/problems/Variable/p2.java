package Patterns.Sliding_Window.problems.Variable;

import java.util.Arrays;

public class p2 {

    public static int getIndex(char c) {
        return (c >= 'A' && c <= 'Z') ? c - 'A' : c - 'a' + 26;
    }

    public static String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        int[] tCount = new int[52];
        int required = 0;
        

        for (int i = 0;i < t.length();i++) {

            char tChar = t.charAt(i); 
            int index = getIndex(tChar);
            if (tCount[index] == 0 ) 
                required++;
            
            tCount[index]++;

        }

        int[] windowCount = new int[52];        
        int formed = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        for (int right = 0; right < s.length(); right++) {

            int index = getIndex(s.charAt(right));

            windowCount[index]++;

            if (windowCount[index] == tCount[index]) {
                formed++;
            }

            while (formed == required) {
                minLen = Math.min(minLen,right - left + 1 );

                if (windowCount[index] == tCount[index]) {
                    formed--;
                }

                windowCount[getIndex(s.charAt(left++))]--;

               

                startIndex = left;
            }
        }

        return s.substring(startIndex,startIndex+minLen) ;
    }
    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";
        
        minWindow(s, t);


    }
}
