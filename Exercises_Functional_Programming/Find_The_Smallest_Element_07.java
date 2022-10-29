package Exercises_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_The_Smallest_Element_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>,Integer> function = func ->{
            int min = func.stream().mapToInt(e -> e).min().getAsInt();
            return func.lastIndexOf(min);
        };
        System.out.println(function.apply(numbers));
    }
}
