import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = List.of(13,42,69,73);

        System.out.println(ListUtils.getMax(list));
        System.out.println(ListUtils.getMin(list));
    }
}
