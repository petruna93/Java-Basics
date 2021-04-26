package WhileLoopLab;

import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        int classes = 0;
        int badCount = 0;
        double sum = 0;

        while (classes < 12) {
            double rating = Double.parseDouble(scanner.nextLine());

            if (rating < 4) {
                badCount++;
                if (badCount > 1) {
                    System.out.printf("%s has been excluded at %d grade", studentName, classes);
                    return;
                }
            }
                sum += rating;
                classes++;
        }
        System.out.printf("%s graduated. Average grade: %.2f",studentName, sum/12);
    }
}
