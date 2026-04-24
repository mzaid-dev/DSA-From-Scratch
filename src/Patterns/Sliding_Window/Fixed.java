package Patterns.Sliding_Window;


public class Fixed {

    // Find the maximum sum of any contiguous subarray of size k.

    public static void maxSum(int[] nums,int k) {
        int sum = 0 ;
        int maxSum = 0;
        int left = 0;
        int startIndex = 0;
        int endIndex = 0; 

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        for (int right = k; right < nums.length; right++) {

            sum += nums[right];
            sum -= nums[left++];


            
            // maxSum = Math.max(maxSum, sum);
            if (sum > maxSum) {
                maxSum = sum;
                startIndex = left;
                endIndex = right;
            }
        }

        System.out.println("Max sum is "+maxSum);
        System.out.print("Subarray is ");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(nums[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};

        maxSum(nums, 3);
    }
}