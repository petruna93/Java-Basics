package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();


        if (operator.equals("+")) {
            int result = firstNum + secondNum;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", firstNum, operator, secondNum, result);
            } else {
                System.out.printf("%d %s %d = %d - odd", firstNum, operator, secondNum, result);
            }
        } else if (operator.equals("-")) {
            int result = firstNum - secondNum;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", firstNum, operator, secondNum, result);
            } else {
                System.out.printf("%d %s %d = %d - odd", firstNum, operator, secondNum, result);
            }
        } else if (operator.equals("*")) {
            int result = firstNum * secondNum;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", firstNum, operator, secondNum, result);
            } else {
                System.out.printf("%d %s %d = %d - odd", firstNum, operator, secondNum, result);
            }
        } else if (operator.equals("/")) {
            if (secondNum==0){
                System.out.printf("Cannot divide %d by zero",firstNum);
            }else {
                double result = firstNum/(secondNum*1.0);
                System.out.printf("%d %s %d = %.2f", firstNum,operator,secondNum,result);
            }
        } else if (operator.equals("%")) {
            if (secondNum==0){
                System.out.printf("Cannot divide %d by zero",firstNum);
            }else {
                int result = firstNum%secondNum;
                System.out.printf("%d %s %d = %d", firstNum,operator,secondNum,result);
            }
        }
    }
}
