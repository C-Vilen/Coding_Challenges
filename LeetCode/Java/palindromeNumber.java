public class palindromeNumber {

    public boolean isPalindrome(int x) {
        int newX = x;
        int y = 0;
        while (newX!= 0) {
            int remainder = newX % 10;
            y = y * 10 + remainder;
            newX = newX / 10;
        }
        if (x == y && x >= 0) {
            return true;
        } else {
            return false;
        }
    }
}