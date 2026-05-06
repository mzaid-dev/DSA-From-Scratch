package Striver_A2Z_Sheet_Solutions.array.easy;

public class P7 {
    public static int linearSearch(int[] nums,int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] ==  target) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {9,4,1,19,2,6};
        int r = linearSearch(nums,6);
        System.out.println(r);
    }
}
