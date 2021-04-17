package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lazyDays = Integer.parseInt(scanner.nextLine());
        int workDays = 365 - lazyDays;
        int sumMinutes = lazyDays * 127 + workDays * 63;
        int diff = Math.abs(30000-sumMinutes);
        int hours = diff / 60;
        int minutes = diff % 60;

        if (sumMinutes>30000){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours,minutes);;

        }else if (sumMinutes<30000){
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours,minutes);;
        }
    }
}
