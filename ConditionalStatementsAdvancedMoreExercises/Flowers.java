package ConditionalStatementsAdvancedMoreExercises;

import javax.swing.*;
import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String seasons = scanner.nextLine();
        String isHoliday = scanner.nextLine();

        double priceChrysanthemums = 0;
        double priceRoses = 0;
        double priceTulips = 0;

        if (seasons.equals("Spring") || seasons.equals("Summer") ){
            priceChrysanthemums=2.0;
            priceRoses=4.10;
            priceTulips=2.50;
        }else {
            priceChrysanthemums=3.75;
            priceRoses=4.50;
            priceTulips=4.15;
        }

        if (isHoliday.equals("Y")){
            priceChrysanthemums*=1.15;
            priceRoses*=1.15;
            priceTulips*=1.15;
        }
        double sum = priceChrysanthemums * chrysanthemums + priceRoses*roses
                +priceTulips*tulips;

        if (tulips>7 && seasons.equals("Spring")){
            sum*=0.95;
        }
        if (roses>=10 && seasons.equals("Winter")){
            sum*=0.90;
        }
        int flowers = tulips+roses+chrysanthemums;
        if (flowers>20){
            sum*=0.80;
        }
        System.out.printf("%.2f", sum+2);

    }
}
