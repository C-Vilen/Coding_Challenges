import java.util.HashSet;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        HashSet<Integer> ModNumber = new HashSet<Integer>(); 
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++ ) {
            int input = sc.nextInt() % 42;
            ModNumber.add(input);
        }
        sc.close();
        System.out.println(ModNumber.size());
    }
}
