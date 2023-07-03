package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("@");
                System.out.println();
            }
            System.out.println();
        }
    }
}
