package Java;
import java.util.Scanner;

public class BabyBites {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String []array = sc.nextLine().split(" ");
        boolean b = false;
        for (int i = 0; i < array.length; i++) {
          if(array[i].equals("mumble") || array[i].equals(Integer.toString(i+1))) 
            continue;
          b = true;
        }
        String result = b ? "something is fishy" : "makes sense";
        System.out.println(result);
        sc.close();
      }
}
