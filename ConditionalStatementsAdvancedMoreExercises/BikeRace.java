package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();
        double taxJuniors = 0;
        double taxSeniors = 0;

        if (trace.equals("trail")){
            taxJuniors = 5.5;
            taxSeniors = 7.0;
        }else if (trace.equals("cross-country")){
            taxJuniors = 8.0;
            taxSeniors = 9.5;
            if (juniors+seniors>=50){
                taxJuniors*=0.75;
                taxSeniors*=0.75;
            }
        }else if (trace.equals("downhill")){
            taxJuniors = 12.25;
            taxSeniors = 13.75;
        }else if (trace.equals("road")){
            taxJuniors = 20.0;
            taxSeniors = 21.5;
        }
        double sum = (juniors * taxJuniors + seniors * taxSeniors) * 0.95;
        System.out.printf("%.2f", sum);
    }
}
