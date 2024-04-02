/**
 * 1732. Find the Highest Altitude
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
 * You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point
 */
public class findtheHighestAltitude {
    // Runtime 0ms, Memory 41.16
    public static int largestAltitude(int[] gain) {
        int max = 0, altitude = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            max = Math.max(max, altitude);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + largestAltitude(new int[]{-5,1,5,0,-7}) + " = 1");
        System.out.println("Example 1: " + largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}) + " = 0");
    }
}
