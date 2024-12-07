package AdventOfCode2024.Java.Day4.Part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayFourPartOne {
    private static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    private static char[][] inputArr;
    private static Character[] word = {'X', 'M', 'A', 'S'};

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("AdventOfCode2024/Java/Day4/input-day-four.txt");
        Scanner scanner = new Scanner(file);
        int output = 0;
        inputArr = new char[150][150];

        int rowIndex = 0;
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            inputArr[rowIndex] = input.toCharArray();
            rowIndex++;
        }

        for (int x = 0; x < inputArr.length; x++) {
            for (int y = 0; y < inputArr[0].length; y++) {
                if (inputArr[x][y] == 'X') {
                    for (int direc = 0; direc < 8; direc++) {
                        output += dfs(1, x + dx[direc], y + dy[direc], direc);
                    }
                }
            }
        }
        
        scanner.close();
        System.out.println(output);
    }

    private static int dfs (int level, int x, int y, int direction){
        // Check bounds
        if (x < 0 || y < 0 || x >= inputArr.length || y >= inputArr[0].length) {
            return 0;
        }

        // Check if expected character
        if (inputArr[x][y] != word[level]) {
            return 0;
        }

        // Found XMAS
        if (level == 3) return 1;

        // Continue same direction
        return dfs(level + 1, x + dx[direction], y + dy[direction], direction);
    }
}
