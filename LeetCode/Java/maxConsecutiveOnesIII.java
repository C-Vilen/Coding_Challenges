/**
 * 1004. Max Consecutive Ones III
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 */
public class maxConsecutiveOnesIII {
    // Runtime 2ms, Memory 46.64 MB
    public static int longestOnes(int[] nums, int k) {
        int start = 0, end = 0;
        while(start < nums.length){
            if(nums[start] == 0) k--;
            if(k < 0 && nums[end++] == 0) k++;
            start++;
        }
        return start-end; 
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2) + " = 6");
        System.out.println("Example 2: " + longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3) + " = 10");
    }
}
