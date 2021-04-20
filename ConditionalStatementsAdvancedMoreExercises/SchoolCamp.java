package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        String sport = "";

        if (season.equals("Winter")) {
            if (group.equals("girls")) {
                price = 9.6;
                sport = "Gymnastics";
            } else if (group.equals("boys")) {
                price = 9.6;
                sport = "Judo";
            } else {
                price = 10.0;
                sport = "Ski";
            }
        } else if (season.equals("Spring")) {
            if (group.equals("girls")) {
                price = 7.2;
                sport = "Athletics";
            } else if (group.equals("boys")) {
                price = 7.2;
                sport = "Tennis";
            } else {
                price = 9.5;
                sport = "Cycling";
            }
        } else {
            if (group.equals("girls")) {
                price = 15.0;
                sport = "Volleyball";
            } else if (group.equals("boys")) {
                price = 15.0;
                sport = "Football";
            } else {
                price = 20.0;
                sport = "Swimming";
            }
        }
        double sum = price * studentsCount * nights;
        if (studentsCount >= 50) {
            sum *= 0.5;
        } else if (studentsCount >= 20 && studentsCount < 50) {
            sum *= 0.85;
        } else if (studentsCount >= 10 && studentsCount < 20) {
            sum *= 0.95;
        }
        System.out.printf("%s %.2f lv.", sport,sum);

    }

}

