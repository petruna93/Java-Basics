package NestedLoopsMoreExercises;

import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hundreds = Integer.parseInt(scanner.nextLine());
        int tens = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=hundreds ; i++) {
            for (int j = 1; j <=tens ; j++) {
                for (int k = 1; k <=num ; k++) {
                    if (k%2==0 && i%2==0){
                        if (j==2 ||  j==3 || j==5 ||  j==7){
                            System.out.printf("%d %d %d%n",i,j,k);
                        }
                    }

                }

            }

        }
    }
}
