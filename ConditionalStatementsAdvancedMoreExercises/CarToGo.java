package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String seasons = scanner.nextLine();
        String classCar = "";
        String car = "";
        double price = 0;

        if (budget<=100){
            classCar="Economy class";
            if (seasons.equals("Summer")){
                car="Cabrio";
                price = 0.35*budget;
            }else {
                car="Jeep";
                price=0.65*budget;
            }
        }else if (budget>100 && budget<=500){
            classCar="Compact class";
            if (seasons.equals("Summer")){
                car="Cabrio";
                price=0.45*budget;
            }else {
                car="Jeep";
                price=0.80*budget;
            }
        }else if (budget>500){
            classCar="Luxury class";
            car="Jeep";
            price=0.9*budget;
        }
        System.out.printf("%s%n", classCar);
        System.out.printf("%s - %.2f", car, price);
    }
}
