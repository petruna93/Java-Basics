package NestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double sum = 0;
        int count = 0;

        while (!input.equals("Finish")){
            String namePresentation = input;
            double individualSum = 0;
            for (int i = 0; i <n ; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                individualSum+=grade;
                sum+=grade;
                count++;
            }
            System.out.printf("%s - %.2f.%n",namePresentation,individualSum/n);

            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", sum/count);
    }
}
