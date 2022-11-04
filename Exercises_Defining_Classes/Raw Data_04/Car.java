package Exercises_Defining_Classes;

import java.util.ArrayList;
import java.util.List;

public class Car extends Engine{
    private String model;
    private Engine engine;
    //    private String engine;
    private Cargo cargo;
//    private String cargo;
    private List<Tire> tires;




    public Car(String model, int engineSpeed, int enginePower,
               int cargoWeight, String cargoType, double tire1Pressure,
               int tire1Age, double tire2Pressure, int tire2Age,
               double tire3Pressure, int tire3Age, double tire4Pressure, int tire4Age) {
        super(engineSpeed,enginePower,cargoWeight,cargoType,tire1Pressure,tire1Age,
                tire2Pressure,tire2Age,tire3Pressure,tire3Age,tire4Pressure,tire4Age);
        this.model = model;
        this.setEngineSpeed(engineSpeed);
        this.setEnginePower(enginePower);
        this.setCargoWeight(cargoWeight);
        this.setCargoType(cargoType);
        this.tires = new ArrayList<>();
        this.tires.addAll(tires);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

}
