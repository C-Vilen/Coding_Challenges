package Java;
import java.util.Scanner;

public class NineNineProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        if (N <= 148) {
            System.out.println(99);
        } else {
            System.out.println(199);
        }
    }
}
