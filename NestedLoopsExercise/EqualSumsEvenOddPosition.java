package NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <=second ; i++) {
            int num = i;
            int sumEven = 0;
            int sumOdd = 0;
            for (int j = 6; j >0 ; j--) {
                if (j%2==0) {
                    sumEven += num % 10;
                }else {
                    sumOdd += num%10;
                }
                num = num / 10;
            }
            if (sumEven==sumOdd){
                System.out.print(i + " ");
            }
        }
    }
}
