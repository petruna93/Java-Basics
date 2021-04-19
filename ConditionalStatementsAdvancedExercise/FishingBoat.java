package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int group = Integer.parseInt(scanner.nextLine());
        double priceShip = 0;
        if (season.equals("Spring")){
            priceShip = 3000.00;
        }else if (season.equals("Summer") || season.equals("Autumn")){
            priceShip = 4200;
        }else {
           priceShip = 2600;
        }
        if (group<=6){
            priceShip*= 0.9;
        }else if (group>6 && group<=11){
            priceShip*=0.85;
        }else if (group>12){
            priceShip*=0.75;
        }
        if (group%2==0 && !season.equals("Autumn")){
            priceShip*=0.95;
        }
        if (budget>=priceShip){
            System.out.printf("Yes! You have %.2f leva left.", budget-priceShip);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", priceShip-budget);
        }
    }
}
