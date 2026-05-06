package Striver_A2Z_Sheet_Solutions.array.easy;


// https://leetcode.com/problems/rotate-array/
public class P5 {

    public static void reverse(int[] nums, int start,int end) {
        while (start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;

            start++;
            end--;

        }
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0,nums.length-1);

        reverse(nums, 0, k-1);

        reverse(nums, k, n-1);

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};

        rotate(nums, 3);

        for (int i : nums) {
            System.out.print(i+" ");
        }


   
    }
}



