package Java;
import java.util.Scanner;

public class InterviewQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int dif = (b-a)+1;
        String[] inputArr = new String[dif];
        for (int i = 0; i < dif; i++) {
            String input = sc.next();
            inputArr[i] = input;
        }
        int outputOne = 0;
        int outputTwo = 0;
        for (int x = 0; x < inputArr.length; x++) {
            if(inputArr[x].equals("Fizz") || inputArr[x].equals("FizzBuzz")) {
                outputOne = outputOne + a+x;
            }
            if (inputArr[x].equals("Buzz") || inputArr[x].equals("FizzBuzz")) {
                outputTwo = outputTwo + a+x;
            }
        }
        int checkVarOne = outputOne;
        for (int y = 1; y < outputOne; y++) {
            while (outputOne%y == 0) {
                if (outputOne == checkVarOne && inputArr[(y-1)].equals("FizzBuzz")) {
                    outputOne = y;
                }
                if (inputArr[(y-1)].equals("Fizz")) {
                    outputOne = y;
                }
                break;
            }
        }
        int checkVarTwo = outputOne;
        for (int y = 1; y < outputTwo; y++) {
            while (outputTwo%y == 0) {
                if (outputTwo == checkVarTwo && inputArr[(y-1)].equals("FizzBuzz")) {
                    outputTwo = y;
                }
                if (inputArr[(y-1)].equals("Buzz")) {
                    outputTwo = y;
                }
                break;
            }
        }
        System.out.println(outputOne + " " + outputTwo);
        sc.close();
    }
}
