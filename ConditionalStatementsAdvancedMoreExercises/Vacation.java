package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget =Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        String location = "";
        String places = "";

        if (budget<=1000){
            places = "Camp";
            if (season.equals("Summer")){
                location = "Alaska";
                price=0.65*budget;
            }else {
                location = "Morocco";
                price=0.45*budget;
            }
        }else if (budget>1000 && budget<=3000){
           places = "Hut";
            if (season.equals("Summer")){
                location = "Alaska";
                price=0.8*budget;
            }else {
                location = "Morocco";
                price=0.6*budget;
            }
        }else if (budget>3000){
            places = "Hotel";
            if (season.equals("Summer")){
                location = "Alaska";
                price=0.9*budget;
            }else {
                location = "Morocco";
                price=0.9*budget;
            }
        }
        System.out.printf("%s - %s - %.2f", location,places,price);
    }
}
