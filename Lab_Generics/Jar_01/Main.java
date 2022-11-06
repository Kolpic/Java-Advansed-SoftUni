import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jar<String> pickleJar = new Jar<String>();

        pickleJar.add("me");
        pickleJar.add("you");
        pickleJar.add("they");

        pickleJar.remove();

    }
}
