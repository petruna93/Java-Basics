package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String partDays = scanner.nextLine();
        double dayTaxi = 0.70 + n *0.79;
        double nightTaxi = 0.70 + n *0.90;
        double bus = n * 0.09;
        double train = n * 0.06;
        double sum = 0;

        if (n<20 && partDays.equals("day")){
            sum = dayTaxi;
        }else if (n<20 && partDays.equals("night")){
            sum = nightTaxi;
        }else if (n>=20 && n<100 && partDays.equals("day")) {
            sum = Math.min(dayTaxi, bus);
        }else if (n>=20 && n<100 && partDays.equals("night")) {
            sum = Math.min(nightTaxi, bus);
        }else if (n>=100 && partDays.equals("day")){
            if (dayTaxi<bus && dayTaxi<train){
                sum = dayTaxi;
            }else if (bus<dayTaxi && bus<train){
                sum = bus;
            }else {
                sum = train;
            }
        }else if (n>=100 && partDays.equals("night")){
            if (nightTaxi<bus && nightTaxi<train){
                sum = nightTaxi;
            }else if (bus<nightTaxi && bus<train){
                sum = bus;
            }else {
                sum = train;
            }
        }
        System.out.printf("%.2f", sum);
    }
}
