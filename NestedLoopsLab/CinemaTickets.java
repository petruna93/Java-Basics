package NestedLoopsLab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int totalCount = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;

        while (!input.equals("Finish")){
            String movie = input;
            int capacity = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int count = 0;
            while (!ticketType.equals("End")){
                count++;
                switch (ticketType){
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidsTickets++;
                        break;
                    default:
                        studentTickets++;
                        break;
                }
                if (count>=capacity){
                    break;
                }
                    ticketType=scanner.nextLine();
            }
            double percent = (count/(capacity*1.0))*100;
            totalCount+=count;
            System.out.printf("%s - %.2f%% full.%n",movie, percent);

            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n",totalCount);
        System.out.printf("%.2f%% student tickets.%n",(studentTickets/(totalCount*1.0))*100);
        System.out.printf("%.2f%% standard tickets.%n",(standardTickets/(totalCount*1.0))*100);
        System.out.printf("%.2f%% kids tickets.",(kidsTickets/(totalCount*1.0))*100);
    }
}
