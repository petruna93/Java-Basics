package ForLoopMoreExercises;

import java.util.Scanner;

public class ClockPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <=23 ; i++) {
            for (int j = 0; j <=59 ; j++) {
                for (int k = 0; k <=59 ; k++) {
                    System.out.println(i + " : " + j + " : " + k);
                }
            }
        }
    }
}
