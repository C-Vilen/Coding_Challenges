import java.util.Scanner;

public class Howl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String howl = sc.nextLine();
        sc.close();
        System.out.println("AWH"+("O".repeat(howl.length())));
    }
}
