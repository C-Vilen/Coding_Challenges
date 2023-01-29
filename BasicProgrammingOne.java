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
        switch(t){
            case 1:
            System.out.println(7);
            break;

            case 2:
            if (array[0] > array[1]) {
                System.out.println("Bigger");
            } else if (array[0] == array[1]) {
                System.out.println("Equal");
            } else {
                System.out.println("Smaller");
            }
            break;

            case 3:
            int medianArray[] = {array[0], array[1], array[2]};
            Arrays.sort(medianArray);
            System.out.println(medianArray[1]);
            break;

            case 4:
            System.out.println(Arrays.stream(array).sum());
            break;

            case 5:
            int output = 0;
            for (Integer integer : array) {
                if(integer% 2 == 0) {
                    output += integer;
                }
            }
            System.out.println(output);
            break;

            case 6:
            char[] outputWord = new char[N];
            for (int i = 0; i < array.length; i++) {
                outputWord[i] = (char)(array[i]%26 + 97);
            } 
            System.out.println(new String(outputWord));
            break;

            case 7:
            int index = 0;
            while (true) {
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
            break;

        }
        sc.close();
    }
}
