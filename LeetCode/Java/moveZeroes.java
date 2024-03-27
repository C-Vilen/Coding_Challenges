import java.util.Arrays;
/**
 * 283. Move Zeroes
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 */
public class moveZeroes {

    // Naive solution : Runtime 45ms, Memory 46.05 MB
    public static String MoveZeroesNaive(int[] nums) {
        if (nums.length == 1) return Arrays.toString(nums);
        int start = 0, last = nums.length-1;
        while (start < last) {
            if (nums[start] == 0) {
                int tmp = nums[last];
                nums[last] = 0;
                int curNum;
                for (int i = last-1; i >= start; i--) {
                    curNum = nums[i];
                    nums[i] = tmp;
                    tmp = curNum;
                }
                last--;
            }
            if (nums[start] != 0) {
                start++;
            }
        }
        return Arrays.toString(nums);
    }

    public static String MoveZeroes(int[] nums){
        if (nums.length == 1) return Arrays.toString(nums);
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        
        for (int i = nonZeroIndex; i < nums.length; i++) nums[i] = 0;
        return Arrays.toString(nums);
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + MoveZeroesNaive(new int[]{0,1,0,3,12}) + " = [1,3,12,0,0]");
        System.out.println("Example 2: " + MoveZeroesNaive(new int[]{0,0,1}) + " = [1,0,0]");
        System.out.println("Example 3: " + MoveZeroesNaive(new int[]{0}) + " = [0]");

        System.out.println("Example 1: " + MoveZeroes(new int[]{0,1,0,3,12}) + " = [1,3,12,0,0]");
        System.out.println("Example 2: " + MoveZeroes(new int[]{0,0,1}) + " = [1,0,0]");
        System.out.println("Example 3: " + MoveZeroes(new int[]{0}) + " = [0]");
    }
}
