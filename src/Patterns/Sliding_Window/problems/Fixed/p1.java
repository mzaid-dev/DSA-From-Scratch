package Patterns.Sliding_Window.problems.Fixed;

// https://leetcode.com/problems/maximum-average-subarray-i/description/

public class p1 {
    public static double findMaxAverage(int[] nums, int k) {
        double maxAverage = 0;
        int left = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        maxAverage = (double) sum / k ;

        double average = 0;

        for (int right = k; right < nums.length; right++) {
            sum += nums[right];
            sum -= nums[left++];
            average = (double) sum / k;
            maxAverage = Math.max(maxAverage, average);
                
        }

        return maxAverage;

    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, 4));
    }
}
