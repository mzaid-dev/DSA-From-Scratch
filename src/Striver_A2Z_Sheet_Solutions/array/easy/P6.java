package Striver_A2Z_Sheet_Solutions.array.easy;

// https://leetcode.com/problems/move-zeroes/

public class P6 {
    static{
        for(int i = 0;i < 1000;i++){
            moveZeroes(new int[]{});
        }
    }
    public static void moveZeroes(int[] nums ){
        int n = nums.length;

        if (n <= 1) {
            return;
        }

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;

            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,3,12};

        moveZeroes(nums);

        


        for (int i : nums) {
            System.out.println(i);
        }


    
    }    
}
