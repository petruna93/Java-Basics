package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String categoryTicket = scanner.nextLine();
        int countPeople = Integer.parseInt(scanner.nextLine());
        double priceTicket = 0;

        if (categoryTicket.equals("VIP")){
         priceTicket = 499.99;
        }else if (categoryTicket.equals("Normal")){
         priceTicket = 249.99;
        }
        double needSum = priceTicket * countPeople;

        if (countPeople>=1 && countPeople<=4){
           budget *= 0.25;
        }else if (countPeople>=5 && countPeople<=9){
            budget *= 0.40;
        }else if (countPeople>=10 && countPeople<=24){
            budget *= 0.50;
        }else if (countPeople>=25 && countPeople<=49){
            budget *= 0.60;
        }else if (countPeople>=50){
            budget *= 0.75;
        }

        double diff = Math.abs(budget-needSum);

        if (budget>=needSum){
            System.out.printf("Yes! You have %.2f leva left.",diff);
        }else if (budget<needSum){
            System.out.printf("Not enough money! You need %.2f leva.",diff);
        }
    }
}
