package FirstStepsInCodingExercise;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());

        double cakePrice = 0.2*rent;
        double drinkPrice = cakePrice*0.55;
        double animator = rent /3;

        double totalSum = rent + cakePrice + drinkPrice + animator;

        System.out.printf("%.1f", totalSum);
    }
}
