package Exercises_Defining_Classes;

public class StreetExtraordinaire {
    private String name;
    private double meowing;

    public StreetExtraordinaire(String name, double meowing) {
        this.name = name;
        this.meowing = meowing;
    }

    @Override
    public String toString() {
        return String.format("StreetExtraordinaire %s %.2f",name,meowing);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMeowing() {
        return meowing;
    }

    public void setMeowing(double meowing) {
        this.meowing = meowing;
    }
}
