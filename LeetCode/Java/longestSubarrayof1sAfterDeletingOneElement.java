/**
 * 1493. Longest Subarray of 1's After Deleting One Element
 * Given a binary array nums, you should delete one element from it.
 * Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
 */
public class longestSubarrayof1sAfterDeletingOneElement {
    // Runtime: 2ms, Memory 56.30 MB
    public static int longestSubarray(int[] nums) {
        int prevC = 0, newC = 0, output = 0;
        boolean zeros = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                output = Math.max(newC, output);
                newC = prevC;
                prevC = 0;
                zeros = true;
            }
            else {
                prevC++;
                newC++;
            }
        }
        if(!zeros){
            return nums.length-1;
        }
        output = Math.max(newC, output);
        return output;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + longestSubarray(new int[]{1,1,0,1}) + " = 3");
        System.out.println("Example 2: " + longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}) + " = 5");
        System.out.println("Example 3: " + longestSubarray(new int[]{1,1,1}) + " = 2");
        System.out.println("Example 4: " + longestSubarray(new int[]{1,1,0,0,1,1,1,0,1}) + " = 4");
        System.out.println("Example 5: " + longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}) + " = 5");
    }
}
