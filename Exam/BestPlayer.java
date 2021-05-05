package Exam;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bestPlayerName = "";
        int bestPlayerGoals = 0;

        String input = scanner.nextLine();

        while (!input.equals("END")){
            String playerName = input;
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals>bestPlayerGoals){
                bestPlayerGoals=goals;
                bestPlayerName=playerName;
            }
            if (bestPlayerGoals>=10){
                break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n",bestPlayerName);
        if (bestPlayerGoals>=3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!",bestPlayerGoals);
        }else {
            System.out.printf("He has scored %d goals.",bestPlayerGoals);
        }

    }
}
