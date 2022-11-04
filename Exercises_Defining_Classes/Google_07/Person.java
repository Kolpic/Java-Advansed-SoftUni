package Exercises_Defining_Classes;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Company company;
    private List<Pokemon> pokemon;
    private List<Parents> parents;
    private List<Children> children;
    private Car car;

    public Person(){
        // company = null
        //car = null
        this.pokemon = new ArrayList<>(); //за да не са null списъците, а да са си празни
        this.parents = new ArrayList<>(); // иначе, когато имаме null в списъка, не можем да дадем
        this.children = new ArrayList<>(); // команда add, листа не е запазил необходимата памет в компютъра
    }

    public Person(Company company, List<Pokemon> pokemon,
                  List<Parents> parents, List<Children> children, Car car) {
        this.company = company;
        this.pokemon = pokemon;
        this.parents = parents;
        this.children = children;
        this.car = car;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Company:").append("\n");
        if (company != null){
            stringBuilder.append(company).append("\n");
        }
        stringBuilder.append("Car:").append("\n");
        if (car != null){
            stringBuilder.append(car).append("\n");
        }
        stringBuilder.append("Pokemon:").append("\n");

        if (pokemon.size() != 0){
            for(Pokemon pokemo : pokemon){
                stringBuilder.append(pokemo).append("\n");
            }
        }
        stringBuilder.append("Parents:").append("\n");

        if (parents.size() != 0){
            for(Parents parent : parents){
                stringBuilder.append(parent).append("\n");
            }
        }
        stringBuilder.append("Children:").append("\n");

        if (children.size() != 0){
            for(Children childre : children){
                stringBuilder.append(childre).append("\n");
            }
        }
        return stringBuilder.toString();
    }


    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public List<Parents> getParents() {
        return parents;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
