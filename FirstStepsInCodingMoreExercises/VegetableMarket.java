package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double priceVegetables = Double.parseDouble(scanner.nextLine());
        Double priceFruits = Double.parseDouble(scanner.nextLine());
        int kiloVegetables = Integer.parseInt(scanner.nextLine());
        int kiloFruits = Integer.parseInt(scanner.nextLine());

        double sumInLeva = priceVegetables*kiloVegetables + priceFruits*kiloFruits;
        double euroSum = sumInLeva / 1.94;

        System.out.printf("%.2f", euroSum);
    }
}
