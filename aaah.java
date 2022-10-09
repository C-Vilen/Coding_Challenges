import java.util.Scanner;

public class aaah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        sc.close();
        if (input1.length() < input2.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }
    }
}
