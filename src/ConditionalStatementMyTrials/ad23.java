package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            for (int k = n - 1; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
