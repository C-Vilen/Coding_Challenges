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
            int prevNum = arr[0];
            boolean safe = true;
            boolean positiveNums = false;
            if (prevNum < arr[1]) positiveNums = true;
            for (int i = 1; i < arr.length; i++) {
                int nextNum = arr[i];
                if (positiveNums) {
                    if (nextNum < prevNum | (nextNum - prevNum) < 1 | (nextNum - prevNum) > 3) {
                        safe = false;
                        break;
                    }
                    prevNum = nextNum;
                }
                if (!positiveNums) {
                    if (nextNum > prevNum | (prevNum - nextNum) < 1 | (prevNum - nextNum) > 3) {
                        safe = false;
                        break;
                    }
                    prevNum = nextNum;
                }
            }
            if(safe) output += 1;
        }
        scanner.close();
        System.out.println(output);
    }
}
