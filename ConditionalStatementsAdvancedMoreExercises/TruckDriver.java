package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kilometers = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (season.equals("Summer")){
            if (kilometers<=5000){
                price = 0.9;
            }else if (kilometers>5000 && kilometers<=10000){
                price = 1.1;
            }else {
                price = 1.45;
            }
        }else if (season.equals("Winter")){
            if (kilometers<=5000){
                price = 1.05;
            }else if (kilometers>5000 && kilometers<=10000){
                price = 1.25;
            }else {
                price = 1.45;
            }
        }else {
            if (kilometers<=5000){
                price = 0.75;
            }else if (kilometers>5000 && kilometers<=10000){
                price = 0.95;
            }else {
                price = 1.45;
            }
        }
        double salary = 0.9 * (price*kilometers*4);

        System.out.printf("%.2f",salary);
    }
}
