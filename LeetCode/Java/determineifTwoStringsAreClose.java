import java.util.Arrays;

/**
 * 1657. Determine if Two Strings Are Close
 * Two strings are considered close if you can attain one from the other using the following operations:
 *  - Operation 1: Swap any two existing characters.
 *     - For example, abcde -> aecdb
 *  - Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
 *     - For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
 * You can use the operations on either string as many times as necessary.
 * Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
 */
public class determineifTwoStringsAreClose {
    
    // Runtime 8ms beats 98.80%, Memory 45.83 MB beats 14.00%
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        if(word1.equals(word2)) return true;
        int[] map1 = new int[26];
        int[] map2 = new int[26];

        for (char c : word1.toCharArray()) map1[c - 'a']++;
        for (char c : word2.toCharArray()) map2[c - 'a']++;

        for (int i = 0; i < 26; i++) {
            if (map1[i] == 0 && map2[i] != 0) return false;
            if (map1[i] != 0 && map2[i] == 0) return false;
        }
        Arrays.sort(map1);
        Arrays.sort(map2);

        return Arrays.equals(map1, map2);
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + closeStrings("abc", "bca") + " = true");
        System.out.println("Example 2: " + closeStrings("a", "aa") + " = false");
        System.out.println("Example 3: " + closeStrings("cabbba", "abbccc") + " = true");
    }
}
