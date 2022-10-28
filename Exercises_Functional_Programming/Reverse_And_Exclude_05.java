package Exercises_Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Reverse_And_Exclude_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int numberToDef = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);

        numbers.forEach(n->{
            if (n % numberToDef != 0){
                System.out.print(n + " ");
            }
        });


    }
}
