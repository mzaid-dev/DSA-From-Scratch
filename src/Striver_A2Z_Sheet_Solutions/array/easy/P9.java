package Striver_A2Z_Sheet_Solutions.array.easy;
// Find missing number
public class P9 {

    public static int missingNumUsingXor(int[] arr) {
        int n = arr.length+1;
        
        int f = 0;
        int s = 0;

        for (int i = 1; i < n; i++) {
            f ^= i;
        }

        for (int i : arr) {
            s ^= i;
        }

        return f^s;
    }

    public static int missingNum(int[] arr) {
        int n = arr.length+1;
        int expSum = (n*(n+1))/2;

        int actSum = 0;

        for (int i : arr) {
            actSum += i;
        }

        return expSum - actSum;
    }
    public static void main(String[] args) {
        int[] nums = {8, 2, 4, 5, 3, 7, 1};

        int r = missingNum(nums);
        System.out.println(r);
    }
    
}
