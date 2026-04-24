package array.easy;

// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

public class P3 {

     public static boolean check(int[] nums) {
        int n = nums.length;

        
        if (n == 0) {
            return false;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                
                count++;
            }
        }

        return count <= 1;

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        System.out.println(check(nums));
    }
}
