package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad10 {
    public static void main(String[] args) {

        int n;
        int sum = 0;

        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number: ");
            n = scanner.nextInt();
        }
        System.out.println("The first n natural numbers are: " + n);

        for (int i = 0; i < n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum of natural number upto " + n + " terms : " + sum);
    }
}
