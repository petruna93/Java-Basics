package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());
        double priceApartment = 0;
        double priceStudio = 0;

        if (month.equals("May") || month.equals("October")) {
           priceStudio = 50.0;
           priceApartment = 65.0;
           if (countNights>7 && countNights<=14){
               priceStudio*=0.95;
           }
           if (countNights>14){
               priceStudio*=0.70;
               priceApartment*=0.90;
           }
        } else if (month.equals("June") || month.equals("September")) {
            priceStudio = 75.2;
            priceApartment = 68.7;
            if (countNights>14){
                priceStudio*=0.80;
                priceApartment*=0.90;
            }
        } else if (month.equals("July") || month.equals("August")) {
            priceStudio = 76.0;
            priceApartment= 77.0;
            if (countNights>14){
                priceApartment*=0.90;
            }
        }
        System.out.printf("Apartment: %.2f lv.%n",priceApartment*countNights);
        System.out.printf("Studio: %.2f lv.", priceStudio*countNights);
    }
}
