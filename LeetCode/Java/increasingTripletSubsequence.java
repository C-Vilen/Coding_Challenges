/**
 * 334. Increasing Triplet Subsequence
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. 
 * If no such indices exists, return false.
 */
public class increasingTripletSubsequence {
    
    // Runtime 1 ms, Memory 94.98 MB
    public static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;
        for(int k : nums) {
            if(k <= i) {
                i = k;
            } else if(k <= j) {
                j = k;
            } else {
                // Clearing the garbage collector to free of memory (saves about 40MB on LeetCode)
                System.gc();
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + increasingTriplet(new int[]{1,2,3,4,5}) + " = true");
        System.out.println("Example 2: " + increasingTriplet(new int[]{5,4,3,2,1}) + " = false");
        System.out.println("Example 3: " + increasingTriplet(new int[]{2,1,5,0,4,6}) + " = true");
        System.out.println("Example 4: " + increasingTriplet(new int[]{20,100,10,12,5,13}) + " = true");
        System.out.println("Example 5: " + increasingTriplet(new int[]{0,4,2,1,0,-1,-3}) + " = false");
    }
}
