package Exercises_Defining_Classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        HashMap<String,Siamese> siameseHashMap = new HashMap<>();
        HashMap<String,Cymric> cymricHashMap = new HashMap<>();
        HashMap<String,StreetExtraordinaire> streetExtraordinaireHashMap = new HashMap<>();

        while (!input.equals("End")){
            String typeOfCat = input.split("\\s+")[0];
            String name = input.split("\\s+")[1];

            switch (typeOfCat){
                case "Siamese":
                    double earSize = Double.parseDouble(input.split("\\s+")[2]);
                    Siamese siamese = new Siamese(name,earSize);
                    siameseHashMap.put(name,siamese);
                    break;

                case "Cymric":
                    double lengthOfTheirFur  = Double.parseDouble(input.split("\\s+")[2]);
                    Cymric cymric = new Cymric(name,lengthOfTheirFur);
                    cymricHashMap.put(name,cymric);
                    break;

                case "StreetExtraordinaire":
                    double meowing  = Double.parseDouble(input.split("\\s+")[2]);
                    StreetExtraordinaire streetExtraordinaire = new StreetExtraordinaire(name,meowing);
                    streetExtraordinaireHashMap.put(name,streetExtraordinaire);
                    break;
            }


            input = scanner.nextLine();
        }

        String catNameToPrint = scanner.nextLine();

        if (siameseHashMap.containsKey(catNameToPrint)){
            System.out.println(siameseHashMap.get(catNameToPrint));
        }else if (cymricHashMap.containsKey(catNameToPrint)){
            System.out.println(cymricHashMap.get(catNameToPrint));
        }else {
            System.out.println(streetExtraordinaireHashMap.get(catNameToPrint));
        }









//        hierarchyMap.entrySet().stream().forEach
//                (e -> System.out.printf("%s %s %.2f",e.getValue().getTypeOfCat(),
//                        e.getKey(),
//                        e.getValue().getInformationAboutTheCat()));
    }
}
