package Lab_Sets_and_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUni_Party_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> guests = new TreeSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")){

            guests.add(input);

            input = scanner.nextLine();
        }

        String command = scanner.nextLine();

        while (!command.equals("END")){

            guests.remove(command);

            command = scanner.nextLine();
        }
        System.out.println(guests.size());
        for (String guest:guests) {
            System.out.println(guest);
        }
    }
}
