package ForLoopMoreExercises;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;


        for (int i = 0; i < fans; i++) {
            String sector = scanner.nextLine();
            if (sector.equals("A")) {
                sectorA++;
            } else if (sector.equals("B")) {
                sectorB++;
            } else if (sector.equals("V")) {
                sectorV++;
            } else if (sector.equals("G")) {
                sectorG++;
            }
        }
        System.out.printf("%.2f%%%n", (sectorA/(fans*1.0)*100));
        System.out.printf("%.2f%%%n", (sectorB/(fans*1.0)*100));
        System.out.printf("%.2f%%%n", (sectorV/(fans*1.0)*100));
        System.out.printf("%.2f%%%n", (sectorG/(fans*1.0)*100));
        System.out.printf("%.2f%%", (fans/(stadiumCapacity*1.0)*100));
    }
}
