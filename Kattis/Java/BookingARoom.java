package Java;
import java.util.ArrayList;
import java.util.Scanner;

public class BookingARoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> bookedRooms = new ArrayList<>();
        if(n >= r) {
            System.out.println("too late");
            sc.close();
            return;
        }
        for (int i = 0; i < n; i++) {
            bookedRooms.add(sc.nextInt());
        }
        int guess = 1;
        while(true) {
            if(!bookedRooms.contains(guess)) {
                System.out.println(guess);
                break;
            }
            guess++;
        }
        sc.close();
    }
}
