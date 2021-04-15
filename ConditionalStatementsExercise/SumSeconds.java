package ConditionalStatementsExercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int sum = first + second + third;
        int hours = sum / 60;
        int min = sum % 60;

        System.out.printf("%d:%02d",hours,min);
    }
}
