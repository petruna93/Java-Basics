package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWall = x * y;
        double windows = 1.5 * 1.5;
        double twoWalls = 2 * sideWall - 2 * windows;
        double behindWall = x * x;
        double entry = 1.2*2;
        double frontAndBehindWalls = 2 * behindWall - entry;
        double totalArea = twoWalls + frontAndBehindWalls;
        double greenPaint = totalArea / 3.4;

        double top = 2 * x * y;
        double twoTriangles = 2 * ((x * h)/2);
        double total = top + twoTriangles;
        double redPaint = total /4.3;

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f", redPaint);



    }
}
