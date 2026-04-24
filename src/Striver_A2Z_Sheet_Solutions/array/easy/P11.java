package array.easy;

public class P11 {

    public static int getSingleElement(int[] nums) {
        
        int result = 0;

        for (int i : nums) {
            result ^= i;
        }

        return result; 
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1};
        System.out.println(getSingleElement(nums));
    }
}
