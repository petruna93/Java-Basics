package ForLoopLab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageLily = Integer.parseInt(scanner.nextLine());
        double washMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int countToy=0;
        double sumMoney=0;
        double money = 0;

        for (int i = 1; i <=ageLily ; i++) {
            if (i%2==0){
                money+=10;
                sumMoney += money-1;
            }else {
                countToy++;
            }
        }
        sumMoney+=countToy*toyPrice;
        if (sumMoney>=washMachinePrice){
            System.out.printf("Yes! %.2f", sumMoney-washMachinePrice);
        }else {
            System.out.printf("No! %.2f", washMachinePrice-sumMoney);
        }
    }
}
