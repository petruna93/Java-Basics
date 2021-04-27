package WhileLoopLabExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());
        int dayCounter = 0;
        int spendCounter = 0;

        while (ownedMoney<neededMoney) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            dayCounter++;

            if (action.equals("spend")) {
                ownedMoney=Math.max(0,ownedMoney-money);
                spendCounter++;
                if (spendCounter >4) {
                    System.out.println("You can't save the money.");
                    System.out.printf("%d", dayCounter);
                    return;
                }
            } else if (action.equals("save")) {
                spendCounter=0;
                ownedMoney += money;
            }
        }
        System.out.printf("You saved the money for %d days.", dayCounter);
    }
}
