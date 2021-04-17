package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double grape = Double.parseDouble(scanner.nextLine());
        int litresWine = Integer.parseInt(scanner.nextLine());
        int countWorker = Integer.parseInt(scanner.nextLine());

        double sum = x * grape * 0.4;
        double litres = sum / 2.5;

        if (litres<litresWine){
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(litresWine-litres));

        }else if (litres>=litresWine){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",Math.floor(litres));
            System.out.printf("%.0f liters left -> %.0f liters per person.",
                    Math.ceil(litres-litresWine),Math.ceil((litres-litresWine)/countWorker));
        }
    }
}
