package dealership;

import java.util.*;

public class Dealership {
    public String name;
    public int capacity;
    public Collection<Car> data;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (this.data.size() < capacity) {
            this.data.add(car);
        }
    }

    public boolean buy(String manufacturer, String model) {
        Car neededCar = data.stream()
                .filter(car -> car.getManufacturer().equals(manufacturer) &&
                        car.getModel().equals(model))
                .findFirst()
                .orElse(null);

        if (neededCar != null) {
            data.remove(neededCar);
            return true;
        } else {
            return false;
        }
    }

    public Car getLatestCar() {

        return Collections.max(data, Comparator.comparingInt(Car::getYear));

    }

    public Car getCar(String manufacturer, String model) {
        return data.stream()
                .filter(car -> car.getManufacturer().equals(manufacturer) &&
                        car.getModel().equals(model))
                .findFirst()
                .orElse(null);
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The cars are in a car dealership %s:",name));

        for (Car car : data) {
            sb.append(System.lineSeparator());
            sb.append(car);
        }

        return sb.toString();
    }

}
