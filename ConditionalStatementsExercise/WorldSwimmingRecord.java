package ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecondsForOneMeter = Double.parseDouble(scanner.nextLine());

        double seconds = distanceMeters * timeInSecondsForOneMeter;
        double slow = Math.floor((distanceMeters/15))*12.5;
        double finalSum = seconds+slow;

        double diff = Math.abs(finalSum-worldRecord);

        if (worldRecord>finalSum){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",finalSum);
        }else if (worldRecord<=finalSum){
            System.out.printf("No, he failed! He was %.2f seconds slower.",diff);
        }


    }
}
