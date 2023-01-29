import java.util.Arrays;
import java.util.Scanner;

public class BasicProgrammingOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int t = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) { 
            array[i] = sc.nextInt();
        }
        if (t == 1) {
            System.out.println(7);
        }
        if(t == 2) {
            if (array[0] > array[1]) {
                System.out.println("Bigger");
            } else if (array[0] == array[1]) {
                System.out.println("Equal");
            } else {
                System.out.println("Smaller");
            }
        }
        if (t == 3) {
            System.out.println(array[1]);
        }
        if (t == 4) {
            System.out.println(Arrays.stream(array).sum());
        }
        if (t == 5) {
            int output = 0;
            for (Integer integer : array) {
                if(integer% 2 == 0) {
                    output += integer;
                }
            }
            System.out.println(output);
        }
        if (t == 6) {
            char[] outputWord = new char[N];
            for (int i = 0; i < array.length; i++) {
                outputWord[i] = (char)(array[i]%26 + 97);
            } 
            System.out.println(new String(outputWord));
        }
        if (t == 7) {
            int index = 0;
            while (index < N) {
                index = array[index];
                if (index >= N) {
                    System.out.println("Out");
                    break;
                } else if (index == N-1) {
                    System.out.println("Done");
                    break;
                } else {
                    System.out.println("Cyclic");
                    break;
                }
            }
        }
        sc.close();
    }
}