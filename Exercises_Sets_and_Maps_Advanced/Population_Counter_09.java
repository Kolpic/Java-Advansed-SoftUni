package Exercises_Sets_and_Maps_Advanced;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Population_Counter_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String,Map<String,Integer>> map = new HashMap<>();

        while (!input.equals("report")){
            String city = input.split("\\|")[0];
            String country = input.split("\\|")[1];
            int population = Integer.parseInt(input.split("\\|")[2]);

            if(!map.containsKey(country)){
                map.put(country,new LinkedHashMap<>());
                map.get(country).put(city,population);
            }
            if (!map.get(country).containsKey(city)){
                map.get(country).put(city,population);
            }


            input = scanner.nextLine();
        }

        map.entrySet().stream()
                .sorted((e1, e2) -> getTotalPopulation(e2.getValue()).compareTo(getTotalPopulation(e1.getValue())))
                .forEach(entry -> {
                    System.out.printf("%s (total population: %d)%n", entry.getKey(), getTotalPopulation(entry.getValue()));
                    entry.getValue().entrySet().stream()
                            .sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
                            .forEach(city -> System.out.printf("=>%s: %d%n", city.getKey(), city.getValue()));
                });
    }
    private static Integer getTotalPopulation(Map<String, Integer> cityPopulation) {
        return cityPopulation.values().stream().reduce(Integer::sum).orElse(0);
    }
}
