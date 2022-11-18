package vetClinic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clinic {
        private int capacity;
        private List<Pet> petsList;


        public Clinic(int capacity) {
            this.capacity = capacity;
            this.petsList = new ArrayList<>();
        }

        public void add(Pet pet) {
            if (petsList.size() < capacity) {
                petsList.add(pet);
            }
        }

        public boolean remove(String pet) {
            return petsList.removeIf(p -> p.getName().equals(pet));
        }

        public Pet getPet(String namePet, String owner) {
            return petsList.stream()
                    .filter(p -> p.getName().equals(namePet) && p.getOwner().equals(owner))
                    .findAny()
                    .orElse(null);
        }

        public Pet getOldestPet() {
            return Collections.max(petsList, Comparator.comparingInt(Pet::getAge));
        }

        public int getCount() {
            return petsList.size();
        }

        public String getStatistics() {
            StringBuilder sb = new StringBuilder("The clinic has the following patients:");
            for (Pet pet : petsList) {
                sb.append(System.lineSeparator())
                        .append(pet.getName())
                        .append(" ")
                        .append(pet.getOwner());
            }
            return sb.toString();
        }

        public List<Pet> getPetsList() {
            return petsList;
        }

        public void setPetsList(List<Pet> petsList) {
            this.petsList = petsList;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

}
