package ForLoopMoreExercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int priceBus = 200;
        int priceTruck = 175;
        int priceTrain = 120;

        int count = Integer.parseInt(scanner.nextLine());
        int bus = 0;
        int truck = 0;
        int train = 0;
        int sum = 0;


        for (int i = 1; i <= count; i++) {
            int ton = Integer.parseInt(scanner.nextLine());

            if (ton <= 3) {
                bus += ton;
            } else if (ton >= 4 && ton <= 11) {
                truck += ton;
            } else if (ton >= 12) {
                train += ton;
            }
        }

        sum = bus + train + truck;
        double averagePrice = (bus * priceBus + truck * priceTruck + train * priceTrain) / (sum * 1.0);
        double percentBus = (bus / (sum * 1.0)) * 100;
        double percentTruck = (truck / (sum * 1.0)) * 100;
        double percentTrain = (train / (sum * 1.0)) * 100;
        System.out.printf("%.2f%n", averagePrice);
        System.out.printf("%.2f%%%n", percentBus);
        System.out.printf("%.2f%%%n", percentTruck);
        System.out.printf("%.2f%%%n", percentTrain);


    }
}
