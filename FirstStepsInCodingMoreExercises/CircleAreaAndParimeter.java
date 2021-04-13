package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class CircleAreaAndParimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());

        double area = num * num * Math.PI;
        double perimeter = 2 * Math.PI * num;

        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f", perimeter);
    }
}
