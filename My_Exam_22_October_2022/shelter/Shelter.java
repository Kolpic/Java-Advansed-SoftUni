package shelter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shelter {
    private List<Animal> data;
    private int capacity;

    public Shelter(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public void add(Animal animal) {
        if (data.size() < capacity) {
            data.add(animal);
        }
    }

    public boolean remove(String name) {
        Animal neededAnimal = data.stream()
                .filter(e -> e.getName().equals(name))
                .findFirst()
                .orElse(null);

        if (neededAnimal != null) {
            data.remove(neededAnimal);
            return true;
        } else {
            return false;
        }
    }

    public Animal getAnimal(String name, String caretaker) {
        return data.stream()
                .filter(e -> e.getName().equals(name) && e.getCaretaker().equals(caretaker))
                .findFirst()
                .orElse(null);
    }

    public Animal getOldestAnimal() {
        return Collections.max(data, Comparator.comparingInt(Animal::getAge));
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder("The shelter has the following animals:");

        for (Animal animal : data) {
            sb.append(System.lineSeparator());
            sb.append(animal.getName());
            sb.append(" ");
            sb.append(animal.getCaretaker());
        }

        return sb.toString();
    }
}
