package Java;
import java.util.Scanner;

public class EchoEchoEcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        sc.close();
        System.out.println(st + " " + st + " " + st);
    }
}
