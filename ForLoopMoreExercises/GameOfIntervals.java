package ForLoopMoreExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        int count0To9 = 0;
        int count10To19=0;
        int count20To29=0;
        int count30To39=0;
        int count40To50=0;
        int countInvalidNumber = 0;



        for (int i = 0; i <count ; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num>=0 && num<=9){
                count0To9++;
                sum+=num*0.2;

            }else if (num>=10 && num<=19){
                count10To19++;
                sum+=num*0.3;

            }else if (num>=20 && num<=29){
                count20To29++;
                sum+=num*0.40;

            }else if (num>=30 && num<=39){
                count30To39++;
                sum+=50;

            }else if (num>=40 && num<=50){
                count40To50++;
                sum+=100;

            }else {
                countInvalidNumber++;
                sum/=2;
            }
        }
        System.out.printf("%.2f%n", sum);
        System.out.printf("From 0 to 9: %.2f%%%n",(count0To9/(count*1.0))*100);
        System.out.printf("From 10 to 19: %.2f%%%n",(count10To19/(count*1.0))*100);
        System.out.printf("From 20 to 29: %.2f%%%n",(count20To29/(count*1.0))*100);
        System.out.printf("From 30 to 39: %.2f%%%n",(count30To39/(count*1.0))*100);
        System.out.printf("From 40 to 50: %.2f%%%n",(count40To50/(count*1.0))*100);
        System.out.printf("Invalid numbers: %.2f%%",(countInvalidNumber/(count*1.0))*100);
    }
}
