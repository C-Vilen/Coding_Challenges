public class mergeStringsAlternately {
    
    // The naive solution to solve the problem
    // Score: Runtime 2ms && Memory 42.86 MB
    public static String mergeAlternatively(String word1, String word2) {
        int counter1 = 0;
        int counter2 = 0;
        String output = "";
        for (int i = 0; i < word1.length()+word2.length(); i++) {
            if (counter1 <= counter2 && counter1 != word1.length() || counter2 == word2.length()) {
                output += word1.substring(counter1, counter1+1);
                counter1++;
            } else {
                output += word2.substring(counter2, counter2+1);
                counter2++;
            }
        }
        return output;
    }

    // Using the stringbuilder performs quite fast compared to the naive solution above.
    // Score: Runtime 0ms && Memory 41.56 MB
    public static String mergeAlternatilyStringBuilder(String word1, String word2){
        StringBuilder sb = new StringBuilder();
        int smallestWord = Math.min(word1.length(), word2.length());
        for (int i = 0; i < smallestWord; i++) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }
        // Adding remaing of word
        if (smallestWord < word1.length()) sb.append(word1.substring(smallestWord));
        if (smallestWord < word2.length()) sb.append(word2.substring(smallestWord));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + mergeAlternatively("abc", "pqr") + " should be equal to apbqcr");
        System.out.println("Example 2: " + mergeAlternatively("ab", "pqrs") + " should be equal to apbqrs");
        System.out.println("Example 3: " + mergeAlternatively("abcd", "pq") + " should be equal to apbqcd");

        System.out.println("Example 1: " + mergeAlternatilyStringBuilder("abc", "pqr") + " should be equal to apbqcr");
        System.out.println("Example 2: " + mergeAlternatilyStringBuilder("ab", "pqrs") + " should be equal to apbqrs");
        System.out.println("Example 3: " + mergeAlternatilyStringBuilder("abcd", "pq") + " should be equal to apbqcd");
    }
}
