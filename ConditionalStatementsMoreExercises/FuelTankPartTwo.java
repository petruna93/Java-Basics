package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class FuelTankPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFuel = scanner.nextLine();
        double quantityFuel = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double sum = 0;

        if (typeFuel.equals("Gas")){
            sum = quantityFuel * 0.93;
        }else if (typeFuel.equals("Gasoline")){
            sum = quantityFuel * 2.22;
        }else if (typeFuel.equals("Diesel")){
            sum = quantityFuel *2.33;
        }

        if (card.equals("Yes")){
            if (typeFuel.equals("Gas")){
                sum -= quantityFuel * 0.08;
            }else if (typeFuel.equals("Gasoline")){
                sum -= quantityFuel * 0.18;
            }else if (typeFuel.equals("Diesel")){
                sum -= quantityFuel * 0.12;
            }
        }

        if (quantityFuel>=20 && quantityFuel<=25){
            sum = sum * 0.92;
        }else if (quantityFuel>25){
            sum = sum * 0.90;
        }
        System.out.printf("%.2f lv.", sum);
    }
}
