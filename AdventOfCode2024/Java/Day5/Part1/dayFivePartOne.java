package AdventOfCode2024.Java.Day5.Part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class dayFivePartOne {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("AdventOfCode2024/Java/Day5/input-day-five.txt");
        Scanner scanner = new Scanner(file);
        HashMap<Integer, ArrayList<Integer>> orderMap = new HashMap<Integer, ArrayList<Integer>>();
        List<List<Integer>> printMap = new ArrayList<>();
        int output = 0;
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.contains("|")) {
                Integer key = Integer.parseInt(input.split("\\|")[0]);
                Integer value = Integer.parseInt(input.split("\\|")[1]);
                if (orderMap.get(key) != null) {
                    ArrayList<Integer> list = orderMap.get(key);
                    list.add(value);
                    orderMap.put(key, list);
                } else {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(value);
                    orderMap.put(key, list);
                }
            } 
            if (input.contains(",")) {
                boolean correctOrder = true; 
                ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(Arrays.stream(input.split(",")).map(Integer::parseInt).toArray(Integer[]::new)));
                
                for (int i = inputList.size()-1; i >= 0; i--) {
                    for (int j = i-1; j >= 0; j--) {
                        if (orderMap.get(inputList.get(i)) != null && orderMap.get(inputList.get(i)).contains(inputList.get(j))) {
                            correctOrder = false;
                        }
                    }
                }
                
                if (correctOrder) {
                    printMap.add(inputList);
                }
            }
        }
        for (List<Integer> list : printMap) {
            int midIndex = (list.size()/2);
            output += list.get(midIndex);
        }
        
        scanner.close();
        System.out.println(output);
    }
}
