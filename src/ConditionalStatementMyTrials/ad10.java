package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad10 {
    public static void main(String[] args) {


        int n;
        int sum = 0;
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input natural number: ");
            n = scanner.nextInt();
        }
        System.out.println("The first number natural number is: " + n);

        for (int j = 0; j < n; j++) {
            System.out.println(j);
            sum += j;
        }
        System.out.println("The sum of natural number upto " + n + " terms: " + sum);
    }
}
