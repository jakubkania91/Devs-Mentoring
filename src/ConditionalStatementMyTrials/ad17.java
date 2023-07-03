package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad17 {
    public static void main(String[] args) {

        int i;
        int j;
        int n;
        int k = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(k++);
            System.out.println(" ");
        }
    }
}

