package Patterns.Sliding_Window;

import java.util.HashSet;

public class Variable {
    // Find the length of the longest contiguous subarray whose sum equals k.

    public static void longestSubarray(int[] nums,int k) {
        
        int left = 0;
        int sum = 0;
        int maxLen = 0;
        int startIndex = 0;
        int endIndex = 0; 

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > k) {
                sum -=  nums[left++];
            }

            if (sum == k) {
                maxLen = Math.max(maxLen,right -left +1 );
                startIndex = left;
                endIndex = right;
            }
            
        }

        System.out.println("Max len is "+maxLen);
        System.out.print("Subarray is ");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }

    // Given a string, find the length of the longest substring that has no repeating characters.

    public static int longestUniqueSubstr(String s) {
        int maxLen = 0;
        int left = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char temp = s.charAt(right);

            while (set.contains(temp)) {
                set.remove(s.charAt(left++));
            }

            set.add(temp);

            maxLen = Math.max(maxLen, right - left +1);
        }

        return maxLen;

    }

    
    public static void main(String[] args) {
        // int[] nums = {1, 2, 3, 1, 1};

        // longestSubarray(nums, 6);

        String s = "abcab";

        System.out.println(longestUniqueSubstr(s));
        
    }

}
