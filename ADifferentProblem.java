import java.util.Scanner;

public class ADifferentProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            try {
                Long firstInt = sc.nextLong();
                Long secondInt = sc.nextLong();
                Long output;
                if(firstInt > secondInt) {
                    output = firstInt-secondInt;
                    System.out.println(output);
                } else {
                    output = secondInt-firstInt;
                    System.out.println(output);
                }
            } catch (Exception e) {
                break;
            }
        
        }
        sc.close();
    }
}