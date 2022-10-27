package Exercises_Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Custom_Min_Function_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[],Integer> smallestNumber = arr -> {
            int min = Integer.MAX_VALUE;
            for (int num :arr) {
                if (num < min){
                    min = num;
                }
            }
            return min;
        };
        System.out.println(smallestNumber.apply(numbers));
    }
}
