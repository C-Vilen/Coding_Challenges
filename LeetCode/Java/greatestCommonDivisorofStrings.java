public class greatestCommonDivisorofStrings {

    // Looking at the greatest common divisor between str1 and str2 and returns the largest string x such that x divedes both str1 and str2
    // Runtime 1 ms & Memory 41.81 MB
    public static String gcdOfStrings(String str1, String str2){
        if (!(str1+str2).equals(str2+str1)) return "";
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    // Helper method to calculate the gcd between to strings
    public static int gcd(int len1, int len2){
        return len2 == 0 ? len1 : gcd(len2, len1 % len2);
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + gcdOfStrings("ABCABC", "ABC") + " = ABC");
        System.out.println("Example 2: " + gcdOfStrings("ABABAB", "ABAB") + " = AB");
        System.out.println("Example 3: " + gcdOfStrings("LEET", "CODE") + " = ");
    }
    
}