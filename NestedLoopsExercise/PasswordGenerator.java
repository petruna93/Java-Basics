package NestedLoopsExercise;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <first ; i++) {
            for (int j = 1; j <first ; j++) {
                for (int k = 97; k <97+second ; k++) {
                    for (int l = 97; l <97+second ; l++) {
                        for (int m = 1; m <=first ; m++) {
                            if (m>i && m>j) {
                                System.out.printf("%d%d%c%c%d ", i, j, k, l, m);
                            }
                        }
                    }
                }
            }
        }
    }
}
