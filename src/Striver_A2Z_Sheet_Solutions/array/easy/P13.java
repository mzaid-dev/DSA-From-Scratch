package array.easy;

// Length of the longest subarray with zero Sum

public class P13 {
    // Brute
    public static void longestSubarraySumZero_B(int[] nums) {
        int sum = 0;
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int j2 = i;j2 < j+1; j2++) {
                    sum += nums[j2]; 
                }
                if (sum == 0) {
                    count = Math.abs(j-i);
                    if (count > maxCount) {
                        maxCount = count;
                    }

                    System.out.println(sum);
                    System.out.println(count);
                }
                sum = 0;
            }
        }

        System.out.println(maxCount);
    }

    // optimal
    public static void longestSubarraySumZero_O(String[] args) {
        
    }
    
    public static void main(String[] args) {
        // int[] nums = {9, -3, 3, -1, 6, -5};

        int[] nums = {1,2,3,4};
        longestSubarraySumZero_B(nums);
    }   
}
