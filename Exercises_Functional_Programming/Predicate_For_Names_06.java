package Exercises_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_For_Names_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nameLength = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Predicate<String> predicate = n -> n.length() <= nameLength;

        names.stream().forEach(e->{
            if (predicate.test(e)){
                System.out.println(e);
            }
        });

    }
}
