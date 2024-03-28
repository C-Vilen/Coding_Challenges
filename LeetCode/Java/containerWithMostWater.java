/**
 * 11. Container With Most Water
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 */
public class containerWithMostWater {
    // Runtime 3ms, Memory 57.31
    public static int maxArea(int[] height) {
        if(height.length <= 1) return 0;
        int output = 0, start = 0, end = height.length-1;
        while (start < end) {
            if(height[start] >= height[end]) { 
                output = Math.max(output, (end-start) * height[end]);
                end--;
            } else {
                output = Math.max(output, (end-start) * height[start]);
                start++;
            }
        }
        return output;
    }

    // Runtime 2ms, 
    public static int maxAreaFast(int[] height) {
        int start = 0, end = height.length - 1, output = 0;
        while(start < end) {
            int minH = Math.min(height[start], height[end]);
            output = Math.max(output, minH * (end - start));
                while(start < end && height[start] <= minH) start++;
                while(start < end && height[end] <= minH) end--;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + maxArea(new int[]{1,8,6,2,5,4,8,3,7}) + " = 49");
        System.out.println("Example 2: " + maxArea(new int[]{1,1}) + " = 1");

        
        System.out.println("Example 1: " + maxAreaFast(new int[]{1,8,6,2,5,4,8,3,7}) + " = 49");
        System.out.println("Example 2: " + maxAreaFast(new int[]{1,1}) + " = 1");
    }
}
