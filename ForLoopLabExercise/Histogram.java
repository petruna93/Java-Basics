package ForLoopLabExercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int firstCount = 0;
        int secondCount = 0;
        int thirdCount = 0;
        int fourthCount = 0;
        int fifthCount = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num<200){
                firstCount++;
            }else if (num>=200 && num<=399){
                secondCount++;
            }else if (num>=400 && num<=599){
                thirdCount++;
            }else if (num>=600 && num<=799){
                fourthCount++;
            }else if (num>=800){
                fifthCount++;
            }
        }
        double first = firstCount*100.0/n;
        double second = secondCount*100.0/n;
        double third = thirdCount*100.0/n;
        double fourth = fourthCount*100.0/n;
        double fifth = fifthCount*100.0/n;

        System.out.println(String.format("%.2f%%",first));
        System.out.println(String.format("%.2f%%",second));
        System.out.println(String.format("%.2f%%",third));
        System.out.println(String.format("%.2f%%",fourth));
        System.out.println(String.format("%.2f%%",fifth));
    }
}
