package Exercises_Sets_and_Maps_Advanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String,String> nameAndPhone = new HashMap<>();

        while (!input.equals("search")){
            String currentName = input.split("-")[0];
            String currentNumber = input.split("-")[1];

            if (!nameAndPhone.containsKey(currentName)){
                nameAndPhone.put(currentName,currentNumber);
            }else {
                nameAndPhone.put(currentName,currentNumber);
            }

            input = scanner.nextLine();
        }

        String name = scanner.nextLine();

        while (!name.equals("stop")){
            if (nameAndPhone.containsKey(name)){
                System.out.println(name + " -> " + nameAndPhone.get(name));
            }else {
                System.out.println("Contact " + name + " does not exist.");
            }

            name = scanner.nextLine();
        }
    }
}
