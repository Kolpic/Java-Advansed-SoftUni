package Exercises_Defining_Classes;

public class Cymric {
    private String name;
    private double lengthOfTheirFur;

    public Cymric(String name, double lengthOfTheirFur) {
        this.name = name;
        this.lengthOfTheirFur = lengthOfTheirFur;
    }

    @Override
    public String toString() {
        return String.format("Cymric %s %.2f",name,lengthOfTheirFur);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLengthOfTheirFur() {
        return lengthOfTheirFur;
    }

    public void setLengthOfTheirFur(double lengthOfTheirFur) {
        this.lengthOfTheirFur = lengthOfTheirFur;
    }
}
