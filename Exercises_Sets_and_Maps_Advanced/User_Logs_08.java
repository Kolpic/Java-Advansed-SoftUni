package Exercises_Sets_and_Maps_Advanced;

import java.util.*;

public class User_Logs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String,Map<String,Integer>> map = new TreeMap<>();

        while (!input.equals("end")){
            String[] inputArr = input.split("\\s+");
            String name = inputArr[2].substring(5);
            String IP = inputArr[0].substring(3);

            if (!map.containsKey(name)){
                map.put(name,new LinkedHashMap<>());
                map.get(name).put(IP,1);
            } else if (!map.get(name).containsKey(IP)){
                map.get(name).put(IP,1);
            }else {
                map.get(name).put(IP,map.get(name).get(IP) + 1);
            }


            input = scanner.nextLine();
        }
        for (var entry : map.entrySet()) {
            System.out.printf("%s:%n", entry.getKey());
            List<String> ipAddresses = new ArrayList<>();
            entry.getValue().forEach((key, value) -> ipAddresses.add(key + " => " + value));
            System.out.println(String.join(", ", ipAddresses) + ".");
        }
    }
}
