package Java;
import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases > 0) {
            String input1 = sc.next();
            String input2 = sc.next();
            String dif = "";
            for (int i = 0; i < input1.length(); i++) {
                if (input1.charAt(i) == input2.charAt(i)) {
                    dif += ".";
                } else {
                    dif += "*";
                }
            }
            System.out.println(input1 + "\n" + input2 + "\n" + dif + "");
            cases--;            
        }
        sc.close();
    }
}
