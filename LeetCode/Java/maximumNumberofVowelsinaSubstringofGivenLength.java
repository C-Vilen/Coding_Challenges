/**
 * 1456. Maximum Number of Vowels in a Substring of Given Length
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 */
public class maximumNumberofVowelsinaSubstringofGivenLength {
    
    // Runtime 13ms, Memory 44.13 MB
    public static int maxVowels(String s, int k) {
        int output = 0, c = 0;
        for (int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) c++;
        }
        output = c;
        for (int i = k; i < s.length(); i++) {
            if(isVowel(s.charAt(i))) c++;
            if(isVowel(s.charAt(i-k))) c--;
            output = Math.max(output, c);
        }
        return output;
    }

    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    // Runtime 6 ms, 44.65 MB
    public static int maxVowelsFast(String s, int k) {
        boolean[] vowels = new boolean['z' + 1];
        vowels['u'] = vowels['e'] = vowels['i'] = vowels['o'] = vowels['a'] = true;

        char[] chars = s.toCharArray();
        int output = 0;
        for (int i = 0;i < k; i++)
            if (vowels[chars[i]])
                output++;

        int len = s.length(), n = output;
        for (int i = k;i < len; i++) {
            if (vowels[chars[i-k]]) n--;
            if (vowels[chars[i]]) n++;
            if (n > output) output = n;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + maxVowels("abciiidef", 3) + " = 3");
        System.out.println("Example 2: " + maxVowels("aeiou", 2) + " = 2");
        System.out.println("Example 3: " + maxVowels("leetcode", 3) + " = 2");
        System.out.println("Example 4: " + maxVowels("weallloveyou", 7) + " = 4");
        System.out.println("Example 5: " + maxVowels("ibpbhixfiouhdljnjfflpapptrxgcomvnb", 33) + " = 7");
        System.out.println("----------------");
        System.out.println("Example 1: " + maxVowelsFast("abciiidef", 3) + " = 3");
        System.out.println("Example 2: " + maxVowelsFast("aeiou", 2) + " = 2");
        System.out.println("Example 3: " + maxVowelsFast("leetcode", 3) + " = 2");
        System.out.println("Example 4: " + maxVowelsFast("weallloveyou", 7) + " = 4");
        System.out.println("Example 5: " + maxVowelsFast("ibpbhixfiouhdljnjfflpapptrxgcomvnb", 33) + " = 7");
    }
}
