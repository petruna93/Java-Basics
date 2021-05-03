package NestedLoopsExercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        boolean isTrue = false;

        for (int i = 1111; i <=9999 ; i++) {
            int number = i;

            while (number>0){
                int lastNum = number%10;
                if (lastNum==0){
                    isTrue = true;
                    break;
                }
                if (num%lastNum!=0 ){
                    isTrue = true;
                    break;
                }
                number=number/10;
            }
            if (!isTrue) {
                System.out.print(i + " ");
            }
            isTrue=false;

        }
    }
}
