package ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countStatists = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        double sumForClothes = countStatists * priceClothes;
        double decor = budget * 0.1;
        if (countStatists>150){
            sumForClothes*=0.9;
        }
        double costs = sumForClothes + decor;
        double diff = Math.abs(costs-budget);

        if (costs>budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }else if (costs<=budget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",diff);
        }
    }
}
