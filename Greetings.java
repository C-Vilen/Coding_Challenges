import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       sc.close();
       int amount = s.length();
       String e = "e";
       String eee = e.repeat((amount-2)*2);
       System.out.println("h" + eee + "y");
    }
}
