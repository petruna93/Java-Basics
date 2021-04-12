package FirstStepsInCodingLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDogs = Integer.parseInt(scanner.nextLine());
        int countOtherAnimals = Integer.parseInt(scanner.nextLine());

        double sum = countDogs*2.5 + countOtherAnimals*4;

        System.out.printf("%.1f lv.", sum);
    }
}
