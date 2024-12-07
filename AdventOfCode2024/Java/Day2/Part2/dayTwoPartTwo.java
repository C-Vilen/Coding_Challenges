package AdventOfCode2024.Java.Day2.Part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class dayTwoPartTwo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("AdventOfCode2024/Java/DayTwo/input-day-two.txt");
        Scanner scanner = new Scanner(file);
        int output = 0;
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            int[] arr = Arrays.stream(input.split("\s+")).mapToInt(Integer::parseInt).toArray();
            boolean safe = isSafe(arr);

            if (!safe) {
                safe = false;
                for (int i = 0; i < arr.length; i++) {
                    int[] newArr = removeLevel(arr, i);
                    if (isSafe(newArr)) {
                        safe = true;
                        break;
                    }
                }
            }
            
            if (safe) {
                output += 1;
            }
        }
        scanner.close();
        System.out.println(output);
    }

    private static boolean isSafe(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (Math.abs(diff) < 1 || Math.abs(diff) > 3 || (i > 1 && !isConsistent(arr, i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isConsistent(int[] arr, int i) {
        int diff = arr[i] - arr[i - 1];
        if (diff > 0 && arr[i - 1] < arr[i - 2]) {
            return false;
        }
        if (diff < 0 && arr[i - 1] > arr[i - 2]) {
            return false;
        }
        return true;
    }

    private static int[] removeLevel(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
}
