package Lab_Sets_and_Maps_Advanced;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Academy_Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Map<String,Double> studentAndGrade = new TreeMap<>();

        while (number > 0){
            String studentName = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            double sum = 0;
            double average = 0;

            for (int i = 0; i < grades.length; i++) {
                sum += grades[i];
            }
            average = sum / grades.length;

            if (!studentAndGrade.containsKey(studentName)){
                studentAndGrade.put(studentName,average);
            }

            number--;
        }
        DecimalFormat df = new DecimalFormat("0.##########");

        studentAndGrade.entrySet().forEach(entry -> {
            System.out.printf("%s is graduated with %s%n",entry.getKey(),fmt(entry.getValue()));
        });
    }
    public static String fmt(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }
}


