package ForLoopLab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;


        for (int i = 0; i <n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > maxNum) {
                maxNum = num;
            }
            if (num < minNum) {
                minNum = num;
            }
        }
        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d", minNum);

    }
}

