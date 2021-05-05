package Exam;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countJoinery = Integer.parseInt(scanner.nextLine());
        String kindJoinery = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;

        if (countJoinery<10){
            System.out.println("Invalid order");
            return;
        }

        if (kindJoinery.equals("90X130")) {
            price = 110.0;
            if (countJoinery>60){
                price*=0.92;
            }else if(countJoinery>30){
                price*=0.95;
            }
        } else if (kindJoinery.equals("100X150")) {
            price = 140.0;
            if (countJoinery>80){
                price*=0.90;
            }else if (countJoinery>40){
                price*=0.94;
            }
        } else if (kindJoinery.equals("130X180")) {
            price = 190.0;
            if (countJoinery>50){
               price*=0.88;
            }else if (countJoinery>20){
               price*=0.93;
            }
        } else if (kindJoinery.equals("200X300")) {
            price = 250.0;
            if (countJoinery>50){
                price*=0.86;
            }else if (countJoinery>25){
                price*=0.91;
            }
        }
        double sum = price*countJoinery;
        if (delivery.equals("With delivery")) {
            sum += 60;
        }
        if (countJoinery>99){
            sum*=0.96;
        }

        System.out.printf("%.2f BGN",sum);
    }
}
