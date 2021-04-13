package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        int wSm = (int) (w * 100);
        int hSm = (int) (h * 100);

        int freeW = hSm  - 100;
        int tableInRow = freeW / 70;
        int row =wSm / 120;

        int places = tableInRow * row - 3;
        System.out.println(places);
    }
}
