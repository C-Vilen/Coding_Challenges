/**
 * 443. String Compression
 * Given an array of characters chars, compress it using the following algorithm:
 * Begin with an empty string s. For each group of consecutive repeating characters in chars:
 *  -  If the group's length is 1, append the character to s.
 *  -   Otherwise, append the character followed by the group's length.
 * The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
 * After you are done modifying the input array, return the new length of the array.
 * You must write an algorithm that uses only constant extra space.
 */
public class stringCompression {

    public static int compress(char[] chars) {
        int output = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[output++] = currentChar;
            if(count != 1) {
                for(char c : Integer.toString(count).toCharArray()) {
                    chars[output++] = c;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + compress(new char[]{'a','a','b','b','c','c','c'}) + " = 6");
        System.out.println("Example 2: " + compress(new char[]{'a'}) + " = 1");
        System.out.println("Example 3: " + compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}) + " = 4");
    }
}