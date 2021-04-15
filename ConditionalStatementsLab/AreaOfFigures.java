package ConditionalStatementsLab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();


        if (figure.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", side*side);
        } else if (figure.equals("rectangle")){
            double side = Double.parseDouble(scanner.nextLine());
            double sideTwo = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", side*sideTwo);
        }else if (figure.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", Math.PI*radius*radius);
        }else if (figure.equals("triangle")){
            double side = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (side*h)/2);
        }
    }
}
