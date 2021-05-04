package NestedLoopsMoreExercises;

import java.util.Scanner;

public class UniquePinCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstMax = Integer.parseInt(scanner.nextLine());
        int secondMax = Integer.parseInt(scanner.nextLine());
        int thirdMax = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= firstMax; i += 2) {
            int second = Math.min(7, secondMax);
            for (int j = 2; j <= second; j++) {
                if (j == 2 || j == 3 || j == 5 || j == 7){
                    for (int l = 2; l <= thirdMax; l += 2) {
                        System.out.println(i + " " + j + " " + l);
                    }

                }

            }
        }
    }
}


