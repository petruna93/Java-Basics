package ForLoopMoreExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        int countTop = 0;
        int countVeryGood = 0;
        int countGood = 0;
        int countBad = 0;


        for (int i = 0; i <countStudents ; i++) {
            double studentsGrade = Double.parseDouble(scanner.nextLine());
            sum+=studentsGrade;

            if (studentsGrade>=2 && studentsGrade<=2.99){
                countBad++;
            }else if (studentsGrade>=3.0 && studentsGrade<=3.99){
                countGood++;
            }else if (studentsGrade>=4.0 && studentsGrade<=4.99){
                countVeryGood++;
            }else if (studentsGrade>=5.00){
                countTop++;
            }
        }
        System.out.printf("Top students: %.2f%%%n", (countTop/(countStudents*1.0))*100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (countVeryGood/(countStudents*1.0))*100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", (countGood/(countStudents*1.0))*100);
        System.out.printf("Fail: %.2f%%%n", (countBad/(countStudents*1.0))*100);
        System.out.printf("Average: %.2f", sum/countStudents);
    }
}
