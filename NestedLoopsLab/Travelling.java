package NestedLoopsLab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String destination = input;
            double minBudget = Double.parseDouble(scanner.nextLine());
            while (minBudget > 0) {
                double money = Double.parseDouble(scanner.nextLine());
                minBudget -= money;

                if (minBudget <= 0) {
                    System.out.printf("Going to %s!%n", destination);
                    break;
                }
            }
            input = scanner.nextLine();
        }
    }
}
