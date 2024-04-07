import java.util.Stack;

/**
 * 394. Decode String
 * Given an encoded string, return its decoded string.
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
 * The test cases are generated so that the length of the output will never exceed 105.
 */
public class decodeString {

    // Runtime 0ms beats 100%, Memory 41.44 MB beats 55.12%
    public static String decodeStringMethod(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> stSB = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                st.push(n);
                n = 0;
                stSB.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') {
                int k = st.pop();
                StringBuilder temp = sb;
                sb = stSB.pop();
                while (k-- > 0) {
                    sb.append(temp);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + decodeStringMethod("3[a]2[bc]") + " = aaabcbc");
        System.out.println("Example 2: " + decodeStringMethod("3[a2[c]]") + " = accaccacc");
        System.out.println("Example 3: " + decodeStringMethod("2[abc]3[cd]ef") + " = abcabccdcdcdef");
    }
}
