import java.util.Scanner;
public class Trik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();
        boolean[] cups = {true, false, false};
        int output = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            boolean temp;
            if(c == 'A') {
                temp = cups[0];
                cups[0] = cups[1];
                cups[1] = temp;
            } else if (c == 'B') {
                temp = cups[1];
                cups[1] = cups[2];
                cups[2] = temp;
            } else {
                temp = cups[0];
                cups[0] = cups[2];
                cups[2] = temp;
            }
        }
        for (int j = 0; j < cups.length; j++) {
            if(cups[j]){
                output= j+1;
                break;
            }
        }
        System.out.println(output);
    }
}