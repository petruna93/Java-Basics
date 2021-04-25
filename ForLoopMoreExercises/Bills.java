package ForLoopMoreExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        int waterBill = 0;
        int netBill = 0;
        double otherBill = 0;
        double electricity = 0;



        for (int i = 0; i <months; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
            waterBill+=20;
            netBill+=15;
            electricity+=electricityBill;
            otherBill+=(electricityBill+20+15)*1.2;
        }
        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", waterBill*1.0);
        System.out.printf("Internet: %.2f lv%n", netBill*1.0);
        System.out.printf("Other: %.2f lv%n", otherBill);
        double sum = (waterBill+netBill+otherBill+electricity)/months;
        System.out.printf("Average: %.2f lv", sum);
    }
}
