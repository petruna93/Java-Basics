package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int countsWorkerWorkExtraTime = Integer.parseInt(scanner.nextLine());

        double day = days * 0.90;
        double sumHours = Math.floor(day * 8 + countsWorkerWorkExtraTime * 2 * days);

        double diff = Math.abs(neededHours-sumHours);

        if (sumHours>=neededHours){
            System.out.printf("Yes!%.0f hours left.",diff);
        }else if (sumHours<neededHours){
            System.out.printf("Not enough time!%.0f hours needed.",diff);
        }

    }
}
