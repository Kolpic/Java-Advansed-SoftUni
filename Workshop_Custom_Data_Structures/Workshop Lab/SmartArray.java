package Workshop_Custom_Data_Structures;

import java.util.function.Consumer;

public class SmartArray {
    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size;
    private int capacity;

    public SmartArray(){
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }

    public void add(int element) {
        if (this.size == this.capacity){
            this.resize();
        }
        this.data[this.size++] = element;
    }

    private void resize(){
        this.capacity *= 2;
        int[] copy = new int[this.capacity];
        for (int i = 0; i < this.data.length; i++) {
            copy[i] = this.data[i];
        }
        this.data = copy;
    }

    public int get(int index){
        checkIndex(index);

        return this.data[index];
    }

    private void checkIndex(int index){
        if (index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException("Index os out of bounds,you typed invalid index");
        }
    }

    private void Shift(int index){
        for (int i = index; i < this.size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[size - 1] = 0;
    }

    private void Shrink(){
        this.capacity /= 2;
        int[] copy = new int[this.capacity];
        for (int i = 0; i < this.size; i++) {
            copy[i] = this.data[i];
        }
        this.data = copy;
    }

    public int remove(int index){
        checkIndex(index);
        int element = this.data[index];
        Shift(index);
        this.size--;
        if (this.size <= this.capacity / 4){
            Shrink();
        }
        return element;
    }

    private void ShiftRight(int index){
        for (int i = this.size -1; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }
    }

    public int add(int index,int element){
        checkIndex(index);
        if (index == this.size - 1){
            add(this.data[this.size -1]);
            this.data[this.size - 2] = element;
        }else {
            this.size++;
            ShiftRight(index);
            this.data[index] = element;
        }
        return element;
    }

    public boolean contains(int element){
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == element){
                return true;
            }
        }
        return false;
    }

    public void forEach(Consumer<Integer> consumer){
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }


}
