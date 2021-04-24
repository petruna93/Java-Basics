package ForLoopLabExercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());


            for (int i = 0; i <openTabs; i++) {

                String site = scanner.nextLine();

                if (site.equals("Facebook")) {
                    salary -= 150;
                } else if (site.equals("Instagram")) {
                    salary -= 100;
                } else if (site.equals("Reddit")) {
                    salary -= 50;
                }
                if (salary<=0){
                    System.out.println("You have lost your salary.");
                    return;
                }
            }

            if (salary>0) {
                System.out.println(salary);
            }
        }
    }

