package array.easy;

public class P10 {

    public static int findMaxConsecutiveOnes(int[] nums){
        int maxCount = 0;
        int count = 0;

        for (int i : nums) {
            if (i == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            }else{
                count = 0;
            }

        }

        return maxCount;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
