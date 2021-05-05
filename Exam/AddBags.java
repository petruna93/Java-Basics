package Exam;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price20kg = Double.parseDouble(scanner.nextLine());
        double kilograms = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int countLuggage = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (kilograms<10){
            price=0.20*price20kg;
        }else if (kilograms>=10 && kilograms<=20){
            price=0.50*price20kg;
        }else if (kilograms>20){
            price=price20kg;
        }

        if (days>30){
            price*=1.10;
        }else if (days<=30 && days>=7){
            price*=1.15;
        }else if (days<7){
            price*=1.40;
        }
        double sum = price*countLuggage;

        System.out.printf("The total price of bags is: %.2f lv.",sum);
    }
}
