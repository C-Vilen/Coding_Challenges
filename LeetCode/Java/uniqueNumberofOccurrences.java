import java.util.HashMap;
import java.util.HashSet;
/**
 * 1207. Unique Number of Occurrences
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 */
public class uniqueNumberofOccurrences {
    // Runtime 3ms, 41.62 MB
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        HashSet<Integer> count = new HashSet<>();
        for (Integer i : map.values()) {
            if (count.contains(i)) {
                return false;
            } else {
                count.add(i);
            }
        }
        return true;
    }

    // Runtime 0ms, Memory 41.9 MB
    public static boolean uniqueOccurrencesFast(int[] arr) {
        int[] countArr = new int[2001];
        boolean[] used = new boolean[1001];

        for (int i : arr) {
            countArr[1000 + i]++;
        }

        for (int i : arr) {
            int count = countArr[1000 + i];
            countArr[1000 + i] = 0; 
            if (count > 0) {
                if (used[count]) return false;
                else used[count] = true;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("Example 1: " + uniqueOccurrences(new int[]{1,2,2,1,1,3}) + " = true");
        System.out.println("Example 2: " + uniqueOccurrences(new int[]{1,2}) + " = false");
        System.out.println("Example 3: " + uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}) + " = true");
        System.out.println("------------------------");
        System.out.println("Example 1: " + uniqueOccurrencesFast(new int[]{1,2,2,1,1,3}) + " = true");
        System.out.println("Example 2: " + uniqueOccurrencesFast(new int[]{1,2}) + " = false");
        System.out.println("Example 3: " + uniqueOccurrencesFast(new int[]{-3,0,1,-3,1,1,1,-3,10,0}) + " = true");
    }
}
