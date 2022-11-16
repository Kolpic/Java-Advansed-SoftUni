package Workshop_Custom_Data_Structures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartArray smartArray = new SmartArray();

        for (int i = 1; i < 10; i++) {
            smartArray.add(i);
        }
        int number = 5;
        int numberTwo = 6;

        smartArray.add(number);
        smartArray.add(numberTwo);

       int n =  smartArray.get(5);
        int z = smartArray.get(1);
       int y =  smartArray.get(9);

       smartArray.remove(0);
        smartArray.remove(1);
        smartArray.remove(5);

        smartArray.add(1,10);
        smartArray.add(1,10);
        smartArray.add(9,10);

        smartArray.contains(10);
        smartArray.contains(555);

        smartArray.forEach(System.out::println);

    }
}
