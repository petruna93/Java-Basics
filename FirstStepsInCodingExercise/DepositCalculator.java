package FirstStepsInCodingExercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double depositSum = Double.parseDouble(scanner.nextLine());
         int months = Integer.parseInt(scanner.nextLine());
         double interestPerYear = Double.parseDouble(scanner.nextLine());

         double interest = (depositSum * interestPerYear)/100;
         double interestPerMonths = interest/12;
         double finalInterest = interestPerMonths * months;
         double sum = depositSum + finalInterest;

        System.out.printf("%.2f", sum);
    }
}
