package NestedLoopsMoreExercises;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMan = Integer.parseInt(scanner.nextLine());
        int countWoman = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        int count =0;

            for (int j = 1; j <=countMan ; j++) {
                for (int k = 1; k <=countWoman ; k++) {
                    count++;
                    System.out.printf("(%d <-> %d) ",j,k);
                    if (j==countMan && k==countWoman ||  count==tables){
                        return;
                    }
                }

            }

        }
    }

