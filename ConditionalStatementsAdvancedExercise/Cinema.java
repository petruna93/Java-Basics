package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeTicket = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double revenue = 0.0;

        int countPlaces = r * c;
        if (typeTicket.equals("Premiere")){
            revenue = countPlaces * 12.00;
        }else if (typeTicket.equals("Normal")){
            revenue = countPlaces * 7.5;
        }else if (typeTicket.equals("Discount")){
           revenue = countPlaces * 5.0;
        }
        System.out.printf("%.2f leva", revenue);
    }
}
