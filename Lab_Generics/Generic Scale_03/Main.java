import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 15;
        int b = 10;

        Scale<Integer> scale = new Scale<>(a,b);

        System.out.println(scale.getHeavier());

    }
}
