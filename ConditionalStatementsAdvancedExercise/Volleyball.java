package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeYear = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int weekendInSofia = 48 - h;
        double freeWeekendInSofia = weekendInSofia * (3/4.0);
        int gameInHomeTown = h;
        double pGame = p * (2/3.0);
        double sum = freeWeekendInSofia + gameInHomeTown + pGame;

        if (typeYear.equals("leap")){
            sum*=1.15;
        }
        System.out.printf("%.0f",Math.floor(sum));

    }
}
