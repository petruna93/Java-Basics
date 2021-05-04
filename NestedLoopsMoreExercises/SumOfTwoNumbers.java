package NestedLoopsMoreExercises;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i = start; i <=end ; i++) {
            for (int j = start; j <=end ; j++) {
                count++;
                if (i+j==magicNum){
                    System.out.printf("Combination N:%d (%d + %d = %d)",count,i,j,magicNum);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", count,magicNum);
    }
}
