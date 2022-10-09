package Exercises_Sets_and_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique_Usernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> set = new LinkedHashSet<>();

        while (n > 0){
            String input = scanner.nextLine();
            set.add(input);

            n--;
        }
        for (String name :set) {
            System.out.println(name);
        }
    }
}
