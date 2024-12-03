package AdventOfCode2024.Java.DayOne.PartTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class dayOnePartTwo {
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

        int similarityScore = 0;
        while (!leftNums.isEmpty()) {
            
            int leftNumber = leftNums.firstKey();
            int leftValue = leftNums.get(leftNumber);
            if (leftValue > 1) {
                int newValue = leftValue-1;
                leftNums.replace(leftNumber, leftValue, newValue);
            } else {
                leftNums.remove(leftNumber, 1);
            }

            int rightMultiplier = rightNums.getOrDefault(leftNumber, 0);
            int score = (leftNumber * rightMultiplier);

            similarityScore += score;
        }
        System.out.println(similarityScore);
    }
}