package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceStrawberry = Double.parseDouble(scanner.nextLine());
        double bananasCount = Double.parseDouble(scanner.nextLine());
        double orangesCount = Double.parseDouble(scanner.nextLine());
        double raspberryCount = Double.parseDouble(scanner.nextLine());
        double strawberryCount = Double.parseDouble(scanner.nextLine());

        double priceRaspberry = priceStrawberry * 0.5;
        double priceOrange = priceRaspberry * 0.6;
        double priceBanana = priceRaspberry * 0.2;

        double sum = priceStrawberry * strawberryCount + bananasCount * priceBanana
                + orangesCount * priceOrange + raspberryCount * priceRaspberry;

        System.out.printf("%.2f", sum);
    }
}
