package Exercises_Defining_Classes;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        while (n > 0){
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name,age);
            people.add(person);

            n--;
        }
        people.stream()
                .filter(person -> person.getAge() > 30)
                .sorted((left,right) -> left.getName().compareTo(right.getName()))
                .forEach(person -> System.out.println(person.getName() + " - " + person.getAge()));
    }
}
