package Patterns.Sliding_Window.problems.Variable;

// https://leetcode.com/problems/longest-repeating-character-replacement/

public class p1 {
    public static int characterReplacement(String s, int k) {
        
        int maxCount = 0;
        int left = 0;
        int[] windowCount = new int[26];
        int result = 0;
        
        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            windowCount[c-'A']++;

            maxCount = Math.max(maxCount, windowCount[c-'A']);

            while (((right - left + 1) - maxCount) > k) {
                windowCount[s.charAt(left++)-'A']--;
            }

            result = Math.max(result, right - left +1);

        }

        return result;
    }

    public static void main(String[] args) {
        
    }
}
