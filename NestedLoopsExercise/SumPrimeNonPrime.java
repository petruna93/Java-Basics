package NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrimeNum = 0;
        int sumNonPrimeNum = 0;
        boolean isTrue=false;

        while (!input.equals("stop")) {
            int num = Integer.parseInt(input);

            if (num < 0) {
                System.out.println("Number is negative.");
                input=scanner.nextLine();

            } else {

                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isTrue = true;
                        break;
                    }
                }

                if (isTrue) {
                    sumNonPrimeNum += num;
                } else {
                    sumPrimeNum += num;
                }
                input = scanner.nextLine();
                isTrue = false;
            }
        }

        System.out.printf("Sum of all prime numbers is: %d%n",sumPrimeNum);
        System.out.printf("Sum of all non prime numbers is: %d",sumNonPrimeNum);


    }
}
