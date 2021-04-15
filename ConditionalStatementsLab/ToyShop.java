package ConditionalStatementsLab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int carsCount = Integer.parseInt(scanner.nextLine());
        int counts = puzzlesCount + dollsCount + bearsCount + minionsCount + carsCount;
        double sum = 0;

        sum = puzzlesCount*2.6 + dollsCount*3
                + bearsCount*4.10 + minionsCount*8.2
                +carsCount*2;
        if (counts>=50){
            sum *= 0.75;
        }
        sum*=0.9;
        double diff = Math.abs(tripPrice-sum);
        if (tripPrice<=sum){
            System.out.printf("Yes! %.2f lv left.", diff);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
