package FirstStepsInCodingLab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());

        double sumWithoutDiscount = squareMeters * 7.61;
        double discount = 0.18 * sumWithoutDiscount;
        double finalSum = sumWithoutDiscount - discount;

        System.out.printf("The final price is: %.2f lv.%n", finalSum);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
