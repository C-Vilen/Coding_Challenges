import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        sc.close();
        if (input1+input2 == input3) {
            System.out.println(input1+"+"+input2+"="+input3);
        } else if (input1*input2 == input3) {
            System.out.println(input1+"*"+input2+"="+input3);
        } else if (input1-input2 == input3) {
            System.out.println(input1+"-"+input2+"="+input3);
        } else if (input1/input2 == input3) {
            System.out.println(input1+"/"+input2+"="+input3);
        } else if (input1 == input2+input3) {
            System.out.println(input1+"="+input2+"+"+input3);
        } else if (input1 == input2-input3) {
            System.out.println(input1+"="+input2+"-"+input3);
        } else if (input1 == input2/input3) {
            System.out.println(input1+"="+input2+"/"+input3);
        } else {            
            System.out.println(input1+"="+input2+"*"+input3);
        }
    }
}
