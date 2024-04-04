import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2352. Equal Row and Column Pairs
 * Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
 * A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
 */
public class equalRowandColumnPairs {
    // Runtime 7ms beats 97.47%, Memory 47.72 MB beats 85.41%
    public static int equalPairs(int[][] grid) {
        int [] colArr = new int[grid.length];
        int c = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid.length; j++) {
                colArr[j] = grid[j][i];
            }
            for(int j = 0; j < grid.length; j++) {
                int[] rowCol = grid[j];
                if(Arrays.equals(colArr, rowCol)) {
                    ++c;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + equalPairs(new int[][]{{3,2,1},{1,7,6},{2,7,7}}) + " = 1");
        System.out.println("Example 1: " + equalPairs(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}) + " = 3");
    }
}
