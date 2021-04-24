package ForLoopLabExercise;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int first = 0;
        int second = 0;
        int third = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num%2==0){
               first++;
            }
            if (num%3==0){
                second++;
            }
            if (num%4==0){
                third++;
            }
        }
        double p1 = first*100.00/n;
        double p2 =second*100.00/n;
        double p3 = third*100.00/n;

        System.out.println(String.format("%.2f%%",p1));
        System.out.println(String.format("%.2f%%",p2));
        System.out.println(String.format("%.2f%%",p3));
    }
}
