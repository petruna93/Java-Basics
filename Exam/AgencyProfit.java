package Exam;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String companyName = scanner.nextLine();
        int countTicketAdults = Integer.parseInt(scanner.nextLine());
        int countTicketChildren = Integer.parseInt(scanner.nextLine());
        double priceForAdults = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double priceChildren = priceForAdults*0.30;

        double finalPriceAdult = priceForAdults+tax;
        double finalPriceChildren = priceChildren+tax;

        double totalSum = countTicketAdults*finalPriceAdult + countTicketChildren*finalPriceChildren;
        double profit = totalSum*0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",companyName,profit);
    }
}
