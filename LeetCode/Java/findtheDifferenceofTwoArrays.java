import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * 2215. Find the Difference of Two Arrays
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 *  - answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 *  - answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * Note that the integers in the lists may be returned in any order.
 */
public class findtheDifferenceofTwoArrays {

    // Runtime 9ms, 45.17 MB
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> n1Set = new HashSet<>();
        HashSet<Integer> n2Set = new HashSet<>();
        for (int i = 0, j = 0; i < nums1.length + nums2.length; i++, j++) {
            if(i < nums1.length) n1Set.add(nums1[i]);
            if(j < nums2.length) n2Set.add(nums2[j]);
        }
        
        ArrayList<Integer> n1List = new ArrayList<>();
        ArrayList<Integer> n2List = new ArrayList<>();
        for (Integer integer : n1Set) {
            if (!n2Set.contains(integer)) {
                n1List.add(integer);
            }
        }
        for (Integer integer : n2Set) {
            if (!n1Set.contains(integer)) {
                n2List.add(integer);
            }
        }
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        output.add(n1List);
        output.add(n2List);
        return output;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + findDifference(new int[]{1,2,3}, new int[]{2,4,6}) + " = [[1,3],[4,6]]");
        System.out.println("Example 1: " + findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2}) + " = [[3],[]]");
    }
}
