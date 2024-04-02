/**
 * 724. Find Pivot Index
 * Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 * Return the leftmost pivot index. If no such index exists, return -1.
 */
public class findPivotIndex {
    // Runtime 1ms, Memory 45.30 MB
    public static int pivotIndex(int[] nums) {
        int total = 0, lSum = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        for (int i = 0; i < nums.length; lSum += nums[i++]) {
            if((lSum * 2) == (total-nums[i])) return i; 
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + pivotIndex(new int[]{1,7,3,6,5,6}) + " = 3");
        System.out.println("Example 2: " + pivotIndex(new int[]{1,2,3}) + " = -1");
        System.out.println("Example 3: " + pivotIndex(new int[]{2,1,-1}) + " = 0");
        System.out.println("Example 4: " + pivotIndex(new int[]{-1,-1,-1,-1,-1,0}) + " = 2");
    }
}
