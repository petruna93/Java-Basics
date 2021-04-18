package ConditionalStatementsAdvancedLab.idea;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String rating = scanner.nextLine();
        double price = 0;

        if (typeRoom.equals("room for one person")) {
            price = (days - 1) * 18;
        } else if (typeRoom.equals("apartment")) {
            price = (days - 1) * 25;
        } else if (typeRoom.equals("president apartment")) {
            price = (days - 1) * 35;
        }


        if (typeRoom.equals("apartment")) {
            if (days < 10) {
                price = price * 0.7;
            } else if (days >= 10 && days <= 15) {
                price = price * 0.65;
            } else if (days > 15) {
                price = price * 0.5;
            }

        } else if (typeRoom.equals("president apartment")) {
            if (days < 10) {
                price = price * 0.90;
            } else if (days >= 10 && days <= 15) {
                price = price * 0.85;
            } else if (days > 15) {
                price = price * 0.80;
            }
        }
        if (rating.equals("positive")) {
            price = price * 1.25;
        } else if (rating.equals("negative")) {
            price = price* 0.90;
        }
        System.out.printf("%.2f",price);
    }
}
