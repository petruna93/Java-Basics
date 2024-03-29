package WhileLoopLab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0.0;

        while (!input.equals("NoMoreMoney")){
            double money = Double.parseDouble(input);
            if (money<0){
                System.out.println("Invalid operation!");
                break;
            }
            sum+=money;
            System.out.printf("Increase: %.2f%n", money);

            input=scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
