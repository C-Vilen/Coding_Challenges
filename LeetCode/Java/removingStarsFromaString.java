/**
 * 2390. Removing Stars From a String
 * You are given a string s, which contains stars *.
 * In one operation, you can:
 *  - Choose a star in s.
 *  - Remove the closest non-star character to its left, as well as remove the star itself.
 * Return the string after all stars have been removed.
 * Note:
 * The input will be generated such that the operation is always possible.
 * It can be shown that the resulting string will always be unique.
 */
public class removingStarsFromaString {
    // Runtime 36ms beats 79.39%, Memory 45.28MB beats 92.82%
    public static String removeStars(String s) {
        if(s.isBlank()) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '*') {
                sb.deleteCharAt(sb.length()-1);
            } else {
                sb.append(c);
            }
            
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + removeStars("leet**cod*e") + " = lecoe");
        System.out.println("Example 2: " + removeStars("erase*****") + " = ");
    }
}
