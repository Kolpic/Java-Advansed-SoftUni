import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<String> box = new Box<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            box.add(input);
        }

        int[] command = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        box.swap(command[0],command[1]);

        System.out.println(box);
    }
}
