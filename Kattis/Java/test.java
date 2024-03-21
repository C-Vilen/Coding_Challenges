package Java;
import java.util.*;

public class test{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N > 0){
            String original = sc.next();
            String copy = sc.next();
            int length = original.length();
            String output = "";
            for (int i = 0; i < length; i++){
                if (original.charAt(i) == copy.charAt(i)){
                    output += ".";
                }
                else{
                    output += "*";
                }
            }
            System.out.println(original);
            System.out.println(copy);
            System.out.println(output);
            System.out.println();
            N--;
        }
        sc.close();
    }
}