package NestedLoopsLab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i = 0; i <=25 ; i++) {
            for (int j = 0; j <=25 ; j++) {
                for (int k = 0; k <=25 ; k++) {
                    if (i + j + k == n){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
