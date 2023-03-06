package Java;
import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double i = sc.nextInt();
        sc.close();
        if (a > i) {
            System.out.println(Math.ceil((i*a)-a+(i/a)));
        } else if (a < i) {
            System.out.println(Math.ceil((a*i)-i+(a/i)));
        } else {
            System.out.println("to bad");
        }
    }
}
