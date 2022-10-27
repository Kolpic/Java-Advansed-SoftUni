package Exercises_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Applied_Arithmetic_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] listOfNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        Function<int[],int[]> add = numbers -> Arrays.stream(numbers).map(number -> number + 1).toArray();
        Function<int[],int[]> multiply = numbers -> Arrays.stream(numbers).map(number -> number * 2).toArray();
        Function<int[],int[]> subtract = numbers -> Arrays.stream(numbers).map(number -> number - 1).toArray();

        while (!command.equals("end")){
            switch (command){
                case "add":
                   listOfNumbers =  add.apply(listOfNumbers);
                    break;

                case "multiply":
                    listOfNumbers =   multiply.apply(listOfNumbers);
                    break;

                case "subtract":
                    listOfNumbers =  subtract.apply(listOfNumbers);
                    break;

                case "print":
                    Arrays.stream(listOfNumbers).forEach(number -> System.out.print(number + " "));
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
