package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int fourth = Integer.parseInt(scanner.nextLine());
        double priceForPresent = Double.parseDouble(scanner.nextLine());

        double sum = (first * 3.25 + second * 4 + third*3.5 + fourth*8)*0.95;
        double diff = Math.abs(priceForPresent - sum);

        if (sum>=priceForPresent){
            System.out.printf("She is left with %.0f leva.", Math.floor(diff));
        }else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));
        }


    }
}
