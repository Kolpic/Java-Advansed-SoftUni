package Exercises_Defining_Classes;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostForOneKilometer;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostForOneKilometer) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostForOneKilometer = fuelCostForOneKilometer;
        this.distanceTraveled = 0;
    }

    public double calculateNeededFuel(int distance){
        return distance * this.fuelCostForOneKilometer;
    }

    public boolean hasEnoughFuel(int distance){
        return calculateNeededFuel(distance) <= this.fuelAmount;
    }

    public void drive(int distance){
        if (this.hasEnoughFuel(distance)){
            this.fuelAmount -= calculateNeededFuel(distance);
            this.distanceTraveled += distance;
        }else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

//    public static boolean canTheCarTravelTheGivenDistance
//            (int kmToDrive, double FuelCostFor1km, double fuelAmount, double distanceTraveled,){
//        if (kmToDrive * FuelCostFor1km < fuelAmount){
//            double cost = kmToDrive * FuelCostFor1km;
//            this.setFuelAmount(this.getFuelAmount() - cost);
//            currentCar.setDistanceTraveled(currentCar.getDistanceTraveled() + amountOfKmToBeDriven);
//            return true;
//        }else {
//            return false;
//        }
//    }


    @Override
    public String toString() {
        return String.format("%s %.2f %d",model,fuelAmount,distanceTraveled);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCostForOneKilometer() {
        return fuelCostForOneKilometer;
    }

    public void setFuelCostForOneKilometer(double fuelCostForOneKilometer) {
        this.fuelCostForOneKilometer = fuelCostForOneKilometer;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }
}
