import java.util.Arrays;

/**
 * 1679. Max Number of K-Sum Pairs
 * You are given an integer array nums and an integer k.
 * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 * Return the maximum number of operations you can perform on the array.
 */
public class maxNumberofKSumPairs {
    
    // Runtime 19 ms, Memory 56.48 MB
    public static int maxOperations(int[] nums, int k) {
        if(nums.length < 1) return 0;
        int start = 0, end = nums.length-1, c = 0;
        Arrays.sort(nums);
        while (start < end) {
            if((nums[start] + nums[end]) == k){
                c++;
                start++;
                end--;
            } else if ((nums[start] + nums[end]) < k) {
                start++;
            } else {
                end--;
            }
        }
        return c;
    }

    // Runtime 12 ms, Memory 57.30 MB
    public static int maxOperationsFast(int[] nums, int k){
        int c = 0, start = 0, end, index = 0;
        for(int i:nums) {
            if(i < k) {
                nums[index++] = i;
            }
        }
        Arrays.sort(nums,0,index);
        end = index-1;
        while(start<end) {
            if(nums[start]+nums[end] == k) {
                c++;
                start++;
                end--;
            } else if(nums[start]+nums[end] < k) {
                start++;
            } else if(nums[start]+nums[end] > k) {
                end--;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + maxOperations(new int[]{1,2,3,4}, 5) + " = 2");
        System.out.println("Example 2: " + maxOperations(new int[]{3,1,3,4,3}, 6) + " = 1"); 
        System.out.println("Example 3: " + maxOperations(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4}, 2) + " = 2");
        System.out.println("Example 4: " + maxOperations(new int[]{2,2,2,3,1,1,4,1}, 4) + " = 2");
        
        System.out.println("Example 1: " + maxOperationsFast(new int[]{1,2,3,4}, 5) + " = 2");
        System.out.println("Example 2: " + maxOperationsFast(new int[]{3,1,3,4,3}, 6) + " = 1"); 
        System.out.println("Example 3: " + maxOperationsFast(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4}, 2) + " = 2");
        System.out.println("Example 4: " + maxOperationsFast(new int[]{2,2,2,3,1,1,4,1}, 4) + " = 2");                
    }
}
