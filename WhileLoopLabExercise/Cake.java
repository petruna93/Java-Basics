package WhileLoopLabExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int pieces = a*b;

        String input = scanner.nextLine();

        while (!input.equals("STOP")){
            int piece = Integer.parseInt(input);

            pieces-=piece;

            if (pieces<0){
                System.out.printf("No more cake left! You need %d pieces more.",Math.abs(pieces));
                return;
            }

            input=scanner.nextLine();
        }
        System.out.printf("%d pieces are left.", pieces);
    }
}
