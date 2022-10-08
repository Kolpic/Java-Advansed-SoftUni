package Lab_Sets_and_Maps_Advanced;

import java.util.*;

public class Cities_by_Continent_and_Country_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Map<String,Map<String, List<String>>> cCS = new LinkedHashMap<>();

        while (count > 0){
            String input = scanner.nextLine();
            String continent = input.split("\\s+")[0];
            String country = input.split("\\s+")[1];
            String city = input.split("\\s+")[2];

            if (!cCS.containsKey(continent)){
                cCS.put(continent,new LinkedHashMap<>());
                cCS.get(continent).put(country,new ArrayList<>());
                cCS.get(continent).get(country).add(city);
            }else {
                if (!cCS.get(continent).containsKey(country)){
                    cCS.get(continent).put(country,new ArrayList<>());
                    cCS.get(continent).get(country).add(city);
                }else {
                    cCS.get(continent).get(country).add(city);
                }
            }

            count--;
        }
        cCS.entrySet().stream().forEach
                (e->{
                    System.out.println(e.getKey() + ":");
                    e.getValue().entrySet().stream().forEach(entry -> {
                        String cities = String.join(", ",entry.getValue());
                        System.out.printf("%s -> %s%n",entry.getKey(),cities);
                    });
        });
    }
}
