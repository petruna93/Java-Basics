package WhileLoopLab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = Integer.parseInt(scanner.nextLine());
        int a = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int freeSpace = b*a*h;

        while (!input.equals("Done")){
            int cartoon = Integer.parseInt(input);
            freeSpace-=cartoon;
            if (freeSpace<=0){
                System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(freeSpace));
                return;
            }

            input= scanner.nextLine();
        }
        System.out.printf("%d Cubic meters left.", Math.abs(freeSpace));


    }
}
