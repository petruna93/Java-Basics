package Exam;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balls = Integer.parseInt(scanner.nextLine());
        int totalPoints=0;
        int redPoints = 0;
        int orangePoints = 0;
        int yellowPoints = 0;
        int whitePoints = 0;
        int countBlackDivide = 0;
        int countOther = 0;


        for (int i = 0; i <balls ; i++) {
            String colour = scanner.nextLine();

            if (colour.equals("red")){
               redPoints++;
               totalPoints+=5;
            }else if (colour.equals("orange")){
               orangePoints++;
               totalPoints+=10;
            }else if (colour.equals("yellow")){
               yellowPoints++;
               totalPoints+=15;
            }else if (colour.equals("white")){
               whitePoints++;
               totalPoints+=20;
            }else if (colour.equals("black")){
                totalPoints*=0.5;
                countBlackDivide++;
            }else {
                countOther++;
            }
        }
        System.out.printf("Total points: %d%n",totalPoints);
        System.out.printf("Points from red balls: %d%n",redPoints);
        System.out.printf("Points from orange balls: %d%n",orangePoints);
        System.out.printf("Points from yellow balls: %d%n",yellowPoints);
        System.out.printf("Points from white balls: %d%n",whitePoints);
        System.out.printf("Other colors picked: %d%n",countOther);
        System.out.printf("Divides from black balls: %d", countBlackDivide);
    }
}
