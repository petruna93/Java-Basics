package ForLoopMoreExercises;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        boolean isTrue = true;
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 0; i <1 ; i++) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            sum+=firstNum+secondNum;
        }
        for (int i = 1; i <n ; i++) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            int newSum = firstNum+secondNum;
            if (sum==newSum){
                isTrue=true;
            }else {
                isTrue=false;
               int diff = Math.abs(sum-newSum);
               sum=newSum;
               if (maxDiff<diff){
                   maxDiff=diff;
               }
            }
        }
        if (isTrue){
            System.out.printf("Yes, value=%d", sum);
        }else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
