package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad20 {
    public static void main(String[] args) {

        int numberOfRows;
        System.out.println("Input number of rows: ");
        Scanner scanner = new Scanner(System.in);
        numberOfRows = scanner.nextInt();

        int number = 1;
        for (int row = 1; row <= numberOfRows ; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
