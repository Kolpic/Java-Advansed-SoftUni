package Lab_Functional_Programming;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Count_Uppercase_Words_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Predicate<String> isStartingWithUpperCase = w -> Character.isUpperCase(w.charAt(0));

        ArrayDeque<String> queueWords = new ArrayDeque<>();

        Arrays.stream(words)
                .filter(isStartingWithUpperCase)
                .forEach(queueWords::offer);

        System.out.println(queueWords.size());

        while (!queueWords.isEmpty()){
            System.out.println(queueWords.poll());
        }
    }
}
