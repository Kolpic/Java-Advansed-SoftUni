package Lab_Sets_and_Maps_Advanced;

import java.util.*;
import java.util.stream.Collectors;

public class Average_Students_Grades_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentAndGrades = new TreeMap<>();

        while (countOfStudents > 0) {
            String[] currentStudent = scanner.nextLine().split("\\s+");

            String name = currentStudent[0];
            double grade = Double.parseDouble(currentStudent[1]);

            if (!studentAndGrades.containsKey(name)) {
                studentAndGrades.put(name, new ArrayList<Double>());
                studentAndGrades.get(name).add(grade);
            } else {
                studentAndGrades.get(name).add(grade);
            }

            countOfStudents--;
        }

        for (Map.Entry<String, List<Double>> entry : studentAndGrades.entrySet()) {
            double avgGradeSum = 0;
            for (Double grade : entry.getValue()) {
                avgGradeSum += grade;
            }

            System.out.printf("%s -> %s (avg: %.2f)%n",
                    entry.getKey(),
                    entry.getValue().stream()
                            .map(d -> String.format("%.2f", d))
                            .collect(Collectors.joining(" ")),
                    avgGradeSum / entry.getValue().size()
            );
        }
    }
}
