import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        m -= 45;
        if (m < 0) {
            h -= 1;
            m += 60;
        }
        if (h < 0 ) {
            h = 23;
        }
        System.out.println(h + " " + m);

        // if (h >= 0 && m >= 45 ) {
        //     System.out.println((h) + " " + (m-45));
        // } else if (h > 0 && m < 44) {
        //     System.out.println((h-1) + " " + ((60+m)-45));
        // } else if (h == 0 && m < 44) {
        //     System.out.println((23) + " " + ((60+m)-45));
        // } else {
        //     System.out.println(h + " " + m);
        // }
    }
}