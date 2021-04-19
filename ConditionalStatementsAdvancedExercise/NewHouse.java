package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int quantityFlower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;

        if (flower.equals("Roses")){
            sum = quantityFlower * 5.0;
            if (quantityFlower>80){
                sum = sum * 0.9;
            }
        }else if (flower.equals("Dahlias")){
            sum =quantityFlower * 3.8;
            if (quantityFlower>90){
                sum = sum * 0.85;
            }
        }else if (flower.equals("Tulips")){
            sum = quantityFlower * 2.8;
            if (quantityFlower>80){
                sum = sum * 0.85;
            }
        }else if (flower.equals("Narcissus")){
            sum = quantityFlower * 3.0;
            if (quantityFlower<120){
                sum = sum * 1.15;
            }
        }else if (flower.equals("Gladiolus")){
            sum = quantityFlower*2.5;
            if (quantityFlower<80){
                sum = sum * 1.20;
            }
        }

        if (budget>=sum){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    quantityFlower,flower, budget-sum);

        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",
                    sum - budget);
        }


    }
}
