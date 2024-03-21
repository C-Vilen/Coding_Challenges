package Java;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
            Long outputSum4 = (long) 0;
            for (int i = 0; i < array.length; i++) {
                outputSum4 += array[i];
            }
            System.out.println(outputSum4);
            break;

            case 5:
            Long outputSum5 = (long) 0;
            for (int i = 0; i < array.length; i++) {
                int nextInt = array[i];
                if(nextInt% 2 == 0) {
                    outputSum5 += nextInt;
                }
            }
            System.out.println(outputSum5);
            break;

            case 6:
            char[] outputWord = new char[N];
            for (int i = 0; i < array.length; i++) {
                outputWord[i] = (char)(array[i]%26 + 97);
            } 
            System.out.println(new String(outputWord));
            break;

            case 7:
            Set<Integer> SetOfInts = new HashSet<>();
            int index = 0;
            while (N-1 >= index && index >= 0 ) {
                index = array[index];
                if (index > N-1) {
                    System.out.println("Out");
                    break;
                } else if (index == N-1) {
                    System.out.println("Done");
                    break;
                } else if (SetOfInts.contains(index)){
                    System.out.println("Cyclic");
                    break;
                }
                SetOfInts.add(index);
            }
            break;

        }
        sc.close();
    }
}
