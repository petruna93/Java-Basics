package WhileLoopMoreExercises;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i <n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum+=num;
        }
        System.out.printf("%.2f", Math.abs(sum/(n*1.0)));
    }
}
