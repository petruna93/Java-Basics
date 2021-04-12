package FirstStepsInCodingExercise;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfCompany = Integer.parseInt(scanner.nextLine());
        int chefs = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double sum = daysOfCompany*(chefs * (cakes * 45 + waffles*5.8 + pancakes * 3.2));
        double cost = sum/8;
        double finalSum = sum - cost;

        System.out.printf("%.2f", finalSum);

    }
}
