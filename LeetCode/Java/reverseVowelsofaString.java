public class reverseVowelsofaString {

    /**
     * 345. Reverse Vowels of a String
     * Given a string s, reverse only all the vowels in the string and return it.
     * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower
     * and upper cases, more than once.
     */
    public static String reverseVowels(String s) {
        char[] input = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";
        while (start < end) {
            while (start < end && vowels.indexOf(input[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(input[end]) == -1) {
                end--;
            }
            char temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
        return new String(input);
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + reverseVowels("hello") + " = holle");
        System.out.println("Example 2: " + reverseVowels("leetcode") + " = leotcede");
    }
}
