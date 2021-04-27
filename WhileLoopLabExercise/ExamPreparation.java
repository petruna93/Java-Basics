package WhileLoopLabExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBadPoint = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int count = 0;
        double sum = 0;
        int counter = 0;
        String nameTask = "";

        while (!input.equals("Enough")) {
            int rating = Integer.parseInt(scanner.nextLine());
            sum += rating;
            counter++;

            if (rating <= 4) {
                count++;
                if (count >= countBadPoint) {
                    System.out.printf("You need a break, %d poor grades.", countBadPoint);
                    return;
                }
            }
            nameTask = input;
            input = scanner.nextLine();
        }
        System.out.printf("Average score: %.2f%n", ((sum * 1.0) / counter));
        System.out.printf("Number of problems: %d%n", counter);
        System.out.printf("Last problem: %s", nameTask);
    }
}
