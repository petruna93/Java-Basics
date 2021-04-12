package FirstStepsInCodingExercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pageInBook = Integer.parseInt(scanner.nextLine());
        int pageCanReadPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int needTime = pageInBook/pageCanReadPerHour;
        int hours = needTime / days;

        System.out.println(hours);
    }
}
