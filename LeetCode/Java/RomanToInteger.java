
public class RomanToInteger {
    public int romanToInt(String s) {
        int output = 0, curr = 0, prev = 0;
        for(int i=s.length()-1; i>=0; i--){
            switch (s.charAt(i)) {
                case 'M' -> curr = 1000;
                case 'D' -> curr = 500;
                case 'C' -> curr = 100;
                case 'L' -> curr = 50;
                case 'X' -> curr = 10;
                case 'V' -> curr = 5;
                case 'I' -> curr = 1;
            }
            if (curr < prev) {
                output -= curr;
            } else {
                output += curr;
            }
            prev = curr;
        }
        return output;
    }
}
