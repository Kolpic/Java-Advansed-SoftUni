package Exercises_Defining_Classes;

import java.util.*;

//import static Exercises_Defining_Classes.Car.canTheCarTravelTheGivenDistance;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Car> carsMap = new LinkedHashMap<>();

        while (n-- > 0){
            String[] inputData = scanner.nextLine().split("\\s+");
            String model = inputData[0];
            double fuelAmount = Double.parseDouble(inputData[1]);
            double fuelCostForOneKilometer = Double.parseDouble(inputData[2]);

            Car car = new Car(model,fuelAmount,fuelCostForOneKilometer);
            carsMap.put(model,car);
        }

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] inputData = command.split("\\s+");
            String model = inputData[1];
            int amountOfKmToBeDriven = Integer.parseInt(inputData[2]);

            Car currentCar = carsMap.get(model);
            currentCar.drive(amountOfKmToBeDriven);
            
            command = scanner.nextLine();
        }
        carsMap.values().forEach(System.out::println);
//        carsMap.entrySet().stream().forEach
//                (e -> System.out.printf("%s %.2f %.0f%n",
//                        e.getKey(),e.getValue().getFuelAmount(),e.getValue().getDistanceTraveled()));
    }

}
