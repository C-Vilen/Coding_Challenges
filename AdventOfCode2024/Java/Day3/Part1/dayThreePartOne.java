package AdventOfCode2024.Java.Day3.Part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.*;

public class dayThreePartOne {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("AdventOfCode2024/Java/DayThree/input-day-three.txt");
        Scanner scanner = new Scanner(file);
        int output = 0;
        String mulRegex = "mul\\((\\d{1,3}),(\\d{1,3})\\)";
        Pattern pattern = Pattern.compile(mulRegex);
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                int leftNum = Integer.parseInt(matcher.group(1));
                int rightNum = Integer.parseInt(matcher.group(2));
                output += leftNum * rightNum;
            }
        }
        
        scanner.close();
        System.out.println(output);
    }
}
