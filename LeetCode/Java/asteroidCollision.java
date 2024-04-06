import java.util.Arrays;
/**
 * 735. Asteroid Collision
 * We are given an array asteroids of integers representing asteroids in a row.
 * For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). 
 * Each asteroid moves at the same speed.
 * Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. 
 * If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
 */
public class asteroidCollision {
    // Runtime 1ms beats 100%, Memory 44.91 MB beats 89.05%
    public static int[] asteroidCollisionMethod(int[] asteroids) {
        int len = asteroids.length;
        int end = 0;

        for (int i = 0; i < len; i++) {
            int num = asteroids[i];
            while (end > 0 && asteroids[end-1] > 0 && num < 0 && asteroids[end-1] < Math.abs(num)){
                end--;  
            } 

            if (end == 0 || num > 0 || asteroids[end-1] < 0) {
                asteroids[end++] = num;
            } else if(asteroids[end-1] == Math.abs(num)) {
                end--;
            }
        }
        
        int[] output = new int[end];
        System.arraycopy(asteroids, 0, output, 0, end);
        return output;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + Arrays.toString(asteroidCollisionMethod(new int[]{5,10,-5})) + " = [5,10]");
        System.out.println("Example 2: " + Arrays.toString(asteroidCollisionMethod(new int[]{8,-8})) + " = []");
        System.out.println("Example 3: " + Arrays.toString(asteroidCollisionMethod(new int[]{10,2,-5})) + " = [10]");
    }
}
