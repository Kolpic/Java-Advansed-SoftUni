import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer[] arr = ArrayCreator.create(Integer.class,5,13);

        String[] strings = ArrayCreator.create(5, "Bismut");

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        for(String i : strings){
            System.out.print(i + " ");
        }

    }
}
