package Exercises_Sets_and_Maps_Advanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Count_Symbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character,Integer> alphabetCounter = new TreeMap<>();

        char[] inputCharArr = input.toCharArray();

        for (int i = 0; i < inputCharArr.length; i++) {
            char currentChar = inputCharArr[i];

            if (!alphabetCounter.containsKey(currentChar)){
                alphabetCounter.put(currentChar,1);
            }else {
                alphabetCounter.put(currentChar,alphabetCounter.get(currentChar) + 1);
            }
        }

        alphabetCounter.entrySet().stream().forEach(e ->{
            System.out.println(e.getKey() + ": " + e.getValue() + " time/s");
        });
    }
}
