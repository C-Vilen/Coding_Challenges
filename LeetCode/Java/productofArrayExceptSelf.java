import java.util.Arrays;

/**
 * 238. Product of Array Except Self
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class productofArrayExceptSelf {

    // Runtime 2ms, Memory 55.07 MB
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if (n == 0) return nums;
        int[] output = new int[n];
        int start = 1, end = 1;
        output[0] = start;
        for (int i = 0; i < n-1; i++) {
            start *= nums[i];
            output[i+1] = start;
        }
        for (int j = n-1; j > 0; j--) {
            end *= nums[j];
            output[j-1] *= end;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + Arrays.toString(productExceptSelf(new int[]{1,2,3,4})) + " = [24,12,8,6]");
        System.out.println("Example 2: " + Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})) + " = [0,0,9,0,0]");
    }
}
