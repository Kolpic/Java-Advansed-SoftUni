package Exercises_Sets_and_Maps_Advanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Sets_of_Elements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int N = numbers[0];
        int M = numbers[1];

        Set<Integer> setOne = new LinkedHashSet<>();
        Set<Integer> setTwo = new LinkedHashSet<>();

        while (N > 0){
            int number = Integer.parseInt(scanner.nextLine());
            setOne.add(number);
            N--;
        }

        while (M > 0){
            int number = Integer.parseInt(scanner.nextLine());
            setTwo.add(number);
            M--;
        }


        for (int element : setOne){//setOne.retainAll(setTwo)
            if (setTwo.contains(element)){
                System.out.print(element + " ");
            }
        }
    }
}
