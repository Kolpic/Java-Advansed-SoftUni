package Exercises_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Knights_of_Honor_02 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        List<String> listOfNames = Arrays.stream(scanner.nextLine().split("\\s+")).toList();

        Consumer<String> addingSir = n -> System.out.println("Sir " + n);

        for (String name : listOfNames){
            addingSir.accept(name);
        }
    }
}
