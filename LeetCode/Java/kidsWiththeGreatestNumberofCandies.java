import java.util.ArrayList;
import java.util.List;

/**
 * 1431. Kids With the Greatest Number of Candies
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
 * Note that multiple kids can have the greatest number of candies.
 */
public class kidsWiththeGreatestNumberofCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> results = new ArrayList<>(candies.length);
        int max = 0;
        for (int i = 0; i < candies.length; i++) max = Math.max(max, (candies[i]));
        for (int j = 0; j < candies.length; j++) results.add(max <= candies[j] + extraCandies);
        return results;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + kidsWithCandies(new int[]{2,3,5,1,3}, 3) + " = [true,true,true,false,true]");
        System.out.println("Example 2: " + kidsWithCandies(new int[]{4,2,1,1,2}, 1) + " = [true,false,false,false,false] ");
        System.out.println("Example 3: " + kidsWithCandies(new int[]{12,1,12}, 10) + " = [true,false,true] ");
        System.out.println("Example 4: " + kidsWithCandies(new int[]{2,8,7}, 1) + " = [false,true,true] ");
    }
}