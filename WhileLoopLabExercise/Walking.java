package WhileLoopLabExercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String input = scanner.nextLine();
       int sumSteps = 0;

       while (!input.equals("Going home")){
           int steps = Integer.parseInt(input);
           sumSteps+=steps;
           if (sumSteps>=10000){
               System.out.printf("Goal reached! Good job!%n%d steps over the goal!", sumSteps-10000);
               return;
           }
           input=scanner.nextLine();
       }
       int stepsToHome = Integer.parseInt(scanner.nextLine());
       sumSteps+=stepsToHome;
       if (sumSteps>=10000){
           System.out.println("Goal reached! Good job!");
           System.out.printf("%d steps over the goal!", sumSteps-10000);

       }else {
           System.out.printf("%d more steps to reach goal.",10000-sumSteps);
       }
    }
}
