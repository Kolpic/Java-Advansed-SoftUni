package Lab_Sets_and_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Parking_Lot_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String carNumberString = scanner.nextLine();

        Set<String> cars = new LinkedHashSet<>();

        while (!carNumberString.equals("END")){

            String[] carNumber = carNumberString.split(", ");

            switch (carNumber[0]){
                case "IN":
                    cars.add(carNumber[1]);
                    break;

                case "OUT":
                    cars.remove(carNumber[1]);
                    break;
            }

            carNumberString = scanner.nextLine();
        }
        if (cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String currentCar:cars) {
                System.out.println(currentCar);
            }
        }

    }
}
