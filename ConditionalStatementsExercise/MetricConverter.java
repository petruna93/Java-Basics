package ConditionalStatementsExercise;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        if (input.equals("mm") && output.equals("m")) {
            System.out.printf("%.3f", num/1000);
        } else if (input.equals("mm") && output.equals("cm")) {
            System.out.printf("%.3f", num/10);
        } else if (input.equals("m") && output.equals("cm")) {
            System.out.printf("%.3f", num*100);
        } else if (input.equals("m") && output.equals("mm")) {
            System.out.printf("%.3f", num*1000);
        } else if (input.equals("cm") && output.equals("m")) {
            System.out.printf("%.3f",num/100);
        } else if (input.equals("cm") && output.equals("mm")) {
            System.out.printf("%.3f", num *10);
        }
    }
}
