/**
 * 151. Reverse Words in a String
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 */
public class reverseWordsinaString {

    // Runtime 12 ms, Memory 45.4 MB
    public static String reverseWords(String s) {
        String[] input = (s.replaceAll("\\s+", " ")).split(" ");
        String output = "";
        for (int i = input.length-1; i > -1; i--) {
            output += input[i] + " ";
        }
        return output.trim();
    }

    // Runtime 6 ms, Memory 42.9 MB
    public static String reverseWordsStringBuilder(String s){
        String[] input = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = input.length-1; i > -1; i--) {
            sb.append(input[i]).append(" ");
        }
        return sb.toString().trim();
    }
    
    public static void main(String[] args) {
        System.out.println("Example 1: " + reverseWords("the sky is blue") + " = blue is sky the");
        System.out.println("Example 2: " + reverseWords("  hello world  ") + " = world hello");
        System.out.println("Example 3: " + reverseWords("a good   example ") + " = example good a");


        System.out.println("Example 1: " + reverseWordsStringBuilder("the sky is blue") + " = blue is sky the");
        System.out.println("Example 2: " + reverseWordsStringBuilder("  hello world  ") + " = world hello");
        System.out.println("Example 3: " + reverseWordsStringBuilder("a good   example ") + " = example good a");
    }
}