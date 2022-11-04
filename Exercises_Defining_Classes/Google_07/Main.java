package Exercises_Defining_Classes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String,Person> peopleData = new HashMap<>();

        while (!command.equals("End")){
            String name = command.split("\\s+")[0];

            if (!peopleData.containsKey(name)){
                peopleData.put(name,new Person());
            }

            switch (command.split("\\s+")[1]){
                case "company":
                    String companyName = command.split("\\s+")[2];
                    String department = command.split("\\s+")[3];
                    double salary = Double.parseDouble(command.split("\\s+")[4]);
                    Company company = new Company(companyName,department,salary);
                    peopleData.get(name).setCompany(company);

                    break;

                case "pokemon":
                    String pokemonName = command.split("\\s+")[2];
                    String pokemonType = command.split("\\s+")[3];
                    Pokemon pokemon = new Pokemon(pokemonName,pokemonType);
                    peopleData.get(name).getPokemon().add(pokemon);

                    break;

                case "parents":
                    String parentName = command.split("\\s+")[2];
                    String parentBirthday = command.split("\\s+")[3];
                    Parents parents = new Parents(parentName,parentBirthday);
                    peopleData.get(name).getParents().add(parents);

                    break;

                case "children":
                    String childrenName = command.split("\\s+")[2];
                    String childrenBirthday =command.split("\\s+")[3];
                    Children children = new Children(childrenName,childrenBirthday);
                    peopleData.get(name).getChildren().add(children);
                    break;

                case "car":
                    String carModel = command.split("\\s+")[2];
                    int carSpeed = Integer.parseInt(command.split("\\s+")[3]);
                    Car car = new Car(carModel,carSpeed);
                    peopleData.get(name).setCar(car);

                    break;

            }

            command = scanner.nextLine();
        }
        String nameToPrint = scanner.nextLine();
        System.out.println(nameToPrint);

        Person personalData = peopleData.get(nameToPrint);
        System.out.println(personalData);

    }
}

