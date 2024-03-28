/**
 * 392. Is Subsequence
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */

public class isSubsequence {

    // Runtime 2 ms, Memory 41.22 MB
    public static boolean isSubsequenceNaive(String s, String t) {
        if(s.length() == 0) return true;
        int sIndex = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(sIndex) == t.charAt(i)) sIndex++;   
            if (sIndex == s.length()) return true;
        }
        return false;
    }

    // Runtime 0ms, Memory 41.62 MB
    public static boolean isSubsequenceFast(String s, String t){
        int tIndex = 0, sIndex = 0;
        int n = t.length();
        int m = s.length();
        char sArr[] = s.toCharArray();
        char tArr[] = t.toCharArray();
        if (m < 1) return true;
        while(tIndex < n) {
            if(sArr[sIndex] == tArr[tIndex]){
                sIndex++;
            }
            tIndex++;
            if(sIndex == m) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + isSubsequenceNaive("abc", "ahbgdc") + " = true");
        System.out.println("Example 2: " + isSubsequenceNaive("axc", "ahbgdc") + " = false");
        System.out.println("Example 3: " + isSubsequenceNaive("acb", "ahbgdc") + " = false");

        
        System.out.println("Example 1: " + isSubsequenceFast("abc", "ahbgdc") + " = true");
        System.out.println("Example 2: " + isSubsequenceFast("axc", "ahbgdc") + " = false");
        System.out.println("Example 3: " + isSubsequenceFast("acb", "ahbgdc") + " = false");
    }
}
