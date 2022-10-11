package Exercises_Sets_and_Maps_Advanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Fix_Emails_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String mail = scanner.nextLine();

        Map<String,String> nameAndEmail = new LinkedHashMap<>();

        while (!name.equals("stop")){
            if (!mail.contains(".us") && !mail.contains(".uk") && !mail.contains(".com")){
                nameAndEmail.put(name,mail);
            }

            name = scanner.nextLine();
            if (name.equals("stop")){
                break;
            }

            mail = scanner.nextLine();
        }

        nameAndEmail.entrySet().forEach(e ->{
            System.out.println(e.getKey() + " -> " + e.getValue());
        });
    }
}
