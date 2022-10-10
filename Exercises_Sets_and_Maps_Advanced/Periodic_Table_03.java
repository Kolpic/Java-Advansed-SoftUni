package Exercises_Sets_and_Maps_Advanced;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Periodic_Table_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> chemicalElements = new TreeSet<>();

        while (n > 0){
            String[] input = scanner.nextLine().split("\\s+");
            chemicalElements.addAll(Arrays.asList(input));
            n--;
        }
        for (String element : chemicalElements) {
            System.out.print(element + " ");
        }
    }
}
