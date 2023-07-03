package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad16 {
    public static void main(String[] args) {

        int i;
        int j;
        int n;

        System.out.println("Input number of n: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println(" ");

        }

    }
}
