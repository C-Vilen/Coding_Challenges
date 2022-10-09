import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        sc.close();
        int reverse1 = 0;
        int reverse2 = 0;
        for (int i = 1; i <= 3; i++) {
            int remainder1 = input1 % 10;
            int remainder2 = input2 % 10;
            reverse1 = reverse1 * 10 + remainder1;  
            reverse2 = reverse2 * 10 + remainder2;  
            input1 = input1 / 10;
            input2 = input2 / 10;
        }
        if (reverse1 > reverse2) {
            System.out.println(reverse1);
        } else {
            System.out.println(reverse2);
        }
    }
}
