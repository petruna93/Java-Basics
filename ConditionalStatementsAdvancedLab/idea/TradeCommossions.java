package ConditionalStatementsAdvancedLab.idea;

import java.util.Scanner;

public class TradeCommossions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double percent = 0.0;
        boolean isTrue = true;


        if (city.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                percent = 5.0;
            } else if (sales > 500 && sales <= 1000) {
                percent = 7.0;
            } else if (sales > 1000 && sales <= 10000) {
                percent = 8.0;
            } else if (sales > 10000) {
                percent = 12.0;
            } else {
                isTrue = false;
                System.out.println("error");
            }

        } else if (city.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                percent = 4.5;
            } else if (sales > 500 && sales <= 1000) {
                percent = 7.5;
            } else if (sales > 1000 && sales <= 10000) {
                percent = 10.0;
            } else if (sales > 10000) {
                percent = 13.0;
            } else {
                isTrue = false;
                System.out.println("error");
            }

        } else if (city.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                percent = 5.5;
            } else if (sales > 500 && sales <= 1000) {
                percent = 8.0;
            } else if (sales > 1000 && sales <= 10000) {
                percent = 12.0;
            } else if (sales > 10000) {
                percent = 14.5;
            } else {
                isTrue = false;
                System.out.println("error");
            }

        } else {
            isTrue = false;
            System.out.println("error");
        }
        if (isTrue) {
            System.out.printf("%.2f", (percent * sales) / 100);
        }
    }
}
