package NestedLoopsMoreExercises;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char last = scanner.nextLine().charAt(0);
        int countRow = Integer.parseInt(scanner.nextLine());
        int placesOdd = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int extra = 0;


        for (char i = 'A'; i <=last ; i++) {
            for (int j = 1; j <=countRow+extra ; j++) {
                if (j%2==0){
                    for (int k = 'a'; k <'a'+placesOdd+2 ; k++) {
                        System.out.printf("%c%d%c%n",i,j,k);
                        count++;
                    }
                }else {
                    for (int k = 'a'; k <'a'+placesOdd ; k++) {
                        System.out.printf("%c%d%c%n",i,j,k);
                        count++;
                    }
                }

            }
            extra++;
        }
        System.out.println(count);

    }
}
