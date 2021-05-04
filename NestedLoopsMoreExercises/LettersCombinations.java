package NestedLoopsMoreExercises;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        char without = scanner.nextLine().charAt(0);
        int count = 0;

        for (int i = start; i <=end ; i++) {
            if (i==without){
                continue;
            }
            for (int j = start; j <=end ; j++) {
                if (j==without){
                    continue;
                }
                for (int k = start; k <=end ; k++) {
                    if (k==without){
                        continue;
                    }
                    count++;
                    System.out.printf("%c%c%c ",i,j,k);

                }

            }

        }
        System.out.println(count);
    }
}
