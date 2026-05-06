package Striver_A2Z_Sheet_Solutions.array.easy;

// Problem Statement: Given an array, we have to find the largest element in the array.

class P1 {

    public static int largestElement(int[] nums) {

        if (nums.length == 0) {
            return -1;
        }
        int lar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (lar < nums[i]) {
                lar = nums[i];
            }
        }

        return lar;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,5,4,3};

        System.out.println(largestElement(nums));
    }
} 