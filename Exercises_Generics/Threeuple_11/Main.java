import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String name = input[0] + " " + input[1];
        String region = input[2];
        String city = input[3];

        Tuple<String,String,String> firstTuple = new Tuple<>(name,region,city);

        input = scanner.nextLine().split("\\s+");
        String firstName = input[0];
        int litersOfBeer = Integer.parseInt(input[1]);
        String state = input[2];

        Tuple<String,Integer,Object> secondTuple =
                new Tuple<>(firstName,litersOfBeer, Tuple.isDrunk(state));

        input = scanner.nextLine().split("\\s+");
        String names = input[0];
        double value = Double.parseDouble(input[1]);
        String bank = input[2];

        Tuple<String,Double,String> thirdTuple = new Tuple<>(names,value,bank);

        System.out.println(firstTuple);
        System.out.println(secondTuple);
        System.out.println(thirdTuple);
    }
}
