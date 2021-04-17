package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int volume = Integer.parseInt(scanner.nextLine());
        int firstVolume = Integer.parseInt(scanner.nextLine());
        int secondVolume = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double firstTube = firstVolume*hours;
        double secondTube = secondVolume*hours;
        double sum = firstTube + secondTube;

        if (sum<=volume){
            double percent = (sum/volume)*100;
            double firstPercent = (firstTube/sum)*100;
            double secondPercent = (secondTube/sum)*100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                    percent,firstPercent,secondPercent);
        }else if (sum>volume){
            double diff = sum - volume;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, diff);
        }

    }
}
