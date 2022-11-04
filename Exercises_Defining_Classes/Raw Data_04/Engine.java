package Exercises_Defining_Classes;

public class Engine extends Cargo{
    private int engineSpeed;
    private int enginePower;

    public Engine(int engineSpeed, int enginePower,
                  int cargoWeight, String cargoType,double tire1Pressure,int Tire1Age,
                  double tire2Pressure,int Tire2Age,double tire3Pressure,int Tire3Age,
                  double tire4Pressure,int Tire4Age) {
        super(cargoWeight,cargoType, tire1Pressure,Tire1Age,tire2Pressure,Tire2Age,
                tire3Pressure,Tire3Age,tire4Pressure,Tire4Age);
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }

    public int getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(int engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}
