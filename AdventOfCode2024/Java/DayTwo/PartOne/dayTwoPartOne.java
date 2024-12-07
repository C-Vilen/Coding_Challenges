package AdventOfCode2024.Java.DayTwo.PartOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class dayTwoPartOne {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("AdventOfCode2024/Java/DayTwo/input-day-two.txt");
        Scanner scanner = new Scanner(file);
        int output = 0;
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            int[] arr = Arrays.stream(input.split("\s+")).mapToInt(Integer::parseInt).toArray();
            boolean safe = true; 

            for (int i = 1; i < arr.length; i++) {
                int dif = arr[i] - arr[i-1];
                if (Math.abs(dif) < 1 || 
                    Math.abs(dif) > 3 || 
                    (dif > 0 && i > 1 && arr[i-1] < arr[i-2]) ||
                    (dif < 0 && i > 1 && arr[i-1] > arr[i-2])) {
                    safe = false;
                    break;                    
                }
            }
            if (safe) {
                output +=1;
            }
        }
        scanner.close();
        System.out.println(output);
    }
}
