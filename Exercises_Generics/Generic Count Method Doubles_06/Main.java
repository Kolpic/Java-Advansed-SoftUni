import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<Double> box = new Box<>();

        for (int i = 0; i < n; i++) {
            Double input = Double.valueOf(scanner.nextLine());
            box.add(input);
        }

        Double command = Double.valueOf(scanner.nextLine());


        System.out.println(box.compareTo(command));
    }
}
