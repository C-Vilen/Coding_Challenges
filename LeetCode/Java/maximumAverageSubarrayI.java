/**
 * 643. Maximum Average Subarray I
 * You are given an integer array nums consisting of n elements, and an integer k.
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 
 * Any answer with a calculation error less than 10-5 will be accepted.
 */
public class maximumAverageSubarrayI {
    
    // Runtime 3 ms, 55.75 MB
    public static double findMaxAverage(int[] nums, int k) {
        int total = 0;
        for(int i = 0; i < k; i ++) total += nums[i];
        int output = total;
        for(int i = k; i < nums.length; i ++) {
            total += nums[i] - nums[i - k];
            output = Math.max(output, total);
        }
        return (double)output / k;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4) + " = 12.75000");
        System.out.println("Example 2: " + findMaxAverage(new int[]{5}, 1) + " = 5.00000");
        System.out.println("Example 2: " + findMaxAverage(new int[]{0,1,1,3,3}, 4) + " = 2.00000");
    }
}
