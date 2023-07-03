package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad15 {
    public static void main(String[] args) {

        int i;
        int j;
        int k;
        int n;

        System.out.println("Input number of rows: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (i = 1; i <= n; i++)
            {
            for (j = 1; j <= i; j++){
                System.out.print(j);

            }

                System.out.println(" ");

            }

        }
    }
