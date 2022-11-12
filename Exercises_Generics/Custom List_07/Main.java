import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();

        String input = scanner.nextLine();

        while (!input.equals("END")){
            String command = input.split("\\s+")[0];

            switch (command){
                case "Add":
                    customList.add(getElement(input));
                    break;
                case "Remove":
                    customList.remove(getIndex(input));
                    break;
                case "Contains":
                    System.out.println(customList.contains(getElement(input)));
                    break;
                case "Swap":
                    customList.swap(getIndex(input), Integer.parseInt(input.split("\\s+")[2]));
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(getElement(input)));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    customList.forEach();
                    break;

            }

            input = scanner.nextLine();
        }

    }
    public static String getElement(String input){
      return  input.split("\\s+")[1];
    }
    public static int getIndex(String input){
      return Integer.parseInt(input.split("\\s+")[1]);
    }
}
