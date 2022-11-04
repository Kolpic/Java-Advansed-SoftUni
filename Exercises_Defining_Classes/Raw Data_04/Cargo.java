package Exercises_Defining_Classes;

public class Cargo extends Tire{
    private int cargoWeight;
    private String cargoType;

    public Cargo(int cargoWeight, String cargoType,double tire1Pressure,int Tire1Age,
                 double tire2Pressure,int Tire2Age,double tire3Pressure,int Tire3Age,
                 double tire4Pressure,int Tire4Age) {
        super(tire1Pressure,Tire1Age,tire2Pressure,Tire2Age,tire3Pressure,Tire3Age,tire4Pressure,Tire4Age);
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }
}
