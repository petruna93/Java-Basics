package WhileLoopMoreExercises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = Integer.parseInt(scanner.nextLine());
        int cash = 0;
        int countCash = 0;
        int bank = 0;
        int countBank = 0;
        int money = 0;

        String input = scanner.nextLine();
        int count = 0;

        while (!input.equals("End")) {
            int prices = Integer.parseInt(input);
            count++;
            if (count % 2 != 0) {
                if (prices > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cash+=prices;
                    countCash++;

                }
            } else {
                if (prices < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    bank+=prices;
                    countBank++;

                }
            }
             money = cash + bank;
            if (money>=sum){
                System.out.printf("Average CS: %.2f%n", cash/(countCash*1.0));
                System.out.printf("Average CC: %.2f", bank/(countBank*1.0));
                return;
            }


            input = scanner.nextLine();
        }
        if (money<sum){
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
