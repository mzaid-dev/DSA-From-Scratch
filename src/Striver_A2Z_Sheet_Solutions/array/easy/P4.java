package array.easy;
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class P4 {
     public static int removeDuplicates(int[] nums) {
        int n = nums.length;

        if (n <= 1 ) {
            return n;
        }

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        for (int k : nums) {
            System.out.println(k);
        }


        return i+1;




    }

    public static void main(String[] args) {
         int[] nums ={0,0,1,1,1,2,2,3,3,4};
         int r = removeDuplicates(nums);
         System.out.println(r);
    }
}

