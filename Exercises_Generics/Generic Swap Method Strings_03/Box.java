import java.util.ArrayList;
import java.util.List;

public class Box <T>{

    private List<T> values;

    public Box(){
        this.values = new ArrayList<>();
    }

    public void add(T element){
        values.add(element);
    }

    public void swap(int indexOne,int indexTwo){
        String indexOneValue = (String) values.get(indexOne);
        String indexTwoValue = (String) values.get(indexTwo);

        values.remove(indexOne);
        values.add(indexOne, (T) indexTwoValue);
        values.remove(indexTwo);
        values.add(indexTwo, (T) indexOneValue);
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (T element : values) {
            sb.append(String.format("%s: %s%n",element.getClass().getName(),element.toString()));
        }
        return sb.toString();
    }
}
