import java.util.ArrayList;
import java.util.Collections;
import java.util.IllegalFormatException;
import java.util.List;

public class CustomList<T extends  Comparable<T>>{
    private List<T> list;

    public CustomList(){
        this.list = new ArrayList<>();
    }

    public void add(T element){
        list.add(element);
    }

    public T remove(int index){
       if (checkIndex(index)){
           T removed =  list.remove(index);
           return removed ;
       }else {
           throw new IllegalArgumentException("INVALID INDEX");
       }
    }

    private boolean checkIndex(int index) {
      return index >= 0 && index < list.size();
    }


    public boolean contains(T element){
        if (list.contains(element)){
            return true;
        }
        return false;
    }

    public void swap(int indexOne,int indexTwo){
        if (checkIndex(indexOne) && checkIndex(indexTwo)){
//            Collections.swap(list,indexOne,indexTwo);
            T indexOneValue = list.get(indexOne);
            T indexTwoValue = list.get(indexTwo);

            list.remove(indexOne);
            list.add(indexOne,indexTwoValue);
            list.remove(indexTwo);
            list.add(indexTwo,indexOneValue);
        }else {
            throw new IllegalArgumentException("INVALID INDEX");
        }
    }

    public int countGreaterThan(T element){
        int counter = 0;
        for (T elements : list){
            if (element.compareTo(elements) < 0){
                counter++;
            }
        }
        return counter;
    }

    public T getMax(){
        return  Collections.max(list);
    }

    public T getMin(){
        return  Collections.min(list);
    }

    public void forEach(){
        for (T element : list){
            System.out.println(element);
        }
    }

    public int size(){
        return list.size();
    }

    public T get(int index){
        return list.get(index);
    }
}
