package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minutesArrive = Integer.parseInt(scanner.nextLine());

        int examMinutes = hourExam*60 + minutesExam;  //120
        int arriveMinutes = hourArrive*60 + minutesArrive; //100

        if (arriveMinutes-examMinutes==0) {
            System.out.println("On Time");
        }else if (examMinutes-arriveMinutes<=30 && arriveMinutes-examMinutes<1){
            System.out.println("On Time");
            int minutes = examMinutes - arriveMinutes;
            System.out.printf("%d minutes before the start", minutes);
        }else if (examMinutes-arriveMinutes>30){
            System.out.println("Early");

            int hour = (examMinutes-arriveMinutes)/60;
            int minutes = (examMinutes-arriveMinutes)%60;
            if (hour!=0){
                System.out.printf("%d:%02d hours before the start",hour,minutes);
            }else {
                System.out.printf("%d minutes before the start", minutes);
            }
        }else if (arriveMinutes-examMinutes>=1){
            System.out.println("Late");

            int hour = (arriveMinutes-examMinutes)/60;
            int minutes = (arriveMinutes-examMinutes)%60;
            if (hour!=0){
                System.out.printf("%d:%02d hours after the start",hour,minutes);
            }else {
                System.out.printf("%d minutes after the start", minutes);
            }

        }
    }
}
