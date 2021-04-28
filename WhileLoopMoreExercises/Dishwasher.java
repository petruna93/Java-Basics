package WhileLoopMoreExercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int quantity = bottles*750;
        int count = 0;
        int plateCount = 0;
        int potCount = 0;

        while (!input.equals("End")){
            int court = Integer.parseInt(input);
            count++;
            if (count%3==0){
               quantity-=court*15;
               potCount+=court;
            }else {
              quantity-= court*5;
              plateCount+=court;
            }
            if (quantity<0){
                System.out.printf("Not enough detergent, %d ml. more necessary!",Math.abs(quantity));
                return;
            }
            input=scanner.nextLine();
        }
        System.out.println("Detergent was enough!");
        System.out.printf("%d dishes and %d pots were washed.%n",plateCount,potCount);
        System.out.printf("Leftover detergent %d ml.",quantity);

    }
}
