import java.util.Scanner;

public class ColdPuterScience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int output = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp < 0) {
                output++;
            }
        }        
        System.out.println(output);
        sc.close();
    }
}
