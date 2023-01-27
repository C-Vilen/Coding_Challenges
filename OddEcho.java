import java.util.Scanner;

public class OddEcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String st = sc.nextLine();

            if (i % 2 == 0) {
                System.out.println(st);
            }
        }
        sc.close();
    }
}