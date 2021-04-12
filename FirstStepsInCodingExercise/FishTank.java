package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volume = length * width * height;
        double liters = volume * 0.001;
        double finalLiters = liters * (100-percent)/100;

        System.out.printf("%.2f", finalLiters);
    }
}
