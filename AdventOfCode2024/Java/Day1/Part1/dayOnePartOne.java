package AdventOfCode2024.Java.Day1.Part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class dayOnePartOne {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("AdventOfCode2024/Java/DayOne/input-day-one.txt");
        Scanner scanner = new Scanner(file);
        TreeMap<Integer, Integer> leftNums = new TreeMap<>();
        TreeMap<Integer, Integer> rightNums = new TreeMap<>();
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            int[] arr = Arrays.stream(input.split("\s+")).mapToInt(Integer::parseInt).toArray();
            leftNums.put(arr[0], leftNums.getOrDefault(arr[0], 0)+1);
            rightNums.put(arr[1], rightNums.getOrDefault(arr[1], 0)+1);
        }
        scanner.close();

        int totalDistance = 0;
        while (!leftNums.isEmpty()) {
            
            int leftNumber = leftNums.firstKey();
            int leftValue = leftNums.get(leftNumber);
            if (leftValue > 1) {
                int newValue = leftValue-1;
                leftNums.replace(leftNumber, leftValue, newValue);
            } else {
                leftNums.remove(leftNumber, 1);
            }
            int rightNumber = rightNums.firstKey();
            int rightValue = rightNums.get(rightNumber);
            if (rightValue > 1) {
                int newValue = rightValue-1;
                rightNums.replace(rightNumber, rightValue, newValue);
            } else {
                rightNums.remove(rightNumber, 1);
            }
            totalDistance += Math.abs(leftNumber - rightNumber);
        }
        System.out.println(totalDistance);
    }
}