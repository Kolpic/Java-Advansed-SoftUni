import java.util.ArrayList;
import java.util.List;

public class Box <T extends Comparable<T>>{

    private List<T> values;

    public Box(){
        this.values = new ArrayList<>();
    }

    public void add(T element){
        values.add(element);
    }

    public void swap(int indexOne,int indexTwo){
        T indexOneValue =  values.get(indexOne);
        T indexTwoValue =  values.get(indexTwo);

        values.remove(indexOne);
        values.add(indexOne, (T) indexTwoValue);
        values.remove(indexTwo);
        values.add(indexTwo, (T) indexOneValue);
    }

    public int compareTo(T toCompare){
        int counter = 0;

        for (T element : values){
            if ( toCompare.compareTo(element) < 0){
                counter++;
            }
        }
        return counter;
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (T element : values) {
            sb.append(String.format("%s: %d%n",element.getClass().getName(),element));
        }
        return sb.toString();
    }
}
