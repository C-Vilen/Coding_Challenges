package Java;
import java.util.Scanner;

public class Timeloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        for (int i = 0; i < input; i++) {
            System.out.println(i+1 + " Abracadabra");
        }
    }
}
