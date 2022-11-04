package Exercises_Defining_Classes;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carsList = new LinkedList<>();

        while (n-- > 0){
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            double tire1Pressure = Double.parseDouble(input[5]);
            int Tire1Age = Integer.parseInt(input[6]);
            double tire2Pressure = Double.parseDouble(input[7]);
            int Tire2Age = Integer.parseInt(input[8]);
            double tire3Pressure = Double.parseDouble(input[9]);
            int Tire3Age = Integer.parseInt(input[10]);
            double tire4Pressure = Double.parseDouble(input[11]);
            int Tire4Age = Integer.parseInt(input[12]);

            Car car = new Car(model,engineSpeed,enginePower,cargoWeight,cargoType,
                    tire1Pressure,Tire1Age,tire2Pressure,Tire2Age,tire3Pressure,
                    Tire3Age,tire4Pressure,Tire4Age);
            carsList.add(car);

        }

        String command = scanner.nextLine();
        Predicate<Tire> tiresPressure = e -> e.getTire1Pressure() < 1 && e.getTire2Pressure() < 1
                && e.getTire3Pressure() < 1 && e.getTire4Pressure() < 1;


        if (command.equals("fragile")){
            carsList.stream()
                    .filter(car -> car.getCargoType().equals("fragile"))
                    .filter(car -> car.getTires().stream().anyMatch(tiresPressure))
                    .forEach(s -> System.out.println(s.getModel()));
        }else if (command.equals("flamable")){
            carsList.stream()
                    .filter(car -> car.getCargoType().equals("flamable"))
                    .filter(car -> car.getEnginePower() > 250)
                    .forEach(s -> System.out.println(s.getModel()));
        }
    }
}
//tire -> tire.getTire1Pressure() < 1 &&
//        tire.getTire2Pressure() < 1 && tire.getTire3Pressure() < 1
//        && tire.getTire4Pressure() < 1