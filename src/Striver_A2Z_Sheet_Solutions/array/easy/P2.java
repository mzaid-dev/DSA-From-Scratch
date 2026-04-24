package array.easy;

import java.util.LinkedHashMap;

// Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.


public class P2 {
    public static int secondLargest(int[] nums) {

        int n = nums.length;
        if (n < 2) {
            return -1;
        }
        int largest = nums[0];

        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] < largest) {
                secondLargest = nums[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static int secondSmallest(int[] nums) {
        int n = nums.length;

        if (n < 2) {
            return -1;
        }

        int smallest = nums[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {

            if (nums[i] < smallest) {
                secondSmallest = smallest;
                smallest = nums[i];
            }

            else if (nums[i] > smallest && nums[i] < secondSmallest) {
                secondSmallest = nums[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            return -1;
        }

        return secondSmallest;
    }


    public static LinkedHashMap<String , Integer> secondLargestAndSmallet(int[] nums) {
        int n = nums.length;

        if (n < 2) {
            return new LinkedHashMap<>();
        }

        int largest = nums[0];
        int secondLargest = Integer.MIN_VALUE;

        int smallest = nums[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {

            if (nums[i] < smallest) {
                secondSmallest = smallest;
                smallest = nums[i];
            }

            else if (nums[i] > smallest && nums[i] < secondSmallest) {
                secondSmallest = nums[i];
            }

            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] < largest) {
                secondLargest = nums[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE || secondLargest == Integer.MIN_VALUE) {
             return new LinkedHashMap<>();
        }
       

        LinkedHashMap<String,Integer> result = new LinkedHashMap<>();
        result.put("Second Largest", secondLargest);
        result.put("Second Smallest", secondSmallest);
        return result;
    }



    public static void main(String[] args) {

        int[] nums = { 1, 2, 4, 7, 7, 5 };

        System.out.println("Second Largest : " + secondLargest(nums));
        System.out.println("Second Smallest : " + secondSmallest(nums));

        System.out.println(secondLargestAndSmallet(nums)); 
    }

}
