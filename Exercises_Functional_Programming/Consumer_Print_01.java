package Exercises_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Consumer_Print_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listOfNames = Arrays.stream(scanner.nextLine().split("\\s+")).toList();

        Consumer<String> consumer = System.out::println;

        for (String name : listOfNames){
            consumer.accept(name);
        }

    }
}
