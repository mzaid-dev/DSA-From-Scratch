package Patterns.Sliding_Window.problems.Fixed;

// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/

public class p2 {
    public static int maxVowels(String s, int k) {
        String vowels = "aeiou";

        int maxVowelsCount = 0;
        int count = 0;
       

        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        maxVowelsCount = count;

        int left = 0;

        for (int right = k; right < s.length(); right++) {

            if (vowels.indexOf(s.charAt(left++)) != -1) {
                count--;
            }

            if (vowels.indexOf(s.charAt(right)) != -1) {
                count++;
            }
            maxVowelsCount = Math.max(maxVowelsCount, count);
        }


        return maxVowelsCount;
    }
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }   
}

