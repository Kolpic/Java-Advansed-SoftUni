package Lab_Sets_and_Maps_Advanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Product_Shop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Map<String, Double>> shopProductAndPrice = new TreeMap<>();

        while (!command.equals("Revision")) {
            String shop = command.split(",\\s+")[0];
            String product = command.split(",\\s+")[1];
            Double price = Double.valueOf(command.split(",\\s+")[2]);

            if (!shopProductAndPrice.containsKey(shop)) {
                shopProductAndPrice.put(shop, new LinkedHashMap<>());
                shopProductAndPrice.get(shop).put(product, price);
            } else {
                if (!shopProductAndPrice.get(shop).containsKey(product)) {
                    shopProductAndPrice.get(shop).put(product, price);
                }

            }
            command = scanner.nextLine();
        }

        shopProductAndPrice.entrySet().stream().forEach
                (e -> {
                    System.out.println(e.getKey() + "->");
                        e.getValue().entrySet().stream()
                                .forEach(entry -> {
                                    System.out.printf("Product: %s, Price: %.1f%n",
                                            entry.getKey(),entry.getValue());
                                });
                });
    }
}
