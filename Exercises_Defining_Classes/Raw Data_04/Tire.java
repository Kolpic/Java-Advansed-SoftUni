package Exercises_Defining_Classes;

import java.util.ArrayList;
import java.util.List;

public class Tire {
    public double tire1Pressure;
    public int Tire1Age;
    private double tire2Pressure;
    private int Tire2Age;
    private double tire3Pressure;
    private int Tire3Age;
    private double tire4Pressure;
    private int Tire4Age;

    public Tire(double tire1Pressure, int tire1Age, double tire2Pressure,
                int tire2Age, double tire3Pressure, int tire3Age,
                double tire4Pressure, int tire4Age) {
        this.tire1Pressure = tire1Pressure;
        Tire1Age = tire1Age;
        this.tire2Pressure = tire2Pressure;
        Tire2Age = tire2Age;
        this.tire3Pressure = tire3Pressure;
        Tire3Age = tire3Age;
        this.tire4Pressure = tire4Pressure;
        Tire4Age = tire4Age;
    }

    public double getTire1Pressure() {
        return tire1Pressure;
    }

    public void setTire1Pressure(double tire1Pressure) {
        this.tire1Pressure = tire1Pressure;
    }

    public int getTire1Age() {
        return Tire1Age;
    }

    public void setTire1Age(int tire1Age) {
        Tire1Age = tire1Age;
    }

    public double getTire2Pressure() {
        return tire2Pressure;
    }

    public void setTire2Pressure(double tire2Pressure) {
        this.tire2Pressure = tire2Pressure;
    }

    public int getTire2Age() {
        return Tire2Age;
    }

    public void setTire2Age(int tire2Age) {
        Tire2Age = tire2Age;
    }

    public double getTire3Pressure() {
        return tire3Pressure;
    }

    public void setTire3Pressure(double tire3Pressure) {
        this.tire3Pressure = tire3Pressure;
    }

    public int getTire3Age() {
        return Tire3Age;
    }

    public void setTire3Age(int tire3Age) {
        Tire3Age = tire3Age;
    }

    public double getTire4Pressure() {
        return tire4Pressure;
    }

    public void setTire4Pressure(double tire4Pressure) {
        this.tire4Pressure = tire4Pressure;
    }

    public int getTire4Age() {
        return Tire4Age;
    }

    public void setTire4Age(int tire4Age) {
        Tire4Age = tire4Age;
    }
}
