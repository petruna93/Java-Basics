package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String typeHoliday = "";
        String destination = "";

        if (budget<=100){
           destination = "Bulgaria";
           if (season.equals("summer")){
               typeHoliday = "Camp";
               budget*=0.3;
           }else{
               typeHoliday="Hotel";
               budget*=0.7;
           }
        }else if (budget<=1000){
            destination="Balkans";
            if (season.equals("summer")){
                typeHoliday = "Camp";
                budget*=0.4;
            }else{
                typeHoliday="Hotel";
                budget*=0.8;
            }
        }else if (budget>1000){
            destination="Europe";
            typeHoliday = "Hotel";
            budget*=0.9;
        }
        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f", typeHoliday,budget);


    }
}
