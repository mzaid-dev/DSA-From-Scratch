package Patterns.Sliding_Window.problems.Fixed;

// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/

public class p3 {

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        
        int sum = 0;

        double average = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];    
        }

        average = (double) sum / k ;
        
        if (average >= threshold) {
            count++;
        }

        int left = 0 ;
        for (int right = k; right < arr.length; right++) {
            sum += arr[right];
            sum -= arr[left++];
            average = (double) sum / k;

            if (average >= threshold) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {11,13,17,23,29,31,7,5,2,3};
        System.out.println(numOfSubarrays(nums, 3, 5));
    }
    
}
