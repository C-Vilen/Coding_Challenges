package Java;
import java.util.Scanner;

public class Skener {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int zr = sc.nextInt();
        int zc = sc.nextInt();

        String[] store = new String[r*zr];

        for (int i = 0; i < r; i++) {
            String input1 = sc.next();
            for (int j = 0; j < zr; j++) {
                store[j] = input1;
            }
        }

        for (int x = 0; x < store.length; x++) {
            String line = store[x];
            store[x] = "";
            for (int y = 0; y < line.length(); y++) {
                for (int z = 0; z < zc; z++)
                store[x] += line.charAt(y);
            }
        }

        for (String s: store) {
            System.out.println(s);
        }
        sc.close();
    }
}
