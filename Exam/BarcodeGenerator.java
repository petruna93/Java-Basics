package Exam;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        int first = firstNum % 10;
        firstNum = firstNum / 10;
        int second = firstNum % 10;
        firstNum = firstNum / 10;
        int third = firstNum % 10;
        firstNum = firstNum / 10;
        int fourth = firstNum % 10;

        int first2 = secondNum % 10;
        secondNum = secondNum / 10;
        int second2 = secondNum % 10;
        secondNum = secondNum / 10;
        int third2 = secondNum % 10;
        secondNum = secondNum / 10;
        int fourth2 = secondNum % 10;

        for (int i = fourth; i <= fourth2; i++) {
            if (i % 2 != 0) {
                for (int j = third; j <= third2; j++) {
                    if (j % 2 != 0)
                        for (int k = second; k <= second2; k++) {
                            if (k % 2 != 0) {
                                for (int l = first; l <= first2; l++) {
                                    if (l % 2 != 0) {
                                        System.out.printf("%d%d%d%d ", i, j, k, l);
                                    }
                                }
                            }
                        }
                }
            }
        }
    }
}


