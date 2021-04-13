package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double bonitoKilo  = Double.parseDouble(scanner.nextLine());
        double horseMackerelKilo  = Double.parseDouble(scanner.nextLine());
        double musselsKilo  = Double.parseDouble(scanner.nextLine());

        double bonitoPrice = 1.6*mackerelPrice;
        double horseMackerelPrice = 1.8 * spratPrice;

        double sum = bonitoKilo * bonitoPrice + horseMackerelKilo * horseMackerelPrice
                + musselsKilo*7.5;
        System.out.printf("%.2f", sum);
    }
}
