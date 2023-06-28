package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad13 {
    public static void main(String[] args) {

        int i;
        int n;

        System.out.println("Input the number(Table to be calculated): ");
        System.out.println("Input numer of terms: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (i = 0; i < n; i++) {
            System.out.println(n + " x " + i + " = " + n * i);

        }
    }
}
