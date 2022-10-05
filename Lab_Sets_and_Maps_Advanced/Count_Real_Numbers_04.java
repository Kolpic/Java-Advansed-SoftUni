package Lab_Sets_and_Maps_Advanced;

import java.util.*;

public class Count_Real_Numbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double,Integer> valuesAndCount = new LinkedHashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            double number = numbers[i];

            if (!valuesAndCount.containsKey(number)){
                valuesAndCount.putIfAbsent(number,1);
            }else {
                int currentValue = valuesAndCount.get(number);
                valuesAndCount.put(number,currentValue + 1);
            }

        }
        valuesAndCount.forEach((key, value) -> System.out.printf("%.1f -> %d%n", key, value));
    }
}
