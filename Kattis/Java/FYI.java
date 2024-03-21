package Java;
import java.util.Scanner;

public class FYI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tel = sc.nextInt();
        sc.close();
        int num = tel/10000;
        if (num == 555) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}