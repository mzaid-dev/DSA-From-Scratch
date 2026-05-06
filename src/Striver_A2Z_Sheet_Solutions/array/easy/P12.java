package Striver_A2Z_Sheet_Solutions.array.easy;

// Longest Subarray with given Sum K(Positives)

public class P12 {

    // brute force
    public static void longestSubarray_B(int[] nums,int k) {

        int sum = 0;
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int j2 = i;j2 < j+1; j2++) {
                    sum += nums[j2]; 
                }
                if (sum == k) {
                    count = j - i +1;
                    if (count > maxCount) {
                        maxCount = count;
                    }
                }
                sum = 0;
            }
        }

        System.out.println(maxCount);
    }

    // medium 
    public static void longestSubarray_M(int[] nums,int k) {

        int maxCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
             int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    int count = j - i + 1;
                    maxCount = Math.max(maxCount, count);
                }
            }
        }

        System.out.println(maxCount);
        
    }

    // optimal 
    public static void longestSubarray_O(int[] nums,int k) {
        int left = 0;
        int sum = 0;
        int maxLen = 0;
       for (int right = 0; right < nums.length; right++) {
        sum += nums[right];
        while (sum > k) {
            sum -= nums[left];
            left++;
        }
        if (sum == k ) {
           int len = right - left + 1; 
           maxLen = Math.max(maxLen, len);
        }
       }
       System.out.println(maxLen);
    }


    public static void main(String[] args) {
        int nums[] = {10, 5, 2, 7, 1, 9};
        longestSubarray_O(nums,15);
    }
}
