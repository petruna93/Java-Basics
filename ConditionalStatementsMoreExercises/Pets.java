package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double tortoiseFood = Double.parseDouble(scanner.nextLine());

        double neededFood = (dogFood + catFood + (tortoiseFood/1000))*days;
        double diff = Math.abs(food-neededFood);

        if (food>=neededFood){
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        }else if (food<neededFood){
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(diff));
        }
    }
}
